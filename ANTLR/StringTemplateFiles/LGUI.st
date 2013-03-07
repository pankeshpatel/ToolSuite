package $Actuatordriver.logicPackageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import $Actuatordriver.PackageName$.*;
import factory.*;
  
   
public  class  Fake$Actuatordriver.name$ extends $Actuatordriver.name$  {	

	I$Actuatordriver.name$ ui;

	public Fake$Actuatordriver.name$(PubSubMiddleware myPubSubMiddleware, Device deviceInfo, I$Actuatordriver.name$ ui) {
		super(myPubSubMiddleware, deviceInfo);
		this.ui = (I$Actuatordriver.name$) ui;
	}	
	
    $Actuatordriver.allActions:{ action |     
    @Override
    protected  void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
     I$Actuatordriver.name$ obj$Actuatordriver.name$ = $Actuatordriver.name$Factory.get$Actuatordriver.name$("Android");
     obj$Actuatordriver.name$.$action.name$($action.allParameter:{ param | arg }; separator=", "$);
    }
    
    }; separator="\n"$
	
}
