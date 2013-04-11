
package $CS.logicPackageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import $CS.PackageName$.*;
	   	


public class  Fake$CS.name$ extends $CS.name$  { 


   public Fake$CS.name$(PubSubMiddleware pubSubM, Device deviceInfo, Object ui) {
		super(pubSubM, deviceInfo);
	}   
    		
	
	    $CS.allConsumedInfo:{ consumedInfo |
	   
	    public  void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg){	    
	    //TODO : write code here.
	    
	    }	   		
	   	
		}; separator="\n"$ 
		
		
		$CS.allDataAccess:{ dataAccess |	   
	    public void onNew$dataAccess.dataAccessName; format="capital"$Received( $CS.allGeneratedInfo:{ generatedInfo |$generatedInfo.type.name$}$ arg)
	    {
	    	//TODO : write code here
	    }	   	
	}$
		
		
		
}