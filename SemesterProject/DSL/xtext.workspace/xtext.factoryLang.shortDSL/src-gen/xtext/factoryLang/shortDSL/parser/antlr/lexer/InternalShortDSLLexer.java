package xtext.factoryLang.shortDSL.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShortDSLLexer extends Lexer {
    public static final int RULE_BEGIN=42;
    public static final int Var=26;
    public static final int Devices=6;
    public static final int Full=17;
    public static final int LessThanSign=34;
    public static final int LeftParenthesis=30;
    public static final int Test=20;
    public static final int In_progress=4;
    public static final int Dsl=23;
    public static final int Short=13;
    public static final int Logging=8;
    public static final int GreaterThanSign=36;
    public static final int RULE_ID=44;
    public static final int RightParenthesis=31;
    public static final int Free=16;
    public static final int Handle=9;
    public static final int Drop=15;
    public static final int RULE_INT=45;
    public static final int Long=18;
    public static final int RULE_ML_COMMENT=47;
    public static final int Scan=19;
    public static final int If=29;
    public static final int RULE_END=43;
    public static final int Complete=5;
    public static final int H=37;
    public static final int RULE_STRING=46;
    public static final int M=38;
    public static final int RULE_SL_COMMENT=48;
    public static final int Comma=32;
    public static final int EqualsSign=35;
    public static final int Empty=11;
    public static final int S=39;
    public static final int Colon=33;
    public static final int RightCurlyBracket=41;
    public static final int EOF=-1;
    public static final int Pickup=10;
    public static final int Blue=14;
    public static final int RULE_WS=49;
    public static final int Use=25;
    public static final int LeftCurlyBracket=40;
    public static final int RULE_ANY_OTHER=50;
    public static final int Red=24;
    public static final int Dev=22;
    public static final int HyphenMinusHyphenMinusGreaterThanSign=21;
    public static final int Foreach=7;
    public static final int ExclamationMarkEqualsSign=27;
    public static final int HyphenMinusGreaterThanSign=28;
    public static final int Green=12;

    // delegates
    // delegators

    public InternalShortDSLLexer() {;} 
    public InternalShortDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalShortDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalShortDSLLexer.g"; }

    // $ANTLR start "In_progress"
    public final void mIn_progress() throws RecognitionException {
        try {
            int _type = In_progress;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:14:13: ( 'in_progress' )
            // InternalShortDSLLexer.g:14:15: 'in_progress'
            {
            match("in_progress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In_progress"

    // $ANTLR start "Complete"
    public final void mComplete() throws RecognitionException {
        try {
            int _type = Complete;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:16:10: ( 'complete' )
            // InternalShortDSLLexer.g:16:12: 'complete'
            {
            match("complete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Complete"

    // $ANTLR start "Devices"
    public final void mDevices() throws RecognitionException {
        try {
            int _type = Devices;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:18:9: ( 'devices' )
            // InternalShortDSLLexer.g:18:11: 'devices'
            {
            match("devices"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Devices"

    // $ANTLR start "Foreach"
    public final void mForeach() throws RecognitionException {
        try {
            int _type = Foreach;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:20:9: ( 'foreach' )
            // InternalShortDSLLexer.g:20:11: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Foreach"

    // $ANTLR start "Logging"
    public final void mLogging() throws RecognitionException {
        try {
            int _type = Logging;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:22:9: ( 'logging' )
            // InternalShortDSLLexer.g:22:11: 'logging'
            {
            match("logging"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Logging"

    // $ANTLR start "Handle"
    public final void mHandle() throws RecognitionException {
        try {
            int _type = Handle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:24:8: ( 'handle' )
            // InternalShortDSLLexer.g:24:10: 'handle'
            {
            match("handle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Handle"

    // $ANTLR start "Pickup"
    public final void mPickup() throws RecognitionException {
        try {
            int _type = Pickup;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:26:8: ( 'pickup' )
            // InternalShortDSLLexer.g:26:10: 'pickup'
            {
            match("pickup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pickup"

    // $ANTLR start "Empty"
    public final void mEmpty() throws RecognitionException {
        try {
            int _type = Empty;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:28:7: ( 'empty' )
            // InternalShortDSLLexer.g:28:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Empty"

    // $ANTLR start "Green"
    public final void mGreen() throws RecognitionException {
        try {
            int _type = Green;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:30:7: ( 'green' )
            // InternalShortDSLLexer.g:30:9: 'green'
            {
            match("green"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Green"

    // $ANTLR start "Short"
    public final void mShort() throws RecognitionException {
        try {
            int _type = Short;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:32:7: ( 'short' )
            // InternalShortDSLLexer.g:32:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Short"

    // $ANTLR start "Blue"
    public final void mBlue() throws RecognitionException {
        try {
            int _type = Blue;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:34:6: ( 'blue' )
            // InternalShortDSLLexer.g:34:8: 'blue'
            {
            match("blue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Blue"

    // $ANTLR start "Drop"
    public final void mDrop() throws RecognitionException {
        try {
            int _type = Drop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:36:6: ( 'drop' )
            // InternalShortDSLLexer.g:36:8: 'drop'
            {
            match("drop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Drop"

    // $ANTLR start "Free"
    public final void mFree() throws RecognitionException {
        try {
            int _type = Free;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:38:6: ( 'free' )
            // InternalShortDSLLexer.g:38:8: 'free'
            {
            match("free"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Free"

    // $ANTLR start "Full"
    public final void mFull() throws RecognitionException {
        try {
            int _type = Full;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:40:6: ( 'full' )
            // InternalShortDSLLexer.g:40:8: 'full'
            {
            match("full"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Full"

    // $ANTLR start "Long"
    public final void mLong() throws RecognitionException {
        try {
            int _type = Long;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:42:6: ( 'long' )
            // InternalShortDSLLexer.g:42:8: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Long"

    // $ANTLR start "Scan"
    public final void mScan() throws RecognitionException {
        try {
            int _type = Scan;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:44:6: ( 'scan' )
            // InternalShortDSLLexer.g:44:8: 'scan'
            {
            match("scan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scan"

    // $ANTLR start "Test"
    public final void mTest() throws RecognitionException {
        try {
            int _type = Test;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:46:6: ( 'test' )
            // InternalShortDSLLexer.g:46:8: 'test'
            {
            match("test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Test"

    // $ANTLR start "HyphenMinusHyphenMinusGreaterThanSign"
    public final void mHyphenMinusHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:48:39: ( '-->' )
            // InternalShortDSLLexer.g:48:41: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinusGreaterThanSign"

    // $ANTLR start "Dev"
    public final void mDev() throws RecognitionException {
        try {
            int _type = Dev;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:50:5: ( 'dev' )
            // InternalShortDSLLexer.g:50:7: 'dev'
            {
            match("dev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dev"

    // $ANTLR start "Dsl"
    public final void mDsl() throws RecognitionException {
        try {
            int _type = Dsl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:52:5: ( 'dsl' )
            // InternalShortDSLLexer.g:52:7: 'dsl'
            {
            match("dsl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dsl"

    // $ANTLR start "Red"
    public final void mRed() throws RecognitionException {
        try {
            int _type = Red;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:54:5: ( 'red' )
            // InternalShortDSLLexer.g:54:7: 'red'
            {
            match("red"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Red"

    // $ANTLR start "Use"
    public final void mUse() throws RecognitionException {
        try {
            int _type = Use;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:56:5: ( 'use' )
            // InternalShortDSLLexer.g:56:7: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Use"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:58:5: ( 'var' )
            // InternalShortDSLLexer.g:58:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "ExclamationMarkEqualsSign"
    public final void mExclamationMarkEqualsSign() throws RecognitionException {
        try {
            int _type = ExclamationMarkEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:60:27: ( '!=' )
            // InternalShortDSLLexer.g:60:29: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMarkEqualsSign"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:62:28: ( '->' )
            // InternalShortDSLLexer.g:62:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:64:4: ( 'if' )
            // InternalShortDSLLexer.g:64:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:66:17: ( '(' )
            // InternalShortDSLLexer.g:66:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:68:18: ( ')' )
            // InternalShortDSLLexer.g:68:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:70:7: ( ',' )
            // InternalShortDSLLexer.g:70:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:72:7: ( ':' )
            // InternalShortDSLLexer.g:72:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:74:14: ( '<' )
            // InternalShortDSLLexer.g:74:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:76:12: ( '=' )
            // InternalShortDSLLexer.g:76:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:78:17: ( '>' )
            // InternalShortDSLLexer.g:78:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            int _type = H;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:80:3: ( 'h' )
            // InternalShortDSLLexer.g:80:5: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            int _type = M;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:82:3: ( 'm' )
            // InternalShortDSLLexer.g:82:5: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:84:3: ( 's' )
            // InternalShortDSLLexer.g:84:5: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:86:18: ( '{' )
            // InternalShortDSLLexer.g:86:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:88:19: ( '}' )
            // InternalShortDSLLexer.g:88:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalShortDSLLexer.g:90:21: ()
            // InternalShortDSLLexer.g:90:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalShortDSLLexer.g:92:19: ()
            // InternalShortDSLLexer.g:92:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:94:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalShortDSLLexer.g:94:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalShortDSLLexer.g:94:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalShortDSLLexer.g:94:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalShortDSLLexer.g:94:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShortDSLLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:96:10: ( ( '0' .. '9' )+ )
            // InternalShortDSLLexer.g:96:12: ( '0' .. '9' )+
            {
            // InternalShortDSLLexer.g:96:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShortDSLLexer.g:96:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:98:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalShortDSLLexer.g:98:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalShortDSLLexer.g:98:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalShortDSLLexer.g:98:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalShortDSLLexer.g:98:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalShortDSLLexer.g:98:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalShortDSLLexer.g:98:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalShortDSLLexer.g:98:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalShortDSLLexer.g:98:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalShortDSLLexer.g:98:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalShortDSLLexer.g:98:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:100:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalShortDSLLexer.g:100:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalShortDSLLexer.g:100:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalShortDSLLexer.g:100:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:102:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalShortDSLLexer.g:102:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalShortDSLLexer.g:102:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalShortDSLLexer.g:102:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalShortDSLLexer.g:102:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalShortDSLLexer.g:102:41: ( '\\r' )? '\\n'
                    {
                    // InternalShortDSLLexer.g:102:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalShortDSLLexer.g:102:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:104:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalShortDSLLexer.g:104:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalShortDSLLexer.g:104:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalShortDSLLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalShortDSLLexer.g:106:16: ( . )
            // InternalShortDSLLexer.g:106:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalShortDSLLexer.g:1:8: ( In_progress | Complete | Devices | Foreach | Logging | Handle | Pickup | Empty | Green | Short | Blue | Drop | Free | Full | Long | Scan | Test | HyphenMinusHyphenMinusGreaterThanSign | Dev | Dsl | Red | Use | Var | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | If | LeftParenthesis | RightParenthesis | Comma | Colon | LessThanSign | EqualsSign | GreaterThanSign | H | M | S | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=45;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalShortDSLLexer.g:1:10: In_progress
                {
                mIn_progress(); 

                }
                break;
            case 2 :
                // InternalShortDSLLexer.g:1:22: Complete
                {
                mComplete(); 

                }
                break;
            case 3 :
                // InternalShortDSLLexer.g:1:31: Devices
                {
                mDevices(); 

                }
                break;
            case 4 :
                // InternalShortDSLLexer.g:1:39: Foreach
                {
                mForeach(); 

                }
                break;
            case 5 :
                // InternalShortDSLLexer.g:1:47: Logging
                {
                mLogging(); 

                }
                break;
            case 6 :
                // InternalShortDSLLexer.g:1:55: Handle
                {
                mHandle(); 

                }
                break;
            case 7 :
                // InternalShortDSLLexer.g:1:62: Pickup
                {
                mPickup(); 

                }
                break;
            case 8 :
                // InternalShortDSLLexer.g:1:69: Empty
                {
                mEmpty(); 

                }
                break;
            case 9 :
                // InternalShortDSLLexer.g:1:75: Green
                {
                mGreen(); 

                }
                break;
            case 10 :
                // InternalShortDSLLexer.g:1:81: Short
                {
                mShort(); 

                }
                break;
            case 11 :
                // InternalShortDSLLexer.g:1:87: Blue
                {
                mBlue(); 

                }
                break;
            case 12 :
                // InternalShortDSLLexer.g:1:92: Drop
                {
                mDrop(); 

                }
                break;
            case 13 :
                // InternalShortDSLLexer.g:1:97: Free
                {
                mFree(); 

                }
                break;
            case 14 :
                // InternalShortDSLLexer.g:1:102: Full
                {
                mFull(); 

                }
                break;
            case 15 :
                // InternalShortDSLLexer.g:1:107: Long
                {
                mLong(); 

                }
                break;
            case 16 :
                // InternalShortDSLLexer.g:1:112: Scan
                {
                mScan(); 

                }
                break;
            case 17 :
                // InternalShortDSLLexer.g:1:117: Test
                {
                mTest(); 

                }
                break;
            case 18 :
                // InternalShortDSLLexer.g:1:122: HyphenMinusHyphenMinusGreaterThanSign
                {
                mHyphenMinusHyphenMinusGreaterThanSign(); 

                }
                break;
            case 19 :
                // InternalShortDSLLexer.g:1:160: Dev
                {
                mDev(); 

                }
                break;
            case 20 :
                // InternalShortDSLLexer.g:1:164: Dsl
                {
                mDsl(); 

                }
                break;
            case 21 :
                // InternalShortDSLLexer.g:1:168: Red
                {
                mRed(); 

                }
                break;
            case 22 :
                // InternalShortDSLLexer.g:1:172: Use
                {
                mUse(); 

                }
                break;
            case 23 :
                // InternalShortDSLLexer.g:1:176: Var
                {
                mVar(); 

                }
                break;
            case 24 :
                // InternalShortDSLLexer.g:1:180: ExclamationMarkEqualsSign
                {
                mExclamationMarkEqualsSign(); 

                }
                break;
            case 25 :
                // InternalShortDSLLexer.g:1:206: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 26 :
                // InternalShortDSLLexer.g:1:233: If
                {
                mIf(); 

                }
                break;
            case 27 :
                // InternalShortDSLLexer.g:1:236: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 28 :
                // InternalShortDSLLexer.g:1:252: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 29 :
                // InternalShortDSLLexer.g:1:269: Comma
                {
                mComma(); 

                }
                break;
            case 30 :
                // InternalShortDSLLexer.g:1:275: Colon
                {
                mColon(); 

                }
                break;
            case 31 :
                // InternalShortDSLLexer.g:1:281: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 32 :
                // InternalShortDSLLexer.g:1:294: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 33 :
                // InternalShortDSLLexer.g:1:305: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 34 :
                // InternalShortDSLLexer.g:1:321: H
                {
                mH(); 

                }
                break;
            case 35 :
                // InternalShortDSLLexer.g:1:323: M
                {
                mM(); 

                }
                break;
            case 36 :
                // InternalShortDSLLexer.g:1:325: S
                {
                mS(); 

                }
                break;
            case 37 :
                // InternalShortDSLLexer.g:1:327: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 38 :
                // InternalShortDSLLexer.g:1:344: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 39 :
                // InternalShortDSLLexer.g:1:362: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 40 :
                // InternalShortDSLLexer.g:1:370: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 41 :
                // InternalShortDSLLexer.g:1:379: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalShortDSLLexer.g:1:391: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 43 :
                // InternalShortDSLLexer.g:1:407: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 44 :
                // InternalShortDSLLexer.g:1:423: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 45 :
                // InternalShortDSLLexer.g:1:431: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\5\46\1\60\3\46\1\66\2\46\1\43\3\46\1\43\7\uffff\1\106\2\uffff\1\43\2\uffff\3\43\2\uffff\1\46\1\117\1\uffff\11\46\1\uffff\5\46\1\uffff\2\46\2\uffff\3\46\20\uffff\1\46\1\uffff\1\46\1\147\1\46\1\151\15\46\1\167\1\170\1\171\3\46\1\uffff\1\175\1\uffff\1\46\1\177\1\u0080\1\46\1\u0082\5\46\1\u0088\1\u0089\1\u008a\3\uffff\3\46\1\uffff\1\46\2\uffff\1\46\1\uffff\2\46\1\u0092\1\u0093\1\u0094\3\uffff\5\46\1\u009a\1\u009b\3\uffff\2\46\1\u009e\1\u009f\1\u00a0\2\uffff\1\46\1\u00a2\3\uffff\1\46\1\uffff\1\46\1\u00a5\1\uffff";
    static final String DFA12_eofS =
        "\u00a6\uffff";
    static final String DFA12_minS =
        "\1\0\1\146\1\157\1\145\2\157\1\60\1\151\1\155\1\162\1\60\1\154\1\145\1\55\1\145\1\163\1\141\1\75\7\uffff\1\60\2\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\137\1\60\1\uffff\1\155\1\166\1\157\1\154\1\162\1\145\1\154\1\147\1\156\1\uffff\1\143\1\160\1\145\1\157\1\141\1\uffff\1\165\1\163\2\uffff\1\144\1\145\1\162\20\uffff\1\160\1\uffff\1\160\1\60\1\160\1\60\2\145\1\154\2\147\1\144\1\153\1\164\1\145\1\162\1\156\1\145\1\164\3\60\1\162\1\154\1\143\1\uffff\1\60\1\uffff\1\141\2\60\1\151\1\60\1\154\1\165\1\171\1\156\1\164\3\60\3\uffff\1\157\2\145\1\uffff\1\143\2\uffff\1\156\1\uffff\1\145\1\160\3\60\3\uffff\1\147\1\164\1\163\1\150\1\147\2\60\3\uffff\1\162\1\145\3\60\2\uffff\1\145\1\60\3\uffff\1\163\1\uffff\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\157\1\163\1\165\1\157\1\172\1\151\1\155\1\162\1\172\1\154\1\145\1\76\1\145\1\163\1\141\1\75\7\uffff\1\172\2\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\137\1\172\1\uffff\1\155\1\166\1\157\1\154\1\162\1\145\1\154\2\156\1\uffff\1\143\1\160\1\145\1\157\1\141\1\uffff\1\165\1\163\2\uffff\1\144\1\145\1\162\20\uffff\1\160\1\uffff\1\160\1\172\1\160\1\172\2\145\1\154\2\147\1\144\1\153\1\164\1\145\1\162\1\156\1\145\1\164\3\172\1\162\1\154\1\143\1\uffff\1\172\1\uffff\1\141\2\172\1\151\1\172\1\154\1\165\1\171\1\156\1\164\3\172\3\uffff\1\157\2\145\1\uffff\1\143\2\uffff\1\156\1\uffff\1\145\1\160\3\172\3\uffff\1\147\1\164\1\163\1\150\1\147\2\172\3\uffff\1\162\1\145\3\172\2\uffff\1\145\1\172\3\uffff\1\163\1\uffff\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\22\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\45\1\46\1\uffff\1\47\1\50\3\uffff\1\54\1\55\2\uffff\1\47\11\uffff\1\42\5\uffff\1\44\2\uffff\1\22\1\31\3\uffff\1\30\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\43\1\45\1\46\1\50\1\51\1\52\1\53\1\54\1\uffff\1\32\27\uffff\1\23\1\uffff\1\24\15\uffff\1\25\1\26\1\27\3\uffff\1\14\1\uffff\1\15\1\16\1\uffff\1\17\5\uffff\1\20\1\13\1\21\7\uffff\1\10\1\11\1\12\5\uffff\1\6\1\7\2\uffff\1\3\1\4\1\5\1\uffff\1\2\2\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\36\uffff\1\0\1\2\u0085\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\21\1\37\4\43\1\40\1\22\1\23\2\43\1\24\1\15\1\43\1\41\12\36\1\25\1\43\1\26\1\27\1\30\2\43\32\35\3\43\1\34\1\35\1\43\1\35\1\13\1\2\1\3\1\10\1\4\1\11\1\6\1\1\2\35\1\5\1\31\2\35\1\7\1\35\1\16\1\12\1\14\1\17\1\20\4\35\1\32\1\43\1\33\uff82\43",
            "\1\45\7\uffff\1\44",
            "\1\47",
            "\1\50\14\uffff\1\51\1\52",
            "\1\53\2\uffff\1\54\2\uffff\1\55",
            "\1\56",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\57\31\46",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\65\4\46\1\64\22\46",
            "\1\67",
            "\1\70",
            "\1\71\20\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\112",
            "\0\112",
            "\1\113\4\uffff\1\114",
            "",
            "",
            "\1\116",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127\6\uffff\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144",
            "",
            "\1\145",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\146\21\46",
            "\1\150",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\176",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0081",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u00a1",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( In_progress | Complete | Devices | Foreach | Logging | Handle | Pickup | Empty | Green | Short | Blue | Drop | Free | Full | Long | Scan | Test | HyphenMinusHyphenMinusGreaterThanSign | Dev | Dsl | Red | Use | Var | ExclamationMarkEqualsSign | HyphenMinusGreaterThanSign | If | LeftParenthesis | RightParenthesis | Comma | Colon | LessThanSign | EqualsSign | GreaterThanSign | H | M | S | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='c') ) {s = 2;}

                        else if ( (LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='f') ) {s = 4;}

                        else if ( (LA12_0=='l') ) {s = 5;}

                        else if ( (LA12_0=='h') ) {s = 6;}

                        else if ( (LA12_0=='p') ) {s = 7;}

                        else if ( (LA12_0=='e') ) {s = 8;}

                        else if ( (LA12_0=='g') ) {s = 9;}

                        else if ( (LA12_0=='s') ) {s = 10;}

                        else if ( (LA12_0=='b') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='-') ) {s = 13;}

                        else if ( (LA12_0=='r') ) {s = 14;}

                        else if ( (LA12_0=='u') ) {s = 15;}

                        else if ( (LA12_0=='v') ) {s = 16;}

                        else if ( (LA12_0=='!') ) {s = 17;}

                        else if ( (LA12_0=='(') ) {s = 18;}

                        else if ( (LA12_0==')') ) {s = 19;}

                        else if ( (LA12_0==',') ) {s = 20;}

                        else if ( (LA12_0==':') ) {s = 21;}

                        else if ( (LA12_0=='<') ) {s = 22;}

                        else if ( (LA12_0=='=') ) {s = 23;}

                        else if ( (LA12_0=='>') ) {s = 24;}

                        else if ( (LA12_0=='m') ) {s = 25;}

                        else if ( (LA12_0=='{') ) {s = 26;}

                        else if ( (LA12_0=='}') ) {s = 27;}

                        else if ( (LA12_0=='^') ) {s = 28;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='w' && LA12_0<='z')) ) {s = 29;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 30;}

                        else if ( (LA12_0=='\"') ) {s = 31;}

                        else if ( (LA12_0=='\'') ) {s = 32;}

                        else if ( (LA12_0=='/') ) {s = 33;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 34;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='.'||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( ((LA12_32>='\u0000' && LA12_32<='\uFFFF')) ) {s = 74;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}