// $ANTLR 3.4 Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g 2013-05-19 14:26:23

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Button'", "'Integer'", "'String'", "'TextBox'", "'TextView'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'deployment-instance'", "'double'", "'from'", "'generate'", "'gui'", "'long'", "'partition-per'", "'region-hops'", "'regions'", "'request'", "'resources'", "'sensors'", "'singleton'", "'storageService'", "'storages'", "'structs'", "'to'", "'widgets'", "'with'"
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
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
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
    public String getGrammarFileName() { return "Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "vocabSpec"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ ( 'widgets' ':' widget_def )* 'resources' ':' abilities_def ;
    public final void vocabSpec() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ ( 'widgets' ':' widget_def )* 'resources' ':' abilities_def )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:25:5: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ ( 'widgets' ':' widget_def )* 'resources' ':' abilities_def
            {
            match(input,35,FOLLOW_35_in_vocabSpec65); 

             context = new Context();
                context.currentRegion = new RegionsGenerator();
                context.currentMappingConstraint = new MappingConstraint(); 

            match(input,11,FOLLOW_11_in_vocabSpec77); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:29:9: ( region_def )+
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
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:29:10: region_def
            	    {
            	    pushFollow(FOLLOW_region_def_in_vocabSpec80);
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

            match(input,42,FOLLOW_42_in_vocabSpec99); 

            match(input,11,FOLLOW_11_in_vocabSpec118); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:33:5: ( struct_def )+
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
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:33:6: struct_def
            	    {
            	    pushFollow(FOLLOW_struct_def_in_vocabSpec132);
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


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:34:5: ( 'widgets' ':' widget_def )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:34:6: 'widgets' ':' widget_def
            	    {
            	    match(input,44,FOLLOW_44_in_vocabSpec142); 

            	    match(input,11,FOLLOW_11_in_vocabSpec144); 

            	    pushFollow(FOLLOW_widget_def_in_vocabSpec146);
            	    widget_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input,37,FOLLOW_37_in_vocabSpec154); 

            match(input,11,FOLLOW_11_in_vocabSpec156); 

            pushFollow(FOLLOW_abilities_def_in_vocabSpec158);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:39:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        VocabSpecParser.dataType_return dataType2 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:39:12: ( CAPITALIZED_ID ':' dataType ';' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:41:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def187); 

            match(input,11,FOLLOW_11_in_region_def189); 

            pushFollow(FOLLOW_dataType_in_region_def191);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def194); 

             
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:1: sc_def : ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ;
    public final void sc_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:47:8: ( ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:3: ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+
            {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:3: ( 'storageService' ( ss_def )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==40) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:4: 'storageService' ( ss_def )+
            	    {
            	    match(input,40,FOLLOW_40_in_sc_def212); 

            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:21: ( ss_def )+
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
            	    	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:48:22: ss_def
            	    	    {
            	    	    pushFollow(FOLLOW_ss_def_in_sc_def215);
            	    	    ss_def();

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


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,25,FOLLOW_25_in_sc_def226); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:27: ( cs_def )+
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
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:49:28: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_sc_def229);
            	    cs_def();

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:54:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:54:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:55:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def250); 

             context.currentStorageService = new Storage();
                  //context.currentStorageService = new Storage((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                  

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:59:5: ( storageAttribute_def ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:59:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def263);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def265); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:60:5: ( storageDataAccess_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:60:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def274);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def276); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:73:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id4 =null;

        VocabSpecParser.dataType_return dataType5 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:73:21: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:74:3: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_storageAttribute_def300); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def302);
            lc_id4=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def304); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def306);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:78:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:78:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:79:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def327);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,19,FOLLOW_19_in_storageDataAccess_def330); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def332);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:83:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID7=null;
        VocabSpecParser.lc_id_return lc_id6 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:83:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:84:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,30,FOLLOW_30_in_storageGeneratedInfo_def351); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def353);
            lc_id6=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def355); 

            CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def358); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:90:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id8 =null;

        VocabSpecParser.dataType_return dataType9 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:90:21: ( lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:91:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def380);
            lc_id8=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def382); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def384);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:95:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:95:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:96:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,27,FOLLOW_27_in_storagePartition_def413); 

            match(input,11,FOLLOW_11_in_storagePartition_def415); 

            storageDeploymentConstraintValue=(Token)match(input,39,FOLLOW_39_in_storagePartition_def421); 


                 
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:106:1: controller_def : CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* ;
    public final void controller_def() throws RecognitionException {
        Token CAPITALIZED_ID10=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:106:15: ( CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:107:3: CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )*
            {
            CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def438); 


                context.currentController = new ControllerService();
                //context.currentController = new ControllerService((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:112:5: ( cntrlAttribute_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:112:6: cntrlAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlAttribute_def_in_controller_def451);
            	    cntrlAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def453); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:113:5: ( cntrlConsumeInfo_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:113:6: cntrlConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlConsumeInfo_def_in_controller_def462);
            	    cntrlConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def464); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:114:5: ( cntrlCommand_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:114:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_controller_def473);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def475); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:115:5: ( cntrlPartition_def ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:115:6: cntrlPartition_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlPartition_def_in_controller_def485);
            	    cntrlPartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def487); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



                context.currentController.setControllerName((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
              //  context.currentController.createCSObject();
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:126:1: cntrlPartition_def : cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void cntrlPartition_def() throws RecognitionException {
        Token cntrlDeploymentConstraint=null;
        Token CAPITALIZED_ID11=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:126:20: (cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:127:3: cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            cntrlDeploymentConstraint=(Token)match(input,33,FOLLOW_33_in_cntrlPartition_def509); 

            match(input,11,FOLLOW_11_in_cntrlPartition_def511); 

            CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def513); 

             
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:136:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id12 =null;

        VocabSpecParser.dataType_return dataType13 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:136:19: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:137:3: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_cntrlAttribute_def531); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def533);
            lc_id12=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def535); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def537);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:141:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id14 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:141:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:142:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,26,FOLLOW_26_in_cntrlConsumeInfo_def554); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def556);
            lc_id14=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:142:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:142:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,29,FOLLOW_29_in_cntrlConsumeInfo_def559); 

                    match(input,34,FOLLOW_34_in_cntrlConsumeInfo_def561); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def563); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def565); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def567); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def569); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:146:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token name=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:146:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:147:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
            {
            match(input,24,FOLLOW_24_in_cntrlCommand_def594); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def601); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def603); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:147:42: ( cntrlParameter_def )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:147:43: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def606);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def610); 

            match(input,43,FOLLOW_43_in_cntrlCommand_def612); 

            match(input,34,FOLLOW_34_in_cntrlCommand_def615); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def617); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def619); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def621); 

            match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def623); 

             
                  context.currentComputationalService.addCommand((name!=null?name.getText():null));  
                

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:153:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id15 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:153:20: ( lc_id ( ',' parameter_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:154:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def643);
            lc_id15=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:154:12: ( ',' parameter_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==10) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:154:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def647); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def649);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             context.currentComputationalService.addParameter((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null)); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:158:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID16=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:158:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:159:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def670); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:163:5: ( csAttribute_def ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:163:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def683);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def685); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:164:5: ( csGeneratedInfo_def ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:164:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def694);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def696); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:165:5: ( csConsumeInfo_def ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:165:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def706);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def708); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:166:5: ( csRequest_def ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:166:6: csRequest_def ';'
            	    {
            	    pushFollow(FOLLOW_csRequest_def_in_cs_def718);
            	    csRequest_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def721); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:167:5: ( partition_def ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:167:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def730);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def732); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:179:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id17 =null;

        VocabSpecParser.dataType_return dataType18 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:179:17: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:180:5: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_csAttribute_def753); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def755);
            lc_id17=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def757); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def759);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:184:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID20=null;
        VocabSpecParser.lc_id_return lc_id19 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:184:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:185:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,30,FOLLOW_30_in_csGeneratedInfo_def778); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def780);
            lc_id19=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def782); 

            CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def785); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:190:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id21 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:190:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:191:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,26,FOLLOW_26_in_csConsumeInfo_def803); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def805);
            lc_id21=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:191:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:191:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,29,FOLLOW_29_in_csConsumeInfo_def808); 

                    match(input,34,FOLLOW_34_in_csConsumeInfo_def810); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def812); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def814); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def816); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def818); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:197:1: csRequest_def : 'request' lc_id ;
    public final void csRequest_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id22 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:197:15: ( 'request' lc_id )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:198:4: 'request' lc_id
            {
            match(input,36,FOLLOW_36_in_csRequest_def840); 

            pushFollow(FOLLOW_lc_id_in_csRequest_def842);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:202:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token CAPITALIZED_ID23=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:202:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:203:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            csDeploymentConstraint=(Token)match(input,33,FOLLOW_33_in_partition_def862); 

            match(input,11,FOLLOW_11_in_partition_def864); 

            CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def866); 

             
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:212:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID24=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:212:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:213:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def885); 

            context.currentStruct = new Struct((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:215:5: ( structField_def ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:215:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def899);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def901); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:218:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id25 =null;

        VocabSpecParser.dataType_return dataType26 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:218:16: ( lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:219:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def923);
            lc_id25=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def925); 

            pushFollow(FOLLOW_dataType_in_structField_def927);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:224:1: lc_id : ID ;
    public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
        VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:224:6: ( ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:224:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id943); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:227:1: dataType : primitiveType ;
    public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
        VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:227:9: ( primitiveType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:228:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType956);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:231:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt23=1;
                }
                break;
            case 13:
                {
                alt23=2;
                }
                break;
            case 16:
                {
                alt23=3;
                }
                break;
            case 28:
                {
                alt23=4;
                }
                break;
            case 32:
                {
                alt23=5;
                }
                break;
            case 23:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:4: id= 'Integer'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType971); 

                    }
                    break;
                case 2 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType977); 

                    }
                    break;
                case 3 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:34: id= 'String'
                    {
                    id=(Token)match(input,16,FOLLOW_16_in_primitiveType983); 

                    }
                    break;
                case 4 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:49: id= 'double'
                    {
                    id=(Token)match(input,28,FOLLOW_28_in_primitiveType992); 

                    }
                    break;
                case 5 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:65: id= 'long'
                    {
                    id=(Token)match(input,32,FOLLOW_32_in_primitiveType1000); 

                    }
                    break;
                case 6 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:232:79: id= 'boolean'
                    {
                    id=(Token)match(input,23,FOLLOW_23_in_primitiveType1006); 

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



    // $ANTLR start "widget_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:235:1: widget_def : ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* ;
    public final void widget_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:235:12: ( ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:236:5: ( 'TextView' textview_def ';' )* ( 'Button' button_def ';' )* ( 'TextBox' textbox_def ';' )*
            {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:236:5: ( 'TextView' textview_def ';' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:236:6: 'TextView' textview_def ';'
            	    {
            	    match(input,18,FOLLOW_18_in_widget_def1022); 

            	    pushFollow(FOLLOW_textview_def_in_widget_def1024);
            	    textview_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_widget_def1026); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:237:5: ( 'Button' button_def ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==14) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:237:6: 'Button' button_def ';'
            	    {
            	    match(input,14,FOLLOW_14_in_widget_def1035); 

            	    pushFollow(FOLLOW_button_def_in_widget_def1038);
            	    button_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_widget_def1040); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:5: ( 'TextBox' textbox_def ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:238:6: 'TextBox' textbox_def ';'
            	    {
            	    match(input,17,FOLLOW_17_in_widget_def1049); 

            	    pushFollow(FOLLOW_textbox_def_in_widget_def1051);
            	    textbox_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_widget_def1053); 

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "widget_def"



    // $ANTLR start "textview_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:245:1: textview_def : lc_id ( ',' textview_def )? ;
    public final void textview_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:245:14: ( lc_id ( ',' textview_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:246:5: lc_id ( ',' textview_def )?
            {
            pushFollow(FOLLOW_lc_id_in_textview_def1078);
            lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:246:12: ( ',' textview_def )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==10) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:246:13: ',' textview_def
                    {
                    match(input,10,FOLLOW_10_in_textview_def1082); 

                    pushFollow(FOLLOW_textview_def_in_textview_def1084);
                    textview_def();

                    state._fsp--;


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
    // $ANTLR end "textview_def"



    // $ANTLR start "button_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:249:1: button_def : lc_id ( ',' button_def )? ;
    public final void button_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:249:12: ( lc_id ( ',' button_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:250:5: lc_id ( ',' button_def )?
            {
            pushFollow(FOLLOW_lc_id_in_button_def1099);
            lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:250:12: ( ',' button_def )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==10) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:250:13: ',' button_def
                    {
                    match(input,10,FOLLOW_10_in_button_def1103); 

                    pushFollow(FOLLOW_button_def_in_button_def1105);
                    button_def();

                    state._fsp--;


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
    // $ANTLR end "button_def"



    // $ANTLR start "textbox_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:253:1: textbox_def : lc_id ( ',' textbox_def )? ;
    public final void textbox_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:253:13: ( lc_id ( ',' textbox_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:254:5: lc_id ( ',' textbox_def )?
            {
            pushFollow(FOLLOW_lc_id_in_textbox_def1121);
            lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:254:11: ( ',' textbox_def )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==10) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:254:12: ',' textbox_def
                    {
                    match(input,10,FOLLOW_10_in_textbox_def1124); 

                    pushFollow(FOLLOW_textbox_def_in_textbox_def1126);
                    textbox_def();

                    state._fsp--;


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
    // $ANTLR end "textbox_def"



    // $ANTLR start "abilities_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:259:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'gui' ':' ( gui_def )+ )* ;
    public final void abilities_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:259:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'gui' ':' ( gui_def )+ )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'gui' ':' ( gui_def )+ )*
            {
            match(input,38,FOLLOW_38_in_abilities_def1141); 

            match(input,11,FOLLOW_11_in_abilities_def1143); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:19: ( sensor_def )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==CAPITALIZED_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:260:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def1148);
            	    sensor_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            match(input,21,FOLLOW_21_in_abilities_def1155); 

            match(input,11,FOLLOW_11_in_abilities_def1157); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:261:19: ( actuator_def )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==CAPITALIZED_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:261:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def1160);
            	    actuator_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            match(input,41,FOLLOW_41_in_abilities_def1166); 

            match(input,11,FOLLOW_11_in_abilities_def1169); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:262:19: ( ss_def )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==CAPITALIZED_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:262:20: ss_def
            	    {
            	    pushFollow(FOLLOW_ss_def_in_abilities_def1172);
            	    ss_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:263:3: ( 'gui' ':' ( gui_def )+ )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==31) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:263:4: 'gui' ':' ( gui_def )+
            	    {
            	    match(input,31,FOLLOW_31_in_abilities_def1179); 

            	    match(input,11,FOLLOW_11_in_abilities_def1181); 

            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:263:14: ( gui_def )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==CAPITALIZED_ID) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:263:15: gui_def
            	    	    {
            	    	    pushFollow(FOLLOW_gui_def_in_abilities_def1184);
            	    	    gui_def();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:266:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID27=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:266:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:267:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID27=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def1202); 

            context.currentSensor = new Sensor((CAPITALIZED_ID27!=null?CAPITALIZED_ID27.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:269:5: ( attribute_def ';' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==22) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:269:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def1215);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1217); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:270:5: ( sensorMeasurement_def ';' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:270:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def1226);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1228); 

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id28 =null;

        VocabSpecParser.dataType_return dataType29 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:274:14: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:275:5: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_attribute_def1249); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1251);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1253); 

            pushFollow(FOLLOW_dataType_in_attribute_def1255);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:279:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID31=null;
        VocabSpecParser.lc_id_return lc_id30 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:279:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:280:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,30,FOLLOW_30_in_sensorMeasurement_def1275); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1277);
            lc_id30=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1279); 

            CAPITALIZED_ID31=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1282); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:285:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID32=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:285:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:286:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID32=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1300); 

            context.currentActuator = new Actuator((CAPITALIZED_ID32!=null?CAPITALIZED_ID32.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:288:4: ( actuatorAttribute_def ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==22) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:288:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1311);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1313); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:289:4: ( action_def ';' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:289:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1321);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1323); 

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:293:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id33 =null;

        VocabSpecParser.dataType_return dataType34 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:293:22: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:294:6: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_actuatorAttribute_def1346); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1348);
            lc_id33=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1350); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1352);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:298:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:298:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:299:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,20,FOLLOW_20_in_action_def1371); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1373); 

            match(input,8,FOLLOW_8_in_action_def1375); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:299:33: ( parameter_def )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:299:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1378);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1382); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:303:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID37=null;
        VocabSpecParser.lc_id_return lc_id36 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:303:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:304:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1402);
            lc_id36=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1404); 

            CAPITALIZED_ID37=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1407); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:304:31: ( ',' parameter_def )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==10) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:304:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1410); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1412);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:311:1: gui_def : CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* ;
    public final void gui_def() throws RecognitionException {
        Token CAPITALIZED_ID38=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:311:8: ( CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:312:3: CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )*
            {
            context.currentGUI = new GUI();

            CAPITALIZED_ID38=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def1440); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:314:4: ( gui_action_def ';' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==20) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:314:5: gui_action_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_action_def_in_gui_def1448);
            	    gui_action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1450); 

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:315:4: ( gui_command_def ';' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:315:5: gui_command_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_command_def_in_gui_def1458);
            	    gui_command_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1460); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:316:4: ( gui_request_def ';' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==36) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:316:5: gui_request_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_request_def_in_gui_def1468);
            	    gui_request_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1471); 

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:322:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
    public final void gui_action_def() throws RecognitionException {
        Token name=null;
        VocabSpecParser.lc_id_return ui =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:322:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:323:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
            {
            match(input,20,FOLLOW_20_in_gui_action_def1493); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1499); 

            match(input,8,FOLLOW_8_in_gui_action_def1501); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:323:40: ( gui_action_parameter_def )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:323:41: gui_action_parameter_def
                    {
                    pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def1504);
                    gui_action_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_action_def1508); 

            match(input,45,FOLLOW_45_in_gui_action_def1510); 

            pushFollow(FOLLOW_lc_id_in_gui_action_def1516);
            ui=lc_id();

            state._fsp--;


             context.currentGUI.addAction((name!=null?name.getText():null), (ui!=null?input.toString(ui.start,ui.stop):null) ); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:327:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
    public final void gui_action_parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID40=null;
        VocabSpecParser.lc_id_return lc_id39 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:327:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:328:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1537);
            lc_id39=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_gui_action_parameter_def1539); 

            CAPITALIZED_ID40=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1542); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:328:31: ( ',' gui_action_parameter_def )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==10) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:328:32: ',' gui_action_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_action_parameter_def1545); 

                    pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1547);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:336:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'with' button= lc_id ( ',' textbox= lc_id )? ;
    public final void gui_command_def() throws RecognitionException {
        Token name=null;
        VocabSpecParser.lc_id_return button =null;

        VocabSpecParser.lc_id_return textbox =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:336:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'with' button= lc_id ( ',' textbox= lc_id )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:337:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'with' button= lc_id ( ',' textbox= lc_id )?
            {
            match(input,24,FOLLOW_24_in_gui_command_def1570); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1577); 

            match(input,8,FOLLOW_8_in_gui_command_def1579); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:337:42: ( gui_command_parameter_def )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:337:43: gui_command_parameter_def
                    {
                    pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def1582);
                    gui_command_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_command_def1586); 

            match(input,45,FOLLOW_45_in_gui_command_def1588); 

            pushFollow(FOLLOW_lc_id_in_gui_command_def1594);
            button=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:337:97: ( ',' textbox= lc_id )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==10) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:337:98: ',' textbox= lc_id
                    {
                    match(input,10,FOLLOW_10_in_gui_command_def1597); 

                    pushFollow(FOLLOW_lc_id_in_gui_command_def1603);
                    textbox=lc_id();

                    state._fsp--;


                    }
                    break;

            }


             
                  context.currentGUI.addCommand((name!=null?name.getText():null),new Widget((textbox!=null?input.toString(textbox.start,textbox.stop):null),(button!=null?input.toString(button.start,button.stop):null),""));  
                

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:349:1: gui_request_def : 'request' lc_id 'with' button= bt_id ',' textbox= txtbx_id ',' textview= txtview_id ;
    public final void gui_request_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id41 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:349:17: ( 'request' lc_id 'with' button= bt_id ',' textbox= txtbx_id ',' textview= txtview_id )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:350:4: 'request' lc_id 'with' button= bt_id ',' textbox= txtbx_id ',' textview= txtview_id
            {
            match(input,36,FOLLOW_36_in_gui_request_def1631); 

            pushFollow(FOLLOW_lc_id_in_gui_request_def1633);
            lc_id41=lc_id();

            state._fsp--;


            match(input,45,FOLLOW_45_in_gui_request_def1635); 

            pushFollow(FOLLOW_bt_id_in_gui_request_def1641);
            bt_id();

            state._fsp--;


            match(input,10,FOLLOW_10_in_gui_request_def1643); 

            pushFollow(FOLLOW_txtbx_id_in_gui_request_def1649);
            txtbx_id();

            state._fsp--;


            match(input,10,FOLLOW_10_in_gui_request_def1651); 

            pushFollow(FOLLOW_txtview_id_in_gui_request_def1657);
            txtview_id();

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



    // $ANTLR start "bt_id"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:355:1: bt_id : ID ;
    public final void bt_id() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:355:7: ( ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:355:10: ID
            {
            match(input,ID,FOLLOW_ID_in_bt_id1673); 

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
    // $ANTLR end "bt_id"



    // $ANTLR start "txtbx_id"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:357:1: txtbx_id : ID ;
    public final void txtbx_id() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:357:10: ( ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:357:13: ID
            {
            match(input,ID,FOLLOW_ID_in_txtbx_id1683); 

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
    // $ANTLR end "txtbx_id"



    // $ANTLR start "txtview_id"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:359:1: txtview_id : ID ;
    public final void txtview_id() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:359:12: ( ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:359:15: ID
            {
            match(input,ID,FOLLOW_ID_in_txtview_id1693); 

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
    // $ANTLR end "txtview_id"



    // $ANTLR start "req_ui_parameter"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:362:1: req_ui_parameter : textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID ;
    public final void req_ui_parameter() throws RecognitionException {
        Token textbox=null;
        Token button=null;
        Token textview=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:362:18: (textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:363:5: textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID
            {
            textbox=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1712); 

            button=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1718); 

            textview=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1724); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:367:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
    public final void gui_command_parameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id42 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:367:27: ( lc_id ( ',' gui_command_parameter_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:368:5: lc_id ( ',' gui_command_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def1744);
            lc_id42=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:368:11: ( ',' gui_command_parameter_def )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==10) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\VocabSpec.g:368:12: ',' gui_command_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_command_parameter_def1747); 

                    pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1749);
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


 

    public static final BitSet FOLLOW_35_in_vocabSpec65 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec77 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_region_def_in_vocabSpec80 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_42_in_vocabSpec99 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_struct_def_in_vocabSpec132 = new BitSet(new long[]{0x0000102000000010L});
    public static final BitSet FOLLOW_44_in_vocabSpec142 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec144 = new BitSet(new long[]{0x0000102000064000L});
    public static final BitSet FOLLOW_widget_def_in_vocabSpec146 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_37_in_vocabSpec154 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec156 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_abilities_def_in_vocabSpec158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def187 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def189 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_region_def191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_sc_def212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_sc_def215 = new BitSet(new long[]{0x0000010002000010L});
    public static final BitSet FOLLOW_25_in_sc_def226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_sc_def229 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def250 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def265 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def276 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22_in_storageAttribute_def300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def302 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def304 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def327 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_storageDataAccess_def330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_storageGeneratedInfo_def351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def353 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def380 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def382 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_storagePartition_def413 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def415 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_storagePartition_def421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def438 = new BitSet(new long[]{0x0000000205400002L});
    public static final BitSet FOLLOW_cntrlAttribute_def_in_controller_def451 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def453 = new BitSet(new long[]{0x0000000205400002L});
    public static final BitSet FOLLOW_cntrlConsumeInfo_def_in_controller_def462 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def464 = new BitSet(new long[]{0x0000000205000002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def473 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def475 = new BitSet(new long[]{0x0000000201000002L});
    public static final BitSet FOLLOW_cntrlPartition_def_in_controller_def485 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def487 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_cntrlPartition_def509 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlPartition_def511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_cntrlAttribute_def531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def533 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def535 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_cntrlConsumeInfo_def554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def556 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_cntrlConsumeInfo_def559 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cntrlConsumeInfo_def561 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def563 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def565 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_cntrlCommand_def594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def603 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def606 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def610 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cntrlCommand_def612 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cntrlCommand_def615 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def619 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def643 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def670 = new BitSet(new long[]{0x0000001244400002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def683 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def685 = new BitSet(new long[]{0x0000001244400002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def694 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def696 = new BitSet(new long[]{0x0000001244000002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def706 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def708 = new BitSet(new long[]{0x0000001204000002L});
    public static final BitSet FOLLOW_csRequest_def_in_cs_def718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def721 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def730 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def732 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22_in_csAttribute_def753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def755 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def757 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_csGeneratedInfo_def778 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def780 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_csConsumeInfo_def803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def805 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_csConsumeInfo_def808 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_csConsumeInfo_def810 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def812 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def814 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_csRequest_def840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csRequest_def842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_partition_def862 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def885 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def899 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def901 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def923 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def925 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_structField_def927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primitiveType983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_primitiveType992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_primitiveType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_primitiveType1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_widget_def1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_textview_def_in_widget_def1024 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_widget_def1026 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_14_in_widget_def1035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_button_def_in_widget_def1038 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_widget_def1040 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_17_in_widget_def1049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_textbox_def_in_widget_def1051 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_widget_def1053 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_lc_id_in_textview_def1078 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_textview_def1082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_textview_def_in_textview_def1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_button_def1099 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_button_def1103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_button_def_in_button_def1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_textbox_def1121 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_textbox_def1124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_textbox_def_in_textbox_def1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_abilities_def1141 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def1148 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_abilities_def1155 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def1160 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_abilities_def1166 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_abilities_def1172 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_31_in_abilities_def1179 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_gui_def_in_abilities_def1184 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def1202 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def1215 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1217 = new BitSet(new long[]{0x0000000040400002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def1226 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1228 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22_in_attribute_def1249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1251 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1253 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_sensorMeasurement_def1275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1277 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1300 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1313 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1323 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_22_in_actuatorAttribute_def1346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1350 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_action_def1371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1373 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1375 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1378 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1407 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1440 = new BitSet(new long[]{0x0000001001100002L});
    public static final BitSet FOLLOW_gui_action_def_in_gui_def1448 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1450 = new BitSet(new long[]{0x0000001001100002L});
    public static final BitSet FOLLOW_gui_command_def_in_gui_def1458 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1460 = new BitSet(new long[]{0x0000001001000002L});
    public static final BitSet FOLLOW_gui_request_def_in_gui_def1468 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1471 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_20_in_gui_action_def1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_action_def1501 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def1504 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_action_def1508 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_gui_action_def1510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_action_def1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1537 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_action_parameter_def1539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1542 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_action_parameter_def1545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_gui_command_def1570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1577 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_command_def1579 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def1582 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_command_def1586 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_gui_command_def1588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_def1594 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_command_def1597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_def1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_gui_request_def1631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_request_def1633 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_gui_request_def1635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_bt_id_in_gui_request_def1641 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_gui_request_def1643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_txtbx_id_in_gui_request_def1649 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_gui_request_def1651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_txtview_id_in_gui_request_def1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_bt_id1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_txtbx_id1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_txtview_id1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def1744 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_command_parameter_def1747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1749 = new BitSet(new long[]{0x0000000000000002L});

}