package fr.inria.arles.pankesh.gen.logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.gen.$Actuatordriver.name$;
$Actuatordriver.allActions:{ action |   $action.allParameter:{ param | import fr.inria.arles.pankesh.gen.$param.type.name$; }; separator=", "$  }; separator="\n"$    
   
public  class  Fake$Actuatordriver.name$ extends $Actuatordriver.name$  {	

	public Fake$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
      //TODO : write code here
    
    }
    
    }; separator="\n"$
	
}
   
     
    
