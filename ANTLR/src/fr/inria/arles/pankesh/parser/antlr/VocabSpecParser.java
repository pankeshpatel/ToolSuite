// $ANTLR 3.4 /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g 2013-05-16 15:32:13

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Button'", "'Integer'", "'String'", "'TextBox'", "'TextView'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'deployment-instance'", "'double'", "'end user applications'", "'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", "'regions'", "'request'", "'resources'", "'sensors'", "'singleton'", "'storageService'", "'storages'", "'structs'", "'to'", "'widgets'", "'with'"
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
    public String getGrammarFileName() { return "/Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "vocabSpec"
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'widgets' ':' ( widget_def )+ 'resources' ':' abilities_def ;
    public final void vocabSpec() throws RecognitionException {
        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'widgets' ':' ( widget_def )+ 'resources' ':' abilities_def )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:25:5: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'widgets' ':' ( widget_def )+ 'resources' ':' abilities_def
            {
            match(input,35,FOLLOW_35_in_vocabSpec65); 

             context = new Context();
                context.currentRegion = new RegionsGenerator();
                context.currentMappingConstraint = new MappingConstraint(); 

            match(input,11,FOLLOW_11_in_vocabSpec77); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:29:9: ( region_def )+
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
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:29:10: region_def
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

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:33:5: ( struct_def )+
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
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:33:6: struct_def
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


            match(input,44,FOLLOW_44_in_vocabSpec141); 

            match(input,11,FOLLOW_11_in_vocabSpec147); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:36:5: ( widget_def )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:36:6: widget_def
            	    {
            	    pushFollow(FOLLOW_widget_def_in_vocabSpec155);
            	    widget_def();

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


            match(input,37,FOLLOW_37_in_vocabSpec163); 

            match(input,11,FOLLOW_11_in_vocabSpec165); 

            pushFollow(FOLLOW_abilities_def_in_vocabSpec167);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:41:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        VocabSpecParser.dataType_return dataType2 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:41:12: ( CAPITALIZED_ID ':' dataType ';' )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:43:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def196); 

            match(input,11,FOLLOW_11_in_region_def198); 

            pushFollow(FOLLOW_dataType_in_region_def200);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def203); 

             
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:49:1: sc_def : ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ;
    public final void sc_def() throws RecognitionException {
        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:49:8: ( ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:50:3: ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+
            {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:50:3: ( 'storageService' ( ss_def )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==40) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:50:4: 'storageService' ( ss_def )+
            	    {
            	    match(input,40,FOLLOW_40_in_sc_def221); 

            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:50:21: ( ss_def )+
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
            	    	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:50:22: ss_def
            	    	    {
            	    	    pushFollow(FOLLOW_ss_def_in_sc_def224);
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


            match(input,25,FOLLOW_25_in_sc_def235); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:51:27: ( cs_def )+
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
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:51:28: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_sc_def238);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:56:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:56:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:57:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def259); 

             context.currentStorageService = new Storage();
                  //context.currentStorageService = new Storage((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                  

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:61:5: ( storageAttribute_def ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:61:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def272);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def274); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:62:5: ( storageDataAccess_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:62:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def283);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def285); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:75:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id4 =null;

        VocabSpecParser.dataType_return dataType5 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:75:21: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:76:3: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_storageAttribute_def309); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def311);
            lc_id4=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def313); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def315);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:80:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:80:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:81:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def336);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,19,FOLLOW_19_in_storageDataAccess_def339); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def341);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:85:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID7=null;
        VocabSpecParser.lc_id_return lc_id6 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:85:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:86:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,31,FOLLOW_31_in_storageGeneratedInfo_def360); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def362);
            lc_id6=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def364); 

            CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def367); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:92:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id8 =null;

        VocabSpecParser.dataType_return dataType9 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:92:21: ( lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:93:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def389);
            lc_id8=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def391); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def393);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:97:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:97:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:98:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,27,FOLLOW_27_in_storagePartition_def422); 

            match(input,11,FOLLOW_11_in_storagePartition_def424); 

            storageDeploymentConstraintValue=(Token)match(input,39,FOLLOW_39_in_storagePartition_def430); 


                 
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:108:1: controller_def : CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* ;
    public final void controller_def() throws RecognitionException {
        Token CAPITALIZED_ID10=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:108:15: ( CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:109:3: CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )*
            {
            CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def447); 


                context.currentController = new ControllerService();
                //context.currentController = new ControllerService((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:114:5: ( cntrlAttribute_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:114:6: cntrlAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlAttribute_def_in_controller_def460);
            	    cntrlAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def462); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:115:5: ( cntrlConsumeInfo_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:115:6: cntrlConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlConsumeInfo_def_in_controller_def471);
            	    cntrlConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def473); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:116:5: ( cntrlCommand_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:116:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_controller_def482);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def484); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:117:5: ( cntrlPartition_def ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:117:6: cntrlPartition_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlPartition_def_in_controller_def494);
            	    cntrlPartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def496); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:128:1: cntrlPartition_def : cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void cntrlPartition_def() throws RecognitionException {
        Token cntrlDeploymentConstraint=null;
        Token CAPITALIZED_ID11=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:128:20: (cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:129:3: cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            cntrlDeploymentConstraint=(Token)match(input,33,FOLLOW_33_in_cntrlPartition_def518); 

            match(input,11,FOLLOW_11_in_cntrlPartition_def520); 

            CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def522); 

             
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:138:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id12 =null;

        VocabSpecParser.dataType_return dataType13 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:138:19: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:139:3: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_cntrlAttribute_def540); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def542);
            lc_id12=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def544); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def546);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:143:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id14 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:143:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:144:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,26,FOLLOW_26_in_cntrlConsumeInfo_def563); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def565);
            lc_id14=lc_id();

            state._fsp--;


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:144:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:144:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,30,FOLLOW_30_in_cntrlConsumeInfo_def568); 

                    match(input,34,FOLLOW_34_in_cntrlConsumeInfo_def570); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def572); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def574); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def576); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def578); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:148:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token name=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:148:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:149:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
            {
            match(input,24,FOLLOW_24_in_cntrlCommand_def603); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def610); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def612); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:149:42: ( cntrlParameter_def )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:149:43: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def615);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def619); 

            match(input,43,FOLLOW_43_in_cntrlCommand_def621); 

            match(input,34,FOLLOW_34_in_cntrlCommand_def624); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def626); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def628); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def630); 

            match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def632); 

             
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:155:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id15 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:155:20: ( lc_id ( ',' parameter_def )? )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:156:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def652);
            lc_id15=lc_id();

            state._fsp--;


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:156:12: ( ',' parameter_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==10) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:156:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def656); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def658);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:160:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID16=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:160:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:161:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def679); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:165:5: ( csAttribute_def ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:165:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def692);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def694); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:166:5: ( csGeneratedInfo_def ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:166:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def703);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def705); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:167:5: ( csConsumeInfo_def ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:167:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def715);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def717); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:168:5: ( csRequest_def ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:168:6: csRequest_def ';'
            	    {
            	    pushFollow(FOLLOW_csRequest_def_in_cs_def727);
            	    csRequest_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def730); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:169:5: ( partition_def ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:169:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def739);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def741); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:181:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id17 =null;

        VocabSpecParser.dataType_return dataType18 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:181:17: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:182:5: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_csAttribute_def762); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def764);
            lc_id17=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def766); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def768);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:186:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID20=null;
        VocabSpecParser.lc_id_return lc_id19 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:186:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:187:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,31,FOLLOW_31_in_csGeneratedInfo_def787); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def789);
            lc_id19=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def791); 

            CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def794); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:192:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id21 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:192:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:193:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,26,FOLLOW_26_in_csConsumeInfo_def812); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def814);
            lc_id21=lc_id();

            state._fsp--;


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:193:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:193:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,30,FOLLOW_30_in_csConsumeInfo_def817); 

                    match(input,34,FOLLOW_34_in_csConsumeInfo_def819); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def821); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def823); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def825); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def827); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:199:1: csRequest_def : 'request' lc_id ;
    public final void csRequest_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id22 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:199:15: ( 'request' lc_id )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:200:4: 'request' lc_id
            {
            match(input,36,FOLLOW_36_in_csRequest_def849); 

            pushFollow(FOLLOW_lc_id_in_csRequest_def851);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:204:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token CAPITALIZED_ID23=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:204:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:205:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            csDeploymentConstraint=(Token)match(input,33,FOLLOW_33_in_partition_def871); 

            match(input,11,FOLLOW_11_in_partition_def873); 

            CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def875); 

             
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:214:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID24=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:214:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:215:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def894); 

            context.currentStruct = new Struct((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:217:5: ( structField_def ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:217:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def908);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def910); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:220:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id25 =null;

        VocabSpecParser.dataType_return dataType26 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:220:16: ( lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:221:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def932);
            lc_id25=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def934); 

            pushFollow(FOLLOW_dataType_in_structField_def936);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:226:1: lc_id : ID ;
    public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
        VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:226:6: ( ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:226:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id952); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:229:1: dataType : primitiveType ;
    public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
        VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:229:9: ( primitiveType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:230:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType965);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:233:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:233:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
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
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:4: id= 'Integer'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType980); 

                    }
                    break;
                case 2 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType986); 

                    }
                    break;
                case 3 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:34: id= 'String'
                    {
                    id=(Token)match(input,16,FOLLOW_16_in_primitiveType992); 

                    }
                    break;
                case 4 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:49: id= 'double'
                    {
                    id=(Token)match(input,28,FOLLOW_28_in_primitiveType1001); 

                    }
                    break;
                case 5 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:65: id= 'long'
                    {
                    id=(Token)match(input,32,FOLLOW_32_in_primitiveType1009); 

                    }
                    break;
                case 6 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:79: id= 'boolean'
                    {
                    id=(Token)match(input,23,FOLLOW_23_in_primitiveType1015); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:237:1: widget_def : 'TextView' ':' (textview= lc_id )* ';' 'Button' ':' (button= lc_id )* ';' 'TextBox' ':' (textbox= lc_id )* ';' ;
    public final void widget_def() throws RecognitionException {
        VocabSpecParser.lc_id_return textview =null;

        VocabSpecParser.lc_id_return button =null;

        VocabSpecParser.lc_id_return textbox =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:237:12: ( 'TextView' ':' (textview= lc_id )* ';' 'Button' ':' (button= lc_id )* ';' 'TextBox' ':' (textbox= lc_id )* ';' )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:3: 'TextView' ':' (textview= lc_id )* ';' 'Button' ':' (button= lc_id )* ';' 'TextBox' ':' (textbox= lc_id )* ';'
            {
            match(input,18,FOLLOW_18_in_widget_def1028); 

            match(input,11,FOLLOW_11_in_widget_def1030); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:18: (textview= lc_id )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:19: textview= lc_id
            	    {
            	    pushFollow(FOLLOW_lc_id_in_widget_def1037);
            	    textview=lc_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match(input,12,FOLLOW_12_in_widget_def1042); 

            match(input,14,FOLLOW_14_in_widget_def1046); 

            match(input,11,FOLLOW_11_in_widget_def1048); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:239:16: (button= lc_id )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:239:18: button= lc_id
            	    {
            	    pushFollow(FOLLOW_lc_id_in_widget_def1056);
            	    button=lc_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match(input,12,FOLLOW_12_in_widget_def1060); 

            match(input,17,FOLLOW_17_in_widget_def1064); 

            match(input,11,FOLLOW_11_in_widget_def1066); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:240:17: (textbox= lc_id )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:240:18: textbox= lc_id
            	    {
            	    pushFollow(FOLLOW_lc_id_in_widget_def1073);
            	    textbox=lc_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            match(input,12,FOLLOW_12_in_widget_def1077); 

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



    // $ANTLR start "abilities_def"
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:243:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )* ;
    public final void abilities_def() throws RecognitionException {
        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:243:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:244:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )*
            {
            match(input,38,FOLLOW_38_in_abilities_def1088); 

            match(input,11,FOLLOW_11_in_abilities_def1090); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:244:19: ( sensor_def )+
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
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:244:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def1095);
            	    sensor_def();

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


            match(input,21,FOLLOW_21_in_abilities_def1102); 

            match(input,11,FOLLOW_11_in_abilities_def1104); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:245:19: ( actuator_def )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==CAPITALIZED_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:245:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def1107);
            	    actuator_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            match(input,41,FOLLOW_41_in_abilities_def1113); 

            match(input,11,FOLLOW_11_in_abilities_def1116); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:246:19: ( ss_def )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==CAPITALIZED_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:246:20: ss_def
            	    {
            	    pushFollow(FOLLOW_ss_def_in_abilities_def1119);
            	    ss_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:247:3: ( 'end user applications' ':' ( gui_def ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:247:4: 'end user applications' ':' ( gui_def )
            	    {
            	    match(input,29,FOLLOW_29_in_abilities_def1126); 

            	    match(input,11,FOLLOW_11_in_abilities_def1128); 

            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:247:32: ( gui_def )
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:247:33: gui_def
            	    {
            	    pushFollow(FOLLOW_gui_def_in_abilities_def1131);
            	    gui_def();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:250:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID27=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:250:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:251:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID27=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def1148); 

            context.currentSensor = new Sensor((CAPITALIZED_ID27!=null?CAPITALIZED_ID27.getText():null));

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:253:5: ( attribute_def ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:253:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def1161);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1163); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:254:5: ( sensorMeasurement_def ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:254:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def1172);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1174); 

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:258:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id28 =null;

        VocabSpecParser.dataType_return dataType29 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:258:14: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:259:5: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_attribute_def1195); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1197);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1199); 

            pushFollow(FOLLOW_dataType_in_attribute_def1201);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:263:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID31=null;
        VocabSpecParser.lc_id_return lc_id30 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:263:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:264:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,31,FOLLOW_31_in_sensorMeasurement_def1221); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1223);
            lc_id30=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1225); 

            CAPITALIZED_ID31=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1228); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:269:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID32=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:269:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:270:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID32=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1246); 

            context.currentActuator = new Actuator((CAPITALIZED_ID32!=null?CAPITALIZED_ID32.getText():null));

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:272:4: ( actuatorAttribute_def ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:272:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1257);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1259); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:273:4: ( action_def ';' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:273:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1267);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1269); 

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:277:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id33 =null;

        VocabSpecParser.dataType_return dataType34 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:277:22: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:278:6: 'attribute' lc_id ':' dataType
            {
            match(input,22,FOLLOW_22_in_actuatorAttribute_def1292); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1294);
            lc_id33=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1296); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1298);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:282:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:282:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:283:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,20,FOLLOW_20_in_action_def1317); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1319); 

            match(input,8,FOLLOW_8_in_action_def1321); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:283:33: ( parameter_def )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:283:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1324);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1328); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:287:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID37=null;
        VocabSpecParser.lc_id_return lc_id36 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:287:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:288:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1348);
            lc_id36=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1350); 

            CAPITALIZED_ID37=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1353); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:288:31: ( ',' parameter_def )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==10) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:288:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1356); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1358);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:295:1: gui_def : CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* ;
    public final void gui_def() throws RecognitionException {
        Token CAPITALIZED_ID38=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:295:8: ( CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:297:3: CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )*
            {
            context.currentGUI = new GUI();

            CAPITALIZED_ID38=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def1388); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:301:4: ( gui_action_def ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==20) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:301:5: gui_action_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_action_def_in_gui_def1397);
            	    gui_action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1399); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:302:4: ( gui_command_def ';' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==24) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:302:5: gui_command_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_command_def_in_gui_def1407);
            	    gui_command_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1409); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:303:4: ( gui_request_def ';' )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:303:5: gui_request_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_request_def_in_gui_def1417);
            	    gui_request_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1420); 

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:309:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id ;
    public final void gui_action_def() throws RecognitionException {
        Token name=null;
        VocabSpecParser.lc_id_return ui =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:309:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:310:5: 'action' name= CAPITALIZED_ID '(' ( gui_action_parameter_def )? ')' 'with' ui= lc_id
            {
            match(input,20,FOLLOW_20_in_gui_action_def1442); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1448); 

            match(input,8,FOLLOW_8_in_gui_action_def1450); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:310:40: ( gui_action_parameter_def )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:310:41: gui_action_parameter_def
                    {
                    pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_def1453);
                    gui_action_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_action_def1457); 

            match(input,45,FOLLOW_45_in_gui_action_def1459); 

            pushFollow(FOLLOW_lc_id_in_gui_action_def1465);
            ui=lc_id();

            state._fsp--;


             context.currentGUI.addAction((name!=null?name.getText():null),(ui!=null?input.toString(ui.start,ui.stop):null) ); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:314:1: gui_action_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? ;
    public final void gui_action_parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID40=null;
        VocabSpecParser.lc_id_return lc_id39 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:314:26: ( lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )? )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:315:5: lc_id ':' CAPITALIZED_ID ( ',' gui_action_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_action_parameter_def1486);
            lc_id39=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_gui_action_parameter_def1488); 

            CAPITALIZED_ID40=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1491); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:315:31: ( ',' gui_action_parameter_def )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==10) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:315:32: ',' gui_action_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_action_parameter_def1494); 

                    pushFollow(FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1496);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:323:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' (textbox= lc_id )? button= lc_id ;
    public final void gui_command_def() throws RecognitionException {
        Token name=null;
        Token region=null;
        VocabSpecParser.lc_id_return textbox =null;

        VocabSpecParser.lc_id_return button =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:323:17: ( 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' (textbox= lc_id )? button= lc_id )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:324:5: 'command' name= CAPITALIZED_ID '(' ( gui_command_parameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' (textbox= lc_id )? button= lc_id
            {
            match(input,24,FOLLOW_24_in_gui_command_def1519); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1526); 

            match(input,8,FOLLOW_8_in_gui_command_def1528); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:324:42: ( gui_command_parameter_def )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:324:43: gui_command_parameter_def
                    {
                    pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_def1531);
                    gui_command_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_command_def1535); 

            match(input,43,FOLLOW_43_in_gui_command_def1537); 

            match(input,34,FOLLOW_34_in_gui_command_def1540); 

            match(input,11,FOLLOW_11_in_gui_command_def1542); 

            match(input,INT,FOLLOW_INT_in_gui_command_def1544); 

            match(input,11,FOLLOW_11_in_gui_command_def1546); 

            region=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1552); 

            match(input,45,FOLLOW_45_in_gui_command_def1554); 

            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:324:138: (textbox= lc_id )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==ID) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:324:139: textbox= lc_id
                    {
                    pushFollow(FOLLOW_lc_id_in_gui_command_def1561);
                    textbox=lc_id();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_lc_id_in_gui_command_def1570);
            button=lc_id();

            state._fsp--;


             
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:330:1: gui_request_def : 'request' lc_id ;
    public final void gui_request_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id41 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:330:17: ( 'request' lc_id )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:331:4: 'request' lc_id
            {
            match(input,36,FOLLOW_36_in_gui_request_def1590); 

            pushFollow(FOLLOW_lc_id_in_gui_request_def1592);
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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:336:1: req_ui_parameter : textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID ;
    public final void req_ui_parameter() throws RecognitionException {
        Token textbox=null;
        Token button=null;
        Token textview=null;

        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:336:18: (textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:337:5: textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID
            {
            textbox=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1616); 

            button=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1622); 

            textview=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1628); 

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
    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:341:1: gui_command_parameter_def : lc_id ( ',' gui_command_parameter_def )? ;
    public final void gui_command_parameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id42 =null;


        try {
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:341:27: ( lc_id ( ',' gui_command_parameter_def )? )
            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:342:5: lc_id ( ',' gui_command_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_command_parameter_def1648);
            lc_id42=lc_id();

            state._fsp--;


            // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:342:11: ( ',' gui_command_parameter_def )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==10) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/soukou/git/ToolSuiteANTLRAfter/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:342:12: ',' gui_command_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_command_parameter_def1651); 

                    pushFollow(FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1653);
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
    public static final BitSet FOLLOW_struct_def_in_vocabSpec132 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_44_in_vocabSpec141 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec147 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_widget_def_in_vocabSpec155 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_vocabSpec163 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec165 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_abilities_def_in_vocabSpec167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def196 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def198 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_region_def200 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_sc_def221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_sc_def224 = new BitSet(new long[]{0x0000010002000010L});
    public static final BitSet FOLLOW_25_in_sc_def235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_sc_def238 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def259 = new BitSet(new long[]{0x0000000080400002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def274 = new BitSet(new long[]{0x0000000080400002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def283 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def285 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22_in_storageAttribute_def309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def311 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def313 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_storageDataAccess_def339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_storageGeneratedInfo_def360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def362 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def389 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def391 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_storagePartition_def422 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def424 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_storagePartition_def430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def447 = new BitSet(new long[]{0x0000000205400002L});
    public static final BitSet FOLLOW_cntrlAttribute_def_in_controller_def460 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def462 = new BitSet(new long[]{0x0000000205400002L});
    public static final BitSet FOLLOW_cntrlConsumeInfo_def_in_controller_def471 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def473 = new BitSet(new long[]{0x0000000205000002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def482 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def484 = new BitSet(new long[]{0x0000000201000002L});
    public static final BitSet FOLLOW_cntrlPartition_def_in_controller_def494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def496 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_cntrlPartition_def518 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlPartition_def520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_cntrlAttribute_def540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def544 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_cntrlConsumeInfo_def563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def565 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_cntrlConsumeInfo_def568 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cntrlConsumeInfo_def570 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_cntrlCommand_def603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def610 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def612 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def615 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def619 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cntrlCommand_def621 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cntrlCommand_def624 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def626 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def628 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def652 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def679 = new BitSet(new long[]{0x0000001284400002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def692 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def694 = new BitSet(new long[]{0x0000001284400002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def703 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def705 = new BitSet(new long[]{0x0000001284000002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def717 = new BitSet(new long[]{0x0000001204000002L});
    public static final BitSet FOLLOW_csRequest_def_in_cs_def727 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def730 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def739 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def741 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22_in_csAttribute_def762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def764 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def766 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_csGeneratedInfo_def787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def789 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_csConsumeInfo_def812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def814 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_csConsumeInfo_def817 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_csConsumeInfo_def819 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def821 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def823 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_csRequest_def849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csRequest_def851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_partition_def871 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def894 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def908 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def910 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def932 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def934 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_structField_def936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_primitiveType992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_primitiveType1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_primitiveType1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_primitiveType1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_widget_def1028 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_widget_def1030 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_lc_id_in_widget_def1037 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_widget_def1042 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_widget_def1046 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_widget_def1048 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_lc_id_in_widget_def1056 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_widget_def1060 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_widget_def1064 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_widget_def1066 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_lc_id_in_widget_def1073 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_widget_def1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_abilities_def1088 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def1095 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_21_in_abilities_def1102 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def1107 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_41_in_abilities_def1113 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_abilities_def1119 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_29_in_abilities_def1126 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_gui_def_in_abilities_def1131 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def1148 = new BitSet(new long[]{0x0000000080400002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def1161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1163 = new BitSet(new long[]{0x0000000080400002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def1172 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1174 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22_in_attribute_def1195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1197 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1199 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_sensorMeasurement_def1221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1223 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1246 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1257 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1259 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1269 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_22_in_actuatorAttribute_def1292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1296 = new BitSet(new long[]{0x000000011081A000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_action_def1317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1319 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1321 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1324 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1353 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1388 = new BitSet(new long[]{0x0000001001100002L});
    public static final BitSet FOLLOW_gui_action_def_in_gui_def1397 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1399 = new BitSet(new long[]{0x0000001001100002L});
    public static final BitSet FOLLOW_gui_command_def_in_gui_def1407 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1409 = new BitSet(new long[]{0x0000001001000002L});
    public static final BitSet FOLLOW_gui_request_def_in_gui_def1417 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1420 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_20_in_gui_action_def1442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1448 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_action_def1450 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_def1453 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_action_def1457 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_gui_action_def1459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_action_def1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_action_parameter_def1486 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_action_parameter_def1488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_parameter_def1491 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_action_parameter_def1494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_action_parameter_def_in_gui_action_parameter_def1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_gui_command_def1519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1526 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_command_def1528 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_def1531 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_command_def1535 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_gui_command_def1537 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_gui_command_def1540 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_command_def1542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_gui_command_def1544 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_command_def1546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1552 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_gui_command_def1554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_def1561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_def1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_gui_request_def1590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_request_def1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_command_parameter_def1648 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_command_parameter_def1651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_command_parameter_def_in_gui_command_parameter_def1653 = new BitSet(new long[]{0x0000000000000002L});

}