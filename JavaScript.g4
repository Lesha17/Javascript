grammar JavaScript;

// Parser                       
function_definition : FUNCTION ID LBRACKET var_list RBRACKET code_block ;

function_call : ID LBRACKET args_list RBRACKET ;

variable : ID ;

var_list : | variable (COMMA variable)* ;

code_block
    : LBRACE operator_list RBRACE
;

expr : simple_expr | ( simple_expr  (PLUS | MINUS | MULT | MOD | MORE_TH | LESS_TH | EQ | MORE_OR_EQ | LESS_OR_EQ | NOT_EQ) expr) ;

args_list : | expr (COMMA expr)* ;

simple_expr :  expr_base
                  | expr_in_brackets
                  | minus_expr
                  | not_expr
                  | prefix_expr
                  | postfix_expr
                  ;

expr_base : 
	function_call 
	| variable 
	| STRING 
	| NUMBER 
	| BOOLEAN ;
	
prefix_expr : (INCR | DECR) variable ;
postfix_expr : variable (INCR | DECR) ;
expr_in_brackets : LBRACKET expr RBRACKET ;
minus_expr : MINUS expr ;
not_expr : NOT expr ;

operator_list : (operator SEMICOLON?)* ;

operator :  return_operator | assign_operator | for_loop | break_operator | if_statement | function_definition | alert_operator
        | prefix_expr | postfix_expr | function_call;

return_operator : RETURN expr? ;

assign_operator : VAR? variable ASSIGN expr ;

break_operator : BREAK;

alert_operator : ALERT LBRACKET expr RBRACKET ;

for_loop
    : FOR LBRACKET operator? SEMICOLON expr? SEMICOLON for_action? RBRACKET
    (code_block | operator SEMICOLON?) ;

for_action : ( | operator (COMMA operator)*) ;

if_statement
    : if_part
    elif_part*
    else_part?
    ;

if_part : IF LBRACKET expr RBRACKET (code_block | operator SEMICOLON?) ;
elif_part : (ELSE IF LBRACKET expr RBRACKET (code_block | operator SEMICOLON?)) ;
else_part : (ELSE (code_block | operator SEMICOLON?)) ;

// Lexer

// Keywords
VAR : 'var';
FOR : 'for';
IF : 'if';
ELSE : 'else';
FUNCTION : 'function';
RETURN : 'return';
BREAK: 'break';

// Auxiliary symbols
LBRACKET : '(';
RBRACKET : ')';
LBRACE : '{';
RBRACE : '}';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';

WS : [' '\n\r\t]* -> skip ;
Comment : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip;
     // Operators
    PLUS : '+' ;
    MINUS:'-';
    INCR : '++' ;
    DECR : '--' ;
    MORE_TH : '>' ;
    LESS_TH : '<' ;
    EQ : '==' ;
    MORE_OR_EQ : '>=' ;
    LESS_OR_EQ : '<=' ;
    NOT_EQ : '!=' ;
    MULT : '*' ;
    MOD : '%' ;
    NOT : '!' ;
    ASSIGN : '=' ;
    ALERT : 'alert' ;

// Literals
STRING
    :   ["] (~["\r\n\\] | ESCAPES)* ["]
    |   ['] (~['\r\n\\] | ESCAPES)* [']
    ;
NUMBER : ([0-9])+('.'[0-9]+)? ;
BOOLEAN : 'true' | 'false' ;

// Fragments
fragment ESCAPES: '\\n' | '\\r' | '\\b' | '\\t' | '\\v' | '\\f' | '\\\\' | '\\"' | '\\\'' | '\\u'[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F];

// Identifiers
ID : [a-zA-Z_][a-zA-Z0-9_]* ;


