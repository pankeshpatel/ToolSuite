package fr.inria.arles.pankesh.gen.logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.gen.$CS.name$;
$CS.allConsumedInfo:{ consumedInfo | import fr.inria.arles.pankesh.gen.$consumedInfo.type.name$; }; separator="\n"$   	
	   	


public class  Fake$CS.name$ extends $CS.name$  { 


   public Fake$CS.name$(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}   
    		
	
	    $CS.allConsumedInfo:{ consumedInfo |
	   
	    public  void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg){	    
	    //TODO : write code here.
	    
	    }	   		
	   	
		}; separator="\n"$ 
}