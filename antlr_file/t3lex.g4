/*********************************
definition of ttcn-3 lexer.
Author: 	Johnson Chen
Created: 	2/23/2018
Email: 		johnsonloveyuki@163.com
*********************************/

lexer grammar t3lex;

/***** begin keyword *****/

ACTION 		: 'action' ;
ACTIVATE 	: 'activate' ;
ADDRESS 	: 'address' ;
ALIVE 		: 'alive' ;
ALL 		: 'all' ;
ALT 		: 'alt' ;
ALTSTEP 	: 'altstep' ;
AND 		: 'and' ;
AND4B 		: 'and4b' ; 
ANY 	 	: 'any' ;
ANYTYPE 	: 'anytype' ;

BITSTRING 	: 'bitstring' ;
BOOLEAN 	: 'boolean' ;
BREAK 		: 'break' ;

CASE 		: 'case' ;
CALL 		: 'call' ;
CATCH 		: 'catch' ;
CHAR 		: 'char' ;
CHARSTRING 	: 'charstring' ;
CHECK 		: 'check' ;
CLEAR 		: 'clear' ;
COMPLEMENT 	: 'complement' ;
COMPONENT 	: 'component' ;
CONNECT 	: 'connect' ;
CONST 		: 'const' ;
CONTINUE 	: 'continue' ;
CONTROL 	: 'control' ;
CREATE 		: 'create' ;

DEACTIVATE 	: 'deactivate' ;
DECMATCH 	: 'decmatch' ;
DEFAULT 	: 'default' ;
DISCONNECT 	: 'disconnect' ;
DISPLAY 	: 'display' ;
DO 			: 'do' ;
DONE 		: 'done' ;

ELSE 		: 'else' ;
ENCODE 		: 'encode' ;
ENUMERATED 	: 'enumerated' ;
ERROR 		: 'error' ;
EXCEPT  	: 'except' ;
EXCEPTION 	: 'exception' ;
EXECUTE 	: 'execute' ;
EXTENDS 	: 'extends' ;
EXTENSION 	: 'extension' ;
EXTERNAL 	: 'external' ;

FAIL 		: 'fail' ;
FALSE 		: 'false' ;
FLOAT 		: 'float' ;
FOR 		: 'for' ;
FRIEND 		: 'friend' ;
FROM 		: 'from' ;
FUNCTION 	: 'function' ;

GETVERDICT 	: 'getverdict' ;
GETCALL 	: 'getcall' ; 
GETREPLY 	: 'getreply' ;
GOTO 		: 'goto' ;
GROUP 		: 'group' ;

HALT   		: 'halt' ;
HEXSTRING 	: 'hexstring' ;

IF 			: 'if' ;
IFPRESENT 	: 'ifpresent' ;
IMPORT 		: 'import' ;
IN  		: 'in' ;
INCONC 		: 'inconc' ;
INFINITY 	: 'infinity' ;
INOUT 		: 'inout' ;
INTEGER 	: 'integer' ;
INTERLEAVE 	: 'interleave' ;

KILL 		: 'kill' ;
KILLED 		: 'killed' ;

LABEL 		: 'label' ;
LANGUAGE 	: 'language' ;
LENGTH 		: 'length' ;
LOG 		: 'log' ;

MAP 		: 'map' ;
MATCH 		: 'match' ;
MESSAGE 	: 'message' ;
MIXED  		: 'mixed' ;
MOD 		: 'mod' ;
MODIFIES 	: 'modifies' ;
MODULE 		: 'module' ;
MODULEPAR 	: 'modulepar' ;
MTC 		: 'mtc' ;

NOBLOCK 	: 'noblock' ;
NONE 		: 'none' ;
NOT 		: 'not' ;
NOT4B 		: 'not4b' ;
NOWAIT  	: 'nowait' ;
NULL 		: 'null' ;

OCTETSTRING : 'octetstring' ;
OF 			: 'of' ;
OMIT 		: 'omit' ;
ON 			: 'on' ;
OPTIONAL 	: 'optional' ;
OR 			: 'or' ;
OR4B 		: 'or4b' ;
OUT 		: 'out' ;
OVERRIDE 	: 'override' ;

PARAM 		: 'param' ;
PASS 		: 'pass' ;
PATTERN 	: 'pattern' ;
PERMUTATION : 'permutation' ;
PORT 		: 'port' ;
PRESENT 	: 'present' ;
PRIVATE 	: 'private' ;
PROCEDURE 	: 'procedure' ;
PUBLIC 		: 'public' ;

RAISE 		: 'raise' ;
READ 		: 'read' ;
RECEIVE 	: 'receive' ;
RECORD 		: 'record' ;
RECURSIVE 	: 'recursive' ;
REM 		: 'rem' ;
REPEAT 		: 'repeat' ;
REPLY 		: 'reply' ;
RETURN 		: 'return' ;
RUNNING 	: 'running' ;
RUNS 		: 'runs' ;

SELECT 		: 'select' ;
SELF 		: 'self' ;
SEND 		: 'send' ;
SENDER 		: 'sender' ;
SET 		: 'set' ;
SETVERDICT  : 'setverdict' ;
SIGNATURE   : 'signature' ;
START 		: 'start' ;
STOP 		: 'stop' ;
SUBSET 		: 'subset' ;
SUPERSET 	: 'superset' ;
SYSTEM 		: 'system' ;

TEMPLATE 	: 'template' ;
TESTCASE 	: 'testcase' ;
TIMEOUT 	: 'timeout' ;
TIMER 		: 'timer' ;
TO 			: 'to' ;
TRIGGER 	: 'trigger' ;
TRUE 		: 'true' ;
TYPE 		: 'type' ;

UNION 		: 'union' ;
UNIVERSAL 	: 'universal' ;
UNMAP 		: 'unmap' ;

VALUE 		: 'value' ;
VALUEOF 	: 'valueof' ;
VAR 		: 'var' ;
VARIANT 	: 'variant' ;
VERDICTTYPE : 'verdicttype' ;

WHILE 		: 'while' ;
WITH 		: 'with' ;

XOR 		: 'xor' ;
XOR4B 		: 'xor4b' ;
/***** end keyword *****/

// @-symbol
AT_DECODED 			: '@decoded' ;
AT_DEFAULT 			: '@default' ;
AT_DETERMINISTIC 	: '@deterministic' ;
AT_FUZZY 			: '@fuzzy' ;
AT_INDEX 			: '@INDEX' ;
AT_LAZY 			: '@lazy' ;
AT_LOCAL 			: '@local' ;
AT_NOCASE 			: '@nocase' ;

// comment
LINE_COMMENT	: '//' .*? '\n' -> skip ;
COMMENT 		: '/*' .*? '*/' -> skip ;

// common character
QUESTION 		: 	'?' ;
STAR 			: 	'*' ;
BACKSLASH		: 	'\\';
OR_SYM			: 	'|' ;
ADD_SYM 		: 	'+' ;
AND_SYM 		: 	'&' ;
COLON 			: 	':' ;
SEMICOLON		: 	';' ;
DOT 			: 	'.' ;
TWODOT  		: 	DOT DOT ;
LEFT_BRACE  	: 	'{' ;
RIGHT_BRACE		: 	'}' ;
LEFT_BRACKET 	: 	'[' ;
RIGHT_BRACKET	: 	']' ;
LEFT_PARENT     : 	'(' ;
RIGHT_PARENT    : 	')' ;
MINUS 			: 	'-' ;
QUOTATION		: 	'"' ;
SINGLE_QUATATION: 	'\'';
SHARP 			: 	'#' ;
COMMA 			: 	',' ;
DIVIDE 			: 	'/' ;
ASSIGNMENT 		: 	'=' ;
BIGGER 			: 	'>' ;
SMALLER         : 	'<' ;
BIGEQUAL 		: 	'>=';
SMALLEQUAL 		: 	'<=';
BIGAT 			: 	'@>';
SMALLAT 		: 	'<@';
BIGBIG 			: 	'>>';
SMALLSMALL  	: 	'<<';
EXLAMATION 		: 	'!' ;
EQAUL    		: 	'==';
NOTEQUAL		: 	'!=';
UNDERSCORE 		: 	'_' ;
ASSIGNMENTCHAR 	: 	':=';
EQUALRIGHT 		: 	'=>';
//EXPONENTIAL 	: 	'E' ;
//U_SYM 			: 	'U' | 'u';
NOT_IN_PATTERN 	:   '^' ;

fragment
UPPERALPHA		: 	[A-Z] ;

fragment
LOWALPHA		: 	[a-z] ;

fragment
ZERO_NUM 		: 	'0'   ;

fragment
NON_ZERO_NUM	: 	[1-9] ;


NUM 			: 	ZERO_NUM | NON_ZERO_NUM ;

NUMBER 			: 	MINUS? ((NON_ZERO_NUM NUM*) | ZERO_NUM) ;

DECIMAL_NUM 	: NUM+ ;

FLOATVALUE
 	: NUMBER DOT DECIMAL_NUM
	| NUMBER (DOT DECIMAL_NUM)? 'E' MINUS? NUMBER
	| NaN
	;


// for value
BSTRING 		: SINGLE_QUATATION (BIN | BINSPACE)* SINGLE_QUATATION 'B' ;
BIN 			: ZERO_NUM | '1' ;

OSTRING 		: SINGLE_QUATATION (OCT | BINSPACE)* SINGLE_QUATATION 'O' ;
HEX 			: NUM|[a-fA-F] ;

HSTRING 		: SINGLE_QUATATION (HEX | BINSPACE)* SINGLE_QUATATION 'H' ;

//CSTRING 		: QUOTATION Char* QUOTATION ;

//BOOLEANVALUE	: TRUE | FALSE ;


// todo???
fragment
BINSPACE 		: ' ' | NLChar ;

fragment
NLChar			: '\r'? '\n' ;

fragment
OCT 			: HEX HEX ;

fragment
NaN 			: 'not_a_number' ;


INTEGERVALUE    : MINUS? NUMBER ;

// needed to modify with predefined value
// 为了避免值与match冲突，将match转到语法分析中
//BitStringMatch	: SINGLE_QUATATION (BIN | QUESTION | STAR)* SINGLE_QUATATION 'B' ;
//HexStringMatch 	: SINGLE_QUATATION (HEX | QUESTION | STAR)* SINGLE_QUATATION 'H' ;
//OctStringMatch 	: SINGLE_QUATATION ((HEX HEX)| QUESTION | STAR) SINGLE_QUATATION 'O' ;

PortRedirectSymbol : '->' ;


// used for regex
ESC_QESTION 	: '\\?' ;
ESC_STAR 		: '\\*' ;
ESC_ESC			: '\\\\';
ESC_LEFT_BRACE	: '\\{' ;
ESC_RIGHT_BRACE	: '\\}' ;
ESC_LEFT_BRACKET: '\\[' ;
ESC_RIGHT_BRACKET: '\\]' ;
ESC_QUAT		: '\\"' ;
ESC_OR			: '\\|'	;
ESC_LEFT_PARENT	: '\\('	;
ESC_RIGHT_PARENT: '\\)'	;
ESC_SHARP		: '\\#'	;
ESC_ADD			: '\\+' ;
ESC_D 			: '\\d' ;
ESC_W 			: '\\w'	;
ESC_T 			: '\\t' ;
ESC_n 			: '\\n' ;
ESC_R 			: '\\r' ;
ESC_S 			: '\\s' ;
ESC_B 			: '\\b' ;
ESC_N 			: '\\N' ;
ESC_QUADRUPLE 	: '\\q' ;
ESC_LINK 		: '\\-' ;
ESC_NOT			: '\\^' ;
ESC_F 			: '\\f' ;



// 这一部分可以直接用string代替，进一步的检查留待语法分析来判断是否错误
//fragment
//ExtendedAlpha	
//	: '\u0020'..'\u007e'  // ascii打印字符
//	| '\u00a1'..'\u00ac'
//	| '\u00ae'..'\u00ff'
//	;


CSTRING
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

//FreeText
//	: QUOTATION ExtendedAlpha* QUOTATION
//	;

Char
  	:  '\u0024' |
    	'\u002d' |
     '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
EscapeSequence
    : ESC_B | ESC_T | ESC_F | ESC_R | ESC_N | '\\"' | '\\\'' | ESC_ESC
    ;

// space
WS 				: [ \t\r\n]+ -> skip ;

// identifier
IDENTIFIER 		: ID_LETTER (ID_LETTER | NUM | UNDERSCORE)* ;
fragment 
ID_LETTER		: UPPERALPHA | LOWALPHA ;

