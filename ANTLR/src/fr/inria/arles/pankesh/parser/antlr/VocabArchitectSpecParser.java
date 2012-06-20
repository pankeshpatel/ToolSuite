// $ANTLR 3.4 Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g 2012-06-20 10:36:56

package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.*; 
import fr.inria.arles.pankesh.semanticmodel.*;  
   


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VocabArchitectSpecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", "'abilities'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'command'", "'computationalService'", "'consume'", "'controller'", "'deployment-instance'", "'double'", "'from'", "'generate'", "'partition-per'", "'region-hops'", "'regions'", "'sensors'", "'singleton'", "'softwarecomponents'", "'storageService'", "'structs'", "'to'"
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
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VocabArchitectSpecParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VocabArchitectSpecParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return VocabArchitectSpecParser.tokenNames; }
    public String getGrammarFileName() { return "Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "vocArchSpec"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:24:1: vocArchSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'abilities' ':' abilities_def 'softwarecomponents' ':' sc_def ;
    public final void vocArchSpec() throws RecognitionException {
        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:24:13: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'abilities' ':' abilities_def 'softwarecomponents' ':' sc_def )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:25:3: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'abilities' ':' abilities_def 'softwarecomponents' ':' sc_def
            {
            match(input,31,FOLLOW_31_in_vocArchSpec60); 

             context = new Context();
            		context.currentRegion = new RegionsGenerator();
            		context.currentMappingConstraint = new MappingConstraint(); 

            match(input,11,FOLLOW_11_in_vocArchSpec68); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:29:7: ( region_def )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CAPITALIZED_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:29:8: region_def
            	    {
            	    pushFollow(FOLLOW_region_def_in_vocArchSpec71);
            	    region_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


             context.currentRegion.generateCode(); 

            match(input,36,FOLLOW_36_in_vocArchSpec99); 

            match(input,11,FOLLOW_11_in_vocArchSpec118); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:34:8: ( struct_def )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CAPITALIZED_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:34:9: struct_def
            	    {
            	    pushFollow(FOLLOW_struct_def_in_vocArchSpec135);
            	    struct_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input,16,FOLLOW_16_in_vocArchSpec156); 

            match(input,11,FOLLOW_11_in_vocArchSpec158); 

            pushFollow(FOLLOW_abilities_def_in_vocArchSpec160);
            abilities_def();

            state._fsp--;


            match(input,34,FOLLOW_34_in_vocArchSpec171); 

            match(input,11,FOLLOW_11_in_vocArchSpec173); 

            pushFollow(FOLLOW_sc_def_in_vocArchSpec175);
            sc_def();

            state._fsp--;


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
    // $ANTLR end "vocArchSpec"



    // $ANTLR start "region_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:40:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        VocabArchitectSpecParser.dataType_return dataType2 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:40:12: ( CAPITALIZED_ID ':' dataType ';' )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:42:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def192); 

            match(input,11,FOLLOW_11_in_region_def194); 

            pushFollow(FOLLOW_dataType_in_region_def196);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def199); 

             
                context.currentRegion.addRegion((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null), (dataType2!=null?input.toString(dataType2.start,dataType2.stop):null)); 
                

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
    // $ANTLR end "region_def"



    // $ANTLR start "sc_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:48:1: sc_def : 'storageService' ( ss_def )+ 'computationalService' ( cs_def )+ 'controller' ( controller_def )+ ;
    public final void sc_def() throws RecognitionException {
        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:48:8: ( 'storageService' ( ss_def )+ 'computationalService' ( cs_def )+ 'controller' ( controller_def )+ )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:49:2: 'storageService' ( ss_def )+ 'computationalService' ( cs_def )+ 'controller' ( controller_def )+
            {
            match(input,35,FOLLOW_35_in_sc_def215); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:49:19: ( ss_def )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CAPITALIZED_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:49:20: ss_def
            	    {
            	    pushFollow(FOLLOW_ss_def_in_sc_def218);
            	    ss_def();

            	    state._fsp--;


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


            match(input,22,FOLLOW_22_in_sc_def227); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:50:28: ( cs_def )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CAPITALIZED_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:50:29: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_sc_def230);
            	    cs_def();

            	    state._fsp--;


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


            match(input,24,FOLLOW_24_in_sc_def239); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:51:18: ( controller_def )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CAPITALIZED_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:51:19: controller_def
            	    {
            	    pushFollow(FOLLOW_controller_def_in_sc_def242);
            	    controller_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "sc_def"



    // $ANTLR start "ss_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:55:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:55:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )* )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:56:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def261); 

            	context.currentStorageService = new Storage();
                	//context.currentStorageService = new Storage((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                	

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:60:5: ( storageAttribute_def ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:60:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def274);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def276); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:61:5: ( storageDataAccess_def ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:61:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def285);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def287); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:62:5: ( storagePartition_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:62:6: storagePartition_def ';'
            	    {
            	    pushFollow(FOLLOW_storagePartition_def_in_ss_def297);
            	    storagePartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def299); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



                 	
                 context.currentStorageService.setStorageServiceName((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                 context.currentStorageService.createStorageObject();
                 context.currentStorageService.generateCode();
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                 context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
                 
                 

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
    // $ANTLR end "ss_def"



    // $ANTLR start "storageAttribute_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:74:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id4 =null;

        VocabArchitectSpecParser.dataType_return dataType5 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:74:21: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:75:3: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_storageAttribute_def319); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def321);
            lc_id4=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def323); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def325);
            dataType5=dataType();

            state._fsp--;


             context.currentStorageService.addAttribute((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null), (dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));  

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
    // $ANTLR end "storageAttribute_def"



    // $ANTLR start "storageDataAccess_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:79:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:79:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:80:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def346);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,17,FOLLOW_17_in_storageDataAccess_def349); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def351);
            storagedataIndex_def();

            state._fsp--;


             context.currentStorageService.addDataAccess(); 

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
    // $ANTLR end "storageDataAccess_def"



    // $ANTLR start "storageGeneratedInfo_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:84:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID7=null;
        VocabArchitectSpecParser.lc_id_return lc_id6 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:84:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:85:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,28,FOLLOW_28_in_storageGeneratedInfo_def370); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def372);
            lc_id6=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def374); 

            CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def377); 

             context.currentStorageService.addGeneratedInfo((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));  
                context.constructSymbTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));

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
    // $ANTLR end "storageGeneratedInfo_def"



    // $ANTLR start "storagedataIndex_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:90:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id8 =null;

        VocabArchitectSpecParser.dataType_return dataType9 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:90:21: ( lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:91:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def399);
            lc_id8=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def401); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def403);
            dataType9=dataType();

            state._fsp--;


             context.currentStorageService.addDataAccessIndex((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (dataType9!=null?input.toString(dataType9.start,dataType9.stop):null));  

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
    // $ANTLR end "storagedataIndex_def"



    // $ANTLR start "storagePartition_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:95:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:95:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:96:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,25,FOLLOW_25_in_storagePartition_def432); 

            match(input,11,FOLLOW_11_in_storagePartition_def434); 

            storageDeploymentConstraintValue=(Token)match(input,33,FOLLOW_33_in_storagePartition_def440); 


                 
                 // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((storageDeploymentConstraint!=null?storageDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((storageDeploymentConstraintValue!=null?storageDeploymentConstraintValue.getText():null));  
                

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
    // $ANTLR end "storagePartition_def"



    // $ANTLR start "controller_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:106:1: controller_def : CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* ;
    public final void controller_def() throws RecognitionException {
        Token CAPITALIZED_ID10=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:106:15: ( CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:107:3: CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )*
            {
            CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def457); 


                context.currentController = new ControllerService();
                //context.currentController = new ControllerService((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:112:5: ( cntrlAttribute_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:112:6: cntrlAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlAttribute_def_in_controller_def470);
            	    cntrlAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def472); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:113:5: ( cntrlConsumeInfo_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:113:6: cntrlConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlConsumeInfo_def_in_controller_def481);
            	    cntrlConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def483); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:114:5: ( cntrlCommand_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:114:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_controller_def492);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def494); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:115:5: ( cntrlPartition_def ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:115:6: cntrlPartition_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlPartition_def_in_controller_def504);
            	    cntrlPartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def506); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



                context.currentController.setControllerName((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                context.currentController.createCSObject();
                context.currentController.generateCode();
                context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
                
                

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
    // $ANTLR end "controller_def"



    // $ANTLR start "cntrlPartition_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:126:1: cntrlPartition_def : cntrlDeploymentConstraint= 'partition-per' ':' ID ;
    public final void cntrlPartition_def() throws RecognitionException {
        Token cntrlDeploymentConstraint=null;
        Token ID11=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:126:20: (cntrlDeploymentConstraint= 'partition-per' ':' ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:127:2: cntrlDeploymentConstraint= 'partition-per' ':' ID
            {
            cntrlDeploymentConstraint=(Token)match(input,29,FOLLOW_29_in_cntrlPartition_def527); 

            match(input,11,FOLLOW_11_in_cntrlPartition_def529); 

            ID11=(Token)match(input,ID,FOLLOW_ID_in_cntrlPartition_def531); 

             
                context.currentController.setPartitionAttribute((ID11!=null?ID11.getText():null)); 
                 // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((cntrlDeploymentConstraint!=null?cntrlDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((ID11!=null?ID11.getText():null));  
                

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
    // $ANTLR end "cntrlPartition_def"



    // $ANTLR start "cntrlAttribute_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:136:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id12 =null;

        VocabArchitectSpecParser.dataType_return dataType13 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:136:19: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:137:3: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_cntrlAttribute_def549); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def551);
            lc_id12=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def553); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def555);
            dataType13=dataType();

            state._fsp--;


             context.currentController.addAttribute((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null), (dataType13!=null?input.toString(dataType13.start,dataType13.stop):null));  

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
    // $ANTLR end "cntrlAttribute_def"



    // $ANTLR start "cntrlConsumeInfo_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:141:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id14 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:141:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' ID )? )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:142:2: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' ID )?
            {
            match(input,23,FOLLOW_23_in_cntrlConsumeInfo_def571); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def573);
            lc_id14=lc_id();

            state._fsp--;


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:142:18: ( 'from' 'region-hops' ':' INT ':' ID )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:142:19: 'from' 'region-hops' ':' INT ':' ID
                    {
                    match(input,27,FOLLOW_27_in_cntrlConsumeInfo_def576); 

                    match(input,30,FOLLOW_30_in_cntrlConsumeInfo_def578); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def580); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def582); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def584); 

                    match(input,ID,FOLLOW_ID_in_cntrlConsumeInfo_def586); 

                    }
                    break;

            }


             context.currentController.addConsumedInfo((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null));  

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
    // $ANTLR end "cntrlConsumeInfo_def"



    // $ANTLR start "cntrlCommand_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:146:1: cntrlCommand_def : 'command' CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token CAPITALIZED_ID15=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:146:18: ( 'command' CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:147:5: 'command' CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' ID
            {
            match(input,21,FOLLOW_21_in_cntrlCommand_def611); 

            CAPITALIZED_ID15=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def614); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def616); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:147:35: ( cntrlParameter_def )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:147:36: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def619);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def623); 

            match(input,37,FOLLOW_37_in_cntrlCommand_def625); 

            match(input,30,FOLLOW_30_in_cntrlCommand_def628); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def630); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def632); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def634); 

            match(input,ID,FOLLOW_ID_in_cntrlCommand_def636); 

             context.currentController.addCommand((CAPITALIZED_ID15!=null?CAPITALIZED_ID15.getText():null));  

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
    // $ANTLR end "cntrlCommand_def"



    // $ANTLR start "cntrlParameter_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:151:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id16 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:151:20: ( lc_id ( ',' parameter_def )? )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:152:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def656);
            lc_id16=lc_id();

            state._fsp--;


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:152:12: ( ',' parameter_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==10) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:152:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def660); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def662);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             context.currentController.addParameter((lc_id16!=null?input.toString(lc_id16.start,lc_id16.stop):null)); 

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
    // $ANTLR end "cntrlParameter_def"



    // $ANTLR start "cs_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:156:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID17=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:156:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( partition_def ';' )* )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:157:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID17=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def683); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:161:5: ( csAttribute_def ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:161:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def696);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def698); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:162:5: ( csGeneratedInfo_def ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:162:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def707);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def709); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:163:5: ( csConsumeInfo_def ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:163:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def719);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def721); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:164:5: ( partition_def ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:164:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def730);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def732); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


             
                 context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
                 context.currentComputationalService.createCSObject();
                context.currentComputationalService.generateCode(); 
                // Next line is for Software Component Name
                context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID17!=null?CAPITALIZED_ID17.getText():null));
                context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
                
                

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
    // $ANTLR end "cs_def"



    // $ANTLR start "csAttribute_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:176:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id18 =null;

        VocabArchitectSpecParser.dataType_return dataType19 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:176:17: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:177:5: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_csAttribute_def753); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def755);
            lc_id18=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def757); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def759);
            dataType19=dataType();

            state._fsp--;


             context.currentComputationalService.addAttribute((lc_id18!=null?input.toString(lc_id18.start,lc_id18.stop):null), (dataType19!=null?input.toString(dataType19.start,dataType19.stop):null));  

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
    // $ANTLR end "csAttribute_def"



    // $ANTLR start "csGeneratedInfo_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:181:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID21=null;
        VocabArchitectSpecParser.lc_id_return lc_id20 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:181:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:182:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,28,FOLLOW_28_in_csGeneratedInfo_def778); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def780);
            lc_id20=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def782); 

            CAPITALIZED_ID21=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def785); 

             context.currentComputationalService.addGeneratedInfo((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null)); 
                context.constructSymbTable((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null), (CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null)); 

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
    // $ANTLR end "csGeneratedInfo_def"



    // $ANTLR start "csConsumeInfo_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:187:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id22 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:187:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' ID )? )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:188:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' ID )?
            {
            match(input,23,FOLLOW_23_in_csConsumeInfo_def802); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def804);
            lc_id22=lc_id();

            state._fsp--;


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:188:19: ( 'from' 'region-hops' ':' INT ':' ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:188:20: 'from' 'region-hops' ':' INT ':' ID
                    {
                    match(input,27,FOLLOW_27_in_csConsumeInfo_def807); 

                    match(input,30,FOLLOW_30_in_csConsumeInfo_def809); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def811); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def813); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def815); 

                    match(input,ID,FOLLOW_ID_in_csConsumeInfo_def817); 

                    }
                    break;

            }


             context.currentComputationalService.addConsumedInfo((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null));  
               

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
    // $ANTLR end "csConsumeInfo_def"



    // $ANTLR start "partition_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:193:1: partition_def : csDeploymentConstraint= 'partition-per' ':' ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token ID23=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:193:14: (csDeploymentConstraint= 'partition-per' ':' ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:194:5: csDeploymentConstraint= 'partition-per' ':' ID
            {
            csDeploymentConstraint=(Token)match(input,29,FOLLOW_29_in_partition_def841); 

            match(input,11,FOLLOW_11_in_partition_def843); 

            ID23=(Token)match(input,ID,FOLLOW_ID_in_partition_def845); 

             
                context.currentComputationalService.addPartitionAttribute((ID23!=null?ID23.getText():null));   
                // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((ID23!=null?ID23.getText():null)); 
               

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
    // $ANTLR end "partition_def"



    // $ANTLR start "struct_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:203:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID24=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:203:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:204:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def864); 

            context.currentStruct = new Struct((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:206:5: ( structField_def ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:206:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def878);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def880); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            context.currentStruct.generateCode();

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
    // $ANTLR end "struct_def"



    // $ANTLR start "structField_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:209:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id25 =null;

        VocabArchitectSpecParser.dataType_return dataType26 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:209:16: ( lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:210:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def902);
            lc_id25=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def904); 

            pushFollow(FOLLOW_dataType_in_structField_def906);
            dataType26=dataType();

            state._fsp--;


             context.currentStruct.addField((lc_id25!=null?input.toString(lc_id25.start,lc_id25.stop):null), (dataType26!=null?input.toString(dataType26.start,dataType26.stop):null));  

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
    // $ANTLR end "structField_def"


    public static class lc_id_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "lc_id"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:214:1: lc_id : ID ;
    public final VocabArchitectSpecParser.lc_id_return lc_id() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return retval = new VocabArchitectSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:214:6: ( ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:214:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id922); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lc_id"


    public static class dataType_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "dataType"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:217:1: dataType : primitiveType ;
    public final VocabArchitectSpecParser.dataType_return dataType() throws RecognitionException {
        VocabArchitectSpecParser.dataType_return retval = new VocabArchitectSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:217:9: ( primitiveType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:218:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType935);
            primitiveType();

            state._fsp--;


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dataType"



    // $ANTLR start "primitiveType"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:221:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:221:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' ) )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:222:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' )
            {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:222:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt22=1;
                }
                break;
            case 13:
                {
                alt22=2;
                }
                break;
            case 15:
                {
                alt22=3;
                }
                break;
            case 26:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:222:4: id= 'Integer'
                    {
                    id=(Token)match(input,14,FOLLOW_14_in_primitiveType950); 

                    }
                    break;
                case 2 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:222:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType956); 

                    }
                    break;
                case 3 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:222:34: id= 'String'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType962); 

                    }
                    break;
                case 4 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:222:49: id= 'double'
                    {
                    id=(Token)match(input,26,FOLLOW_26_in_primitiveType971); 

                    }
                    break;

            }


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
    // $ANTLR end "primitiveType"



    // $ANTLR start "abilities_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:225:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ ;
    public final void abilities_def() throws RecognitionException {
        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:225:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:226:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+
            {
            match(input,32,FOLLOW_32_in_abilities_def984); 

            match(input,11,FOLLOW_11_in_abilities_def986); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:226:19: ( sensor_def )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==CAPITALIZED_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:226:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def991);
            	    sensor_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            match(input,19,FOLLOW_19_in_abilities_def997); 

            match(input,11,FOLLOW_11_in_abilities_def999); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:227:19: ( actuator_def )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==CAPITALIZED_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:227:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def1002);
            	    actuator_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "abilities_def"



    // $ANTLR start "sensor_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:230:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID27=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:230:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:231:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID27=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def1018); 

            context.currentSensor = new Sensor((CAPITALIZED_ID27!=null?CAPITALIZED_ID27.getText():null));

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:233:5: ( attribute_def ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:233:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def1031);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1033); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:234:5: ( sensorMeasurement_def ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:234:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def1042);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1044); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            context.currentSensor.generateCode();

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
    // $ANTLR end "sensor_def"



    // $ANTLR start "attribute_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:238:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id28 =null;

        VocabArchitectSpecParser.dataType_return dataType29 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:238:14: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:239:5: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_attribute_def1065); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1067);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1069); 

            pushFollow(FOLLOW_dataType_in_attribute_def1071);
            dataType29=dataType();

            state._fsp--;


             context.currentSensor.addAttribute((lc_id28!=null?input.toString(lc_id28.start,lc_id28.stop):null), (dataType29!=null?input.toString(dataType29.start,dataType29.stop):null));  

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
    // $ANTLR end "attribute_def"



    // $ANTLR start "sensorMeasurement_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:243:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID31=null;
        VocabArchitectSpecParser.lc_id_return lc_id30 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:243:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:244:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,28,FOLLOW_28_in_sensorMeasurement_def1091); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1093);
            lc_id30=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1095); 

            CAPITALIZED_ID31=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1098); 

             context.currentSensor.addSensorMeasurement((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null)); 
                context.constructSymbTable((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null)); 

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
    // $ANTLR end "sensorMeasurement_def"



    // $ANTLR start "actuator_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:249:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID32=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:249:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:250:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID32=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1116); 

            context.currentActuator = new Actuator((CAPITALIZED_ID32!=null?CAPITALIZED_ID32.getText():null));

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:252:4: ( actuatorAttribute_def ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==20) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:252:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1127);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1129); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:253:4: ( action_def ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:253:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1137);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1139); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            context.currentActuator.generateCode();

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
    // $ANTLR end "actuator_def"



    // $ANTLR start "actuatorAttribute_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:257:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        VocabArchitectSpecParser.lc_id_return lc_id33 =null;

        VocabArchitectSpecParser.dataType_return dataType34 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:257:22: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:258:6: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_actuatorAttribute_def1162); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1164);
            lc_id33=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1166); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1168);
            dataType34=dataType();

            state._fsp--;


             context.currentActuator.addAttribute((lc_id33!=null?input.toString(lc_id33.start,lc_id33.stop):null), (dataType34!=null?input.toString(dataType34.start,dataType34.stop):null));  

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
    // $ANTLR end "actuatorAttribute_def"



    // $ANTLR start "action_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:262:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;

        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:262:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:263:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,18,FOLLOW_18_in_action_def1187); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1189); 

            match(input,8,FOLLOW_8_in_action_def1191); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:263:33: ( parameter_def )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:263:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1194);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1198); 

             context.currentActuator.addAction((CAPITALIZED_ID35!=null?CAPITALIZED_ID35.getText():null)); 

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
    // $ANTLR end "action_def"



    // $ANTLR start "parameter_def"
    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:267:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID37=null;
        VocabArchitectSpecParser.lc_id_return lc_id36 =null;


        try {
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:267:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:268:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1218);
            lc_id36=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1220); 

            CAPITALIZED_ID37=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1223); 

            // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:268:31: ( ',' parameter_def )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==10) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Y:\\git\\Parser\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabArchitectSpec.g:268:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1226); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1228);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentActuator.addParameter((lc_id36!=null?input.toString(lc_id36.start,lc_id36.stop):null), (CAPITALIZED_ID37!=null?CAPITALIZED_ID37.getText():null)); 
                context.constructSymbTable((lc_id36!=null?input.toString(lc_id36.start,lc_id36.stop):null), (CAPITALIZED_ID37!=null?CAPITALIZED_ID37.getText():null));
                

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
    // $ANTLR end "parameter_def"

    // Delegated rules


 

    public static final BitSet FOLLOW_31_in_vocArchSpec60 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocArchSpec68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_region_def_in_vocArchSpec71 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_36_in_vocArchSpec99 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocArchSpec118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_struct_def_in_vocArchSpec135 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_vocArchSpec156 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocArchSpec158 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_abilities_def_in_vocArchSpec160 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_vocArchSpec171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocArchSpec173 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_sc_def_in_vocArchSpec175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def192 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def194 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_region_def196 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_sc_def215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_sc_def218 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_sc_def227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_sc_def230 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_sc_def239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_controller_def_in_sc_def242 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def261 = new BitSet(new long[]{0x0000000012100002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def276 = new BitSet(new long[]{0x0000000012100002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def287 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_storagePartition_def_in_ss_def297 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def299 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20_in_storageAttribute_def319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def323 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def346 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_storageDataAccess_def349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_storageGeneratedInfo_def370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def372 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def399 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def401 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_storagePartition_def432 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def434 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_storagePartition_def440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def457 = new BitSet(new long[]{0x0000000020B00002L});
    public static final BitSet FOLLOW_cntrlAttribute_def_in_controller_def470 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def472 = new BitSet(new long[]{0x0000000020B00002L});
    public static final BitSet FOLLOW_cntrlConsumeInfo_def_in_controller_def481 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def483 = new BitSet(new long[]{0x0000000020A00002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def492 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def494 = new BitSet(new long[]{0x0000000020200002L});
    public static final BitSet FOLLOW_cntrlPartition_def_in_controller_def504 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def506 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_cntrlPartition_def527 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlPartition_def529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cntrlPartition_def531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_cntrlAttribute_def549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def551 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def553 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_cntrlConsumeInfo_def571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def573 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_cntrlConsumeInfo_def576 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_cntrlConsumeInfo_def578 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def582 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cntrlConsumeInfo_def586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_cntrlCommand_def611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def614 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def616 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def619 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def623 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_cntrlCommand_def625 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_cntrlCommand_def628 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def630 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def632 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_cntrlCommand_def636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def656 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def683 = new BitSet(new long[]{0x0000000030900002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def696 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def698 = new BitSet(new long[]{0x0000000030900002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def707 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def709 = new BitSet(new long[]{0x0000000030800002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def721 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def732 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20_in_csAttribute_def753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def755 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def757 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_csGeneratedInfo_def778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def780 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_csConsumeInfo_def802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def804 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_csConsumeInfo_def807 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_csConsumeInfo_def809 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def811 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def813 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_csConsumeInfo_def817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_partition_def841 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_partition_def845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def864 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def878 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def880 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def902 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def904 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_structField_def906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primitiveType950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_primitiveType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_abilities_def984 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def991 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_abilities_def997 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def1002 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def1018 = new BitSet(new long[]{0x0000000010100002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def1031 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1033 = new BitSet(new long[]{0x0000000010100002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def1042 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1044 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_20_in_attribute_def1065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1067 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1069 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_sensorMeasurement_def1091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1093 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1116 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1129 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1139 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20_in_actuatorAttribute_def1162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1164 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1166 = new BitSet(new long[]{0x000000000400E000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_action_def1187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1189 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1191 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1194 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1218 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1223 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1226 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1228 = new BitSet(new long[]{0x0000000000000002L});

}