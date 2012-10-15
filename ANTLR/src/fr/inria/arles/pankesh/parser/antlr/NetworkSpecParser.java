// $ANTLR 3.4 C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g 2012-10-11 14:16:21

package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.DeviceNetwork; 
import fr.inria.arles.pankesh.semanticmodel.*;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NetworkSpecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "','", "':'", "';'", "'abilities'", "'devices'", "'networkaddress'", "'region'", "'type'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public NetworkSpecParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public NetworkSpecParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return NetworkSpecParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "networkspec"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:23:1: networkspec : 'devices' ':' ( device_def )* ;
    public final void networkspec() throws RecognitionException {
        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:23:12: ( 'devices' ':' ( device_def )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:24:7: 'devices' ':' ( device_def )*
            {
            match(input,12,FOLLOW_12_in_networkspec56); 

            match(input,9,FOLLOW_9_in_networkspec58); 

             context = new Context();
                  

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:27:4: ( device_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= CAPITALIZED_ID && LA1_0 <= ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:27:5: device_def
            	    {
            	    pushFollow(FOLLOW_device_def_in_networkspec72);
            	    device_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "networkspec"



    // $ANTLR start "device_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:30:1: device_def : deviceName= ( ID | CAPITALIZED_ID ) ':' networkAddress_def ';' 'region' ':' ( location_def )* 'type' ':' ( device_type )* ';' 'abilities' ':' ( abilities_def )* ';' ;
    public final void device_def() throws RecognitionException {
        Token deviceName=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:30:11: (deviceName= ( ID | CAPITALIZED_ID ) ':' networkAddress_def ';' 'region' ':' ( location_def )* 'type' ':' ( device_type )* ';' 'abilities' ':' ( abilities_def )* ';' )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:31:4: deviceName= ( ID | CAPITALIZED_ID ) ':' networkAddress_def ';' 'region' ':' ( location_def )* 'type' ':' ( device_type )* ';' 'abilities' ':' ( abilities_def )* ';'
            {
            deviceName=(Token)input.LT(1);

            if ( (input.LA(1) >= CAPITALIZED_ID && input.LA(1) <= ID) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,9,FOLLOW_9_in_device_def104); 

             
             	 context.currentNetwork = new DeviceNetwork();
             	 context.currentNetwork.setDeviceName((deviceName!=null?deviceName.getText():null));
             	 

            pushFollow(FOLLOW_networkAddress_def_in_device_def121);
            networkAddress_def();

            state._fsp--;


            match(input,10,FOLLOW_10_in_device_def123); 

            match(input,14,FOLLOW_14_in_device_def129); 

            match(input,9,FOLLOW_9_in_device_def131); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:37:18: ( location_def )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CAPITALIZED_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:37:19: location_def
            	    {
            	    pushFollow(FOLLOW_location_def_in_device_def134);
            	    location_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,15,FOLLOW_15_in_device_def143); 

            match(input,9,FOLLOW_9_in_device_def145); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:38:16: ( device_type )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CAPITALIZED_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:38:17: device_type
            	    {
            	    pushFollow(FOLLOW_device_type_in_device_def148);
            	    device_type();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,10,FOLLOW_10_in_device_def152); 

            match(input,11,FOLLOW_11_in_device_def158); 

            match(input,9,FOLLOW_9_in_device_def160); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:39:21: ( abilities_def )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CAPITALIZED_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:39:22: abilities_def
            	    {
            	    pushFollow(FOLLOW_abilities_def_in_device_def163);
            	    abilities_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,10,FOLLOW_10_in_device_def167); 

             context.currentNetwork.addDeviceObj();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "device_def"



    // $ANTLR start "networkAddress_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:43:1: networkAddress_def : 'networkaddress' ':' INT ;
    public final void networkAddress_def() throws RecognitionException {
        Token INT1=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:43:20: ( 'networkaddress' ':' INT )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:44:2: 'networkaddress' ':' INT
            {
            match(input,13,FOLLOW_13_in_networkAddress_def183); 

            match(input,9,FOLLOW_9_in_networkAddress_def185); 

            INT1=(Token)match(input,INT,FOLLOW_INT_in_networkAddress_def187); 

            context.currentNetwork.setNetworkAddress((INT1!=null?INT1.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "networkAddress_def"



    // $ANTLR start "location_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:48:1: location_def : CAPITALIZED_ID ':' INT ';' ;
    public final void location_def() throws RecognitionException {
        Token CAPITALIZED_ID2=null;
        Token INT3=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:48:14: ( CAPITALIZED_ID ':' INT ';' )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:49:3: CAPITALIZED_ID ':' INT ';'
            {
            CAPITALIZED_ID2=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_location_def202); 

            match(input,9,FOLLOW_9_in_location_def204); 

            INT3=(Token)match(input,INT,FOLLOW_INT_in_location_def206); 

            match(input,10,FOLLOW_10_in_location_def208); 

            context.currentNetwork.addRegionLabel((CAPITALIZED_ID2!=null?CAPITALIZED_ID2.getText():null));
            		context.currentNetwork.addRegionValue((INT3!=null?INT3.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "location_def"



    // $ANTLR start "device_type"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:54:1: device_type : CAPITALIZED_ID ;
    public final void device_type() throws RecognitionException {
        Token CAPITALIZED_ID4=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:54:13: ( CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:55:4: CAPITALIZED_ID
            {
            CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_device_type224); 

            context.currentNetwork.setDeviceType((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "device_type"



    // $ANTLR start "abilities_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:59:1: abilities_def : CAPITALIZED_ID ( ',' abilities_def )? ;
    public final void abilities_def() throws RecognitionException {
        Token CAPITALIZED_ID5=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:59:15: ( CAPITALIZED_ID ( ',' abilities_def )? )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:60:3: CAPITALIZED_ID ( ',' abilities_def )?
            {
            CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_abilities_def240); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:60:18: ( ',' abilities_def )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==8) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:60:19: ',' abilities_def
                    {
                    match(input,8,FOLLOW_8_in_abilities_def243); 

                    pushFollow(FOLLOW_abilities_def_in_abilities_def245);
                    abilities_def();

                    state._fsp--;


                    }
                    break;

            }


            context.currentNetwork.addDeviceAbilities((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "abilities_def"

    // Delegated rules


 

    public static final BitSet FOLLOW_12_in_networkspec56 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_networkspec58 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_device_def_in_networkspec72 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_device_def98 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_device_def104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_networkAddress_def_in_device_def121 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_device_def123 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_device_def129 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_device_def131 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_location_def_in_device_def134 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_device_def143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_device_def145 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_device_type_in_device_def148 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_10_in_device_def152 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_device_def158 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_device_def160 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_abilities_def_in_device_def163 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_10_in_device_def167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_networkAddress_def183 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_networkAddress_def185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_networkAddress_def187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_location_def202 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_location_def204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_location_def206 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_location_def208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_device_type224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_abilities_def240 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_abilities_def243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_abilities_def_in_abilities_def245 = new BitSet(new long[]{0x0000000000000002L});

}