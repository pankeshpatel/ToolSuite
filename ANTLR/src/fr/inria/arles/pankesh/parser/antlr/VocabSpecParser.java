// $ANTLR 3.4 Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g 2013-04-16 11:01:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'controller'", "'deployment-instance'", "'double'", "'end user applications'", "'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", "'regions'", "'request'", "'resources'", "'sensors'", "'singleton'", "'storageService'", "'storages'", "'structs'", "'to'", "'with'"
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
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
    public String getGrammarFileName() { return "Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "vocabSpec"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
    public final void vocabSpec() throws RecognitionException {
        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:25:3: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
            {
            match(input,33,FOLLOW_33_in_vocabSpec63); 

             context = new Context();
            		context.currentRegion = new RegionsGenerator();
            		context.currentMappingConstraint = new MappingConstraint(); 

            match(input,11,FOLLOW_11_in_vocabSpec71); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:29:7: ( region_def )+
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
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:29:8: region_def
            	    {
            	    pushFollow(FOLLOW_region_def_in_vocabSpec74);
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

            match(input,40,FOLLOW_40_in_vocabSpec91); 

            match(input,11,FOLLOW_11_in_vocabSpec110); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:33:5: ( struct_def )+
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
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:33:6: struct_def
            	    {
            	    pushFollow(FOLLOW_struct_def_in_vocabSpec124);
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


            match(input,35,FOLLOW_35_in_vocabSpec134); 

            match(input,11,FOLLOW_11_in_vocabSpec136); 

            pushFollow(FOLLOW_abilities_def_in_vocabSpec138);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:38:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        VocabSpecParser.dataType_return dataType2 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:38:12: ( CAPITALIZED_ID ':' dataType ';' )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:40:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def164); 

            match(input,11,FOLLOW_11_in_region_def166); 

            pushFollow(FOLLOW_dataType_in_region_def168);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def171); 

             
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:46:1: sc_def : ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )* ;
    public final void sc_def() throws RecognitionException {
        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:46:8: ( ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:2: ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )*
            {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:2: ( 'storageService' ( ss_def )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==38) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:3: 'storageService' ( ss_def )+
            	    {
            	    match(input,38,FOLLOW_38_in_sc_def188); 

            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:20: ( ss_def )+
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
            	    	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:21: ss_def
            	    	    {
            	    	    pushFollow(FOLLOW_ss_def_in_sc_def191);
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


            match(input,22,FOLLOW_22_in_sc_def202); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:27: ( cs_def )+
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
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:28: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_sc_def205);
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


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:5: ( 'controller' ( controller_def )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:6: 'controller' ( controller_def )+
            	    {
            	    match(input,24,FOLLOW_24_in_sc_def215); 

            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:19: ( controller_def )+
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
            	    	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:20: controller_def
            	    	    {
            	    	    pushFollow(FOLLOW_controller_def_in_sc_def218);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:53:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:53:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:54:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def239); 

            	context.currentStorageService = new Storage();
                	//context.currentStorageService = new Storage((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                	

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:58:5: ( storageAttribute_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:58:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def252);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def254); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:59:5: ( storageDataAccess_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:59:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def263);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def265); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:72:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id4 =null;

        VocabSpecParser.dataType_return dataType5 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:72:21: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:73:3: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_storageAttribute_def289); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def291);
            lc_id4=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def293); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def295);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:77:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:77:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:78:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def316);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,16,FOLLOW_16_in_storageDataAccess_def319); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def321);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:82:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID7=null;
        VocabSpecParser.lc_id_return lc_id6 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:82:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:83:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_storageGeneratedInfo_def340); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def342);
            lc_id6=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def344); 

            CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def347); 

             context.currentStorageService.addGeneratedInfo((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));  
                context.constructSymbTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
                context.constructResponseTypeSymblTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:89:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id8 =null;

        VocabSpecParser.dataType_return dataType9 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:89:21: ( lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:90:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def369);
            lc_id8=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def371); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def373);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:94:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:94:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:95:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,25,FOLLOW_25_in_storagePartition_def402); 

            match(input,11,FOLLOW_11_in_storagePartition_def404); 

            storageDeploymentConstraintValue=(Token)match(input,37,FOLLOW_37_in_storagePartition_def410); 


                 
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:105:1: controller_def : CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* ;
    public final void controller_def() throws RecognitionException {
        Token CAPITALIZED_ID10=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:105:15: ( CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:106:3: CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )*
            {
            CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def427); 


                context.currentController = new ControllerService();
                //context.currentController = new ControllerService((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:111:5: ( cntrlAttribute_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:111:6: cntrlAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlAttribute_def_in_controller_def440);
            	    cntrlAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def442); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:112:5: ( cntrlConsumeInfo_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:112:6: cntrlConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlConsumeInfo_def_in_controller_def451);
            	    cntrlConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def453); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:113:5: ( cntrlCommand_def ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:113:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_controller_def462);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def464); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:114:5: ( cntrlPartition_def ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:114:6: cntrlPartition_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlPartition_def_in_controller_def474);
            	    cntrlPartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def476); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:125:1: cntrlPartition_def : cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void cntrlPartition_def() throws RecognitionException {
        Token cntrlDeploymentConstraint=null;
        Token CAPITALIZED_ID11=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:125:20: (cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:126:2: cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            cntrlDeploymentConstraint=(Token)match(input,31,FOLLOW_31_in_cntrlPartition_def497); 

            match(input,11,FOLLOW_11_in_cntrlPartition_def499); 

            CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def501); 

             
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:135:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id12 =null;

        VocabSpecParser.dataType_return dataType13 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:135:19: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:136:3: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_cntrlAttribute_def519); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def521);
            lc_id12=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def523); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def525);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:140:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id14 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:140:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:141:2: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,23,FOLLOW_23_in_cntrlConsumeInfo_def541); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def543);
            lc_id14=lc_id();

            state._fsp--;


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:141:18: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:141:19: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,28,FOLLOW_28_in_cntrlConsumeInfo_def546); 

                    match(input,32,FOLLOW_32_in_cntrlConsumeInfo_def548); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def550); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def552); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def554); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def556); 

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:145:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token name=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:145:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:146:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
            {
            match(input,21,FOLLOW_21_in_cntrlCommand_def581); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def588); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def590); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:146:42: ( cntrlParameter_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:146:43: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def593);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def597); 

            match(input,41,FOLLOW_41_in_cntrlCommand_def599); 

            match(input,32,FOLLOW_32_in_cntrlCommand_def602); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def604); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def606); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def608); 

            match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def610); 

             
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:152:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id15 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:152:20: ( lc_id ( ',' parameter_def )? )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:153:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def630);
            lc_id15=lc_id();

            state._fsp--;


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:153:12: ( ',' parameter_def )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==10) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:153:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def634); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def636);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:157:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID16=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:157:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:158:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def657); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:162:5: ( csAttribute_def ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:162:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def670);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def672); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:163:5: ( csGeneratedInfo_def ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:163:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def681);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def683); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:164:5: ( csConsumeInfo_def ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:164:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def693);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def695); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:165:5: ( csRequest_def ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:165:6: csRequest_def ';'
            	    {
            	    pushFollow(FOLLOW_csRequest_def_in_cs_def705);
            	    csRequest_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def708); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:166:5: ( partition_def ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:166:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def717);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def719); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:178:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id17 =null;

        VocabSpecParser.dataType_return dataType18 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:178:17: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:179:5: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_csAttribute_def740); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def742);
            lc_id17=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def744); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def746);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:183:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID20=null;
        VocabSpecParser.lc_id_return lc_id19 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:183:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:184:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_csGeneratedInfo_def765); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def767);
            lc_id19=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def769); 

            CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def772); 

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:189:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id21 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:189:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:190:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,23,FOLLOW_23_in_csConsumeInfo_def790); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def792);
            lc_id21=lc_id();

            state._fsp--;


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:190:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:190:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,28,FOLLOW_28_in_csConsumeInfo_def795); 

                    match(input,32,FOLLOW_32_in_csConsumeInfo_def797); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def799); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def801); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def803); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def805); 

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:196:1: csRequest_def : 'request' lc_id ;
    public final void csRequest_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id22 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:196:15: ( 'request' lc_id )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:197:4: 'request' lc_id
            {
            match(input,34,FOLLOW_34_in_csRequest_def827); 

            pushFollow(FOLLOW_lc_id_in_csRequest_def829);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:201:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token CAPITALIZED_ID23=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:201:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:202:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            csDeploymentConstraint=(Token)match(input,31,FOLLOW_31_in_partition_def849); 

            match(input,11,FOLLOW_11_in_partition_def851); 

            CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def853); 

             
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:211:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID24=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:211:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:212:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def872); 

            context.currentStruct = new Struct((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:214:5: ( structField_def ';' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:214:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def886);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def888); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:217:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id25 =null;

        VocabSpecParser.dataType_return dataType26 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:217:16: ( lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:218:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def910);
            lc_id25=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def912); 

            pushFollow(FOLLOW_dataType_in_structField_def914);
            dataType26=dataType();

            state._fsp--;


             context.currentStruct.addField((lc_id25!=null?input.toString(lc_id25.start,lc_id25.stop):null), (dataType26!=null?input.toString(dataType26.start,dataType26.stop):null));
                context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:223:1: lc_id : ID ;
    public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
        VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:223:6: ( ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:223:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id930); 

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:226:1: dataType : primitiveType ;
    public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
        VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:226:9: ( primitiveType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:227:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType943);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:230:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:230:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt24=1;
                }
                break;
            case 13:
                {
                alt24=2;
                }
                break;
            case 15:
                {
                alt24=3;
                }
                break;
            case 26:
                {
                alt24=4;
                }
                break;
            case 30:
                {
                alt24=5;
                }
                break;
            case 20:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:4: id= 'Integer'
                    {
                    id=(Token)match(input,14,FOLLOW_14_in_primitiveType958); 

                    }
                    break;
                case 2 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType964); 

                    }
                    break;
                case 3 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:34: id= 'String'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType970); 

                    }
                    break;
                case 4 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:49: id= 'double'
                    {
                    id=(Token)match(input,26,FOLLOW_26_in_primitiveType979); 

                    }
                    break;
                case 5 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:65: id= 'long'
                    {
                    id=(Token)match(input,30,FOLLOW_30_in_primitiveType987); 

                    }
                    break;
                case 6 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:79: id= 'boolean'
                    {
                    id=(Token)match(input,20,FOLLOW_20_in_primitiveType993); 

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:234:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )* ;
    public final void abilities_def() throws RecognitionException {
        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:234:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:235:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )*
            {
            match(input,36,FOLLOW_36_in_abilities_def1006); 

            match(input,11,FOLLOW_11_in_abilities_def1008); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:235:19: ( sensor_def )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==CAPITALIZED_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:235:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def1013);
            	    sensor_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            match(input,18,FOLLOW_18_in_abilities_def1019); 

            match(input,11,FOLLOW_11_in_abilities_def1021); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:236:19: ( actuator_def )+
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
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:236:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def1024);
            	    actuator_def();

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


            match(input,39,FOLLOW_39_in_abilities_def1030); 

            match(input,11,FOLLOW_11_in_abilities_def1033); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:237:19: ( ss_def )+
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
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:237:20: ss_def
            	    {
            	    pushFollow(FOLLOW_ss_def_in_abilities_def1036);
            	    ss_def();

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


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:3: ( 'end user applications' ':' ( gui_def ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:4: 'end user applications' ':' ( gui_def )
            	    {
            	    match(input,27,FOLLOW_27_in_abilities_def1043); 

            	    match(input,11,FOLLOW_11_in_abilities_def1045); 

            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:32: ( gui_def )
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:33: gui_def
            	    {
            	    pushFollow(FOLLOW_gui_def_in_abilities_def1048);
            	    gui_def();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "abilities_def"



    // $ANTLR start "sensor_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:241:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID27=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:241:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:242:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID27=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def1065); 

            context.currentSensor = new Sensor((CAPITALIZED_ID27!=null?CAPITALIZED_ID27.getText():null));

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:244:5: ( attribute_def ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==19) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:244:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def1078);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1080); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:245:5: ( sensorMeasurement_def ';' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:245:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def1089);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1091); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:249:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id28 =null;

        VocabSpecParser.dataType_return dataType29 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:249:14: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:250:5: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_attribute_def1112); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1114);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1116); 

            pushFollow(FOLLOW_dataType_in_attribute_def1118);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:254:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID31=null;
        VocabSpecParser.lc_id_return lc_id30 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:254:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:255:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_sensorMeasurement_def1138); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1140);
            lc_id30=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1142); 

            CAPITALIZED_ID31=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1145); 

             context.currentSensor.addSensorMeasurement((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null) ,context.getStructSymblTable((CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null)) ); 
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID32=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:261:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID32=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1163); 

            context.currentActuator = new Actuator((CAPITALIZED_ID32!=null?CAPITALIZED_ID32.getText():null));

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:263:4: ( actuatorAttribute_def ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:263:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1174);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1176); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:264:4: ( action_def ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:264:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1184);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1186); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:268:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id33 =null;

        VocabSpecParser.dataType_return dataType34 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:268:22: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:269:6: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_actuatorAttribute_def1209); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1211);
            lc_id33=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1213); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1215);
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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:273:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:273:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,17,FOLLOW_17_in_action_def1234); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1236); 

            match(input,8,FOLLOW_8_in_action_def1238); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:33: ( parameter_def )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1241);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1245); 

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
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:278:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID37=null;
        VocabSpecParser.lc_id_return lc_id36 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:278:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:279:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1265);
            lc_id36=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1267); 

            CAPITALIZED_ID37=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1270); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:279:31: ( ',' parameter_def )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==10) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:279:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1273); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1275);
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



    // $ANTLR start "gui_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:286:1: gui_def : CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* ;
    public final void gui_def() throws RecognitionException {
        Token CAPITALIZED_ID38=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:286:8: ( CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:287:3: CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )*
            {
            CAPITALIZED_ID38=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def1295); 

                context.currentGUI = new GUI();
              

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:290:4: ( gui_action_def ';' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:290:5: gui_action_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_action_def_in_gui_def1305);
            	    gui_action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1307); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:291:4: ( gui_command_def ';' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:291:5: gui_command_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_command_def_in_gui_def1315);
            	    gui_command_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1317); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:292:4: ( gui_request_def ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:292:5: gui_request_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_request_def_in_gui_def1325);
            	    gui_request_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1328); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            context.currentGUI.setGUIName((CAPITALIZED_ID38!=null?CAPITALIZED_ID38.getText():null));
                context.currentGUI.createGUIObject();
                context.currentGUI.generateCode();

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
    // $ANTLR end "gui_def"



    // $ANTLR start "gui_action_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:298:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= CAPITALIZED_ID ;
    public final void gui_action_def() throws RecognitionException {
        Token name=null;
        Token ui=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:298:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:299:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= CAPITALIZED_ID
            {
            match(input,17,FOLLOW_17_in_gui_action_def1350); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1356); 

            match(input,8,FOLLOW_8_in_gui_action_def1358); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:299:40: ( gui_action_parameter_def )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:299:41: gui_action_parameter_def
                    {
                    pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def1361);
                    gui_action_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_action_def1365); 

            match(input,42,FOLLOW_42_in_gui_action_def1367); 

            ui=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1373); 

             context.currentGUI.addAction((name!=null?name.getText():null),(ui!=null?ui.getText():null) ); 

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
    // $ANTLR end "gui_action_def"



    // $ANTLR start "gui_action_parameter_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:303:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
    public final void gui_action_parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID40=null;
        VocabSpecParser.lc_id_return lc_id39 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:303:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:304:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1393);
            lc_id39=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_gui_action_parameter_def1395); 

            CAPITALIZED_ID40=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1398); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:304:31: ( ',' gui_action_parameter_def )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==10) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:304:32: ',' gui_action_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_action_parameter_def1401); 

                    pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1403);
                    gui_action_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentGUI.addActionParameter((lc_id39!=null?input.toString(lc_id39.start,lc_id39.stop):null), (CAPITALIZED_ID40!=null?CAPITALIZED_ID40.getText():null)); 
                context.constructSymbTable((lc_id39!=null?input.toString(lc_id39.start,lc_id39.stop):null), (CAPITALIZED_ID40!=null?CAPITALIZED_ID40.getText():null));
                
                

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
    // $ANTLR end "gui_action_parameter_def"



    // $ANTLR start "gui_command_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:312:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' (textbox= CAPITALIZED_ID )? button= CAPITALIZED_ID ;
    public final void gui_command_def() throws RecognitionException {
        Token name=null;
        Token region=null;
        Token textbox=null;
        Token button=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:312:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' (textbox= CAPITALIZED_ID )? button= CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:313:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' (textbox= CAPITALIZED_ID )? button= CAPITALIZED_ID
            {
            match(input,21,FOLLOW_21_in_gui_command_def1426); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1433); 

            match(input,8,FOLLOW_8_in_gui_command_def1435); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:313:42: ( gui_command_parameter_def )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:313:43: gui_command_parameter_def
                    {
                    pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def1438);
                    gui_command_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_command_def1442); 

            match(input,41,FOLLOW_41_in_gui_command_def1444); 

            match(input,32,FOLLOW_32_in_gui_command_def1447); 

            match(input,11,FOLLOW_11_in_gui_command_def1449); 

            match(input,INT,FOLLOW_INT_in_gui_command_def1451); 

            match(input,11,FOLLOW_11_in_gui_command_def1453); 

            region=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1459); 

            match(input,42,FOLLOW_42_in_gui_command_def1461); 

            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:313:138: (textbox= CAPITALIZED_ID )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==CAPITALIZED_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==CAPITALIZED_ID) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:313:139: textbox= CAPITALIZED_ID
                    {
                    textbox=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1468); 

                    }
                    break;

            }


            button=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1476); 

             
                  context.currentGUI.addCommand((name!=null?name.getText():null),new Widget((textbox!=null?textbox.getText():null),(button!=null?button.getText():null),""));  
                

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
    // $ANTLR end "gui_command_def"



    // $ANTLR start "gui_request_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:319:1: gui_request_def : 'request' lc_id ;
    public final void gui_request_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id41 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:319:17: ( 'request' lc_id )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:320:4: 'request' lc_id
            {
            match(input,34,FOLLOW_34_in_gui_request_def1495); 

            pushFollow(FOLLOW_lc_id_in_gui_request_def1497);
            lc_id41=lc_id();

            state._fsp--;


             context.currentGUI.getDataAccessListFromSymblTable((lc_id41!=null?input.toString(lc_id41.start,lc_id41.stop):null));
               context.currentGUI.setRequestType(context.getResponseTypeSymblTable((lc_id41!=null?input.toString(lc_id41.start,lc_id41.stop):null)));

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
    // $ANTLR end "gui_request_def"



    // $ANTLR start "req_ui_parameter"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:325:1: req_ui_parameter : textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID ;
    public final void req_ui_parameter() throws RecognitionException {
        Token textbox=null;
        Token button=null;
        Token textview=null;

        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:325:18: (textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:326:5: textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID
            {
            textbox=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1521); 

            button=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1527); 

            textview=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1533); 

            context.currentGUI.setReqWidget((textbox!=null?textbox.getText():null),(button!=null?button.getText():null),(textview!=null?textview.getText():null));

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
    // $ANTLR end "req_ui_parameter"



    // $ANTLR start "gui_command_parameter_def"
    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:330:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
    public final void gui_command_parameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id42 =null;


        try {
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:330:27: ( lc_id ( ',' gui_command_parameter_def )? )
            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:331:5: lc_id ( ',' gui_command_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def1553);
            lc_id42=lc_id();

            state._fsp--;


            // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:331:11: ( ',' gui_command_parameter_def )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==10) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Y:\\git\\FrameworkGenerator\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:331:12: ',' gui_command_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_command_parameter_def1556); 

                    pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1558);
                    gui_command_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentGUI.addCommandParameter((lc_id42!=null?input.toString(lc_id42.start,lc_id42.stop):null)); 
                

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
    // $ANTLR end "gui_command_parameter_def"

    // Delegated rules


 

    public static final BitSet FOLLOW_33_in_vocabSpec63 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec71 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_region_def_in_vocabSpec74 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_40_in_vocabSpec91 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_struct_def_in_vocabSpec124 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_vocabSpec134 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec136 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_abilities_def_in_vocabSpec138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def164 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def166 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_region_def168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_sc_def188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_sc_def191 = new BitSet(new long[]{0x0000004000400010L});
    public static final BitSet FOLLOW_22_in_sc_def202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_sc_def205 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_sc_def215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_controller_def_in_sc_def218 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def239 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def254 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def265 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19_in_storageAttribute_def289 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def291 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def293 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def316 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_storageDataAccess_def319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_storageGeneratedInfo_def340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def342 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def369 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def371 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_storagePartition_def402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def404 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_storagePartition_def410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def427 = new BitSet(new long[]{0x0000000080A80002L});
    public static final BitSet FOLLOW_cntrlAttribute_def_in_controller_def440 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def442 = new BitSet(new long[]{0x0000000080A80002L});
    public static final BitSet FOLLOW_cntrlConsumeInfo_def_in_controller_def451 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def453 = new BitSet(new long[]{0x0000000080A00002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def462 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def464 = new BitSet(new long[]{0x0000000080200002L});
    public static final BitSet FOLLOW_cntrlPartition_def_in_controller_def474 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def476 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_cntrlPartition_def497 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlPartition_def499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_cntrlAttribute_def519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def523 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_cntrlConsumeInfo_def541 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def543 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_cntrlConsumeInfo_def546 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cntrlConsumeInfo_def548 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def552 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_cntrlCommand_def581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def590 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def593 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def597 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_cntrlCommand_def599 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cntrlCommand_def602 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def606 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def630 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def657 = new BitSet(new long[]{0x00000004A0880002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def670 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def672 = new BitSet(new long[]{0x00000004A0880002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def681 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def683 = new BitSet(new long[]{0x00000004A0800002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def693 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def695 = new BitSet(new long[]{0x0000000480800002L});
    public static final BitSet FOLLOW_csRequest_def_in_cs_def705 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def708 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def717 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def719 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19_in_csAttribute_def740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def742 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def744 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_csGeneratedInfo_def765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def767 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_csConsumeInfo_def790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def792 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_csConsumeInfo_def795 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_csConsumeInfo_def797 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def801 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_csRequest_def827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csRequest_def829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_partition_def849 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def872 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def886 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def888 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def910 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def912 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_structField_def914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primitiveType958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_primitiveType979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_primitiveType987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_primitiveType993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_abilities_def1006 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def1013 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_abilities_def1019 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def1024 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_abilities_def1030 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_abilities_def1036 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_27_in_abilities_def1043 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_gui_def_in_abilities_def1048 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def1065 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def1078 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1080 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def1089 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1091 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19_in_attribute_def1112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1114 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1116 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_sensorMeasurement_def1138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1140 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1163 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1174 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1176 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1186 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_19_in_actuatorAttribute_def1209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1213 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_action_def1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1236 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1238 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1241 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1265 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1270 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1295 = new BitSet(new long[]{0x0000000400220002L});
    public static final BitSet FOLLOW_gui_action_def_in_gui_def1305 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1307 = new BitSet(new long[]{0x0000000400220002L});
    public static final BitSet FOLLOW_gui_command_def_in_gui_def1315 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1317 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_gui_request_def_in_gui_def1325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1328 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_17_in_gui_action_def1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1356 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_action_def1358 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def1361 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_action_def1365 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_gui_action_def1367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1393 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_action_parameter_def1395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1398 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_action_parameter_def1401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_gui_command_def1426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1433 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_command_def1435 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def1438 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_command_def1442 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_gui_command_def1444 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_gui_command_def1447 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_command_def1449 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_gui_command_def1451 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_command_def1453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1459 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_gui_command_def1461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_gui_request_def1495 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_request_def1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def1553 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_command_parameter_def1556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1558 = new BitSet(new long[]{0x0000000000000002L});

}