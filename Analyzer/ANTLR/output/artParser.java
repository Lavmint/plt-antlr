// $ANTLR 3.4 /data/cloud/Git/PLT/Analyzer/ANTLR/art.g 2015-12-05 01:04:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class artParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BEGIN", "BLOCK", "BOOLEAN", "COLON", "COMMA", "COMMENT", "DO", "DOT", "ELSE", "END", "EQUAL", "EXPONENT", "FALSE", "FOR", "GE", "GT", "IDENT", "IDLIST", "IF", "INTEGER", "LCURLY", "LE", "LPAREN", "LT", "MINUS", "NOT", "NOT_EQUAL", "NUMLIST", "NUM_BIN", "NUM_DEC", "NUM_HEX", "NUM_OCT", "NUM_REAL", "OR", "PLUS", "PROGRAM", "RCURLY", "READ", "REAL", "RPAREN", "SEMI", "SLASH", "STAR", "THEN", "TO", "TRUE", "VAR", "VARDECL", "WHILE", "WRITE", "WS"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "variableDeclaration", "forStatement", "num", "parameterList", 
    "operand", "term", "operators", "variableDeclarationPart", "emptyStatement", 
    "conditionalStatement", "empty", "compoundStatement", "num_oct", "num_real", 
    "program", "num_dec", "writeStatement", "num_hex", "num_bin", "expression", 
    "factor", "ifStatement", "readStatement", "identifierList", "logical", 
    "whileStatement", "assignmentStatement", "identifier", "type", "operator"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public artParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public artParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public artParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return artParser.tokenNames; }
    public String getGrammarFileName() { return "/data/cloud/Git/PLT/Analyzer/ANTLR/art.g"; }


    public static class num_bin_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_bin"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:73:1: num_bin : NUM_BIN ;
    public final artParser.num_bin_return num_bin() throws RecognitionException {
        artParser.num_bin_return retval = new artParser.num_bin_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_BIN1=null;

        Object NUM_BIN1_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num_bin");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:73:9: ( NUM_BIN )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:73:11: NUM_BIN
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(73,11);
            NUM_BIN1=(Token)match(input,NUM_BIN,FOLLOW_NUM_BIN_in_num_bin1376); 
            NUM_BIN1_tree = 
            (Object)adaptor.create(NUM_BIN1)
            ;
            adaptor.addChild(root_0, NUM_BIN1_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(73, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num_bin");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num_bin"


    public static class num_oct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_oct"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:74:1: num_oct : NUM_OCT ;
    public final artParser.num_oct_return num_oct() throws RecognitionException {
        artParser.num_oct_return retval = new artParser.num_oct_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_OCT2=null;

        Object NUM_OCT2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num_oct");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:74:9: ( NUM_OCT )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:74:11: NUM_OCT
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(74,11);
            NUM_OCT2=(Token)match(input,NUM_OCT,FOLLOW_NUM_OCT_in_num_oct1383); 
            NUM_OCT2_tree = 
            (Object)adaptor.create(NUM_OCT2)
            ;
            adaptor.addChild(root_0, NUM_OCT2_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(74, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num_oct");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num_oct"


    public static class num_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_dec"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:75:1: num_dec : NUM_DEC ;
    public final artParser.num_dec_return num_dec() throws RecognitionException {
        artParser.num_dec_return retval = new artParser.num_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_DEC3=null;

        Object NUM_DEC3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num_dec");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:75:9: ( NUM_DEC )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:75:11: NUM_DEC
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(75,11);
            NUM_DEC3=(Token)match(input,NUM_DEC,FOLLOW_NUM_DEC_in_num_dec1390); 
            NUM_DEC3_tree = 
            (Object)adaptor.create(NUM_DEC3)
            ;
            adaptor.addChild(root_0, NUM_DEC3_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(75, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num_dec");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num_dec"


    public static class num_hex_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_hex"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:76:1: num_hex : NUM_HEX ;
    public final artParser.num_hex_return num_hex() throws RecognitionException {
        artParser.num_hex_return retval = new artParser.num_hex_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_HEX4=null;

        Object NUM_HEX4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num_hex");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:76:9: ( NUM_HEX )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:76:11: NUM_HEX
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(76,11);
            NUM_HEX4=(Token)match(input,NUM_HEX,FOLLOW_NUM_HEX_in_num_hex1397); 
            NUM_HEX4_tree = 
            (Object)adaptor.create(NUM_HEX4)
            ;
            adaptor.addChild(root_0, NUM_HEX4_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(76, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num_hex");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num_hex"


    public static class num_real_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_real"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:77:1: num_real : NUM_REAL ;
    public final artParser.num_real_return num_real() throws RecognitionException {
        artParser.num_real_return retval = new artParser.num_real_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM_REAL5=null;

        Object NUM_REAL5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "num_real");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:77:9: ( NUM_REAL )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:77:11: NUM_REAL
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(77,11);
            NUM_REAL5=(Token)match(input,NUM_REAL,FOLLOW_NUM_REAL_in_num_real1403); 
            NUM_REAL5_tree = 
            (Object)adaptor.create(NUM_REAL5)
            ;
            adaptor.addChild(root_0, NUM_REAL5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(77, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num_real");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num_real"


    public static class num_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:1: num : ( num_bin | num_oct | num_dec | num_hex | num_real );
    public final artParser.num_return num() throws RecognitionException {
        artParser.num_return retval = new artParser.num_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        artParser.num_bin_return num_bin6 =null;

        artParser.num_oct_return num_oct7 =null;

        artParser.num_dec_return num_dec8 =null;

        artParser.num_hex_return num_hex9 =null;

        artParser.num_real_return num_real10 =null;



        try { dbg.enterRule(getGrammarFileName(), "num");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:5: ( num_bin | num_oct | num_dec | num_hex | num_real )
            int alt1=5;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            switch ( input.LA(1) ) {
            case NUM_BIN:
                {
                alt1=1;
                }
                break;
            case NUM_OCT:
                {
                alt1=2;
                }
                break;
            case NUM_DEC:
                {
                alt1=3;
                }
                break;
            case NUM_HEX:
                {
                alt1=4;
                }
                break;
            case NUM_REAL:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:7: num_bin
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(78,7);
                    pushFollow(FOLLOW_num_bin_in_num1410);
                    num_bin6=num_bin();

                    state._fsp--;

                    adaptor.addChild(root_0, num_bin6.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:15: num_oct
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(78,15);
                    pushFollow(FOLLOW_num_oct_in_num1412);
                    num_oct7=num_oct();

                    state._fsp--;

                    adaptor.addChild(root_0, num_oct7.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:23: num_dec
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(78,23);
                    pushFollow(FOLLOW_num_dec_in_num1414);
                    num_dec8=num_dec();

                    state._fsp--;

                    adaptor.addChild(root_0, num_dec8.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:31: num_hex
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(78,31);
                    pushFollow(FOLLOW_num_hex_in_num1416);
                    num_hex9=num_hex();

                    state._fsp--;

                    adaptor.addChild(root_0, num_hex9.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:78:39: num_real
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(78,39);
                    pushFollow(FOLLOW_num_real_in_num1418);
                    num_real10=num_real();

                    state._fsp--;

                    adaptor.addChild(root_0, num_real10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(78, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "num");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "num"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:80:1: identifier : IDENT ;
    public final artParser.identifier_return identifier() throws RecognitionException {
        artParser.identifier_return retval = new artParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENT11=null;

        Object IDENT11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:81:6: ( IDENT )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:81:8: IDENT
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(81,8);
            IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_identifier1433); 
            IDENT11_tree = 
            (Object)adaptor.create(IDENT11)
            ;
            adaptor.addChild(root_0, IDENT11_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(81, 12);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identifier"


    public static class logical_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:82:1: logical : ( TRUE | FALSE );
    public final artParser.logical_return logical() throws RecognitionException {
        artParser.logical_return retval = new artParser.logical_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logical");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:82:9: ( TRUE | FALSE )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(82,9);
            set12=(Token)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set12)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(82, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logical");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logical"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:84:1: type : ( BOOLEAN | INTEGER | REAL );
    public final artParser.type_return type() throws RecognitionException {
        artParser.type_return retval = new artParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:84:6: ( BOOLEAN | INTEGER | REAL )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(84,6);
            set13=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==INTEGER||input.LA(1)==REAL ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set13)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(84, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:87:1: expression : operand ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^) operand )* ;
    public final artParser.expression_return expression() throws RecognitionException {
        artParser.expression_return retval = new artParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL15=null;
        Token NOT_EQUAL16=null;
        Token LT17=null;
        Token LE18=null;
        Token GE19=null;
        Token GT20=null;
        artParser.operand_return operand14 =null;

        artParser.operand_return operand21 =null;


        Object EQUAL15_tree=null;
        Object NOT_EQUAL16_tree=null;
        Object LT17_tree=null;
        Object LE18_tree=null;
        Object GE19_tree=null;
        Object GT20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:5: ( operand ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^) operand )* )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:7: operand ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^) operand )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(88,7);
            pushFollow(FOLLOW_operand_in_expression1467);
            operand14=operand();

            state._fsp--;

            adaptor.addChild(root_0, operand14.getTree());
            dbg.location(88,15);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:15: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^) operand )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==EQUAL||(LA3_0 >= GE && LA3_0 <= GT)||LA3_0==LE||LA3_0==LT||LA3_0==NOT_EQUAL) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:16: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^) operand
            	    {
            	    dbg.location(88,16);
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:16: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GE ^| GT ^)
            	    int alt2=6;
            	    try { dbg.enterSubRule(2);
            	    try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            	    switch ( input.LA(1) ) {
            	    case EQUAL:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case NOT_EQUAL:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    case LE:
            	        {
            	        alt2=4;
            	        }
            	        break;
            	    case GE:
            	        {
            	        alt2=5;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt2=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }

            	    } finally {dbg.exitDecision(2);}

            	    switch (alt2) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:17: EQUAL ^
            	            {
            	            dbg.location(88,22);
            	            EQUAL15=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expression1471); 
            	            EQUAL15_tree = 
            	            (Object)adaptor.create(EQUAL15)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQUAL15_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:26: NOT_EQUAL ^
            	            {
            	            dbg.location(88,35);
            	            NOT_EQUAL16=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expression1476); 
            	            NOT_EQUAL16_tree = 
            	            (Object)adaptor.create(NOT_EQUAL16)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(NOT_EQUAL16_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:39: LT ^
            	            {
            	            dbg.location(88,41);
            	            LT17=(Token)match(input,LT,FOLLOW_LT_in_expression1481); 
            	            LT17_tree = 
            	            (Object)adaptor.create(LT17)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT17_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:45: LE ^
            	            {
            	            dbg.location(88,47);
            	            LE18=(Token)match(input,LE,FOLLOW_LE_in_expression1486); 
            	            LE18_tree = 
            	            (Object)adaptor.create(LE18)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LE18_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:51: GE ^
            	            {
            	            dbg.location(88,53);
            	            GE19=(Token)match(input,GE,FOLLOW_GE_in_expression1491); 
            	            GE19_tree = 
            	            (Object)adaptor.create(GE19)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GE19_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:88:57: GT ^
            	            {
            	            dbg.location(88,59);
            	            GT20=(Token)match(input,GT,FOLLOW_GT_in_expression1496); 
            	            GT20_tree = 
            	            (Object)adaptor.create(GT20)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT20_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(2);}

            	    dbg.location(88,62);
            	    pushFollow(FOLLOW_operand_in_expression1500);
            	    operand21=operand();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operand21.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(89, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"


    public static class operand_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operand"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:91:1: operand : term ( ( PLUS ^| MINUS ^| OR ^) term )* ;
    public final artParser.operand_return operand() throws RecognitionException {
        artParser.operand_return retval = new artParser.operand_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PLUS23=null;
        Token MINUS24=null;
        Token OR25=null;
        artParser.term_return term22 =null;

        artParser.term_return term26 =null;


        Object PLUS23_tree=null;
        Object MINUS24_tree=null;
        Object OR25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:5: ( term ( ( PLUS ^| MINUS ^| OR ^) term )* )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:7: term ( ( PLUS ^| MINUS ^| OR ^) term )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(92,7);
            pushFollow(FOLLOW_term_in_operand1520);
            term22=term();

            state._fsp--;

            adaptor.addChild(root_0, term22.getTree());
            dbg.location(92,12);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:12: ( ( PLUS ^| MINUS ^| OR ^) term )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==MINUS||(LA5_0 >= OR && LA5_0 <= PLUS)) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:14: ( PLUS ^| MINUS ^| OR ^) term
            	    {
            	    dbg.location(92,14);
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:14: ( PLUS ^| MINUS ^| OR ^)
            	    int alt4=3;
            	    try { dbg.enterSubRule(4);
            	    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            	    switch ( input.LA(1) ) {
            	    case PLUS:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case MINUS:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case OR:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }

            	    } finally {dbg.exitDecision(4);}

            	    switch (alt4) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:15: PLUS ^
            	            {
            	            dbg.location(92,19);
            	            PLUS23=(Token)match(input,PLUS,FOLLOW_PLUS_in_operand1525); 
            	            PLUS23_tree = 
            	            (Object)adaptor.create(PLUS23)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS23_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:23: MINUS ^
            	            {
            	            dbg.location(92,28);
            	            MINUS24=(Token)match(input,MINUS,FOLLOW_MINUS_in_operand1530); 
            	            MINUS24_tree = 
            	            (Object)adaptor.create(MINUS24)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MINUS24_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:92:32: OR ^
            	            {
            	            dbg.location(92,34);
            	            OR25=(Token)match(input,OR,FOLLOW_OR_in_operand1535); 
            	            OR25_tree = 
            	            (Object)adaptor.create(OR25)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(OR25_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(4);}

            	    dbg.location(92,37);
            	    pushFollow(FOLLOW_term_in_operand1539);
            	    term26=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(93, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operand"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:95:1: term : factor ( ( STAR ^| SLASH ^| AND ^) factor )* ;
    public final artParser.term_return term() throws RecognitionException {
        artParser.term_return retval = new artParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STAR28=null;
        Token SLASH29=null;
        Token AND30=null;
        artParser.factor_return factor27 =null;

        artParser.factor_return factor31 =null;


        Object STAR28_tree=null;
        Object SLASH29_tree=null;
        Object AND30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:3: ( factor ( ( STAR ^| SLASH ^| AND ^) factor )* )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:5: factor ( ( STAR ^| SLASH ^| AND ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(96,5);
            pushFollow(FOLLOW_factor_in_term1557);
            factor27=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor27.getTree());
            dbg.location(96,12);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:12: ( ( STAR ^| SLASH ^| AND ^) factor )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==AND||(LA7_0 >= SLASH && LA7_0 <= STAR)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:14: ( STAR ^| SLASH ^| AND ^) factor
            	    {
            	    dbg.location(96,14);
            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:14: ( STAR ^| SLASH ^| AND ^)
            	    int alt6=3;
            	    try { dbg.enterSubRule(6);
            	    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }

            	    } finally {dbg.exitDecision(6);}

            	    switch (alt6) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:15: STAR ^
            	            {
            	            dbg.location(96,19);
            	            STAR28=(Token)match(input,STAR,FOLLOW_STAR_in_term1562); 
            	            STAR28_tree = 
            	            (Object)adaptor.create(STAR28)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR28_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:23: SLASH ^
            	            {
            	            dbg.location(96,28);
            	            SLASH29=(Token)match(input,SLASH,FOLLOW_SLASH_in_term1567); 
            	            SLASH29_tree = 
            	            (Object)adaptor.create(SLASH29)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH29_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:96:32: AND ^
            	            {
            	            dbg.location(96,35);
            	            AND30=(Token)match(input,AND,FOLLOW_AND_in_term1572); 
            	            AND30_tree = 
            	            (Object)adaptor.create(AND30)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AND30_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(6);}

            	    dbg.location(96,38);
            	    pushFollow(FOLLOW_factor_in_term1576);
            	    factor31=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor31.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(97, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:99:1: factor : ( identifier | num -> ^( NUMLIST ( num )+ ) | logical | LPAREN ! expression RPAREN !| NOT ^ factor );
    public final artParser.factor_return factor() throws RecognitionException {
        artParser.factor_return retval = new artParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN35=null;
        Token RPAREN37=null;
        Token NOT38=null;
        artParser.identifier_return identifier32 =null;

        artParser.num_return num33 =null;

        artParser.logical_return logical34 =null;

        artParser.expression_return expression36 =null;

        artParser.factor_return factor39 =null;


        Object LPAREN35_tree=null;
        Object RPAREN37_tree=null;
        Object NOT38_tree=null;
        RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num");
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:100:5: ( identifier | num -> ^( NUMLIST ( num )+ ) | logical | LPAREN ! expression RPAREN !| NOT ^ factor )
            int alt8=5;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt8=1;
                }
                break;
            case NUM_BIN:
            case NUM_DEC:
            case NUM_HEX:
            case NUM_OCT:
            case NUM_REAL:
                {
                alt8=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt8=3;
                }
                break;
            case LPAREN:
                {
                alt8=4;
                }
                break;
            case NOT:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:100:7: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(100,7);
                    pushFollow(FOLLOW_identifier_in_factor1596);
                    identifier32=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier32.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:101:7: num
                    {
                    dbg.location(101,7);
                    pushFollow(FOLLOW_num_in_factor1604);
                    num33=num();

                    state._fsp--;

                    stream_num.add(num33.getTree());

                    // AST REWRITE
                    // elements: num
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:11: -> ^( NUMLIST ( num )+ )
                    {
                        dbg.location(101,14);
                        // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:101:14: ^( NUMLIST ( num )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(101,16);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(NUMLIST, "NUMLIST")
                        , root_1);

                        dbg.location(101,24);
                        if ( !(stream_num.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_num.hasNext() ) {
                            dbg.location(101,24);
                            adaptor.addChild(root_1, stream_num.nextTree());

                        }
                        stream_num.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:102:7: logical
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(102,7);
                    pushFollow(FOLLOW_logical_in_factor1621);
                    logical34=logical();

                    state._fsp--;

                    adaptor.addChild(root_0, logical34.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:103:7: LPAREN ! expression RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(103,13);
                    LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor1629); 
                    dbg.location(103,15);
                    pushFollow(FOLLOW_expression_in_factor1632);
                    expression36=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression36.getTree());
                    dbg.location(103,32);
                    RPAREN37=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor1634); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:104:7: NOT ^ factor
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(104,10);
                    NOT38=(Token)match(input,NOT,FOLLOW_NOT_in_factor1643); 
                    NOT38_tree = 
                    (Object)adaptor.create(NOT38)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT38_tree, root_0);

                    dbg.location(104,12);
                    pushFollow(FOLLOW_factor_in_factor1646);
                    factor39=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(105, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"


    public static class empty_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "empty"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:109:1: empty :;
    public final artParser.empty_return empty() throws RecognitionException {
        artParser.empty_return retval = new artParser.empty_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        try { dbg.enterRule(getGrammarFileName(), "empty");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:110:4: ()
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:111:4: 
            {
            root_0 = (Object)adaptor.nil();


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        finally {
        	// do for sure before leaving
        }
        dbg.location(111, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "empty");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "empty"


    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "emptyStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:113:1: emptyStatement :;
    public final artParser.emptyStatement_return emptyStatement() throws RecognitionException {
        artParser.emptyStatement_return retval = new artParser.emptyStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        try { dbg.enterRule(getGrammarFileName(), "emptyStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:114:4: ()
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:115:4: 
            {
            root_0 = (Object)adaptor.nil();


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        finally {
        	// do for sure before leaving
        }
        dbg.location(115, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "emptyStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "emptyStatement"


    public static class parameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterList"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:117:1: parameterList : expression ( COMMA expression )* ;
    public final artParser.parameterList_return parameterList() throws RecognitionException {
        artParser.parameterList_return retval = new artParser.parameterList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA41=null;
        artParser.expression_return expression40 =null;

        artParser.expression_return expression42 =null;


        Object COMMA41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parameterList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:118:5: ( expression ( COMMA expression )* )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:118:7: expression ( COMMA expression )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(118,7);
            pushFollow(FOLLOW_expression_in_parameterList1692);
            expression40=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression40.getTree());
            dbg.location(118,18);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:118:18: ( COMMA expression )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:118:20: COMMA expression
            	    {
            	    dbg.location(118,20);
            	    COMMA41=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameterList1696); 
            	    COMMA41_tree = 
            	    (Object)adaptor.create(COMMA41)
            	    ;
            	    adaptor.addChild(root_0, COMMA41_tree);

            	    dbg.location(118,26);
            	    pushFollow(FOLLOW_expression_in_parameterList1698);
            	    expression42=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression42.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(119, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parameterList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parameterList"


    public static class writeStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "writeStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:121:1: writeStatement : WRITE ^ LPAREN expression RPAREN ;
    public final artParser.writeStatement_return writeStatement() throws RecognitionException {
        artParser.writeStatement_return retval = new artParser.writeStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WRITE43=null;
        Token LPAREN44=null;
        Token RPAREN46=null;
        artParser.expression_return expression45 =null;


        Object WRITE43_tree=null;
        Object LPAREN44_tree=null;
        Object RPAREN46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "writeStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:122:2: ( WRITE ^ LPAREN expression RPAREN )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:122:4: WRITE ^ LPAREN expression RPAREN
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(122,9);
            WRITE43=(Token)match(input,WRITE,FOLLOW_WRITE_in_writeStatement1719); 
            WRITE43_tree = 
            (Object)adaptor.create(WRITE43)
            ;
            root_0 = (Object)adaptor.becomeRoot(WRITE43_tree, root_0);

            dbg.location(122,11);
            LPAREN44=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_writeStatement1722); 
            LPAREN44_tree = 
            (Object)adaptor.create(LPAREN44)
            ;
            adaptor.addChild(root_0, LPAREN44_tree);

            dbg.location(122,18);
            pushFollow(FOLLOW_expression_in_writeStatement1724);
            expression45=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression45.getTree());
            dbg.location(122,29);
            RPAREN46=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_writeStatement1726); 
            RPAREN46_tree = 
            (Object)adaptor.create(RPAREN46)
            ;
            adaptor.addChild(root_0, RPAREN46_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(123, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "writeStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "writeStatement"


    public static class readStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "readStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:125:1: readStatement : READ ^ LPAREN parameterList RPAREN ;
    public final artParser.readStatement_return readStatement() throws RecognitionException {
        artParser.readStatement_return retval = new artParser.readStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token READ47=null;
        Token LPAREN48=null;
        Token RPAREN50=null;
        artParser.parameterList_return parameterList49 =null;


        Object READ47_tree=null;
        Object LPAREN48_tree=null;
        Object RPAREN50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "readStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:126:2: ( READ ^ LPAREN parameterList RPAREN )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:126:4: READ ^ LPAREN parameterList RPAREN
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(126,8);
            READ47=(Token)match(input,READ,FOLLOW_READ_in_readStatement1738); 
            READ47_tree = 
            (Object)adaptor.create(READ47)
            ;
            root_0 = (Object)adaptor.becomeRoot(READ47_tree, root_0);

            dbg.location(126,10);
            LPAREN48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_readStatement1741); 
            LPAREN48_tree = 
            (Object)adaptor.create(LPAREN48)
            ;
            adaptor.addChild(root_0, LPAREN48_tree);

            dbg.location(126,17);
            pushFollow(FOLLOW_parameterList_in_readStatement1743);
            parameterList49=parameterList();

            state._fsp--;

            adaptor.addChild(root_0, parameterList49.getTree());
            dbg.location(126,31);
            RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_readStatement1745); 
            RPAREN50_tree = 
            (Object)adaptor.create(RPAREN50)
            ;
            adaptor.addChild(root_0, RPAREN50_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(127, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "readStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "readStatement"


    public static class assignmentStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:129:1: assignmentStatement : identifier ASSIGN ^ expression ;
    public final artParser.assignmentStatement_return assignmentStatement() throws RecognitionException {
        artParser.assignmentStatement_return retval = new artParser.assignmentStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ASSIGN52=null;
        artParser.identifier_return identifier51 =null;

        artParser.expression_return expression53 =null;


        Object ASSIGN52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignmentStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:130:5: ( identifier ASSIGN ^ expression )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:130:7: identifier ASSIGN ^ expression
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(130,7);
            pushFollow(FOLLOW_identifier_in_assignmentStatement1765);
            identifier51=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier51.getTree());
            dbg.location(130,24);
            ASSIGN52=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentStatement1767); 
            ASSIGN52_tree = 
            (Object)adaptor.create(ASSIGN52)
            ;
            root_0 = (Object)adaptor.becomeRoot(ASSIGN52_tree, root_0);

            dbg.location(130,26);
            pushFollow(FOLLOW_expression_in_assignmentStatement1770);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(131, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignmentStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignmentStatement"


    public static class conditionalStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:133:1: conditionalStatement : ifStatement ;
    public final artParser.conditionalStatement_return conditionalStatement() throws RecognitionException {
        artParser.conditionalStatement_return retval = new artParser.conditionalStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        artParser.ifStatement_return ifStatement54 =null;



        try { dbg.enterRule(getGrammarFileName(), "conditionalStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:134:5: ( ifStatement )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:134:7: ifStatement
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(134,7);
            pushFollow(FOLLOW_ifStatement_in_conditionalStatement1791);
            ifStatement54=ifStatement();

            state._fsp--;

            adaptor.addChild(root_0, ifStatement54.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(135, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "conditionalStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "conditionalStatement"


    public static class compoundStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compoundStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:137:1: compoundStatement : BEGIN operators END -> ^( BLOCK ( operators )* ) ;
    public final artParser.compoundStatement_return compoundStatement() throws RecognitionException {
        artParser.compoundStatement_return retval = new artParser.compoundStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BEGIN55=null;
        Token END57=null;
        artParser.operators_return operators56 =null;


        Object BEGIN55_tree=null;
        Object END57_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_operators=new RewriteRuleSubtreeStream(adaptor,"rule operators");
        try { dbg.enterRule(getGrammarFileName(), "compoundStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:138:5: ( BEGIN operators END -> ^( BLOCK ( operators )* ) )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:138:7: BEGIN operators END
            {
            dbg.location(138,7);
            BEGIN55=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_compoundStatement1808);  
            stream_BEGIN.add(BEGIN55);

            dbg.location(138,13);
            pushFollow(FOLLOW_operators_in_compoundStatement1810);
            operators56=operators();

            state._fsp--;

            stream_operators.add(operators56.getTree());
            dbg.location(139,7);
            END57=(Token)match(input,END,FOLLOW_END_in_compoundStatement1818);  
            stream_END.add(END57);


            // AST REWRITE
            // elements: operators
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 139:11: -> ^( BLOCK ( operators )* )
            {
                dbg.location(139,14);
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:139:14: ^( BLOCK ( operators )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(139,16);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(139,22);
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:139:22: ( operators )*
                while ( stream_operators.hasNext() ) {
                    dbg.location(139,22);
                    adaptor.addChild(root_1, stream_operators.nextTree());

                }
                stream_operators.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(140, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "compoundStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "compoundStatement"


    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:142:1: ifStatement : IF ^ expression THEN ! operator ( ELSE ! operator )? ;
    public final artParser.ifStatement_return ifStatement() throws RecognitionException {
        artParser.ifStatement_return retval = new artParser.ifStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF58=null;
        Token THEN60=null;
        Token ELSE62=null;
        artParser.expression_return expression59 =null;

        artParser.operator_return operator61 =null;

        artParser.operator_return operator63 =null;


        Object IF58_tree=null;
        Object THEN60_tree=null;
        Object ELSE62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ifStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:143:5: ( IF ^ expression THEN ! operator ( ELSE ! operator )? )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:143:7: IF ^ expression THEN ! operator ( ELSE ! operator )?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(143,9);
            IF58=(Token)match(input,IF,FOLLOW_IF_in_ifStatement1849); 
            IF58_tree = 
            (Object)adaptor.create(IF58)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF58_tree, root_0);

            dbg.location(143,11);
            pushFollow(FOLLOW_expression_in_ifStatement1852);
            expression59=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression59.getTree());
            dbg.location(143,26);
            THEN60=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement1854); 
            dbg.location(143,28);
            pushFollow(FOLLOW_operator_in_ifStatement1857);
            operator61=operator();

            state._fsp--;

            adaptor.addChild(root_0, operator61.getTree());
            dbg.location(143,37);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:143:37: ( ELSE ! operator )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:143:38: ELSE ! operator
                    {
                    dbg.location(143,42);
                    ELSE62=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement1860); 
                    dbg.location(143,44);
                    pushFollow(FOLLOW_operator_in_ifStatement1863);
                    operator63=operator();

                    state._fsp--;

                    adaptor.addChild(root_0, operator63.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(144, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:146:1: whileStatement : WHILE ^ expression DO ! operator ;
    public final artParser.whileStatement_return whileStatement() throws RecognitionException {
        artParser.whileStatement_return retval = new artParser.whileStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE64=null;
        Token DO66=null;
        artParser.expression_return expression65 =null;

        artParser.operator_return operator67 =null;


        Object WHILE64_tree=null;
        Object DO66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "whileStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:147:5: ( WHILE ^ expression DO ! operator )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:147:7: WHILE ^ expression DO ! operator
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(147,12);
            WHILE64=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement1882); 
            WHILE64_tree = 
            (Object)adaptor.create(WHILE64)
            ;
            root_0 = (Object)adaptor.becomeRoot(WHILE64_tree, root_0);

            dbg.location(147,14);
            pushFollow(FOLLOW_expression_in_whileStatement1885);
            expression65=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression65.getTree());
            dbg.location(147,27);
            DO66=(Token)match(input,DO,FOLLOW_DO_in_whileStatement1887); 
            dbg.location(147,29);
            pushFollow(FOLLOW_operator_in_whileStatement1890);
            operator67=operator();

            state._fsp--;

            adaptor.addChild(root_0, operator67.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(148, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatement"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:150:1: forStatement : FOR ^ assignmentStatement TO ^ expression DO ! operator ;
    public final artParser.forStatement_return forStatement() throws RecognitionException {
        artParser.forStatement_return retval = new artParser.forStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOR68=null;
        Token TO70=null;
        Token DO72=null;
        artParser.assignmentStatement_return assignmentStatement69 =null;

        artParser.expression_return expression71 =null;

        artParser.operator_return operator73 =null;


        Object FOR68_tree=null;
        Object TO70_tree=null;
        Object DO72_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "forStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:151:5: ( FOR ^ assignmentStatement TO ^ expression DO ! operator )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:151:7: FOR ^ assignmentStatement TO ^ expression DO ! operator
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(151,10);
            FOR68=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement1907); 
            FOR68_tree = 
            (Object)adaptor.create(FOR68)
            ;
            root_0 = (Object)adaptor.becomeRoot(FOR68_tree, root_0);

            dbg.location(151,12);
            pushFollow(FOLLOW_assignmentStatement_in_forStatement1910);
            assignmentStatement69=assignmentStatement();

            state._fsp--;

            adaptor.addChild(root_0, assignmentStatement69.getTree());
            dbg.location(151,34);
            TO70=(Token)match(input,TO,FOLLOW_TO_in_forStatement1912); 
            TO70_tree = 
            (Object)adaptor.create(TO70)
            ;
            root_0 = (Object)adaptor.becomeRoot(TO70_tree, root_0);

            dbg.location(151,36);
            pushFollow(FOLLOW_expression_in_forStatement1915);
            expression71=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression71.getTree());
            dbg.location(151,49);
            DO72=(Token)match(input,DO,FOLLOW_DO_in_forStatement1917); 
            dbg.location(151,51);
            pushFollow(FOLLOW_operator_in_forStatement1920);
            operator73=operator();

            state._fsp--;

            adaptor.addChild(root_0, operator73.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(152, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forStatement"


    public static class identifierList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifierList"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:156:1: identifierList : identifier ( COMMA identifier )* -> ^( IDLIST ( identifier )+ ) ;
    public final artParser.identifierList_return identifierList() throws RecognitionException {
        artParser.identifierList_return retval = new artParser.identifierList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMMA75=null;
        artParser.identifier_return identifier74 =null;

        artParser.identifier_return identifier76 =null;


        Object COMMA75_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try { dbg.enterRule(getGrammarFileName(), "identifierList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(156, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:157:5: ( identifier ( COMMA identifier )* -> ^( IDLIST ( identifier )+ ) )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:157:7: identifier ( COMMA identifier )*
            {
            dbg.location(157,7);
            pushFollow(FOLLOW_identifier_in_identifierList1941);
            identifier74=identifier();

            state._fsp--;

            stream_identifier.add(identifier74.getTree());
            dbg.location(157,18);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:157:18: ( COMMA identifier )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:157:20: COMMA identifier
            	    {
            	    dbg.location(157,20);
            	    COMMA75=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifierList1945);  
            	    stream_COMMA.add(COMMA75);

            	    dbg.location(157,26);
            	    pushFollow(FOLLOW_identifier_in_identifierList1947);
            	    identifier76=identifier();

            	    state._fsp--;

            	    stream_identifier.add(identifier76.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 158:5: -> ^( IDLIST ( identifier )+ )
            {
                dbg.location(158,7);
                // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:158:7: ^( IDLIST ( identifier )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(158,9);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IDLIST, "IDLIST")
                , root_1);

                dbg.location(158,16);
                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    dbg.location(158,16);
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(159, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identifierList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identifierList"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclaration"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:161:1: variableDeclaration : identifierList c= COLON ^ type ;
    public final artParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        artParser.variableDeclaration_return retval = new artParser.variableDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token c=null;
        artParser.identifierList_return identifierList77 =null;

        artParser.type_return type78 =null;


        Object c_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:162:5: ( identifierList c= COLON ^ type )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:162:7: identifierList c= COLON ^ type
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(162,7);
            pushFollow(FOLLOW_identifierList_in_variableDeclaration1983);
            identifierList77=identifierList();

            state._fsp--;

            adaptor.addChild(root_0, identifierList77.getTree());
            dbg.location(162,23);
            c=(Token)match(input,COLON,FOLLOW_COLON_in_variableDeclaration1987); 
            c_tree = 
            (Object)adaptor.create(c)
            ;
            root_0 = (Object)adaptor.becomeRoot(c_tree, root_0);

            dbg.location(162,31);
            c.setType(VARDECL);
            dbg.location(162,54);
            pushFollow(FOLLOW_type_in_variableDeclaration1992);
            type78=type();

            state._fsp--;

            adaptor.addChild(root_0, type78.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(163, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclaration"


    public static class variableDeclarationPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationPart"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:165:1: variableDeclarationPart : VAR ^ variableDeclaration ( SEMI ! variableDeclaration )* SEMI !;
    public final artParser.variableDeclarationPart_return variableDeclarationPart() throws RecognitionException {
        artParser.variableDeclarationPart_return retval = new artParser.variableDeclarationPart_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR79=null;
        Token SEMI81=null;
        Token SEMI83=null;
        artParser.variableDeclaration_return variableDeclaration80 =null;

        artParser.variableDeclaration_return variableDeclaration82 =null;


        Object VAR79_tree=null;
        Object SEMI81_tree=null;
        Object SEMI83_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variableDeclarationPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:166:5: ( VAR ^ variableDeclaration ( SEMI ! variableDeclaration )* SEMI !)
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:166:7: VAR ^ variableDeclaration ( SEMI ! variableDeclaration )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(166,10);
            VAR79=(Token)match(input,VAR,FOLLOW_VAR_in_variableDeclarationPart2009); 
            VAR79_tree = 
            (Object)adaptor.create(VAR79)
            ;
            root_0 = (Object)adaptor.becomeRoot(VAR79_tree, root_0);

            dbg.location(166,12);
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationPart2012);
            variableDeclaration80=variableDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, variableDeclaration80.getTree());
            dbg.location(166,32);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:166:32: ( SEMI ! variableDeclaration )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==SEMI) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==IDENT) ) {
                        alt12=1;
                    }


                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:166:34: SEMI ! variableDeclaration
            	    {
            	    dbg.location(166,38);
            	    SEMI81=(Token)match(input,SEMI,FOLLOW_SEMI_in_variableDeclarationPart2016); 
            	    dbg.location(166,40);
            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationPart2019);
            	    variableDeclaration82=variableDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variableDeclaration82.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(166,67);
            SEMI83=(Token)match(input,SEMI,FOLLOW_SEMI_in_variableDeclarationPart2024); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(167, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableDeclarationPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variableDeclarationPart"


    public static class operator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:169:1: operator : ( assignmentStatement | writeStatement | readStatement | compoundStatement | conditionalStatement | whileStatement | forStatement | emptyStatement );
    public final artParser.operator_return operator() throws RecognitionException {
        artParser.operator_return retval = new artParser.operator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        artParser.assignmentStatement_return assignmentStatement84 =null;

        artParser.writeStatement_return writeStatement85 =null;

        artParser.readStatement_return readStatement86 =null;

        artParser.compoundStatement_return compoundStatement87 =null;

        artParser.conditionalStatement_return conditionalStatement88 =null;

        artParser.whileStatement_return whileStatement89 =null;

        artParser.forStatement_return forStatement90 =null;

        artParser.emptyStatement_return emptyStatement91 =null;



        try { dbg.enterRule(getGrammarFileName(), "operator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:170:5: ( assignmentStatement | writeStatement | readStatement | compoundStatement | conditionalStatement | whileStatement | forStatement | emptyStatement )
            int alt13=8;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt13=1;
                }
                break;
            case WRITE:
                {
                alt13=2;
                }
                break;
            case READ:
                {
                alt13=3;
                }
                break;
            case BEGIN:
                {
                alt13=4;
                }
                break;
            case IF:
                {
                alt13=5;
                }
                break;
            case WHILE:
                {
                alt13=6;
                }
                break;
            case FOR:
                {
                alt13=7;
                }
                break;
            case COLON:
            case ELSE:
            case END:
            case SEMI:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:170:7: assignmentStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(170,7);
                    pushFollow(FOLLOW_assignmentStatement_in_operator2042);
                    assignmentStatement84=assignmentStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentStatement84.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:171:7: writeStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(171,7);
                    pushFollow(FOLLOW_writeStatement_in_operator2050);
                    writeStatement85=writeStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, writeStatement85.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:172:7: readStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(172,7);
                    pushFollow(FOLLOW_readStatement_in_operator2058);
                    readStatement86=readStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, readStatement86.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:173:7: compoundStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(173,7);
                    pushFollow(FOLLOW_compoundStatement_in_operator2066);
                    compoundStatement87=compoundStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundStatement87.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:174:7: conditionalStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(174,7);
                    pushFollow(FOLLOW_conditionalStatement_in_operator2074);
                    conditionalStatement88=conditionalStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, conditionalStatement88.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:175:7: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(175,7);
                    pushFollow(FOLLOW_whileStatement_in_operator2082);
                    whileStatement89=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement89.getTree());

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:176:7: forStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(176,7);
                    pushFollow(FOLLOW_forStatement_in_operator2090);
                    forStatement90=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement90.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:177:7: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(177,7);
                    pushFollow(FOLLOW_emptyStatement_in_operator2098);
                    emptyStatement91=emptyStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, emptyStatement91.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(178, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operator"


    public static class operators_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operators"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:180:1: operators : operator ( COLON ! operator )* ;
    public final artParser.operators_return operators() throws RecognitionException {
        artParser.operators_return retval = new artParser.operators_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLON93=null;
        artParser.operator_return operator92 =null;

        artParser.operator_return operator94 =null;


        Object COLON93_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operators");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:181:5: ( operator ( COLON ! operator )* )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:181:7: operator ( COLON ! operator )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(181,7);
            pushFollow(FOLLOW_operator_in_operators2115);
            operator92=operator();

            state._fsp--;

            adaptor.addChild(root_0, operator92.getTree());
            dbg.location(181,16);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:181:16: ( COLON ! operator )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==COLON) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:181:18: COLON ! operator
            	    {
            	    dbg.location(181,23);
            	    COLON93=(Token)match(input,COLON,FOLLOW_COLON_in_operators2119); 
            	    dbg.location(181,25);
            	    pushFollow(FOLLOW_operator_in_operators2122);
            	    operator94=operator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operator94.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(182, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operators");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operators"


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:184:1: program : PROGRAM ^ ( variableDeclarationPart )* BEGIN ^ operator ( SEMI ! operator )* END DOT ;
    public final artParser.program_return program() throws RecognitionException {
        artParser.program_return retval = new artParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PROGRAM95=null;
        Token BEGIN97=null;
        Token SEMI99=null;
        Token END101=null;
        Token DOT102=null;
        artParser.variableDeclarationPart_return variableDeclarationPart96 =null;

        artParser.operator_return operator98 =null;

        artParser.operator_return operator100 =null;


        Object PROGRAM95_tree=null;
        Object BEGIN97_tree=null;
        Object SEMI99_tree=null;
        Object END101_tree=null;
        Object DOT102_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 0);

        try {
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:185:5: ( PROGRAM ^ ( variableDeclarationPart )* BEGIN ^ operator ( SEMI ! operator )* END DOT )
            dbg.enterAlt(1);

            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:185:7: PROGRAM ^ ( variableDeclarationPart )* BEGIN ^ operator ( SEMI ! operator )* END DOT
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(185,14);
            PROGRAM95=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_program2147); 
            PROGRAM95_tree = 
            (Object)adaptor.create(PROGRAM95)
            ;
            root_0 = (Object)adaptor.becomeRoot(PROGRAM95_tree, root_0);

            dbg.location(185,16);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:185:16: ( variableDeclarationPart )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==VAR) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:185:18: variableDeclarationPart
            	    {
            	    dbg.location(185,18);
            	    pushFollow(FOLLOW_variableDeclarationPart_in_program2152);
            	    variableDeclarationPart96=variableDeclarationPart();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variableDeclarationPart96.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}

            dbg.location(185,49);
            BEGIN97=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_program2156); 
            BEGIN97_tree = 
            (Object)adaptor.create(BEGIN97)
            ;
            root_0 = (Object)adaptor.becomeRoot(BEGIN97_tree, root_0);

            dbg.location(185,51);
            pushFollow(FOLLOW_operator_in_program2159);
            operator98=operator();

            state._fsp--;

            adaptor.addChild(root_0, operator98.getTree());
            dbg.location(185,60);
            // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:185:60: ( SEMI ! operator )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==SEMI) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /data/cloud/Git/PLT/Analyzer/ANTLR/art.g:185:62: SEMI ! operator
            	    {
            	    dbg.location(185,66);
            	    SEMI99=(Token)match(input,SEMI,FOLLOW_SEMI_in_program2163); 
            	    dbg.location(185,68);
            	    pushFollow(FOLLOW_operator_in_program2166);
            	    operator100=operator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, operator100.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}

            dbg.location(185,80);
            END101=(Token)match(input,END,FOLLOW_END_in_program2171); 
            END101_tree = 
            (Object)adaptor.create(END101)
            ;
            adaptor.addChild(root_0, END101_tree);

            dbg.location(185,84);
            DOT102=(Token)match(input,DOT,FOLLOW_DOT_in_program2173); 
            DOT102_tree = 
            (Object)adaptor.create(DOT102)
            ;
            adaptor.addChild(root_0, DOT102_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(186, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    // Delegated rules


 

    public static final BitSet FOLLOW_NUM_BIN_in_num_bin1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_OCT_in_num_oct1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_DEC_in_num_dec1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_HEX_in_num_hex1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_REAL_in_num_real1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_bin_in_num1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_oct_in_num1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_dec_in_num1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_hex_in_num1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_real_in_num1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identifier1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operand_in_expression1467 = new BitSet(new long[]{0x0000000128310002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1471 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expression1476 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_LT_in_expression1481 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_LE_in_expression1486 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_GE_in_expression1491 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_GT_in_expression1496 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_operand_in_expression1500 = new BitSet(new long[]{0x0000000128310002L});
    public static final BitSet FOLLOW_term_in_operand1520 = new BitSet(new long[]{0x0000018040000002L});
    public static final BitSet FOLLOW_PLUS_in_operand1525 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_MINUS_in_operand1530 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_OR_in_operand1535 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_term_in_operand1539 = new BitSet(new long[]{0x0000018040000002L});
    public static final BitSet FOLLOW_factor_in_term1557 = new BitSet(new long[]{0x0001800000000012L});
    public static final BitSet FOLLOW_STAR_in_term1562 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_SLASH_in_term1567 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_AND_in_term1572 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_factor_in_term1576 = new BitSet(new long[]{0x0001800000000012L});
    public static final BitSet FOLLOW_identifier_in_factor1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_num_in_factor1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_in_factor1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_factor1629 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_factor1632 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_factor1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1643 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_factor_in_factor1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameterList1692 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_parameterList1696 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_parameterList1698 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_WRITE_in_writeStatement1719 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_writeStatement1722 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_writeStatement1724 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_writeStatement1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_readStatement1738 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LPAREN_in_readStatement1741 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_parameterList_in_readStatement1743 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RPAREN_in_readStatement1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignmentStatement1765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentStatement1767 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_conditionalStatement1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_compoundStatement1808 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operators_in_compoundStatement1810 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_compoundStatement1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1849 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1852 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1854 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_ifStatement1857 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1860 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_ifStatement1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1882 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1885 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1887 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_whileStatement1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement1907 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_assignmentStatement_in_forStatement1910 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_TO_in_forStatement1912 = new BitSet(new long[]{0x0008007C90440000L});
    public static final BitSet FOLLOW_expression_in_forStatement1915 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_forStatement1917 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_forStatement1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifierList1941 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identifierList1945 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_identifier_in_identifierList1947 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifierList_in_variableDeclaration1983 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration1987 = new BitSet(new long[]{0x0000100002000100L});
    public static final BitSet FOLLOW_type_in_variableDeclaration1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableDeclarationPart2009 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationPart2012 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMI_in_variableDeclarationPart2016 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationPart2019 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEMI_in_variableDeclarationPart2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_operator2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_writeStatement_in_operator2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readStatement_in_operator2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_operator2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalStatement_in_operator2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_operator2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_operator2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_operator2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_in_operators2115 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COLON_in_operators2119 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_operators2122 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_PROGRAM_in_program2147 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_variableDeclarationPart_in_program2152 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_BEGIN_in_program2156 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_program2159 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_SEMI_in_program2163 = new BitSet(new long[]{0x00C0080001480040L});
    public static final BitSet FOLLOW_operator_in_program2166 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_END_in_program2171 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DOT_in_program2173 = new BitSet(new long[]{0x0000000000000002L});

}