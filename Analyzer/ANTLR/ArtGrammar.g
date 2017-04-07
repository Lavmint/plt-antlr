grammar ArtGrammar;

options { output=AST; language=CSharp3; }

tokens {
  AND              = 'and'             ;
  BEGIN            = 'begin'           ;
  BOOLEAN          = '$'               ;
  DO               = 'do'              ;
  ELSE             = 'else'            ;
  END              = 'end'             ;
  FOR              = 'for'             ;
  IF               = 'if'              ;
  INTEGER          = '%'               ;
  NOT              = 'not'             ;
  OR               = 'or'              ;
  PROGRAM          = 'program'         ;
  REAL             = '!'               ;
  THEN             = 'then'            ;
  TO               = 'to'              ;
  VAR              = 'var'             ;
  WHILE            = 'while'           ;
  WRITE		   = 'write'	       ;
  READ		   = 'read'	       ;
  TRUE		   = 'true'	       ;
  FALSE		   = 'false'	       ;
  
  BLOCK;    // list of statements
  IDLIST;   // list of identifiers
  NUMLIST;  // list of numerics
  VARDECL;  // declaration of a variable
  
  //----------------------------------------------------------------------------
  // OPERATORS
  //----------------------------------------------------------------------------
  PLUS            = '+'   ;
  MINUS           = '-'   ;
  STAR            = '*'   ;
  SLASH           = '/'   ;
  ASSIGN          = 'ass'  ;
  COMMA           = ','   ;
  SEMI            = ';'   ;
  COLON           = ':'   ;
  EQUAL           = '='   ;
  NOT_EQUAL       = '<>'  ;
  LT              = '<'   ;
  LE              = '<='  ;
  GE              = '>='  ;
  GT              = '>'   ;
  LPAREN          = '('   ;
  RPAREN          = ')'   ;
  DOT             = '.' ;
  LCURLY          = '{' ;
  RCURLY          = '}' ;
}

//IGNORE
WS      :	(' '|'\t'|'\f'|('\r\n'|'\r'|'\n') {  }) { $channel=HIDDEN; };
COMMENT	:	LCURLY(.)*RCURLY  {$channel=HIDDEN; };

//NUM ADN IDEN
IDENT	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;
        
NUM_BIN	:	('0'..'1')+('B'|'b');
NUM_OCT	:	('0'..'7')+('O'|'o');
NUM_DEC	:	('0'..'9')+('D'|'d')?;
NUM_HEX	:	('0'..'9'|'A'..'F'|'a'..'f')+('H'|'h');

NUM_REAL:	('0'..'9')+EXPONENT|'0'..'9'? DOT ('0'..'9')+ EXPONENT?;
fragment EXPONENT:  ('e'|'E') ('+'|'-')? ('0'..'9')+;

//PARSERS FOR NUMS
num_bin	:	NUM_BIN;
num_oct	:	NUM_OCT;
num_dec	:	NUM_DEC;
num_hex	:	NUM_HEX;
num_real:	NUM_REAL;
num	:	num_bin|num_oct|num_dec|num_hex|num_real;
  
identifier
    	:	IDENT;
logical	:	TRUE|FALSE;

type	:	BOOLEAN|INTEGER|REAL;

//expressions
expression
    : operand ((EQUAL^ | NOT_EQUAL^ | LT^ | LE^ | GE^ | GT^) operand )*
    ;

operand
    : term ( (PLUS^ | MINUS^ | OR^) term )*
    ;

term
  : factor ( (STAR^ | SLASH^ | AND^) factor )*
    ;

factor
    : identifier
    | num -> ^(NUMLIST num+)
    | logical
    | LPAREN! expression RPAREN!
    | NOT^ factor
    ;
//expression

//operators
empty
   : // nothing
   ;

emptyStatement
   :
   ;

parameterList
    : expression ( COMMA expression )*
    ;
    
writeStatement
	:	WRITE^ LPAREN expression RPAREN
	;
	
readStatement
	:	READ^ LPAREN parameterList RPAREN
	;	 
    
assignmentStatement
    : identifier ASSIGN^ expression
    ;
    
conditionalStatement
    : ifStatement
    ;

compoundStatement
    : BEGIN operators
      END -> ^(BLOCK operators*) // for the AST
    ;
    
ifStatement
    : IF^ expression THEN! operator (ELSE! operator)?
    ;

whileStatement
    : WHILE^ expression DO! operator
    ;

forStatement
    : FOR^ assignmentStatement TO^ expression DO! operator
    ;
//operators
  
//program structure
identifierList
    : identifier ( COMMA identifier )*
    ->^(IDLIST identifier+)
    ;
    
variableDeclaration
    : identifierList c=COLON^ {$c.setType(VARDECL);} type
    ;

variableDeclarationPart
    : VAR^ variableDeclaration ( SEMI! variableDeclaration )* SEMI!
    ;

operator
    : assignmentStatement
    | writeStatement
    | readStatement
    | compoundStatement
    | conditionalStatement
    | whileStatement
    | forStatement
    | emptyStatement
    ;

operators
    : operator ( COLON! operator )* 
    ;
    
program
    : PROGRAM^ ( variableDeclarationPart)* BEGIN^ operator ( SEMI! operator )* END DOT
    ;
//program structure
