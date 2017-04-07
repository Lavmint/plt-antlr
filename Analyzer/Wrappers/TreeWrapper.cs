using System;
using Antlr.Runtime.Tree;
using System.Collections.Generic;

namespace Analyzer.Wrappers
{
    public class TreeWrapper
    {
        private readonly ITree _tree;
        private List<TreeWrapper> _list;

        public TreeWrapper(ITree tree)
        {
            _tree = tree;
        }

        public TreeWrapper GetChild(int i)
        {
            return new TreeWrapper(_tree.GetChild(i));
        }

        public int ChildCount
        {
            get { return _tree.ChildCount; }
        }

        public string Text
        {
            get { return _tree.Text; }
        }

        public TreeWrapper Parent
        {
            get { return new TreeWrapper(_tree.Parent); }
        }

        public int Type
        {
            get { return _tree.Type; }
        }

        public int Line
        {
            get { return _tree.Line; }
        }

        public int CharPositionInLine
        {
            get { return _tree.CharPositionInLine; }
        }

        public List<TreeWrapper> ToList()
        {
            _list = new List<TreeWrapper>();
            LookUpTree(this);
            return _list;
        }
            

        private void LookUpTree(TreeWrapper root)
        {
            _list.Add(root);
            for (int i = 0; i < root.ChildCount; i++)
            {
                var node = root.GetChild(i);
                if (node.ChildCount != 0)
                    LookUpTree(node);
                else
                    _list.Add(node);
            }
        }
    }
}

