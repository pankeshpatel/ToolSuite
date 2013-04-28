// $ANTLR 3.4 C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g 2013-04-28 18:49:25

  package fr.inria.arles.pankesh.parser.antlr; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NetworkSpecLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public NetworkSpecLexer() {} 
    public NetworkSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NetworkSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:11:6: ( ',' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:11:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:12:6: ( ':' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:12:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:13:7: ( ';' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:14:7: ( 'devices' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:14:9: 'devices'
            {
            match("devices"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:15:7: ( 'networkaddress' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:15:9: 'networkaddress'
            {
            match("networkaddress"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:16:7: ( 'region' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:16:9: 'region'
            {
            match("region"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:17:7: ( 'resources' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:17:9: 'resources'
            {
            match("resources"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:18:7: ( 'type' )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:18:9: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:7: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
            {
            matchRange('a','z'); 

            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:17: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:41: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:69:5: ( '0' .. '9' ( '0' .. '9' )* )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:69:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 

            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:69:15: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CAPITALIZED_ID"
    public final void mCAPITALIZED_ID() throws RecognitionException {
        try {
            int _type = CAPITALIZED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:71:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:71:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
            {
            matchRange('A','Z'); 

            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:71:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:71:50: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CAPITALIZED_ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:73:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:73:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:73:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | INT | CAPITALIZED_ID | WS )
        int alt7=12;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt7=1;
            }
            break;
        case ':':
            {
            alt7=2;
            }
            break;
        case ';':
            {
            alt7=3;
            }
            break;
        case 'd':
            {
            int LA7_4 = input.LA(2);

            if ( (LA7_4=='e') ) {
                int LA7_12 = input.LA(3);

                if ( (LA7_12=='v') ) {
                    int LA7_16 = input.LA(4);

                    if ( (LA7_16=='i') ) {
                        int LA7_21 = input.LA(5);

                        if ( (LA7_21=='c') ) {
                            int LA7_26 = input.LA(6);

                            if ( (LA7_26=='e') ) {
                                int LA7_31 = input.LA(7);

                                if ( (LA7_31=='s') ) {
                                    int LA7_35 = input.LA(8);

                                    if ( ((LA7_35 >= '0' && LA7_35 <= '9')||(LA7_35 >= 'A' && LA7_35 <= 'Z')||(LA7_35 >= 'a' && LA7_35 <= 'z')) ) {
                                        alt7=9;
                                    }
                                    else {
                                        alt7=4;
                                    }
                                }
                                else {
                                    alt7=9;
                                }
                            }
                            else {
                                alt7=9;
                            }
                        }
                        else {
                            alt7=9;
                        }
                    }
                    else {
                        alt7=9;
                    }
                }
                else {
                    alt7=9;
                }
            }
            else {
                alt7=9;
            }
            }
            break;
        case 'n':
            {
            int LA7_5 = input.LA(2);

            if ( (LA7_5=='e') ) {
                int LA7_13 = input.LA(3);

                if ( (LA7_13=='t') ) {
                    int LA7_17 = input.LA(4);

                    if ( (LA7_17=='w') ) {
                        int LA7_22 = input.LA(5);

                        if ( (LA7_22=='o') ) {
                            int LA7_27 = input.LA(6);

                            if ( (LA7_27=='r') ) {
                                int LA7_32 = input.LA(7);

                                if ( (LA7_32=='k') ) {
                                    int LA7_36 = input.LA(8);

                                    if ( (LA7_36=='a') ) {
                                        int LA7_40 = input.LA(9);

                                        if ( (LA7_40=='d') ) {
                                            int LA7_42 = input.LA(10);

                                            if ( (LA7_42=='d') ) {
                                                int LA7_44 = input.LA(11);

                                                if ( (LA7_44=='r') ) {
                                                    int LA7_46 = input.LA(12);

                                                    if ( (LA7_46=='e') ) {
                                                        int LA7_47 = input.LA(13);

                                                        if ( (LA7_47=='s') ) {
                                                            int LA7_48 = input.LA(14);

                                                            if ( (LA7_48=='s') ) {
                                                                int LA7_49 = input.LA(15);

                                                                if ( ((LA7_49 >= '0' && LA7_49 <= '9')||(LA7_49 >= 'A' && LA7_49 <= 'Z')||(LA7_49 >= 'a' && LA7_49 <= 'z')) ) {
                                                                    alt7=9;
                                                                }
                                                                else {
                                                                    alt7=5;
                                                                }
                                                            }
                                                            else {
                                                                alt7=9;
                                                            }
                                                        }
                                                        else {
                                                            alt7=9;
                                                        }
                                                    }
                                                    else {
                                                        alt7=9;
                                                    }
                                                }
                                                else {
                                                    alt7=9;
                                                }
                                            }
                                            else {
                                                alt7=9;
                                            }
                                        }
                                        else {
                                            alt7=9;
                                        }
                                    }
                                    else {
                                        alt7=9;
                                    }
                                }
                                else {
                                    alt7=9;
                                }
                            }
                            else {
                                alt7=9;
                            }
                        }
                        else {
                            alt7=9;
                        }
                    }
                    else {
                        alt7=9;
                    }
                }
                else {
                    alt7=9;
                }
            }
            else {
                alt7=9;
            }
            }
            break;
        case 'r':
            {
            int LA7_6 = input.LA(2);

            if ( (LA7_6=='e') ) {
                switch ( input.LA(3) ) {
                case 'g':
                    {
                    int LA7_18 = input.LA(4);

                    if ( (LA7_18=='i') ) {
                        int LA7_23 = input.LA(5);

                        if ( (LA7_23=='o') ) {
                            int LA7_28 = input.LA(6);

                            if ( (LA7_28=='n') ) {
                                int LA7_33 = input.LA(7);

                                if ( ((LA7_33 >= '0' && LA7_33 <= '9')||(LA7_33 >= 'A' && LA7_33 <= 'Z')||(LA7_33 >= 'a' && LA7_33 <= 'z')) ) {
                                    alt7=9;
                                }
                                else {
                                    alt7=6;
                                }
                            }
                            else {
                                alt7=9;
                            }
                        }
                        else {
                            alt7=9;
                        }
                    }
                    else {
                        alt7=9;
                    }
                    }
                    break;
                case 's':
                    {
                    int LA7_19 = input.LA(4);

                    if ( (LA7_19=='o') ) {
                        int LA7_24 = input.LA(5);

                        if ( (LA7_24=='u') ) {
                            int LA7_29 = input.LA(6);

                            if ( (LA7_29=='r') ) {
                                int LA7_34 = input.LA(7);

                                if ( (LA7_34=='c') ) {
                                    int LA7_38 = input.LA(8);

                                    if ( (LA7_38=='e') ) {
                                        int LA7_41 = input.LA(9);

                                        if ( (LA7_41=='s') ) {
                                            int LA7_43 = input.LA(10);

                                            if ( ((LA7_43 >= '0' && LA7_43 <= '9')||(LA7_43 >= 'A' && LA7_43 <= 'Z')||(LA7_43 >= 'a' && LA7_43 <= 'z')) ) {
                                                alt7=9;
                                            }
                                            else {
                                                alt7=7;
                                            }
                                        }
                                        else {
                                            alt7=9;
                                        }
                                    }
                                    else {
                                        alt7=9;
                                    }
                                }
                                else {
                                    alt7=9;
                                }
                            }
                            else {
                                alt7=9;
                            }
                        }
                        else {
                            alt7=9;
                        }
                    }
                    else {
                        alt7=9;
                    }
                    }
                    break;
                default:
                    alt7=9;
                }

            }
            else {
                alt7=9;
            }
            }
            break;
        case 't':
            {
            int LA7_7 = input.LA(2);

            if ( (LA7_7=='y') ) {
                int LA7_15 = input.LA(3);

                if ( (LA7_15=='p') ) {
                    int LA7_20 = input.LA(4);

                    if ( (LA7_20=='e') ) {
                        int LA7_25 = input.LA(5);

                        if ( ((LA7_25 >= '0' && LA7_25 <= '9')||(LA7_25 >= 'A' && LA7_25 <= 'Z')||(LA7_25 >= 'a' && LA7_25 <= 'z')) ) {
                            alt7=9;
                        }
                        else {
                            alt7=8;
                        }
                    }
                    else {
                        alt7=9;
                    }
                }
                else {
                    alt7=9;
                }
            }
            else {
                alt7=9;
            }
            }
            break;
        case 'a':
        case 'b':
        case 'c':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'o':
        case 'p':
        case 'q':
        case 's':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=9;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=10;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt7=11;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt7=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:56: ID
                {
                mID(); 


                }
                break;
            case 10 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:59: INT
                {
                mINT(); 


                }
                break;
            case 11 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:63: CAPITALIZED_ID
                {
                mCAPITALIZED_ID(); 


                }
                break;
            case 12 :
                // C:\\Users\\Hiral\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:78: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}