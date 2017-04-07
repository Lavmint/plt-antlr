using System;
using System.Collections.Generic;
using Analyzer.Wrappers;
using Analyzer.Models.Semantics;
using Antlr.Runtime;
using System.Linq;
using Analyzer.Utils;

namespace Analyzer.ANTLR
{
    public class ArtGrammarSemantics
    {
        #region ops
        private int[] _operators = new int[]
        {
            ArtGrammarLexer.ASSIGN,
            ArtGrammarLexer.NOT,
            ArtGrammarLexer.GE,
            ArtGrammarLexer.GT,
            ArtGrammarLexer.LE,
            ArtGrammarLexer.LT,
            ArtGrammarLexer.EQUAL,
            ArtGrammarLexer.NOT_EQUAL
        };
        #endregion
        
        private readonly TreeWrapper _root;
        private readonly List<Identifier> _idenTable;
        private readonly List<TreeWrapper> _treeList;
        public List<RecognitionException> RecognitionErrors { get; private set; }

        public ArtGrammarSemantics(TreeWrapper root)
        {
            _root = root;
            _idenTable = new List<Identifier>();
            RecognitionErrors = new List<RecognitionException>();
            _treeList = _root.ToList();

            Run();
        }

        private void Run()
        {
            RegisterVariablesAndLookForDuplicates();
            LookForUndeclaredVariables();
            LookForAssigments();
        }

        private void LookForAssigments()
        {
            var assigments = _treeList.FindAll(t => _operators.Contains(t.Type));
            foreach (var assign in assigments)
            {
                var nodes = assign.ToList().FindAll(
                    t => t.Type.IsNumeric() || t.Type == ArtGrammarLexer.IDENT);

                int typePointer = -1;
                foreach (var node in nodes)
                {
                    int type;

                    if (node.Type == ArtGrammarLexer.IDENT)
                    {
                        var id = _idenTable.Find(t => t.Name == node.Text);
                        type = id != null ? id.Type : -1;
                    }
                    else
                    {
                        type = node.Type.AgreageType();
                    }

                    if (typePointer == -1)
                    {
                        typePointer = type;
                    }
                    else
                    {
                        if (typePointer != type)
                            RegisterError(node, 
                                String.Format("Assigment of incompatible types {0} to {1}",
                                    typePointer.TypeName(), type.TypeName()));
                    }
                }
            }
        }

        private void LookForUndeclaredVariables()
        {;
            var idens = _treeList.FindAll(n => n.Type == ArtGrammarLexer.IDENT);
            foreach (var iden in idens)
            {
                if (_idenTable.Find(i => i.Name == iden.Text) == null)
                    RegisterError(iden, Resources.UndeclaredException);
            }
        }

        /// <summary>
        /// Search duplicates and register identifiers in the table
        /// </summary>
        private void RegisterVariablesAndLookForDuplicates()
        {
            TreeWrapper decRoot = _treeList.Find(t => t.Type == ArtGrammarLexer.VAR);
            for (int i = 0; i < decRoot.ChildCount; i++)
            {
                var node = decRoot.GetChild(i);
                var nlist = node.ToList();
                var idens = nlist.FindAll(t => t.Type == ArtGrammarLexer.IDENT);
                var itype = nlist.Find(t => IsLangType(t.Type));
                foreach (var iden in idens)
                {
                    var idenItem = new Identifier() {
                            Name = iden.Text,
                            Type = itype.Type,
                    };

                    if (_idenTable.Find(item => item.Name == idenItem.Name) != null)
                    {
                        RegisterError(iden, Resources.DuplicateException);
                    }
                    else
                    {
                        _idenTable.Add(idenItem);    
                    }
                }
            }
        }

        private void RegisterError(TreeWrapper node, string msg)
        {
            var exc = new RecognitionException(msg);
            exc.Token = new ClassicToken(node.Type, node.Text);
            exc.Line = node.Line;
            exc.CharPositionInLine = node.CharPositionInLine;
            RecognitionErrors.Add(exc); 
        }

        private bool IsLangType(int type)
        {
            return type == ArtGrammarLexer.INTEGER
            || type == ArtGrammarLexer.BOOLEAN
            || type == ArtGrammarLexer.REAL;
        }
    }
}

