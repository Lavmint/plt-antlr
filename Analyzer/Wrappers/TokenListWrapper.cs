using System;
using Antlr.Runtime;
using System.Collections.Generic;

namespace Analyzer.Wrappers
{
    public class TokenListWrapper
    {
        private readonly List<TokenWrapper> _tokens;

        public TokenListWrapper(List<IToken> tokens)
        {
            _tokens = new List<TokenWrapper>();
            foreach (var token in tokens)
            {
                _tokens.Add(new TokenWrapper(token));
            }
        }

        public List<TokenWrapper> Tokens
        {
            get
            {
                return _tokens;
            }
        }
    }
}

