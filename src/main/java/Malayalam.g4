grammar Malayalam;
program
    :   statements EOF
    ;

statements
    :   statement+
    ;

statement
    :   block
    |   assignment
    |   aanenkilStatement
    |   aayirikkumbolStatement
    |   pathikkukaStatement
    |   sweekarikkukaStatement
    |   OTHER {System.err.println("unknown character: " + $OTHER.text);}
    ;

block
    :   LBRACE statements RBRACE
//    |   statement
    ;

assignment
    :   ID ASSIGN expr SEMI
    ;

aanenkilStatement
    :   expr AANENKIL block (ATHAVA expr AANENKIL block)* (ALLENKIL block)?
    ;

aayirikkumbolStatement
    :   expr AAYIRIKKUMPOL block
    ;

pathikkukaStatement
    :   PATHIKKUKA LPAREN expr RPAREN SEMI
    ;
sweekarikkukaStatement
    :  ID ASSIGN SWEEKARIKKUKA LPAREN STRING? RPAREN SEMI
    ;
/*
expr
 : SUB expr                           #unaryMinusExpr
 | BANG expr                             #notExpr
 | expr op=(MUL | DIV | MOD) expr      #multiplicationExpr
 | expr op=(ADD | SUB) expr          #additiveExpr
 | expr op=(LE | GE | LT | GT) expr #relationalExpr
 | expr op=(EQUAL | NOTEQUAL) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;
 */

 expr
  //  :   expr
    :   conditionalExpr
    ;
 conditionalExpr
    :   conditionalOrExpr
    |   conditionalOrExpr '?' expr ':' conditionalExpr
    ;
conditionalOrExpr
    :   conditionalAndExpr
    |   conditionalOrExpr '||' conditionalAndExpr
    ;

conditionalAndExpr
    : inclusiveOrExpr
    | conditionalAndExpr '&&' inclusiveOrExpr
    ;

inclusiveOrExpr
    : exclusiveOrExpr
    | inclusiveOrExpr '|' exclusiveOrExpr
    ;
exclusiveOrExpr
    :   andExpr
    |   exclusiveOrExpr '^' andExpr
    ;
andExpr
	:	equalityExpr
	|	andExpr'&' equalityExpr
	;

equalityExpr
	:	relationalExpr
	|	equalityExpr '==' relationalExpr
	|	equalityExpr '!=' relationalExpr
	;

relationalExpr
	:	shiftExpr
	|	relationalExpr '<' shiftExpr
	|	relationalExpr '>' shiftExpr
	|	relationalExpr '<=' shiftExpr
	|	relationalExpr '>=' shiftExpr
//	|	relationalExpr 'instanceof' referenceType
	;

shiftExpr
	:	additiveExpr
	|	shiftExpr '<' '<' additiveExpr
	|	shiftExpr '>' '>' additiveExpr
	|	shiftExpr '>' '>' '>' additiveExpr
	;

additiveExpr
	:	multiplicativeExpr
	|	additiveExpr '+' multiplicativeExpr
	|	additiveExpr '-' multiplicativeExpr
	;

multiplicativeExpr
	:	unaryExpr
	|	multiplicativeExpr '*' unaryExpr
	|	multiplicativeExpr '/' unaryExpr
	|	multiplicativeExpr '%' unaryExpr
	;

unaryExpr
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpr
	|	'-' unaryExpr
	|	unaryExprNotPlusMinus
	;

preIncrementExpression
	:	'++' unaryExpr
	;

preDecrementExpression
	:	'--' unaryExpr
	;

unaryExprNotPlusMinus
	:	postfixExpression
	|	'~' unaryExpr
	|	'!' unaryExpr
	|	castExpression
	;

postfixExpression
	:   atom
		(	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
		)*
	;

postIncrementExpression
	:	postfixExpression '++'
	;

postIncrementExpression_lf_postfixExpression
	:	'++'
	;

postDecrementExpression
	:	postfixExpression '--'
	;

postDecrementExpression_lf_postfixExpression
	:	'--'
	;

castExpression
	:	'(' TYPES ')' unaryExpr
	|     atom
	;

TYPES
    :   SAMKHYA
    |   BHINNA
    ;

    /////////////////////////////////////////////////

atom
 : LPAREN expr RPAREN #parExpr
 | (INT | FLOAT)  #numberAtom
 | (TRUE | FALSE) #booleanAtom
 | ID             #idAtom
 | STRING         #stringAtom
 | NIL            #nilAtom
 ;

//Lexer Rules
// §3.11 Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// §3.12 Operators

ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
COLONCOLON : '::';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';
URSHIFT_ASSIGN : '>>>=';
// Keywords
TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
AANENKIL : 'ആണെങ്കില്‍';
ATHAVA  : 'അഥവാ';
ALLENKIL : 'അല്ലെങ്കില്‍';
AAYIRIKKUMPOL : 'ആയിരിക്കുമ്പോള്‍';
PATHIKKUKA : 'പതിക്കുക';
SWEEKARIKKUKA : 'സ്വീകരിക്കുക' ;
SAMKHYA     :   'സംഖ്യ' ;
BHINNA      :   'ഭിന്ന';

ID :LETTER (LETTER|DIGIT)*;



INT
 : [0-9]+
 ;

FLOAT
    : [0-9]+ '.' [0-9]*
    | '.' [0-9]+
    ;

STRING
    : '"' (~["\r\n] | '""')* '"'
    ;

fragment
LETTER	:'\u0024'
		|'\u0041'..'\u005a'
		|'\u005f'
		|'\u0061'..'\u007a'
		|'\u00c0'..'\u00d6'
		|'\u00d8'..'\u00f6'
		|'\u00f8'..'\u00ff'
		|'\u0100'..'\u1fff'
		|'\u3040'..'\u318f'
		|'\u3300'..'\u337f'
		|'\u3400'..'\u3d2d'
		|'\u4e00'..'\u9fff'
		|'\uf900'..'\ufaff'
		|'\u200d'
		|'\u200c'
  	 	;

fragment
DIGIT	:'\u0030'..'\u0039'
		|'\u0660'..'\u0669'
		|'\u06f0'..'\u06f9'
		|'\u0966'..'\u096f'
		|'\u09e6'..'\u09ef'
		|'\u0a66'..'\u0a6f'
		|'\u0ae6'..'\u0aef'
		|'\u0b66'..'\u0b6f'
		|'\u0be7'..'\u0bef'
		|'\u0c66'..'\u0c6f'
		|'\u0ce6'..'\u0cef'
		|'\u0d66'..'\u0d6f'
		|'\u0e50'..'\u0e59'
		|'\u0ed0'..'\u0ed9'
		|'\u1040'..'\u1049'
   		;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;



COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

OTHER
    : .
    ;