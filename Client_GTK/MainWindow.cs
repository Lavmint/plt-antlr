using System;
using Gtk;
using Analyzer;
using System.IO;
using Analyzer.Wrappers;
using System.Collections.Generic;
using System.Timers;

public partial class MainWindow: Gtk.Window
{
    private MainModel _model;
    private string _filePath;
    private int _selectedTab = 0;

    private TreeStore _asrSource;
    private TreeStore _tokensSource;

    public MainWindow()
        : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }
        
    protected override void OnShown()
    {
        base.OnShown();

        _model = new MainModel();
        _model.DataLoaded += OnDataLoaded;

        sourceTextView.Buffer.Changed += (sender, e) => OnSourceTextViewTextChanged();
        PrepareTreeViewForTokens();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    public void OnTabChanged(int selectedTab)
    {
        if (_selectedTab == selectedTab)
            return;
        
        _selectedTab = selectedTab;
        UpdateSource();
    }

    private void PrepareTreeViewForTokens()
    {
        TreeViewColumn tokenValueColumn = new TreeViewColumn ();
        tokenValueColumn.Title = "Value";

        CellRendererText tokenValueCell = new CellRendererText ();
        tokenValueColumn.PackStart (tokenValueCell, true);

        treeView.AppendColumn (tokenValueColumn);

        tokenValueColumn.AddAttribute (tokenValueCell, "text", 0);
    }

    public void OnSourceTextViewTextChanged()
    {
        if (!_model.IsUpdating)
        {
            _model.Update(sourceTextView.Buffer.Text);
        }
    }

    private void GenerateTokenListSource()
    {
        _tokensSource = new TreeStore (typeof (string), typeof(string));

        TreeIter keyWordsIter = _tokensSource.AppendValues("Keywords group");
        AddNodes(_tokensSource, keyWordsIter, _model.KeyWords);

        TreeIter delimetersIter = _tokensSource.AppendValues("Delimeters group");
        AddNodes(_tokensSource, delimetersIter, _model.Delimeters);

        TreeIter identifiersIter = _tokensSource.AppendValues("Identifiers group");
        AddNodes(_tokensSource, identifiersIter, _model.Identifiers);

        TreeIter numercisIter = _tokensSource.AppendValues("Numeric group");
        AddNodes(_tokensSource, numercisIter, _model.Numerics);
    }

    private void AddNodes(TreeStore tree, TreeIter iter, List<TokenWrapper> tokensList)
    {
        if (tokensList == null)
            return;

        for (int i = 0; i < tokensList.Count; i++)
        {
            tree.AppendValues(iter, String.Format("{0} | {1}", i , tokensList[i].Text));
        }
    }

    private void GenerateASTSource()
    {
        _asrSource = new TreeStore (typeof (string));
        TreeIter rootIter = _asrSource.AppendValues("root");
        ASTToTreeView(_model.AST, rootIter);
    }

    private void ASTToTreeView(TreeWrapper root, TreeIter rootIter)
    {
        for (int i = 0; i < root.ChildCount; i++)
        {
            var node = root.GetChild(i);
            TreeIter nodeIter = _asrSource.AppendValues(rootIter, node.Text);
            if (node.ChildCount != 0)
            {
                ASTToTreeView(node, nodeIter);
            }
        }
    }

    private void OnDataLoaded()
    {
        GenerateTokenListSource();
        GenerateASTSource();
        UpdateSource();
        logTextView.Buffer.Text = _model.ErrorsToString() ?? string.Empty;
        pointersTextView.Buffer.Text = _model.GetTablePointers() ?? string.Empty;
    }

    private void UpdateSource()
    {
        switch (_selectedTab)
        {
            case 0:
                treeView.Model = _tokensSource;
                break;
            case 1:
                treeView.Model = _asrSource;
                break;
        }
        treeView.ExpandAll();
    }

    protected void OnTokensButtonClicked(object sender, EventArgs e)
    {
        OnTabChanged(0);
    }

    protected void OnAstButtonClicked(object sender, EventArgs e)
    {
        OnTabChanged(1);
    }

    protected void OnExecuteActionActivated(object sender, EventArgs e)
    {
        _model.Update(sourceTextView.Buffer.Text); 
    }

    protected void OnQuitActionActivated(object sender, EventArgs e)
    {
        Application.Quit();
    }

    protected void OnSaveActionActivated(object sender, EventArgs e)
    {
        File.WriteAllText(_filePath, sourceTextView.Buffer.Text);
    }
        
    protected void OnOpenActionActivated(object sender, EventArgs e)
    {
        Gtk.FileChooserDialog filechooser =
            new Gtk.FileChooserDialog("Choose the file to open",
                this,
                FileChooserAction.Open,
                "Cancel",ResponseType.Cancel,
                "Open",ResponseType.Accept);

        if (filechooser.Run() == (int)ResponseType.Accept) 
        {
            _filePath = filechooser.Filename;
            sourceTextView.Buffer.Text = File.ReadAllText(filechooser.Filename);
        }

        filechooser.Destroy();
    }
}