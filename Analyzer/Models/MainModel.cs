using System;
using Antlr.Runtime;
using System.Collections.Generic;
using Antlr.Runtime.Tree;
using System.Linq;
using Analyzer.Wrappers;
using System.Collections;
using Analyzer.ANTLR;
using Analyzer.Utils;

namespace Analyzer
{
    public class MainModel
    {
        private TokenListWrapper _tokensWrapper;
        private int _errorsCount;
        public event Action DataLoaded;
        public bool IsUpdating { get; private set; }

        #region Tokens classification
        private readonly int[] _keyWords = new int[]
        {
            ArtGrammarLexer.PROGRAM,
            ArtGrammarLexer.VAR,
            ArtGrammarLexer.BEGIN,
            ArtGrammarLexer.AND,
            ArtGrammarLexer.END,

            ArtGrammarLexer.OR,
            ArtGrammarLexer.READ,
            ArtGrammarLexer.WRITE,
            ArtGrammarLexer.IF,
            ArtGrammarLexer.THEN,

            ArtGrammarLexer.ELSE,
            ArtGrammarLexer.WHILE,
            ArtGrammarLexer.DO,
            ArtGrammarLexer.TRUE,
            ArtGrammarLexer.FALSE,

            ArtGrammarLexer.NOT,
            ArtGrammarLexer.ASSIGN, //ASS
            ArtGrammarLexer.TO,
            ArtGrammarLexer.FOR  
        };

        private readonly int[] _delimeters = new int[]
        {
            ArtGrammarLexer.DOT,
            ArtGrammarLexer.COMMA,
            ArtGrammarLexer.SEMI,
            ArtGrammarLexer.COLON,

            ArtGrammarLexer.LPAREN,
            ArtGrammarLexer.RPAREN,
            ArtGrammarLexer.LCURLY,
            ArtGrammarLexer.RCURLY,

            ArtGrammarLexer.PLUS,
            ArtGrammarLexer.MINUS,
            ArtGrammarLexer.STAR,
            ArtGrammarLexer.SLASH,

            ArtGrammarLexer.INTEGER,
            ArtGrammarLexer.BOOLEAN,
            ArtGrammarLexer.REAL,

            ArtGrammarLexer.NOT_EQUAL,
            ArtGrammarLexer.EQUAL,
            ArtGrammarLexer.GE,
            ArtGrammarLexer.GT,
            ArtGrammarLexer.LT,
            ArtGrammarLexer.LE
        };
        #endregion

        public List<TokenWrapper> Identifiers
        { 
            get
            { 
                return _tokensWrapper.Tokens.FindAll(node => node.Type == ArtGrammarLexer.IDENT); 
            }
        }
        public List<TokenWrapper> Numerics
        { 
            get
            { 
                return _tokensWrapper.Tokens.FindAll(node => node.Type.IsNumeric()); 
            }
        }
        public List<TokenWrapper> KeyWords
        {
            get
            {
                return _tokensWrapper.Tokens.FindAll(node => _keyWords.Contains(node.Type));
            }
        }
        public List<TokenWrapper> Delimeters
        {
            get
            {
                return _tokensWrapper.Tokens.FindAll(node => _delimeters.Contains(node.Type));
            }
        }
        public List<RecognitionException> _recognitionExceptions;
        public TreeWrapper AST { get; private set; }

        public void Update(string text)
        {
            IsUpdating = true;

            var stream = new ANTLRStringStream(text);
            var lexer = new ArtGrammarLexer(stream, new RecognizerSharedState() { errorRecovery = true });

            var tokenStream = new CommonTokenStream(lexer);
            var parser = new ArtGrammarParser(tokenStream);

            AST = new TreeWrapper(parser.program().Tree as ITree);
            _tokensWrapper = new TokenListWrapper(tokenStream.GetTokens());
            _errorsCount = parser.NumberOfSyntaxErrors;
            _recognitionExceptions = parser.RecognitionExceptions;

            if (_recognitionExceptions.Count == 0)
            {
                var semantics = new ArtGrammarSemantics(AST);
                _recognitionExceptions.AddRange(semantics.RecognitionErrors);
            }

            if (DataLoaded != null)
                DataLoaded();

            IsUpdating = false;
        }

        public string GetTablePointers()
        {
            var result = new string[_tokensWrapper.Tokens.Count];

            var tokenTable = new[] { KeyWords, Delimeters, Identifiers, Numerics  };
            BitArray[] tokenUsage = new BitArray[tokenTable.Length];

            for (int i = 0; i < _tokensWrapper.Tokens.Count; i++)
            {
                var token = _tokensWrapper.Tokens[i];
                for (int j = 0; j < tokenTable.Length; j++)
                {
                    var tableTokens = tokenTable[j];
                    tokenUsage[j] = tokenUsage[j] ?? new BitArray(tableTokens.Count);

                    for (int k = 0; k < tableTokens.Count; k++)
                    {
                        if (tableTokens[k].Type == token.Type && !tokenUsage[j].Get(k))
                        {
                            result[i] = string.Format("({0},{1})", j, k);
                            tokenUsage[j].Set(k, true);
                            goto found;
                        }
                    }
                }
                found:;
            }

            return string.Join(" ", result);
        }

        public string ErrorsToString()
        {
            if (_recognitionExceptions.Count == 0)
                return "There are no errors reconized by parser.";

            var stringErrors = new string[_recognitionExceptions.Count]; 
            for (int i = 0; i < _recognitionExceptions.Count; i++)
            {
                var error = _recognitionExceptions[i];
                stringErrors[i] = string.Format("{0} '{1}' at line {2} position {3}",
                    error.Message, error.Token.Text, error.Line, error.CharPositionInLine);
            }

            return string.Join("\r\n", stringErrors);
        }
    }
}