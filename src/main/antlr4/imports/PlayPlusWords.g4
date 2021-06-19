lexer grammar PlayPlusWords;

BY: 'by';
DEFAULT: 'default';
DECLARE: 'declare';
AND: 'and';
RETAIN: 'retain';
YOUR: 'your';
TURN: 'turn';
WHEN: 'when';
LOCAL: 'local';
AS: 'as';
DO: 'do';
DONE: 'done';
LPAR: '(';
RPAR: ')';
LCRO: '[';
RCRO: ']';
COMMA: ',';
PLUS: '+';
MINUS: '-';
POINT: '.';
POINTVIRGULE: ';';
DIVIDE : '/';
MODULO : '%';
TIMES: '*';
OR: 'or';
INF: '<' ;
SUP: '>' ;
EQUAL: '=';
NOT: 'not';
TRUE: 'true';
FALSE: 'false';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
ENNEMI: 'ennemi';
GRAAL: 'graal';
IS: 'is';
LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRIDSIZE: 'grid size';
MAP: 'map';
RADIO: 'radio';
RADAR: 'radar';
AMMO: 'ammo';
FRUITS: 'fruits';
SODA: 'soda';
COUNT: 'count';
LIFE: 'life';
DIRT: 'dirt';
ROCK: 'rock';
VINES: 'vines';
ZOMBIE: 'zombie';
PLAYER: 'player';
NEARBY: 'nearby';
SKIPCODE: 'skip';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
SET: 'set';
TO: 'to';
COMPUTE: 'compute';
NEXT: 'next';
MOVE: 'move';
SHOOT: 'shoot';
USE: 'use';
NOTHING: 'nothing';
FUNCTION: 'function';
VOID: 'void';
RETURN: 'return';
EXTWLD: '.wld';


DOUBLEPOINT: ':';
IMPORT: 'import';
SCALAR: 'boolean' | 'integer' | 'square';

// Identifiers
ID: LETTER (LETTER | DIGIT)* ;

VARDECL: LETTER (LETTER | DIGIT)* ;

NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;


// Comments -> ignored
COMMENT_UNELIGNE: ('//' .*? '\r' ? '\n')  -> skip;
COMMENT: '/*' .*? '*/'  -> skip;


// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;