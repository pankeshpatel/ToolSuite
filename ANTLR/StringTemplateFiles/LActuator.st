package $Actuatordriver.logicPackageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import $Actuatordriver.PackageName$.*;
import factory.*;
  
   
public  class  Fake$Actuatordriver.name$ extends $Actuatordriver.name$  {	

	public Fake$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, Object ui) {
		super(myPubSubMiddleware, deviceInfo);

	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
     I$Actuatordriver.name$ obj$Actuatordriver.name$ = $Actuatordriver.name$Factory.get$Actuatordriver.name$(myDeviceInfo.getType(), null, null);
     obj$Actuatordriver.name$.$action.name$($action.allParameter:{ param | arg }; separator=", "$);
    }
    
    }; separator="\n"$
	
}
   
     
    
