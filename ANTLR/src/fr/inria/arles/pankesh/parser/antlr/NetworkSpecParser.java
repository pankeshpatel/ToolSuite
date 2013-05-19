// $ANTLR 3.4 Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g 2013-05-16 18:23:09

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "MOBILEFLAG", "WS", "','", "':'", "';'", "'devices'", "'mobile'", "'networkaddress'", "'region'", "'resources'", "'type'"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int MOBILEFLAG=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "networkspec"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:23:1: networkspec : 'devices' ':' ( device_def )* ;
    public final void networkspec() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:23:12: ( 'devices' ':' ( device_def )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:24:7: 'devices' ':' ( device_def )*
            {
            match(input,12,FOLLOW_12_in_networkspec58); 

            match(input,10,FOLLOW_10_in_networkspec60); 

             context = new Context();
                  

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:27:5: ( device_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= CAPITALIZED_ID && LA1_0 <= ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:27:6: device_def
            	    {
            	    pushFollow(FOLLOW_device_def_in_networkspec75);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:30:1: device_def : deviceName= ( ID | CAPITALIZED_ID ) ':' 'region' ':' ( location_def )* 'type' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )* ';' ( mobileFlag_def )* ';' ;
    public final void device_def() throws RecognitionException {
        Token deviceName=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:30:11: (deviceName= ( ID | CAPITALIZED_ID ) ':' 'region' ':' ( location_def )* 'type' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )* ';' ( mobileFlag_def )* ';' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:31:4: deviceName= ( ID | CAPITALIZED_ID ) ':' 'region' ':' ( location_def )* 'type' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )* ';' ( mobileFlag_def )* ';'
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


            match(input,10,FOLLOW_10_in_device_def109); 

             
               context.currentNetwork = new DeviceNetwork();
               context.currentNetwork.setDeviceName((deviceName!=null?deviceName.getText():null));
               

            match(input,15,FOLLOW_15_in_device_def126); 

            match(input,10,FOLLOW_10_in_device_def128); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:37:18: ( location_def )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CAPITALIZED_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:37:19: location_def
            	    {
            	    pushFollow(FOLLOW_location_def_in_device_def131);
            	    location_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,17,FOLLOW_17_in_device_def140); 

            match(input,10,FOLLOW_10_in_device_def142); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:38:16: ( device_type )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CAPITALIZED_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:38:17: device_type
            	    {
            	    pushFollow(FOLLOW_device_type_in_device_def145);
            	    device_type();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,11,FOLLOW_11_in_device_def149); 

            match(input,16,FOLLOW_16_in_device_def155); 

            match(input,10,FOLLOW_10_in_device_def157); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:39:21: ( abilities_def )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CAPITALIZED_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:39:22: abilities_def
            	    {
            	    pushFollow(FOLLOW_abilities_def_in_device_def160);
            	    abilities_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,11,FOLLOW_11_in_device_def164); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:40:5: ( mobileFlag_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:40:6: mobileFlag_def
            	    {
            	    pushFollow(FOLLOW_mobileFlag_def_in_device_def171);
            	    mobileFlag_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,11,FOLLOW_11_in_device_def175); 

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



    // $ANTLR start "mobileFlag_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:44:1: mobileFlag_def : 'mobile' ':' MOBILEFLAG ;
    public final void mobileFlag_def() throws RecognitionException {
        Token MOBILEFLAG1=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:44:16: ( 'mobile' ':' MOBILEFLAG )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:45:4: 'mobile' ':' MOBILEFLAG
            {
            match(input,13,FOLLOW_13_in_mobileFlag_def193); 

            match(input,10,FOLLOW_10_in_mobileFlag_def195); 

            MOBILEFLAG1=(Token)match(input,MOBILEFLAG,FOLLOW_MOBILEFLAG_in_mobileFlag_def197); 

            context.currentNetwork.setMobileFlag((MOBILEFLAG1!=null?MOBILEFLAG1.getText():null));

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
    // $ANTLR end "mobileFlag_def"



    // $ANTLR start "networkAddress_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:49:1: networkAddress_def : 'networkaddress' ':' INT ;
    public final void networkAddress_def() throws RecognitionException {
        Token INT2=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:49:20: ( 'networkaddress' ':' INT )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:50:3: 'networkaddress' ':' INT
            {
            match(input,14,FOLLOW_14_in_networkAddress_def215); 

            match(input,10,FOLLOW_10_in_networkAddress_def217); 

            INT2=(Token)match(input,INT,FOLLOW_INT_in_networkAddress_def219); 

            context.currentNetwork.setNetworkAddress((INT2!=null?INT2.getText():null));

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:54:1: location_def : CAPITALIZED_ID ':' INT ';' ;
    public final void location_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;
        Token INT4=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:54:14: ( CAPITALIZED_ID ':' INT ';' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:55:5: CAPITALIZED_ID ':' INT ';'
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_location_def237); 

            match(input,10,FOLLOW_10_in_location_def239); 

            INT4=(Token)match(input,INT,FOLLOW_INT_in_location_def241); 

            match(input,11,FOLLOW_11_in_location_def243); 

            context.currentNetwork.addRegionLabel((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                context.currentNetwork.addRegionValue((INT4!=null?INT4.getText():null));

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:60:1: device_type : CAPITALIZED_ID ;
    public final void device_type() throws RecognitionException {
        Token CAPITALIZED_ID5=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:60:13: ( CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:61:6: CAPITALIZED_ID
            {
            CAPITALIZED_ID5=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_device_type263); 

            context.currentNetwork.setDeviceType((CAPITALIZED_ID5!=null?CAPITALIZED_ID5.getText():null));

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:65:1: abilities_def : CAPITALIZED_ID ( ',' abilities_def )? ;
    public final void abilities_def() throws RecognitionException {
        Token CAPITALIZED_ID6=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:65:15: ( CAPITALIZED_ID ( ',' abilities_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:4: CAPITALIZED_ID ( ',' abilities_def )?
            {
            CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_abilities_def282); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:19: ( ',' abilities_def )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==9) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:66:20: ',' abilities_def
                    {
                    match(input,9,FOLLOW_9_in_abilities_def285); 

                    pushFollow(FOLLOW_abilities_def_in_abilities_def287);
                    abilities_def();

                    state._fsp--;


                    }
                    break;

            }


            context.currentNetwork.addDeviceAbilities((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
              

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


 

    public static final BitSet FOLLOW_12_in_networkspec58 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_networkspec60 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_device_def_in_networkspec75 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_device_def103 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_device_def109 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_device_def126 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_device_def128 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_location_def_in_device_def131 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_device_def140 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_device_def142 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_device_type_in_device_def145 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_device_def149 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_device_def155 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_device_def157 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_abilities_def_in_device_def160 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_device_def164 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_mobileFlag_def_in_device_def171 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_11_in_device_def175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_mobileFlag_def193 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_mobileFlag_def195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_MOBILEFLAG_in_mobileFlag_def197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_networkAddress_def215 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_networkAddress_def217 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_networkAddress_def219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_location_def237 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_location_def239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_location_def241 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_location_def243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_device_type263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_abilities_def282 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_abilities_def285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_abilities_def_in_abilities_def287 = new BitSet(new long[]{0x0000000000000002L});

}