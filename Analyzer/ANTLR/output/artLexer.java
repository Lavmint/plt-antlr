// $ANTLR 3.4 /data/cloud/Git/PLT/Analyzer/ANTLR/art.g 2015-12-05 01:04:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class artLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ASSIGN=5;
    public static final int BEGIN=6;
    public static final int BLOCK=7;
    public static final int BOOLEAN=8;
    public static final int COLON=9;
    public static final int COMMA=10;
    public static final int COMMENT=11;
    public static final int DO=12;
    public static final int DOT=13;
    public static final int ELSE=14;
    public static final int END=15;
    public static final int EQUAL=16;
    public static final int EXPONENT=17;
    public static final int FALSE=18;
    public static final int FOR=19;
    public static final int GE=20;
    public static final int GT=21;
    public static final int IDENT=22;
    public static final int IDLIST=23;
    public static final int IF=24;
    public static final int INTEGER=25;
    public static final int LCURLY=26;
    public static final int LE=27;
    public static final int LPAREN=28;
    public static final int LT=29;
    public static final int MINUS=30;
    public static final int NOT=31;
    public static final int NOT_EQUAL=32;
    public static final int NUMLIST=33;
    public static final int NUM_BIN=34;
    public static final int NUM_DEC=35;
    public static final int NUM_HEX=36;
    public static final int NUM_OCT=37;
    public static final int NUM_REAL=38;
    public static final int OR=39;
    public static final int PLUS=40;
    public static final int PROGRAM=41;
    public static final int RCURLY=42;
    public static final int READ=43;
    public static final int REAL=44;
    public static final int RPAREN=45;
    public static final int SEMI=46;
    public static final int SLASH=47;
    public static final int STAR=48;
    public static final int THEN=49;
    public static final int TO=50;
    public static final int TRUE=51;
    public static final int VAR=52;
    public static final int VARDECL=53;
    public static final int WHILE=54;
    public static final int WRITE=55;
    public static final int WS=56;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public artLexer() {} 
    public artLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public artLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/data/cloud/Git/PLT/Analyzer/ANTLR/art.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:2:5: ( 'and' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:2:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:3:8: ( 'ass' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:3:10: 'ass'
            {
            match("ass"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:4:7: ( 'begin' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:4:9: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:5:9: ( '$' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:5:11: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:6:7: ( ':' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:6:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:7:7: ( ',' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:8:4: ( 'do' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:8:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:9:5: ( '.' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:9:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:10:6: ( 'else' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:10:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:11:5: ( 'end' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:11:7: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:12:7: ( '=' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:13:7: ( 'false' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:13:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:14:5: ( 'for' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:14:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:15:4: ( '>=' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:15:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:16:4: ( '>' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:16:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:17:4: ( 'if' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:17:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:18:9: ( '%' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:18:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:19:8: ( '{' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:19:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:20:4: ( '<=' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:20:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:21:8: ( '(' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:21:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:22:4: ( '<' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:22:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:23:7: ( '-' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:23:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:24:5: ( 'not' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:24:7: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:25:11: ( '<>' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:25:13: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:26:4: ( 'or' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:26:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:27:6: ( '+' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:27:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:28:9: ( 'program' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:28:11: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:29:8: ( '}' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:29:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:30:6: ( 'read' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:30:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:31:6: ( '!' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:31:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:32:8: ( ')' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:32:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:33:6: ( ';' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:33:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:34:7: ( '/' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:34:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:35:6: ( '*' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:35:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:36:6: ( 'then' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:36:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:37:4: ( 'to' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:37:6: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:38:6: ( 'true' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:38:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:39:5: ( 'var' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:39:7: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:40:7: ( 'while' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:40:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:41:7: ( 'write' )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:41:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:9: ( ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:11: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:11: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt2=1;
                }
                break;
            case '\t':
                {
                alt2=2;
                }
                break;
            case '\f':
                {
                alt2=3;
                }
                break;
            case '\n':
            case '\r':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:12: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:16: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:21: '\\f'
                    {
                    match('\f'); 

                    }
                    break;
                case 4 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:26: ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:26: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt1=3;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='\r') ) {
                        int LA1_1 = input.LA(2);

                        if ( (LA1_1=='\n') ) {
                            alt1=1;
                        }
                        else {
                            alt1=2;
                        }
                    }
                    else if ( (LA1_0=='\n') ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;

                    }
                    switch (alt1) {
                        case 1 :
                            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:27: '\\r\\n'
                            {
                            match("\r\n"); 



                            }
                            break;
                        case 2 :
                            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:34: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:58:39: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                      

                    }
                    break;

            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:59:9: ( LCURLY ( . )* RCURLY )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:59:11: LCURLY ( . )* RCURLY
            {
            mLCURLY(); 


            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:59:17: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='}') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '|')||(LA3_0 >= '~' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:59:18: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            mRCURLY(); 


            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:62:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:62:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:62:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "NUM_BIN"
    public final void mNUM_BIN() throws RecognitionException {
        try {
            int _type = NUM_BIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:64:9: ( ( '0' .. '1' )+ ( 'B' | 'b' ) )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:64:11: ( '0' .. '1' )+ ( 'B' | 'b' )
            {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:64:11: ( '0' .. '1' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '1')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_BIN"

    // $ANTLR start "NUM_OCT"
    public final void mNUM_OCT() throws RecognitionException {
        try {
            int _type = NUM_OCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:65:9: ( ( '0' .. '7' )+ ( 'O' | 'o' ) )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:65:11: ( '0' .. '7' )+ ( 'O' | 'o' )
            {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:65:11: ( '0' .. '7' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '7')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_OCT"

    // $ANTLR start "NUM_DEC"
    public final void mNUM_DEC() throws RecognitionException {
        try {
            int _type = NUM_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:66:9: ( ( '0' .. '9' )+ ( 'D' | 'd' )? )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:66:11: ( '0' .. '9' )+ ( 'D' | 'd' )?
            {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:66:11: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:66:22: ( 'D' | 'd' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='D'||LA8_0=='d') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_DEC"

    // $ANTLR start "NUM_HEX"
    public final void mNUM_HEX() throws RecognitionException {
        try {
            int _type = NUM_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:67:9: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( 'H' | 'h' ) )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:67:11: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ ( 'H' | 'h' )
            {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:67:11: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'F')||(LA9_0 >= 'a' && LA9_0 <= 'f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_HEX"

    // $ANTLR start "NUM_REAL"
    public final void mNUM_REAL() throws RecognitionException {
        try {
            int _type = NUM_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:9: ( ( '0' .. '9' )+ EXPONENT | ( '0' .. '9' )? DOT ( '0' .. '9' )+ ( EXPONENT )? )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1 >= '0' && LA14_1 <= '9')||LA14_1=='E'||LA14_1=='e') ) {
                    alt14=1;
                }
                else if ( (LA14_1=='.') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA14_0=='.') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:11: ( '0' .. '9' )+ EXPONENT
                    {
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:11: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;
                case 2 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:31: ( '0' .. '9' )? DOT ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:31: ( '0' .. '9' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
                            {
                            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    mDOT(); 


                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:45: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:57: ( EXPONENT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:69:57: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_REAL"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:70:18: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:70:21: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:70:31: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:70:42: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    public void mTokens() throws RecognitionException {
        // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:8: ( AND | ASSIGN | BEGIN | BOOLEAN | COLON | COMMA | DO | DOT | ELSE | END | EQUAL | FALSE | FOR | GE | GT | IF | INTEGER | LCURLY | LE | LPAREN | LT | MINUS | NOT | NOT_EQUAL | OR | PLUS | PROGRAM | RCURLY | READ | REAL | RPAREN | SEMI | SLASH | STAR | THEN | TO | TRUE | VAR | WHILE | WRITE | WS | COMMENT | IDENT | NUM_BIN | NUM_OCT | NUM_DEC | NUM_HEX | NUM_REAL )
        int alt17=48;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:10: AND
                {
                mAND(); 


                }
                break;
            case 2 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:14: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 3 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:21: BEGIN
                {
                mBEGIN(); 


                }
                break;
            case 4 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:27: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 5 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:35: COLON
                {
                mCOLON(); 


                }
                break;
            case 6 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:41: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 7 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:47: DO
                {
                mDO(); 


                }
                break;
            case 8 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:50: DOT
                {
                mDOT(); 


                }
                break;
            case 9 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:54: ELSE
                {
                mELSE(); 


                }
                break;
            case 10 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:59: END
                {
                mEND(); 


                }
                break;
            case 11 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:63: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 12 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:69: FALSE
                {
                mFALSE(); 


                }
                break;
            case 13 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:75: FOR
                {
                mFOR(); 


                }
                break;
            case 14 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:79: GE
                {
                mGE(); 


                }
                break;
            case 15 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:82: GT
                {
                mGT(); 


                }
                break;
            case 16 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:85: IF
                {
                mIF(); 


                }
                break;
            case 17 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:88: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 18 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:96: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 19 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:103: LE
                {
                mLE(); 


                }
                break;
            case 20 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:106: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 21 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:113: LT
                {
                mLT(); 


                }
                break;
            case 22 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:116: MINUS
                {
                mMINUS(); 


                }
                break;
            case 23 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:122: NOT
                {
                mNOT(); 


                }
                break;
            case 24 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:126: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 25 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:136: OR
                {
                mOR(); 


                }
                break;
            case 26 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:139: PLUS
                {
                mPLUS(); 


                }
                break;
            case 27 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:144: PROGRAM
                {
                mPROGRAM(); 


                }
                break;
            case 28 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:152: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 29 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:159: READ
                {
                mREAD(); 


                }
                break;
            case 30 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:164: REAL
                {
                mREAL(); 


                }
                break;
            case 31 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:169: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 32 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:176: SEMI
                {
                mSEMI(); 


                }
                break;
            case 33 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:181: SLASH
                {
                mSLASH(); 


                }
                break;
            case 34 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:187: STAR
                {
                mSTAR(); 


                }
                break;
            case 35 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:192: THEN
                {
                mTHEN(); 


                }
                break;
            case 36 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:197: TO
                {
                mTO(); 


                }
                break;
            case 37 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:200: TRUE
                {
                mTRUE(); 


                }
                break;
            case 38 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:205: VAR
                {
                mVAR(); 


                }
                break;
            case 39 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:209: WHILE
                {
                mWHILE(); 


                }
                break;
            case 40 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:215: WRITE
                {
                mWRITE(); 


                }
                break;
            case 41 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:221: WS
                {
                mWS(); 


                }
                break;
            case 42 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:224: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 43 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:232: IDENT
                {
                mIDENT(); 


                }
                break;
            case 44 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:238: NUM_BIN
                {
                mNUM_BIN(); 


                }
                break;
            case 45 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:246: NUM_OCT
                {
                mNUM_OCT(); 


                }
                break;
            case 46 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:254: NUM_DEC
                {
                mNUM_DEC(); 


                }
                break;
            case 47 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:262: NUM_HEX
                {
                mNUM_HEX(); 


                }
                break;
            case 48 :
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:1:270: NUM_REAL
                {
                mNUM_REAL(); 


                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\45\3\uffff\1\45\1\54\1\45\1\uffff\1\45\1\63\1\45\1\uffff"+
        "\1\65\1\71\2\uffff\2\45\1\uffff\1\45\1\uffff\1\45\5\uffff\3\45\1"+
        "\uffff\1\45\3\111\1\uffff\2\45\1\uffff\2\45\1\120\2\uffff\4\45\2"+
        "\uffff\1\125\5\uffff\1\45\1\127\3\45\1\133\4\45\1\140\1\111\1\uffff"+
        "\2\111\1\uffff\1\111\2\uffff\1\142\1\143\1\45\1\uffff\1\45\1\146"+
        "\1\45\1\150\1\uffff\1\151\1\uffff\3\45\1\uffff\1\45\1\156\2\45\1"+
        "\uffff\1\55\2\uffff\1\45\1\162\1\uffff\1\45\2\uffff\1\45\1\165\1"+
        "\166\1\167\1\uffff\2\45\1\172\1\uffff\1\173\1\45\3\uffff\1\175\1"+
        "\176\2\uffff\1\45\2\uffff\1\u0080\1\uffff";
    static final String DFA17_eofS =
        "\u0081\uffff";
    static final String DFA17_minS =
        "\1\11\2\60\3\uffff\3\60\1\uffff\1\60\1\75\1\146\1\uffff\1\0\1\75"+
        "\2\uffff\1\157\1\162\1\uffff\1\162\1\uffff\1\145\5\uffff\1\150\1"+
        "\141\1\150\1\uffff\1\60\3\56\1\uffff\1\144\1\163\1\uffff\3\60\2"+
        "\uffff\1\163\1\144\1\60\1\162\2\uffff\1\60\5\uffff\1\164\1\60\1"+
        "\157\1\141\1\145\1\60\1\165\1\162\2\151\2\60\1\uffff\2\60\1\uffff"+
        "\1\60\1\uffff\1\53\2\60\1\151\1\uffff\1\145\1\60\1\163\1\60\1\uffff"+
        "\1\60\1\uffff\1\147\1\144\1\156\1\uffff\1\145\1\60\1\154\1\164\1"+
        "\uffff\1\60\2\uffff\1\156\1\60\1\uffff\1\145\2\uffff\1\162\3\60"+
        "\1\uffff\2\145\1\60\1\uffff\1\60\1\141\3\uffff\2\60\2\uffff\1\155"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\175\1\163\1\150\3\uffff\1\157\1\71\1\156\1\uffff\1\157\1\75\1"+
        "\146\1\uffff\1\uffff\1\76\2\uffff\1\157\1\162\1\uffff\1\162\1\uffff"+
        "\1\145\5\uffff\1\162\1\141\1\162\1\uffff\1\150\2\157\1\150\1\uffff"+
        "\1\144\1\163\1\uffff\2\150\1\172\2\uffff\1\163\1\144\1\154\1\162"+
        "\2\uffff\1\172\5\uffff\1\164\1\172\1\157\1\141\1\145\1\172\1\165"+
        "\1\162\2\151\1\150\1\157\1\uffff\1\157\1\150\1\uffff\1\150\1\uffff"+
        "\1\150\2\172\1\151\1\uffff\1\145\1\172\1\163\1\172\1\uffff\1\172"+
        "\1\uffff\1\147\1\144\1\156\1\uffff\1\145\1\172\1\154\1\164\1\uffff"+
        "\1\150\2\uffff\1\156\1\172\1\uffff\1\145\2\uffff\1\162\3\172\1\uffff"+
        "\2\145\1\172\1\uffff\1\172\1\141\3\uffff\2\172\2\uffff\1\155\2\uffff"+
        "\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\4\1\5\1\6\3\uffff\1\13\3\uffff\1\21\2\uffff\1\24\1\26"+
        "\2\uffff\1\32\1\uffff\1\34\1\uffff\1\36\1\37\1\40\1\41\1\42\3\uffff"+
        "\1\51\4\uffff\1\53\2\uffff\1\53\3\uffff\1\10\1\60\4\uffff\1\16\1"+
        "\17\1\uffff\1\22\1\52\1\23\1\30\1\25\14\uffff\1\55\2\uffff\1\56"+
        "\1\uffff\1\57\4\uffff\1\7\4\uffff\1\20\1\uffff\1\31\3\uffff\1\44"+
        "\4\uffff\1\54\1\uffff\1\1\1\2\2\uffff\1\12\1\uffff\1\15\1\27\4\uffff"+
        "\1\46\3\uffff\1\11\2\uffff\1\35\1\43\1\45\2\uffff\1\3\1\14\1\uffff"+
        "\1\47\1\50\1\uffff\1\33";
    static final String DFA17_specialS =
        "\16\uffff\1\0\162\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\1\30\2\uffff\1\3\1\15\2\uffff"+
            "\1\20\1\31\1\34\1\24\1\5\1\21\1\7\1\33\2\42\6\43\2\44\1\4\1"+
            "\32\1\17\1\11\1\13\2\uffff\6\41\24\45\6\uffff\1\1\1\2\1\41\1"+
            "\6\1\10\1\12\2\45\1\14\4\45\1\22\1\23\1\25\1\45\1\27\1\45\1"+
            "\35\1\45\1\36\1\37\3\45\1\16\1\uffff\1\26",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\uffff\1\50"+
            "\5\uffff\1\46\4\uffff\1\47",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\4\51\1\52\1\51\1"+
            "\uffff\1\50",
            "",
            "",
            "",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\uffff\1\50"+
            "\6\uffff\1\53",
            "\12\55",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\uffff\1\50"+
            "\3\uffff\1\56\1\uffff\1\57",
            "",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\1\60\5\51\1\uffff"+
            "\1\50\6\uffff\1\61",
            "\1\62",
            "\1\64",
            "",
            "\0\66",
            "\1\67\1\70",
            "",
            "",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\76\6\uffff\1\77\2\uffff\1\100",
            "\1\101",
            "\1\102\11\uffff\1\103",
            "",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\uffff\1\50",
            "\1\55\1\uffff\2\105\6\107\2\112\7\uffff\1\113\1\104\1\113\1"+
            "\110\1\114\1\113\1\uffff\1\113\6\uffff\1\106\21\uffff\1\113"+
            "\1\104\1\113\1\110\1\114\1\113\1\uffff\1\113\6\uffff\1\106",
            "\1\55\1\uffff\10\107\2\112\7\uffff\3\113\1\110\1\114\1\113"+
            "\1\uffff\1\113\6\uffff\1\106\21\uffff\3\113\1\110\1\114\1\113"+
            "\1\uffff\1\113\6\uffff\1\106",
            "\1\55\1\uffff\12\112\7\uffff\3\113\1\110\1\114\1\113\1\uffff"+
            "\1\113\30\uffff\3\113\1\110\1\114\1\113\1\uffff\1\113",
            "",
            "\1\115",
            "\1\116",
            "",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\uffff\1\50",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\117\1\50",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "",
            "\1\121",
            "\1\122",
            "\12\51\7\uffff\6\51\1\uffff\1\50\30\uffff\6\51\1\uffff\1\50"+
            "\3\uffff\1\123",
            "\1\124",
            "",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\113\7\uffff\6\113\1\uffff\1\113\30\uffff\6\113\1\uffff"+
            "\1\113",
            "\2\105\6\107\2\112\7\uffff\1\113\1\104\1\113\1\110\1\114\1"+
            "\113\1\uffff\1\113\6\uffff\1\106\21\uffff\1\113\1\104\1\113"+
            "\1\110\1\114\1\113\1\uffff\1\113\6\uffff\1\106",
            "",
            "\10\107\2\112\7\uffff\3\113\1\110\1\114\1\113\1\uffff\1\113"+
            "\6\uffff\1\106\21\uffff\3\113\1\110\1\114\1\113\1\uffff\1\113"+
            "\6\uffff\1\106",
            "\12\113\7\uffff\6\113\1\uffff\1\113\30\uffff\6\113\1\uffff"+
            "\1\113",
            "",
            "\12\112\7\uffff\3\113\1\110\1\114\1\113\1\uffff\1\113\30\uffff"+
            "\3\113\1\110\1\114\1\113\1\uffff\1\113",
            "",
            "\1\55\1\uffff\1\55\2\uffff\12\141\7\uffff\6\113\1\uffff\1\113"+
            "\30\uffff\6\113\1\uffff\1\113",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\1\144",
            "",
            "\1\145",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\1\147",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\1\157",
            "\1\160",
            "",
            "\12\141\7\uffff\6\113\1\uffff\1\113\30\uffff\6\113\1\uffff"+
            "\1\113",
            "",
            "",
            "\1\161",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "\1\163",
            "",
            "",
            "\1\164",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "\1\170",
            "\1\171",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\1\174",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            "",
            "",
            "\1\177",
            "",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( AND | ASSIGN | BEGIN | BOOLEAN | COLON | COMMA | DO | DOT | ELSE | END | EQUAL | FALSE | FOR | GE | GT | IF | INTEGER | LCURLY | LE | LPAREN | LT | MINUS | NOT | NOT_EQUAL | OR | PLUS | PROGRAM | RCURLY | READ | REAL | RPAREN | SEMI | SLASH | STAR | THEN | TO | TRUE | VAR | WHILE | WRITE | WS | COMMENT | IDENT | NUM_BIN | NUM_OCT | NUM_DEC | NUM_HEX | NUM_REAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_14 = input.LA(1);

                        s = -1;
                        if ( ((LA17_14 >= '\u0000' && LA17_14 <= '\uFFFF')) ) {s = 54;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}