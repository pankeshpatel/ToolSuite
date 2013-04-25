grammar NetworkSpec;

options {
  language = Java;
}

@lexer::header {
  package fr.inria.arles.pankesh.parser.antlr; 
}

@parser::header {
package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.DeviceNetwork; 
import fr.inria.arles.pankesh.semanticmodel.*;  
} 

@members {
  //Initialize the context
  private Context context; 
}
  

networkspec: 
      'devices' ':'
      { context = new Context();
      }
    (device_def)*   
    ;
    
device_def:
   deviceName = (ID|CAPITALIZED_ID) ':' 
   { 
   context.currentNetwork = new DeviceNetwork();
   context.currentNetwork.setDeviceName($deviceName.text);
   }  
  
    'region' ':' (location_def)* 
    'type' ':' (device_type)* ';'
    'resources' ':' (abilities_def)* ';'
    { context.currentNetwork.addDeviceObj();}
;

networkAddress_def :
  'networkaddress' ':' INT 
  {context.currentNetwork.setNetworkAddress($INT.text);}
;

location_def :
    CAPITALIZED_ID ':' INT ';'
    {context.currentNetwork.addRegionLabel($CAPITALIZED_ID.text);
    context.currentNetwork.addRegionValue($INT.text);}
;

device_type :
     CAPITALIZED_ID 
    {context.currentNetwork.setDeviceType($CAPITALIZED_ID.text);}
;

abilities_def :
   CAPITALIZED_ID (',' abilities_def)?
  {context.currentNetwork.addDeviceAbilities($CAPITALIZED_ID.text);
  }
;


ID  : 'a'..'z'  ('a'..'z' | 'A'..'Z' )* ('0'..'9')*
   ;
   
INT : '0'..'9'('0'..'9')*  ; 

CAPITALIZED_ID: 'A'..'Z' ('a'..'z' | 'A'..'Z' )* ('0'..'9')*;

WS: ('\t' | ' ' | '\r' | '\n' | '\u000C')+ {$channel = HIDDEN;};