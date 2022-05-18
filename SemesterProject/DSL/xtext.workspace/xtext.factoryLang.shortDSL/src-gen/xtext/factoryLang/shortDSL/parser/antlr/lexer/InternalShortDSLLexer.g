/*
 * generated by Xtext 2.25.0
 */
lexer grammar InternalShortDSLLexer;

@header {
package xtext.factoryLang.shortDSL.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

In_progress : 'in_progress';

Complete : 'complete';

Devices : 'devices';

Foreach : 'foreach';

Pickup : 'pickup';

Empty : 'empty';

Green : 'green';

Short : 'short';

Blue : 'blue';

Drop : 'drop';

Free : 'free';

Full : 'full';

Long : 'long';

Test : 'test';

HyphenMinusHyphenMinusGreaterThanSign : '-->';

Dsl : 'dsl';

Red : 'red';

Use : 'use';

ExclamationMarkEqualsSign : '!=';

HyphenMinusGreaterThanSign : '->';

If : 'if';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
