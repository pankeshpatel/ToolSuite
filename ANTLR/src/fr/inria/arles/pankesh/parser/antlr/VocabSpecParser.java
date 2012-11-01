// $ANTLR 3.4 C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g 2012-11-01 23:38:22

package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.*; 
import fr.inria.arles.pankesh.semanticmodel.*;  
   


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VocabSpecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", "'abilities'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'controller'", "'deployment-instance'", "'double'", "'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", "'regions'", "'request'", "'sensors'", "'singleton'", "'storageService'", "'structs'", "'to'"
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
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VocabSpecParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VocabSpecParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return VocabSpecParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "vocabSpec"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'abilities' ':' abilities_def ;
    public final void vocabSpec() throws RecognitionException {
        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'abilities' ':' abilities_def )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:25:3: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'abilities' ':' abilities_def
            {
            match(input,33,FOLLOW_33_in_vocabSpec62); 

             context = new Context();
            		context.currentRegion = new RegionsGenerator();
            		context.currentMappingConstraint = new MappingConstraint(); 

            match(input,11,FOLLOW_11_in_vocabSpec70); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:29:7: ( region_def )+
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
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:29:8: region_def
            	    {
            	    pushFollow(FOLLOW_region_def_in_vocabSpec73);
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

            match(input,38,FOLLOW_38_in_vocabSpec90); 

            match(input,11,FOLLOW_11_in_vocabSpec109); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:33:5: ( struct_def )+
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
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:33:6: struct_def
            	    {
            	    pushFollow(FOLLOW_struct_def_in_vocabSpec123);
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


            match(input,16,FOLLOW_16_in_vocabSpec133); 

            match(input,11,FOLLOW_11_in_vocabSpec135); 

            pushFollow(FOLLOW_abilities_def_in_vocabSpec137);
            abilities_def();

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
    // $ANTLR end "vocabSpec"



    // $ANTLR start "region_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:38:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        VocabSpecParser.dataType_return dataType2 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:38:12: ( CAPITALIZED_ID ':' dataType ';' )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:40:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def159); 

            match(input,11,FOLLOW_11_in_region_def161); 

            pushFollow(FOLLOW_dataType_in_region_def163);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def166); 

             
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:46:1: sc_def : ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )* ;
    public final void sc_def() throws RecognitionException {
        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:46:8: ( ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:2: ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )*
            {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:2: ( 'storageService' ( ss_def )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:3: 'storageService' ( ss_def )+
            	    {
            	    match(input,37,FOLLOW_37_in_sc_def183); 

            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:20: ( ss_def )+
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
            	    	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:21: ss_def
            	    	    {
            	    	    pushFollow(FOLLOW_ss_def_in_sc_def186);
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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,23,FOLLOW_23_in_sc_def197); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:27: ( cs_def )+
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
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:28: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_sc_def200);
            	    cs_def();

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


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:5: ( 'controller' ( controller_def )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:6: 'controller' ( controller_def )+
            	    {
            	    match(input,25,FOLLOW_25_in_sc_def210); 

            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:19: ( controller_def )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==CAPITALIZED_ID) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:20: controller_def
            	    	    {
            	    	    pushFollow(FOLLOW_controller_def_in_sc_def213);
            	    	    controller_def();

            	    	    state._fsp--;


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


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "sc_def"



    // $ANTLR start "ss_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:53:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:53:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:54:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def234); 

            	context.currentStorageService = new Storage();
                	//context.currentStorageService = new Storage((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                	

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:58:5: ( storageAttribute_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:58:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def247);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def249); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:59:5: ( storageDataAccess_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:59:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def258);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def260); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:60:5: ( storagePartition_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:60:6: storagePartition_def ';'
            	    {
            	    pushFollow(FOLLOW_storagePartition_def_in_ss_def270);
            	    storagePartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def272); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:72:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id4 =null;

        VocabSpecParser.dataType_return dataType5 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:72:21: ( 'attribute' lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:73:3: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_storageAttribute_def292); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def294);
            lc_id4=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def296); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def298);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:77:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:77:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:78:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def319);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,17,FOLLOW_17_in_storageDataAccess_def322); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def324);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:82:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID7=null;
        VocabSpecParser.lc_id_return lc_id6 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:82:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:83:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_storageGeneratedInfo_def343); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def345);
            lc_id6=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def347); 

            CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def350); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:88:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id8 =null;

        VocabSpecParser.dataType_return dataType9 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:88:21: ( lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:89:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def372);
            lc_id8=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def374); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def376);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:93:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:93:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:94:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,26,FOLLOW_26_in_storagePartition_def405); 

            match(input,11,FOLLOW_11_in_storagePartition_def407); 

            storageDeploymentConstraintValue=(Token)match(input,36,FOLLOW_36_in_storagePartition_def413); 


                 
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:104:1: controller_def : CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* ;
    public final void controller_def() throws RecognitionException {
        Token CAPITALIZED_ID10=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:104:15: ( CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:105:3: CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )*
            {
            CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def430); 


                context.currentController = new ControllerService();
                //context.currentController = new ControllerService((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:110:5: ( cntrlAttribute_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:110:6: cntrlAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlAttribute_def_in_controller_def443);
            	    cntrlAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def445); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:111:5: ( cntrlConsumeInfo_def ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:111:6: cntrlConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlConsumeInfo_def_in_controller_def454);
            	    cntrlConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def456); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:112:5: ( cntrlCommand_def ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:112:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_controller_def465);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def467); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:113:5: ( cntrlPartition_def ';' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:113:6: cntrlPartition_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlPartition_def_in_controller_def477);
            	    cntrlPartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def479); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:124:1: cntrlPartition_def : cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void cntrlPartition_def() throws RecognitionException {
        Token cntrlDeploymentConstraint=null;
        Token CAPITALIZED_ID11=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:124:20: (cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:125:2: cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            cntrlDeploymentConstraint=(Token)match(input,31,FOLLOW_31_in_cntrlPartition_def500); 

            match(input,11,FOLLOW_11_in_cntrlPartition_def502); 

            CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def504); 

             
                context.currentController.setPartitionAttribute((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
                 // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((cntrlDeploymentConstraint!=null?cntrlDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));  
                

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:134:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id12 =null;

        VocabSpecParser.dataType_return dataType13 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:134:19: ( 'attribute' lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:135:3: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_cntrlAttribute_def522); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def524);
            lc_id12=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def526); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def528);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:139:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id14 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:139:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:140:2: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,24,FOLLOW_24_in_cntrlConsumeInfo_def544); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def546);
            lc_id14=lc_id();

            state._fsp--;


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:140:18: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:140:19: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,28,FOLLOW_28_in_cntrlConsumeInfo_def549); 

                    match(input,32,FOLLOW_32_in_cntrlConsumeInfo_def551); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def553); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def555); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def557); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def559); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:144:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token name=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:144:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:145:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
            {
            match(input,22,FOLLOW_22_in_cntrlCommand_def584); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def591); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def593); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:145:42: ( cntrlParameter_def )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:145:43: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def596);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def600); 

            match(input,39,FOLLOW_39_in_cntrlCommand_def602); 

            match(input,32,FOLLOW_32_in_cntrlCommand_def605); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def607); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def609); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def611); 

            match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def613); 

             
                  context.currentController.addCommand((name!=null?name.getText():null));  
                

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:151:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id15 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:151:20: ( lc_id ( ',' parameter_def )? )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:152:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def633);
            lc_id15=lc_id();

            state._fsp--;


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:152:12: ( ',' parameter_def )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==10) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:152:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def637); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def639);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             context.currentController.addParameter((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null)); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:156:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID16=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:156:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:157:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def660); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:161:5: ( csAttribute_def ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:161:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def673);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def675); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:162:5: ( csGeneratedInfo_def ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:162:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def684);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def686); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:163:5: ( csConsumeInfo_def ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:163:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def696);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def698); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:164:5: ( csRequest_def ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:164:6: csRequest_def ';'
            	    {
            	    pushFollow(FOLLOW_csRequest_def_in_cs_def708);
            	    csRequest_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def711); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:165:5: ( partition_def ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:165:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def720);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def722); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


             
                 context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
                 context.currentComputationalService.createCSObject();
                context.currentComputationalService.generateCode(); 
                // Next line is for Software Component Name
                context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:177:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id17 =null;

        VocabSpecParser.dataType_return dataType18 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:177:17: ( 'attribute' lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:178:5: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_csAttribute_def743); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def745);
            lc_id17=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def747); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def749);
            dataType18=dataType();

            state._fsp--;


             context.currentComputationalService.addAttribute((lc_id17!=null?input.toString(lc_id17.start,lc_id17.stop):null), (dataType18!=null?input.toString(dataType18.start,dataType18.stop):null));  

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:182:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID20=null;
        VocabSpecParser.lc_id_return lc_id19 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:182:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:183:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_csGeneratedInfo_def768); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def770);
            lc_id19=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def772); 

            CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def775); 

             context.currentComputationalService.addGeneratedInfo((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null)); 
                context.constructSymbTable((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null)); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:188:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id21 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:188:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:189:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,24,FOLLOW_24_in_csConsumeInfo_def793); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def795);
            lc_id21=lc_id();

            state._fsp--;


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:189:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:189:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,28,FOLLOW_28_in_csConsumeInfo_def798); 

                    match(input,32,FOLLOW_32_in_csConsumeInfo_def800); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def802); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def804); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def806); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def808); 

                    }
                    break;

            }


             context.currentComputationalService.addConsumedInfo((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null));  
                
               

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



    // $ANTLR start "csRequest_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:195:1: csRequest_def : 'request' lc_id ;
    public final void csRequest_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id22 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:195:15: ( 'request' lc_id )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:196:4: 'request' lc_id
            {
            match(input,34,FOLLOW_34_in_csRequest_def830); 

            pushFollow(FOLLOW_lc_id_in_csRequest_def832);
            lc_id22=lc_id();

            state._fsp--;


             context.currentComputationalService.getDataAccessListFromSymblTable((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null));

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
    // $ANTLR end "csRequest_def"



    // $ANTLR start "partition_def"
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:200:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token CAPITALIZED_ID23=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:200:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:201:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            csDeploymentConstraint=(Token)match(input,31,FOLLOW_31_in_partition_def852); 

            match(input,11,FOLLOW_11_in_partition_def854); 

            CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def856); 

             
                context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID23!=null?CAPITALIZED_ID23.getText():null));   
                // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID23!=null?CAPITALIZED_ID23.getText():null)); 
               

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:210:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID24=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:210:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:211:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def875); 

            context.currentStruct = new Struct((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:213:5: ( structField_def ';' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:213:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def889);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def891); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:216:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id25 =null;

        VocabSpecParser.dataType_return dataType26 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:216:16: ( lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:217:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def913);
            lc_id25=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def915); 

            pushFollow(FOLLOW_dataType_in_structField_def917);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:221:1: lc_id : ID ;
    public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
        VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:221:6: ( ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:221:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id933); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:224:1: dataType : primitiveType ;
    public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
        VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:224:9: ( primitiveType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:225:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType946);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:228:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:228:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt25=1;
                }
                break;
            case 13:
                {
                alt25=2;
                }
                break;
            case 15:
                {
                alt25=3;
                }
                break;
            case 27:
                {
                alt25=4;
                }
                break;
            case 30:
                {
                alt25=5;
                }
                break;
            case 21:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:4: id= 'Integer'
                    {
                    id=(Token)match(input,14,FOLLOW_14_in_primitiveType961); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType967); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:34: id= 'String'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType973); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:49: id= 'double'
                    {
                    id=(Token)match(input,27,FOLLOW_27_in_primitiveType982); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:65: id= 'long'
                    {
                    id=(Token)match(input,30,FOLLOW_30_in_primitiveType990); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:229:79: id= 'boolean'
                    {
                    id=(Token)match(input,21,FOLLOW_21_in_primitiveType996); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ ;
    public final void abilities_def() throws RecognitionException {
        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:233:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+
            {
            match(input,35,FOLLOW_35_in_abilities_def1009); 

            match(input,11,FOLLOW_11_in_abilities_def1011); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:233:19: ( sensor_def )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CAPITALIZED_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:233:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def1016);
            	    sensor_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            match(input,19,FOLLOW_19_in_abilities_def1022); 

            match(input,11,FOLLOW_11_in_abilities_def1024); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:234:19: ( actuator_def )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==CAPITALIZED_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:234:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def1027);
            	    actuator_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:237:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID27=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:237:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID27=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def1043); 

            context.currentSensor = new Sensor((CAPITALIZED_ID27!=null?CAPITALIZED_ID27.getText():null));

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:240:5: ( attribute_def ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:240:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def1056);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1058); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:241:5: ( sensorMeasurement_def ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:241:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def1067);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1069); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:245:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id28 =null;

        VocabSpecParser.dataType_return dataType29 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:245:14: ( 'attribute' lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:246:5: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_attribute_def1090); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1092);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1094); 

            pushFollow(FOLLOW_dataType_in_attribute_def1096);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:250:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID31=null;
        VocabSpecParser.lc_id_return lc_id30 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:250:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:251:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_sensorMeasurement_def1116); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1118);
            lc_id30=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1120); 

            CAPITALIZED_ID31=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1123); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:256:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID32=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:256:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:257:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID32=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1141); 

            context.currentActuator = new Actuator((CAPITALIZED_ID32!=null?CAPITALIZED_ID32.getText():null));

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:259:4: ( actuatorAttribute_def ';' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:259:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1152);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1154); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:4: ( action_def ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1162);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1164); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:264:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id33 =null;

        VocabSpecParser.dataType_return dataType34 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:264:22: ( 'attribute' lc_id ':' dataType )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:265:6: 'attribute' lc_id ':' dataType
            {
            match(input,20,FOLLOW_20_in_actuatorAttribute_def1187); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1189);
            lc_id33=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1191); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1193);
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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:269:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;

        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:269:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:270:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,18,FOLLOW_18_in_action_def1212); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1214); 

            match(input,8,FOLLOW_8_in_action_def1216); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:270:33: ( parameter_def )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:270:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1219);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1223); 

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
    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID37=null;
        VocabSpecParser.lc_id_return lc_id36 =null;


        try {
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:275:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1243);
            lc_id36=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1245); 

            CAPITALIZED_ID37=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1248); 

            // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:275:31: ( ',' parameter_def )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==10) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Hiral\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:275:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1251); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1253);
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


 

    public static final BitSet FOLLOW_33_in_vocabSpec62 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec70 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_region_def_in_vocabSpec73 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_38_in_vocabSpec90 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_struct_def_in_vocabSpec123 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_vocabSpec133 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec135 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_abilities_def_in_vocabSpec137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def159 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def161 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_region_def163 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_sc_def183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_sc_def186 = new BitSet(new long[]{0x0000002000800010L});
    public static final BitSet FOLLOW_23_in_sc_def197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_sc_def200 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_25_in_sc_def210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_controller_def_in_sc_def213 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def234 = new BitSet(new long[]{0x0000000024100002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def249 = new BitSet(new long[]{0x0000000024100002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def260 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_storagePartition_def_in_ss_def270 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def272 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_20_in_storageAttribute_def292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def296 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def319 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_storageDataAccess_def322 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_storageGeneratedInfo_def343 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def345 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def372 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def374 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_storagePartition_def405 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def407 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_storagePartition_def413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def430 = new BitSet(new long[]{0x0000000081500002L});
    public static final BitSet FOLLOW_cntrlAttribute_def_in_controller_def443 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def445 = new BitSet(new long[]{0x0000000081500002L});
    public static final BitSet FOLLOW_cntrlConsumeInfo_def_in_controller_def454 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def456 = new BitSet(new long[]{0x0000000081400002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def467 = new BitSet(new long[]{0x0000000080400002L});
    public static final BitSet FOLLOW_cntrlPartition_def_in_controller_def477 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def479 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_cntrlPartition_def500 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlPartition_def502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_cntrlAttribute_def522 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def526 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_cntrlConsumeInfo_def544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def546 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_cntrlConsumeInfo_def549 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cntrlConsumeInfo_def551 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def553 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def555 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_cntrlCommand_def584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def591 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def593 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def596 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def600 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_cntrlCommand_def602 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cntrlCommand_def605 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def609 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def633 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def660 = new BitSet(new long[]{0x00000004A1100002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def673 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def675 = new BitSet(new long[]{0x00000004A1100002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def686 = new BitSet(new long[]{0x00000004A1000002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def696 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def698 = new BitSet(new long[]{0x0000000481000002L});
    public static final BitSet FOLLOW_csRequest_def_in_cs_def708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def711 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def722 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_20_in_csAttribute_def743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def745 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def747 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_csGeneratedInfo_def768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def770 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_csConsumeInfo_def793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def795 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_csConsumeInfo_def798 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_csConsumeInfo_def800 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def802 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def804 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_csRequest_def830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csRequest_def832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_partition_def852 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def875 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def889 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def891 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def913 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def915 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_structField_def917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primitiveType961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_primitiveType982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_primitiveType990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_primitiveType996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_abilities_def1009 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def1016 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_abilities_def1022 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def1027 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def1043 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def1056 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1058 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def1067 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1069 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20_in_attribute_def1090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1092 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1094 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_sensorMeasurement_def1116 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1118 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1141 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1152 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1154 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1164 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20_in_actuatorAttribute_def1187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1189 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1191 = new BitSet(new long[]{0x000000004820E000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_action_def1212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1214 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1216 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1219 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1243 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1248 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1253 = new BitSet(new long[]{0x0000000000000002L});

}