// $ANTLR 3.4 Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g 2013-04-29 18:14:16

package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.*; 
import fr.inria.arles.pankesh.semanticmodel.*;  
   


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArchSpecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'deployment-instance'", "'double'", "'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", "'request'", "'sensors'", "'singleton'", "'softwarecomponents'", "'structs'", "'to'"
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
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ArchSpecParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArchSpecParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ArchSpecParser.tokenNames; }
    public String getGrammarFileName() { return "Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g"; }


      //Initialize the context  
      private Context context;    



    // $ANTLR start "archSpec"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:24:1: archSpec : ( 'structs' ':' struct_def )* 'softwarecomponents' ':' component_def ;
    public final void archSpec() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:24:10: ( ( 'structs' ':' struct_def )* 'softwarecomponents' ':' component_def )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:26:5: ( 'structs' ':' struct_def )* 'softwarecomponents' ':' component_def
            {
             context = new Context();
                context.currentRegion = new RegionsGenerator();
                context.currentMappingConstraint = new MappingConstraint(); 

             context.currentRegion.generateCode(); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:31:5: ( 'structs' ':' struct_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:31:6: 'structs' ':' struct_def
            	    {
            	    match(input,35,FOLLOW_35_in_archSpec87); 

            	    match(input,11,FOLLOW_11_in_archSpec89); 

            	    pushFollow(FOLLOW_struct_def_in_archSpec91);
            	    struct_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,34,FOLLOW_34_in_archSpec105); 

            match(input,11,FOLLOW_11_in_archSpec107); 

            pushFollow(FOLLOW_component_def_in_archSpec109);
            component_def();

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
    // $ANTLR end "archSpec"



    // $ANTLR start "region_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:36:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        ArchSpecParser.dataType_return dataType2 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:36:12: ( CAPITALIZED_ID ':' dataType ';' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:38:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def127); 

            match(input,11,FOLLOW_11_in_region_def129); 

            pushFollow(FOLLOW_dataType_in_region_def131);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def134); 

             
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



    // $ANTLR start "component_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:44:1: component_def : 'computationalService' ':' ( cs_def )+ ;
    public final void component_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:44:15: ( 'computationalService' ':' ( cs_def )+ )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:46:4: 'computationalService' ':' ( cs_def )+
            {
            match(input,22,FOLLOW_22_in_component_def156); 

            match(input,11,FOLLOW_11_in_component_def158); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:46:31: ( cs_def )+
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
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:46:32: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_component_def161);
            	    cs_def();

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
    // $ANTLR end "component_def"



    // $ANTLR start "cs_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:54:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:54:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:55:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( cntrlCommand_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def194); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:59:5: ( csAttribute_def ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:59:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def207);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def209); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:60:5: ( csGeneratedInfo_def ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:60:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def218);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def220); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:61:5: ( csConsumeInfo_def ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:61:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def230);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def232); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:62:5: ( csRequest_def ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:62:6: csRequest_def ';'
            	    {
            	    pushFollow(FOLLOW_csRequest_def_in_cs_def242);
            	    csRequest_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def245); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:63:5: ( cntrlCommand_def ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:63:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_cs_def254);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def256); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:64:5: ( partition_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:64:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def266);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def268); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


             
                 context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                 context.currentComputationalService.createCSObject();
                context.currentComputationalService.generateCode(); 
                // Next line is for Software Component Name
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
    // $ANTLR end "cs_def"



    // $ANTLR start "ss_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:76:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID4=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:76:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:77:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ( storagePartition_def ';' )*
            {
            CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def286); 

             context.currentStorageService = new Storage();
                  //context.currentStorageService = new Storage((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
                  

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:81:5: ( storageAttribute_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:81:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def299);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def301); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:82:5: ( storageDataAccess_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:82:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def310);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def312); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:83:5: ( storagePartition_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:83:6: storagePartition_def ';'
            	    {
            	    pushFollow(FOLLOW_storagePartition_def_in_ss_def322);
            	    storagePartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def324); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



                  
                 context.currentStorageService.setStorageServiceName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
                 context.currentStorageService.createStorageObject();
                 context.currentStorageService.generateCode();
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:95:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id5 =null;

        ArchSpecParser.dataType_return dataType6 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:95:21: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:96:3: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_storageAttribute_def344); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def346);
            lc_id5=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def348); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def350);
            dataType6=dataType();

            state._fsp--;


             context.currentStorageService.addAttribute((lc_id5!=null?input.toString(lc_id5.start,lc_id5.stop):null), (dataType6!=null?input.toString(dataType6.start,dataType6.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:100:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:100:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:101:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def371);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,16,FOLLOW_16_in_storageDataAccess_def374); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def376);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:105:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID8=null;
        ArchSpecParser.lc_id_return lc_id7 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:105:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:106:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,27,FOLLOW_27_in_storageGeneratedInfo_def395); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def397);
            lc_id7=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def399); 

            CAPITALIZED_ID8=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def402); 

             context.currentStorageService.addGeneratedInfo((lc_id7!=null?input.toString(lc_id7.start,lc_id7.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null));  
                context.constructSymbTable((lc_id7!=null?input.toString(lc_id7.start,lc_id7.stop):null), (CAPITALIZED_ID8!=null?CAPITALIZED_ID8.getText():null));

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:111:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id9 =null;

        ArchSpecParser.dataType_return dataType10 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:111:21: ( lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:112:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def424);
            lc_id9=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def426); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def428);
            dataType10=dataType();

            state._fsp--;


             context.currentStorageService.addDataAccessIndex((lc_id9!=null?input.toString(lc_id9.start,lc_id9.stop):null), (dataType10!=null?input.toString(dataType10.start,dataType10.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:116:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:116:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:117:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,24,FOLLOW_24_in_storagePartition_def457); 

            match(input,11,FOLLOW_11_in_storagePartition_def459); 

            storageDeploymentConstraintValue=(Token)match(input,33,FOLLOW_33_in_storagePartition_def465); 


                 
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



    // $ANTLR start "cntrlAttribute_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:157:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id11 =null;

        ArchSpecParser.dataType_return dataType12 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:157:19: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:158:3: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_cntrlAttribute_def526); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def528);
            lc_id11=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def530); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def532);
            dataType12=dataType();

            state._fsp--;


             context.currentController.addAttribute((lc_id11!=null?input.toString(lc_id11.start,lc_id11.stop):null), (dataType12!=null?input.toString(dataType12.start,dataType12.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:162:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id13 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:162:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:163:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,23,FOLLOW_23_in_cntrlConsumeInfo_def549); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def551);
            lc_id13=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:163:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:163:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,26,FOLLOW_26_in_cntrlConsumeInfo_def554); 

                    match(input,30,FOLLOW_30_in_cntrlConsumeInfo_def556); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def558); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def560); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def562); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def564); 

                    }
                    break;

            }


             context.currentController.addConsumedInfo((lc_id13!=null?input.toString(lc_id13.start,lc_id13.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:167:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token name=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:167:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:168:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
            {
            match(input,21,FOLLOW_21_in_cntrlCommand_def589); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def596); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def598); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:168:42: ( cntrlParameter_def )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:168:43: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def601);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def605); 

            match(input,36,FOLLOW_36_in_cntrlCommand_def607); 

            match(input,30,FOLLOW_30_in_cntrlCommand_def610); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def612); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def614); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def616); 

            match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def618); 

             
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:174:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id14 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:174:20: ( lc_id ( ',' parameter_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:175:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def638);
            lc_id14=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:175:12: ( ',' parameter_def )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==10) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:175:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def642); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def644);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             context.currentComputationalService.addParameter((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null)); 

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



    // $ANTLR start "csAttribute_def"
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:181:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id15 =null;

        ArchSpecParser.dataType_return dataType16 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:181:17: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:182:5: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_csAttribute_def670); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def672);
            lc_id15=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def674); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def676);
            dataType16=dataType();

            state._fsp--;


             context.currentComputationalService.addAttribute((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null), (dataType16!=null?input.toString(dataType16.start,dataType16.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:186:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID18=null;
        ArchSpecParser.lc_id_return lc_id17 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:186:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:187:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,27,FOLLOW_27_in_csGeneratedInfo_def696); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def698);
            lc_id17=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def700); 

            CAPITALIZED_ID18=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def703); 

             context.currentComputationalService.addGeneratedInfo((lc_id17!=null?input.toString(lc_id17.start,lc_id17.stop):null), (CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null)); 
                context.constructSymbTable((lc_id17!=null?input.toString(lc_id17.start,lc_id17.stop):null), (CAPITALIZED_ID18!=null?CAPITALIZED_ID18.getText():null)); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:192:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id19 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:192:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:193:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,23,FOLLOW_23_in_csConsumeInfo_def721); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def723);
            lc_id19=lc_id();

            state._fsp--;


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:193:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:193:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,26,FOLLOW_26_in_csConsumeInfo_def726); 

                    match(input,30,FOLLOW_30_in_csConsumeInfo_def728); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def730); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def732); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def734); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def736); 

                    }
                    break;

            }


             context.currentComputationalService.addConsumedInfo((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null));  
                
               

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:199:1: csRequest_def : 'request' lc_id ;
    public final void csRequest_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id20 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:199:15: ( 'request' lc_id )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:200:4: 'request' lc_id
            {
            match(input,31,FOLLOW_31_in_csRequest_def758); 

            pushFollow(FOLLOW_lc_id_in_csRequest_def760);
            lc_id20=lc_id();

            state._fsp--;


             context.currentComputationalService.getDataAccessListFromSymblTable((lc_id20!=null?input.toString(lc_id20.start,lc_id20.stop):null));

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:204:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token CAPITALIZED_ID21=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:204:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:205:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            csDeploymentConstraint=(Token)match(input,29,FOLLOW_29_in_partition_def780); 

            match(input,11,FOLLOW_11_in_partition_def782); 

            CAPITALIZED_ID21=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def784); 

             
                context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null));   
                // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID21!=null?CAPITALIZED_ID21.getText():null)); 
               

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:214:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID22=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:214:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:215:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID22=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def803); 

            context.currentStruct = new Struct((CAPITALIZED_ID22!=null?CAPITALIZED_ID22.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:217:5: ( structField_def ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:217:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def817);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def819); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:220:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id23 =null;

        ArchSpecParser.dataType_return dataType24 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:220:16: ( lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:221:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def841);
            lc_id23=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def843); 

            pushFollow(FOLLOW_dataType_in_structField_def845);
            dataType24=dataType();

            state._fsp--;


             context.currentStruct.addField((lc_id23!=null?input.toString(lc_id23.start,lc_id23.stop):null), (dataType24!=null?input.toString(dataType24.start,dataType24.stop):null));
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:226:1: lc_id : ID ;
    public final ArchSpecParser.lc_id_return lc_id() throws RecognitionException {
        ArchSpecParser.lc_id_return retval = new ArchSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:226:6: ( ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:226:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id861); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:229:1: dataType : primitiveType ;
    public final ArchSpecParser.dataType_return dataType() throws RecognitionException {
        ArchSpecParser.dataType_return retval = new ArchSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:229:9: ( primitiveType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:230:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType874);
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:233:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:233:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt17=1;
                }
                break;
            case 13:
                {
                alt17=2;
                }
                break;
            case 15:
                {
                alt17=3;
                }
                break;
            case 25:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            case 20:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:4: id= 'Integer'
                    {
                    id=(Token)match(input,14,FOLLOW_14_in_primitiveType889); 

                    }
                    break;
                case 2 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType895); 

                    }
                    break;
                case 3 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:34: id= 'String'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType901); 

                    }
                    break;
                case 4 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:49: id= 'double'
                    {
                    id=(Token)match(input,25,FOLLOW_25_in_primitiveType910); 

                    }
                    break;
                case 5 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:65: id= 'long'
                    {
                    id=(Token)match(input,28,FOLLOW_28_in_primitiveType918); 

                    }
                    break;
                case 6 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:234:79: id= 'boolean'
                    {
                    id=(Token)match(input,20,FOLLOW_20_in_primitiveType924); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:237:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ ;
    public final void abilities_def() throws RecognitionException {
        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:237:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:238:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+
            {
            match(input,32,FOLLOW_32_in_abilities_def937); 

            match(input,11,FOLLOW_11_in_abilities_def939); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:238:19: ( sensor_def )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==CAPITALIZED_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:238:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def944);
            	    sensor_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match(input,18,FOLLOW_18_in_abilities_def950); 

            match(input,11,FOLLOW_11_in_abilities_def952); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:239:19: ( actuator_def )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==CAPITALIZED_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:239:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def955);
            	    actuator_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:242:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID25=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:242:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:243:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID25=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def971); 

            context.currentSensor = new Sensor((CAPITALIZED_ID25!=null?CAPITALIZED_ID25.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:245:5: ( attribute_def ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:245:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def984);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def986); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:246:5: ( sensorMeasurement_def ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:246:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def995);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def997); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:250:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id26 =null;

        ArchSpecParser.dataType_return dataType27 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:250:14: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:251:5: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_attribute_def1018); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1020);
            lc_id26=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1022); 

            pushFollow(FOLLOW_dataType_in_attribute_def1024);
            dataType27=dataType();

            state._fsp--;


             context.currentSensor.addAttribute((lc_id26!=null?input.toString(lc_id26.start,lc_id26.stop):null), (dataType27!=null?input.toString(dataType27.start,dataType27.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:255:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID29=null;
        ArchSpecParser.lc_id_return lc_id28 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:255:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:256:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,27,FOLLOW_27_in_sensorMeasurement_def1044); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1046);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1048); 

            CAPITALIZED_ID29=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1051); 

             context.currentSensor.addSensorMeasurement((lc_id28!=null?input.toString(lc_id28.start,lc_id28.stop):null), (CAPITALIZED_ID29!=null?CAPITALIZED_ID29.getText():null), context.getStructSymblTable((CAPITALIZED_ID29!=null?CAPITALIZED_ID29.getText():null))); 
                context.constructSymbTable((lc_id28!=null?input.toString(lc_id28.start,lc_id28.stop):null), (CAPITALIZED_ID29!=null?CAPITALIZED_ID29.getText():null)); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:261:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID30=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:261:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:262:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID30=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1069); 

            context.currentActuator = new Actuator((CAPITALIZED_ID30!=null?CAPITALIZED_ID30.getText():null));

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:264:4: ( actuatorAttribute_def ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:264:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1080);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1082); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:265:4: ( action_def ';' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:265:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1090);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1092); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:269:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        ArchSpecParser.lc_id_return lc_id31 =null;

        ArchSpecParser.dataType_return dataType32 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:269:22: ( 'attribute' lc_id ':' dataType )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:270:6: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_actuatorAttribute_def1115); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1117);
            lc_id31=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1119); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1121);
            dataType32=dataType();

            state._fsp--;


             context.currentActuator.addAttribute((lc_id31!=null?input.toString(lc_id31.start,lc_id31.stop):null), (dataType32!=null?input.toString(dataType32.start,dataType32.stop):null));  

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:274:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID33=null;

        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:274:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:275:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,17,FOLLOW_17_in_action_def1140); 

            CAPITALIZED_ID33=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1142); 

            match(input,8,FOLLOW_8_in_action_def1144); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:275:33: ( parameter_def )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:275:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1147);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1151); 

             context.currentActuator.addAction((CAPITALIZED_ID33!=null?CAPITALIZED_ID33.getText():null)); 

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
    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:279:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;
        ArchSpecParser.lc_id_return lc_id34 =null;


        try {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:279:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:280:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1171);
            lc_id34=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1173); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1176); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:280:31: ( ',' parameter_def )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==10) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\ArchSpec.g:280:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1179); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1181);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentActuator.addParameter((lc_id34!=null?input.toString(lc_id34.start,lc_id34.stop):null), (CAPITALIZED_ID35!=null?CAPITALIZED_ID35.getText():null)); 
                context.constructSymbTable((lc_id34!=null?input.toString(lc_id34.start,lc_id34.stop):null), (CAPITALIZED_ID35!=null?CAPITALIZED_ID35.getText():null));
                

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


 

    public static final BitSet FOLLOW_35_in_archSpec87 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_archSpec89 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_struct_def_in_archSpec91 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_archSpec105 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_archSpec107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_component_def_in_archSpec109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def127 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def129 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_region_def131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_component_def156 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_component_def158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_component_def161 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def194 = new BitSet(new long[]{0x00000000A8A80002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def207 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def209 = new BitSet(new long[]{0x00000000A8A80002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def218 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def220 = new BitSet(new long[]{0x00000000A8A00002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def232 = new BitSet(new long[]{0x00000000A0A00002L});
    public static final BitSet FOLLOW_csRequest_def_in_cs_def242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def245 = new BitSet(new long[]{0x00000000A0200002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_cs_def254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def256 = new BitSet(new long[]{0x0000000020200002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def266 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def268 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def286 = new BitSet(new long[]{0x0000000009080002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def299 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def301 = new BitSet(new long[]{0x0000000009080002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def312 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_storagePartition_def_in_ss_def322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def324 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19_in_storageAttribute_def344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def346 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def348 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def371 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_storageDataAccess_def374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_storageGeneratedInfo_def395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def424 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def426 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_storagePartition_def457 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def459 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_storagePartition_def465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_cntrlAttribute_def526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def528 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def530 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_cntrlConsumeInfo_def549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def551 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_cntrlConsumeInfo_def554 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_cntrlConsumeInfo_def556 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def558 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def560 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_cntrlCommand_def589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def596 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def598 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def601 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def605 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_cntrlCommand_def607 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_cntrlCommand_def610 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def612 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def614 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def638 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_csAttribute_def670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def672 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def674 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_csGeneratedInfo_def696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def698 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_csConsumeInfo_def721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def723 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_csConsumeInfo_def726 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_csConsumeInfo_def728 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def730 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def732 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_csRequest_def758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csRequest_def760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_partition_def780 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def803 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def817 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def819 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def841 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def843 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_structField_def845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primitiveType889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_primitiveType910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_primitiveType918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_primitiveType924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_abilities_def937 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def944 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_abilities_def950 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def955 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def971 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def984 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def986 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def995 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def997 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19_in_attribute_def1018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1020 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1022 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_sensorMeasurement_def1044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1046 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1069 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1080 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1082 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1092 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_19_in_actuatorAttribute_def1115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1117 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1119 = new BitSet(new long[]{0x000000001210E000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_action_def1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1144 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1147 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1171 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1176 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1181 = new BitSet(new long[]{0x0000000000000002L});

}