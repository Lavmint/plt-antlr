using System;
using Antlr.Runtime;

namespace Analyzer.Wrappers
{
    public class TokenWrapper
    {
        private readonly IToken _token;

        public TokenWrapper(IToken token)
        {
            _token = token;
        }

        public int Type
        {
            get { return _token.Type; }
        }

        public string Text
        {
            get { return _token.Text; }
        }
    }
}

