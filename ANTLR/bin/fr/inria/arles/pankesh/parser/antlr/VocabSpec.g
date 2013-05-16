grammar VocabSpec; 

options {
  language     = Java;  
}  

@lexer::header {
  package fr.inria.arles.pankesh.parser.antlr; 
  
}

@parser::header {
package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.*; 
import fr.inria.arles.pankesh.semanticmodel.*;  
   
} 
 
@members {
  //Initialize the context
  private Context context; 
} 

vocabSpec : 
    'regions'
    { context = new Context();
    context.currentRegion = new RegionsGenerator();
    context.currentMappingConstraint = new MappingConstraint(); }
    ':' (region_def)+  
    { context.currentRegion.generateCode(); }   
    'structs'         
        ':'       
    (struct_def)+ 
    'widgets'
    ':' 
    (widget_def)+
    'resources' ':' abilities_def   
   // 'softwarecomponents' ':' sc_def  
;
 
region_def :    
  
     CAPITALIZED_ID ':' dataType  ';'
    { 
    context.currentRegion.addRegion($CAPITALIZED_ID.text, $dataType.text); 
    }
;

sc_def :
  ('storageService' (ss_def)+ )* 
   'computationalService' (cs_def)+ 
 //   ('controller' (controller_def)+ )*
     
;

ss_def:
  CAPITALIZED_ID
    { context.currentStorageService = new Storage();
      //context.currentStorageService = new Storage($CAPITALIZED_ID.text);
      }
    (storageAttribute_def ';')*
    (storageDataAccess_def ';')* 
  // (storagePartition_def ';')*
     {
      
     context.currentStorageService.setStorageServiceName($CAPITALIZED_ID.text);
     context.currentStorageService.createStorageObject();
     context.currentStorageService.generateCode();
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
     context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
     
     }
; 

storageAttribute_def:
  'attribute' lc_id ':' dataType
    { context.currentStorageService.addAttribute($lc_id.text, $dataType.text);  } 
;

storageDataAccess_def :
     storageGeneratedInfo_def  'accessed-by' storagedataIndex_def
    { context.currentStorageService.addDataAccess(); }
;

storageGeneratedInfo_def :
    'generate' lc_id ':'  CAPITALIZED_ID
    { context.currentStorageService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text);  
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    context.constructResponseTypeSymblTable($lc_id.text, $CAPITALIZED_ID.text);}
;

storagedataIndex_def:
        lc_id ':' dataType
        { context.currentStorageService.addDataAccessIndex($lc_id.text, $dataType.text);  }
;  

storagePartition_def :
    storageDeploymentConstraint = 'deployment-instance' ':' storageDeploymentConstraintValue = 'singleton'
    {
     
     // Next two lines are for  Mapping constraints
    context.currentMappingConstraint.setAttributeName($storageDeploymentConstraint.text);  
    context.currentMappingConstraint.setAttributeValue($storageDeploymentConstraintValue.text);  
    }
;


controller_def:
  CAPITALIZED_ID
    {
    context.currentController = new ControllerService();
    //context.currentController = new ControllerService($CAPITALIZED_ID.text);
    }
    (cntrlAttribute_def ';')*
    (cntrlConsumeInfo_def ';')*
    (cntrlCommand_def ';')* 
    (cntrlPartition_def ';')*
    {
    context.currentController.setControllerName($CAPITALIZED_ID.text);
  //  context.currentController.createCSObject();
    context.currentController.generateCode();
    context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
    context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
    
    }
;

cntrlPartition_def :
  cntrlDeploymentConstraint ='partition-per' ':' CAPITALIZED_ID 
    { 
    context.currentController.setPartitionAttribute($CAPITALIZED_ID.text); 
     // Next two lines are for  Mapping constraints
    context.currentMappingConstraint.setAttributeName($cntrlDeploymentConstraint.text);  
    context.currentMappingConstraint.setAttributeValue($CAPITALIZED_ID.text);  
    }
;
 
cntrlAttribute_def:
  'attribute' lc_id ':' dataType
    { context.currentController.addAttribute($lc_id.text, $dataType.text);  } 
;

cntrlConsumeInfo_def:
  'consume' lc_id ('from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?  
   { context.currentController.addConsumedInfo($lc_id.text);  }
; 
 
cntrlCommand_def :
    'command'  name = CAPITALIZED_ID '(' (cntrlParameter_def)? ')' 'to'  'region-hops' ':' INT ':' CAPITALIZED_ID 
    { 
      context.currentComputationalService.addCommand($name.text);  
    }
;

cntrlParameter_def :
    lc_id  (',' parameter_def )?
    { context.currentComputationalService.addParameter($lc_id.text); }  
;

cs_def:
  CAPITALIZED_ID
    { 
     context.currentComputationalService = new CS(); 
     context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);}
    (csAttribute_def ';')*
    (csGeneratedInfo_def ';')* 
    (csConsumeInfo_def ';')* 
    (csRequest_def  ';')*
    (partition_def ';')*
    { 
     context.currentComputationalService.setComputationalServiceName($CAPITALIZED_ID.text);
     context.currentComputationalService.createCSObject();
    context.currentComputationalService.generateCode(); 
    // Next line is for Software Component Name
    context.currentMappingConstraint.setSoftwareComponentName($CAPITALIZED_ID.text);
    context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
    
    }
;

csAttribute_def :
    'attribute' lc_id ':' dataType
    { context.currentComputationalService.addAttribute($lc_id.text, $dataType.text);  } 
;

csGeneratedInfo_def:
    'generate' lc_id ':'  CAPITALIZED_ID
    { context.currentComputationalService.addGeneratedInfo($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text); }
;
  
csConsumeInfo_def:
  'consume' lc_id ('from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?  
   { context.currentComputationalService.addConsumedInfo($lc_id.text);  
    
   }
;

csRequest_def :
   'request' lc_id 
   { context.currentComputationalService.getDataAccessListFromSymblTable($lc_id.text);}
;

partition_def:
    csDeploymentConstraint='partition-per' ':' CAPITALIZED_ID 
    { 
    context.currentComputationalService.addPartitionAttribute($CAPITALIZED_ID.text);   
    // Next two lines are for  Mapping constraints
    context.currentMappingConstraint.setAttributeName($csDeploymentConstraint.text);  
    context.currentMappingConstraint.setAttributeValue($CAPITALIZED_ID.text); 
   }
;

struct_def:
    CAPITALIZED_ID 
    {context.currentStruct = new Struct($CAPITALIZED_ID.text);}
    (structField_def ';')*   
    {context.currentStruct.generateCode();}
;
structField_def:  
  lc_id ':' dataType 
  { context.currentStruct.addField($lc_id.text, $dataType.text);
    context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  }  
; 

lc_id: ID  
;
 
dataType:
  primitiveType 
;
 
primitiveType:
  (id='Integer' | id='Boolean' | id='String' |  id = 'double' | id = 'long' | id='boolean' )
;

widget_def :
  'TextView' ':' textview = lc_id ';'
  'Button' ':' button = lc_id ';'
  'TextBox' ':' textbox = lc_id ';'
;

abilities_def :
  'sensors' ':'   (sensor_def)+ 
  'actuators' ':' (actuator_def)+
  'storages'  ':' (ss_def)+
  ('end user applications' ':' (gui_def))*
 ; 

sensor_def:
    CAPITALIZED_ID
    {context.currentSensor = new Sensor($CAPITALIZED_ID.text);}
    (attribute_def ';')*
    (sensorMeasurement_def ';')* 
    {context.currentSensor.generateCode();}
;

attribute_def:
    'attribute' lc_id ':' dataType
    { context.currentSensor.addAttribute($lc_id.text, $dataType.text);  } 
;

sensorMeasurement_def :
    'generate' lc_id ':'  CAPITALIZED_ID
    { context.currentSensor.addSensorMeasurement($lc_id.text, $CAPITALIZED_ID.text ,context.getStructSymblTable($CAPITALIZED_ID.text) ); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text); } 
;

actuator_def:
   CAPITALIZED_ID
   {context.currentActuator = new Actuator($CAPITALIZED_ID.text);}
   (actuatorAttribute_def ';')*
   (action_def ';')*
   {context.currentActuator.generateCode();}   
;

actuatorAttribute_def:
     'attribute' lc_id ':' dataType
    { context.currentActuator.addAttribute($lc_id.text, $dataType.text);  } 
;

action_def:
    'action' CAPITALIZED_ID '(' (parameter_def)? ')'
    { context.currentActuator.addAction($CAPITALIZED_ID.text); } 
;

parameter_def :
    lc_id ':'  CAPITALIZED_ID (',' parameter_def )?
    { 
    context.currentActuator.addParameter($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    }
; 

gui_def:
  
  {context.currentGUI = new GUI();}
  
  CAPITALIZED_ID
  
   (gui_action_def ';')*
   (gui_command_def ';')*
   (gui_request_def  ';')*
   {context.currentGUI.setGUIName($CAPITALIZED_ID.text);
    context.currentGUI.createGUIObject();
    context.currentGUI.generateCode();}   
;

gui_action_def:
    'action' name = CAPITALIZED_ID '(' (gui_action_parameter_def)? ')' 'with' ui = CAPITALIZED_ID
    { context.currentGUI.addAction($name.text,$ui.text ); } 
;

gui_action_parameter_def :
    lc_id ':'  CAPITALIZED_ID (',' gui_action_parameter_def )?
    { 
    context.currentGUI.addActionParameter($lc_id.text, $CAPITALIZED_ID.text); 
    context.constructSymbTable($lc_id.text, $CAPITALIZED_ID.text);
    
    }
; 

gui_command_def :
    'command'  name = CAPITALIZED_ID '(' (gui_command_parameter_def)? ')' 'to'  'region-hops' ':' INT ':' region = CAPITALIZED_ID 'with' (textbox = CAPITALIZED_ID)? button = CAPITALIZED_ID 
    { 
      context.currentGUI.addCommand($name.text,new Widget($textbox.text,$button.text,""));  
    }
;

gui_request_def :
   'request' lc_id 
   { context.currentGUI.getDataAccessListFromSymblTable($lc_id.text);
   context.currentGUI.setRequestType(context.getResponseTypeSymblTable($lc_id.text));}
;
 
req_ui_parameter :
    textbox = CAPITALIZED_ID button = CAPITALIZED_ID textview = CAPITALIZED_ID 
    {context.currentGUI.setReqWidget($textbox.text,$button.text,$textview.text);}
;

gui_command_parameter_def :
    lc_id (',' gui_command_parameter_def )?
    { 
    context.currentGUI.addCommandParameter($lc_id.text); 
    }
;



ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' )*
   ;
   
INT : '0'..'9'('0'..'9')*  ; 

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};