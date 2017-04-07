using System;
using Analyzer.Wrappers;

namespace Analyzer.Utils
{
    public static class Extensions
    {
        public static bool IsNumeric(this int type)
        {
            return type == ArtGrammarLexer.NUM_BIN
                || type == ArtGrammarLexer.NUM_OCT
                || type == ArtGrammarLexer.NUM_DEC
                || type == ArtGrammarLexer.NUM_HEX
                || type == ArtGrammarLexer.NUM_REAL;
        }

        public static string TypeName(this int type)
        {
            switch (type)
            {
                case ArtGrammarLexer.NUM_BIN:
                case ArtGrammarLexer.NUM_HEX:
                case ArtGrammarLexer.NUM_DEC:
                case ArtGrammarLexer.NUM_OCT:
                case ArtGrammarLexer.INTEGER:
                    return "Integer";
                case ArtGrammarLexer.REAL:
                case ArtGrammarLexer.NUM_REAL:
                    return "Float";
                case ArtGrammarLexer.BOOLEAN:
                    return "Boolean";
                default:
                    return "Unresolvable type";
            }
        }

        public static int AgreageType(this int type)
        {
            switch (type)
            {
                case ArtGrammarLexer.NUM_BIN:
                case ArtGrammarLexer.NUM_HEX:
                case ArtGrammarLexer.NUM_DEC:
                case ArtGrammarLexer.NUM_OCT:
                case ArtGrammarLexer.INTEGER:
                    return ArtGrammarLexer.INTEGER;
                
                case ArtGrammarLexer.REAL:
                case ArtGrammarLexer.NUM_REAL:
                    return ArtGrammarLexer.REAL;

                case ArtGrammarLexer.BOOLEAN:
                    return ArtGrammarLexer.BOOLEAN;
                default:
                    return -1;
            }
        }
    }
}

