grammar cpmvc;


//TODO: include, forward decl

mvc : (modelDecl | controllerDecl | interfaceDecl )*;

DATAMODEL           : 'datamodel';
CONTROLLER          : 'controller';
INTERFACE           : 'interface';
BEGIN               : '{';
END                 : '}';
NAMETYPESEPARATOR   : ':';
LINEEND             : ';';
INT                 : 'int';
FLOAT               : 'float';
STRING              : 'string';
VECTOR              : 'vector';
OF                  : 'of';
LIST                : 'list';
MAP                 : 'map';
WITH                : 'with';
PARAMBEGIN          : '(';
PARAMEND            : ')';
COMMA               : ',';

ID : [a-zA-Z] [a-zA-Z0-9]* ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) -> skip;
        
COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;
    

nameTypeDecl: ( name = ID NAMETYPESEPARATOR type = typeDecl);

modelDecl: DATAMODEL name = ID BEGIN modelAttributeDecl* END;

modelAttributeDecl : nameTypeDecl LINEEND;

typeDecl : ( simpleDataType | simpleObject | arrayObject | mapObject );

simpleDataType : INT | FLOAT | STRING;

simpleObject   : ID;

arrayObject    : name = ( VECTOR | LIST ) OF type = typeDecl; 

mapObject      : MAP OF (simpleDataType | simpleObject ) WITH (simpleDataType | simpleObject );

controllerDecl : CONTROLLER name = ID BEGIN methodDecl* END;

methodDecl: name = ID PARAMBEGIN params = methodParamDecl* PARAMEND ( NAMETYPESEPARATOR returnType = typeDecl)? LINEEND;

methodParamDecl: nameTypeDecl ( COMMA nameTypeDecl)*;

interfaceDecl : INTERFACE name = ID BEGIN methodDecl* END;