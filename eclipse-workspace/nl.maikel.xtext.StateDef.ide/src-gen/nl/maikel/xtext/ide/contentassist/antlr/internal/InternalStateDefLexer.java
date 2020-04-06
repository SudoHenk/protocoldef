package nl.sudohenk.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateDefLexer extends Lexer {
    public static final int RULE_HEX=8;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ENUMNAME=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_DATATYPE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalStateDefLexer() {;} 
    public InternalStateDefLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStateDefLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalStateDef.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:11:7: ( 'machine' )
            // InternalStateDef.g:11:9: 'machine'
            {
            match("machine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:12:7: ( '{' )
            // InternalStateDef.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:13:7: ( 'initial' )
            // InternalStateDef.g:13:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:14:7: ( 'end' )
            // InternalStateDef.g:14:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:15:7: ( '}' )
            // InternalStateDef.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:16:7: ( 'state' )
            // InternalStateDef.g:16:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:17:7: ( 'transition' )
            // InternalStateDef.g:17:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:18:7: ( 'from' )
            // InternalStateDef.g:18:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:19:7: ( 'received' )
            // InternalStateDef.g:19:9: 'received'
            {
            match("received"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:20:7: ( 'messages' )
            // InternalStateDef.g:20:9: 'messages'
            {
            match("messages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:21:7: ( 'sent' )
            // InternalStateDef.g:21:9: 'sent'
            {
            match("sent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:22:7: ( 'go' )
            // InternalStateDef.g:22:9: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:23:7: ( 'message' )
            // InternalStateDef.g:23:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:24:7: ( 'struct' )
            // InternalStateDef.g:24:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:25:7: ( ';' )
            // InternalStateDef.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:26:7: ( '=' )
            // InternalStateDef.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:27:7: ( ',' )
            // InternalStateDef.g:27:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:28:7: ( '<' )
            // InternalStateDef.g:28:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:29:7: ( '..' )
            // InternalStateDef.g:29:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:30:7: ( '>' )
            // InternalStateDef.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:31:7: ( '[' )
            // InternalStateDef.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:32:7: ( ']' )
            // InternalStateDef.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:33:7: ( 'enum' )
            // InternalStateDef.g:33:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:34:7: ( '(' )
            // InternalStateDef.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:35:7: ( ')' )
            // InternalStateDef.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:36:7: ( 'any' )
            // InternalStateDef.g:36:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:3660:10: ( '0x' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* )
            // InternalStateDef.g:3660:12: '0x' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )*
            {
            match("0x"); 

            // InternalStateDef.g:3660:17: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateDef.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_DATATYPE"
    public final void mRULE_DATATYPE() throws RecognitionException {
        try {
            int _type = RULE_DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:3662:15: ( ( 'uint' ( '8' | '16' | '24' ) | 'opaque' ) )
            // InternalStateDef.g:3662:17: ( 'uint' ( '8' | '16' | '24' ) | 'opaque' )
            {
            // InternalStateDef.g:3662:17: ( 'uint' ( '8' | '16' | '24' ) | 'opaque' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='u') ) {
                alt3=1;
            }
            else if ( (LA3_0=='o') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateDef.g:3662:18: 'uint' ( '8' | '16' | '24' )
                    {
                    match("uint"); 

                    // InternalStateDef.g:3662:25: ( '8' | '16' | '24' )
                    int alt2=3;
                    switch ( input.LA(1) ) {
                    case '8':
                        {
                        alt2=1;
                        }
                        break;
                    case '1':
                        {
                        alt2=2;
                        }
                        break;
                    case '2':
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // InternalStateDef.g:3662:26: '8'
                            {
                            match('8'); 

                            }
                            break;
                        case 2 :
                            // InternalStateDef.g:3662:30: '16'
                            {
                            match("16"); 


                            }
                            break;
                        case 3 :
                            // InternalStateDef.g:3662:35: '24'
                            {
                            match("24"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalStateDef.g:3662:41: 'opaque'
                    {
                    match("opaque"); 


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
    // $ANTLR end "RULE_DATATYPE"

    // $ANTLR start "RULE_ENUMNAME"
    public final void mRULE_ENUMNAME() throws RecognitionException {
        try {
            int _type = RULE_ENUMNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:3664:15: ( ( 'a' .. 'z' | '_' )+ )
            // InternalStateDef.g:3664:17: ( 'a' .. 'z' | '_' )+
            {
            // InternalStateDef.g:3664:17: ( 'a' .. 'z' | '_' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateDef.g:
            	    {
            	    if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENUMNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalStateDef.g:3666:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalStateDef.g:3666:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalStateDef.g:3666:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateDef.g:3666:11: '^'
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

            // InternalStateDef.g:3666:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateDef.g:
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
            	    break loop6;
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
            // InternalStateDef.g:3668:10: ( ( '0' .. '9' )+ )
            // InternalStateDef.g:3668:12: ( '0' .. '9' )+
            {
            // InternalStateDef.g:3668:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalStateDef.g:3668:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalStateDef.g:3670:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalStateDef.g:3670:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalStateDef.g:3670:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalStateDef.g:3670:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalStateDef.g:3670:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalStateDef.g:3670:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateDef.g:3670:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalStateDef.g:3670:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalStateDef.g:3670:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalStateDef.g:3670:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalStateDef.g:3670:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalStateDef.g:3672:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalStateDef.g:3672:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalStateDef.g:3672:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalStateDef.g:3672:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalStateDef.g:3674:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalStateDef.g:3674:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalStateDef.g:3674:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalStateDef.g:3674:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalStateDef.g:3674:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalStateDef.g:3674:41: ( '\\r' )? '\\n'
                    {
                    // InternalStateDef.g:3674:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalStateDef.g:3674:41: '\\r'
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
            // InternalStateDef.g:3676:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalStateDef.g:3676:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalStateDef.g:3676:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalStateDef.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalStateDef.g:3678:16: ( . )
            // InternalStateDef.g:3678:18: .
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
        // InternalStateDef.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_HEX | RULE_DATATYPE | RULE_ENUMNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=36;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalStateDef.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalStateDef.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalStateDef.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalStateDef.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalStateDef.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalStateDef.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalStateDef.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalStateDef.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalStateDef.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalStateDef.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalStateDef.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalStateDef.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalStateDef.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalStateDef.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalStateDef.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalStateDef.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalStateDef.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalStateDef.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalStateDef.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalStateDef.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalStateDef.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalStateDef.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalStateDef.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalStateDef.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalStateDef.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalStateDef.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalStateDef.g:1:166: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 28 :
                // InternalStateDef.g:1:175: RULE_DATATYPE
                {
                mRULE_DATATYPE(); 

                }
                break;
            case 29 :
                // InternalStateDef.g:1:189: RULE_ENUMNAME
                {
                mRULE_ENUMNAME(); 

                }
                break;
            case 30 :
                // InternalStateDef.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalStateDef.g:1:211: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalStateDef.g:1:220: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalStateDef.g:1:232: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalStateDef.g:1:248: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalStateDef.g:1:264: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalStateDef.g:1:272: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\45\1\uffff\2\45\1\uffff\5\45\4\uffff\1\41\5\uffff\1\45\1\75\3\45\1\41\2\uffff\3\41\2\uffff\3\45\3\uffff\2\45\1\uffff\5\45\1\117\12\uffff\1\45\2\uffff\2\45\4\uffff\3\45\1\126\7\45\1\uffff\1\136\5\45\1\uffff\1\144\2\45\1\147\1\45\1\151\1\45\1\uffff\5\45\1\uffff\1\162\1\45\1\uffff\1\45\1\uffff\1\45\1\166\2\46\4\45\1\uffff\1\175\2\45\1\uffff\3\166\1\u0080\1\u0082\1\u0083\1\uffff\2\45\1\uffff\1\u0086\2\uffff\1\45\1\u0088\1\uffff\1\45\1\uffff\1\u008a\1\uffff";
    static final String DFA16_eofS =
        "\u008b\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\uffff\2\60\1\uffff\5\60\4\uffff\1\56\5\uffff\1\60\1\170\3\60\1\101\2\uffff\2\0\1\52\2\uffff\3\60\3\uffff\2\60\1\uffff\6\60\12\uffff\1\60\2\uffff\2\60\4\uffff\13\60\1\uffff\6\60\1\uffff\7\60\1\uffff\5\60\1\uffff\2\60\1\uffff\1\60\1\uffff\2\60\1\66\1\64\4\60\1\uffff\3\60\1\uffff\6\60\1\uffff\2\60\1\uffff\1\60\2\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\uffff\2\172\1\uffff\5\172\4\uffff\1\56\5\uffff\1\172\1\170\4\172\2\uffff\2\uffff\1\57\2\uffff\3\172\3\uffff\2\172\1\uffff\6\172\12\uffff\1\172\2\uffff\2\172\4\uffff\13\172\1\uffff\6\172\1\uffff\7\172\1\uffff\5\172\1\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\66\1\64\4\172\1\uffff\3\172\1\uffff\6\172\1\uffff\2\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\5\uffff\1\17\1\20\1\21\1\22\1\uffff\1\24\1\25\1\26\1\30\1\31\6\uffff\1\36\1\37\3\uffff\1\43\1\44\3\uffff\1\35\1\36\1\2\2\uffff\1\5\6\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\uffff\1\33\1\37\2\uffff\1\40\1\41\1\42\1\43\13\uffff\1\14\6\uffff\1\4\7\uffff\1\32\5\uffff\1\27\2\uffff\1\13\1\uffff\1\10\10\uffff\1\6\3\uffff\1\34\6\uffff\1\16\2\uffff\1\1\1\uffff\1\15\1\3\2\uffff\1\12\1\uffff\1\11\1\uffff\1\7";
    static final String DFA16_specialS =
        "\1\1\34\uffff\1\0\1\2\154\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\1\23\1\24\2\41\1\15\1\41\1\17\1\37\1\26\11\34\1\41\1\13\1\16\1\14\1\20\2\41\32\33\1\21\1\41\1\22\1\32\1\31\1\41\1\25\3\31\1\4\1\10\1\12\1\31\1\3\3\31\1\1\1\31\1\30\2\31\1\11\1\6\1\7\1\27\5\31\1\2\1\41\1\5\uff82\41",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\1\42\3\44\1\43\25\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\50\14\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\51\14\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\54\16\44\1\53\6\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\21\44\1\55\10\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\21\44\1\56\10\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\57\25\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\16\44\1\60\13\44",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\73\14\44",
            "\1\74",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\76\21\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\17\44\1\77\12\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\0\100",
            "\0\100",
            "\1\101\4\uffff\1\102",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\2\44\1\104\27\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\22\44\1\105\7\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\106\21\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\3\44\1\107\20\44\1\110\5\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\1\111\20\44\1\112\10\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\113\14\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\1\114\31\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\16\44\1\115\13\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\2\44\1\116\27\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
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
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\30\44\1\120\1\44",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\121\14\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\1\122\31\44",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\7\44\1\123\22\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\22\44\1\124\7\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\23\44\1\125\6\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\14\44\1\127\15\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\23\44\1\130\6\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\24\44\1\131\5\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\23\44\1\132\6\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\133\14\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\14\44\1\134\15\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\135\25\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\23\44\1\137\6\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\20\44\1\140\11\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\141\21\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\1\142\31\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\143\21\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\145\25\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\2\44\1\146\27\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\22\44\1\150\7\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\152\21\44",
            "",
            "\1\46\1\154\1\155\5\46\1\153\1\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\24\44\1\156\5\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\157\14\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\6\44\1\160\23\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\1\161\31\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\23\44\1\163\6\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\164\21\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\25\44\1\165\4\44",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\167",
            "\1\170",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\171\25\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\172\25\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\173\25\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\13\44\1\174\16\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\23\44\1\176\6\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\4\44\1\177\25\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\22\44\1\u0081\7\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\10\44\1\u0084\21\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\3\44\1\u0085\26\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\16\44\1\u0087\13\44",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\15\44\1\u0089\14\44",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_HEX | RULE_DATATYPE | RULE_ENUMNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_29 = input.LA(1);

                        s = -1;
                        if ( ((LA16_29>='\u0000' && LA16_29<='\uFFFF')) ) {s = 64;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='m') ) {s = 1;}

                        else if ( (LA16_0=='{') ) {s = 2;}

                        else if ( (LA16_0=='i') ) {s = 3;}

                        else if ( (LA16_0=='e') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='s') ) {s = 6;}

                        else if ( (LA16_0=='t') ) {s = 7;}

                        else if ( (LA16_0=='f') ) {s = 8;}

                        else if ( (LA16_0=='r') ) {s = 9;}

                        else if ( (LA16_0=='g') ) {s = 10;}

                        else if ( (LA16_0==';') ) {s = 11;}

                        else if ( (LA16_0=='=') ) {s = 12;}

                        else if ( (LA16_0==',') ) {s = 13;}

                        else if ( (LA16_0=='<') ) {s = 14;}

                        else if ( (LA16_0=='.') ) {s = 15;}

                        else if ( (LA16_0=='>') ) {s = 16;}

                        else if ( (LA16_0=='[') ) {s = 17;}

                        else if ( (LA16_0==']') ) {s = 18;}

                        else if ( (LA16_0=='(') ) {s = 19;}

                        else if ( (LA16_0==')') ) {s = 20;}

                        else if ( (LA16_0=='a') ) {s = 21;}

                        else if ( (LA16_0=='0') ) {s = 22;}

                        else if ( (LA16_0=='u') ) {s = 23;}

                        else if ( (LA16_0=='o') ) {s = 24;}

                        else if ( (LA16_0=='_'||(LA16_0>='b' && LA16_0<='d')||LA16_0=='h'||(LA16_0>='j' && LA16_0<='l')||LA16_0=='n'||(LA16_0>='p' && LA16_0<='q')||(LA16_0>='v' && LA16_0<='z')) ) {s = 25;}

                        else if ( (LA16_0=='^') ) {s = 26;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')) ) {s = 27;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) ) {s = 28;}

                        else if ( (LA16_0=='\"') ) {s = 29;}

                        else if ( (LA16_0=='\'') ) {s = 30;}

                        else if ( (LA16_0=='/') ) {s = 31;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 32;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='*' && LA16_0<='+')||LA16_0=='-'||LA16_0==':'||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 64;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}