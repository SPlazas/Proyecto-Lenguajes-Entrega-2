grammar Bot;

@header {

import org.jpavlich.bot.*;

}

@parser::members {

private Bot bot;

public BotParser(TokenStream input, Bot bot) {
    this(input);
    this.bot = bot;
}

}

program: (norte|sur|este|oeste|recoger|soltar)*;
norte: NORTH a=NUMBER{bot.up(Integer.parseInt($a.getText()));} SEMICOLON;
sur: SOUTH a=NUMBER{bot.down(Integer.parseInt($a.getText()));} SEMICOLON;
este: EAST a=NUMBER{bot.right(Integer.parseInt($a.getText()));} SEMICOLON;
oeste: WEST a=NUMBER{bot.left(Integer.parseInt($a.getText()));} SEMICOLON;
recoger: PICK {bot.pick();} SEMICOLON;
soltar: DROP {bot.drop();} SEMICOLON;

AND: ('and');
OR: ('or');
NOT: ('not');
ASSIGN: '=';
EQUAL:'==';
DIFFERENT:'<>';
SUM: '+';
REST: '-';
MULT: '*';
DIVI: '/';
MIN_E_THAN: '<=';
MIN_THAN: '<';
MAX_E_THAN: '>=';
MAX_THAN: '>';
NEGA:'!';
PAR_O: '(';
PAR_C: ')'; 
CORCH_O: '{';
CORCH_C: '}';
CUAD_O: '[';
CUAD_C: ']';
QUOT:'"';
QUOT_O:'“';
QUOT_C:'”';
IF: 'if';
THEN: 'then';
ELSE: 'else';
ENDWHILE: 'endwhile';
ENDF: 'endfunction';
ENDIF: 'endif';
RETORNO: 'return';
NUMBER: ('0'..'9')*; 
FLOTANTE: ('0'..'9')+'.'('0'..'9');
COMMA: ',';
SEMICOLON: ';';
DECLARATION: 'var';
NORTH: 'north';
SOUTH: 'south';
WEST: 'west';
EAST: 'east';
PICK: 'pick';
DROP: 'drop';
LOOK: 'look';
FUNC: 'function';
FUNCTION: 'fun';
MIENTRAS: 'while'; 
READ:'read';
PRINT: 'println';
DO: 'do';
DOSP: ':'; 
STRING: ('"' (~'"')* '"');
STR: '"'(.)*'"';
ID: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS:	[ \t\r\n]+ -> skip;
WS1: (' '|'\t'|'\r'|'\n')->skip;