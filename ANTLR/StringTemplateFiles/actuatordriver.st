package fr.inria.arles.pankesh.gen;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.CommandListener;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.gen.util.Logger;

public abstract class  $Actuatordriver.name$ implements Runnable, CommandListener  {	
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	public $Actuatordriver.name$(PubSubMiddleware pubSubM, Device deviceInfo) {  
	
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
		postInitialize();
		
    } 
    
    protected void postInitialize() {
      $Actuatordriver.allActions:{action |subscribe$action.name; format="capital"$(); 
    }$ }

   	$Actuatordriver.allAttributes:{ attribute |
    private $attribute.type$ $attribute.name; format="avoidCapital"$;
    protected void set$attribute.name; format="capital"$($attribute.type$ newValue) {
      if ($attribute.name; format="avoidCapital"$ != newValue) {
        $attribute.name; format="avoidCapital"$ = newValue; 
      }
    }  
    public $attribute.type$ get$attribute.name; format="capital"$() {
      return $attribute.name; format="avoidCapital"$;
    }
}; separator="\n"$
	
    $Actuatordriver.allActions:{ action | protected abstract void $action.name$($action.allParameter:{ param | $param.type.name$ arg }; separator=", "$); }; separator="\n"$
	
    public final Object commandReceived(String methodName, Object arg, Device deviceInfo) { 
    $Actuatordriver.allActions:{ action |
    if (methodName.equals("$action.name$")   $action.allParameter:{ param | && arg instanceof $param.type.name$}; separator=", "$) {
    	
    	Logger.log( myDeviceInfo.getName() ,"$Actuatordriver.name$" , "$action.name$ has been received");
    	
    	
		   $action.name$($action.allParameter:{ param | ($param.type.name$)arg }; separator=", "$);
		   return null;
      } }; separator=" else "$
    		  return null;
    }	
    
   
     $Actuatordriver.allActions:{ action | 
    	public void subscribe$action.name; format="capital"$() {
           this.myPubSubMiddleware.registerInstance(this,"$action.name$");
   		}
    }$  		
   		  		
   	 public void run() {  }
}	
	 $if(Actuatordriver.generatedInfo)$
     
    $Actuatordriver.allGeneratedInfo:{ generatedInfo |
    private $generatedInfo.type.name$ $generatedInfo.name; format="avoidCapital"$;
	
	
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type.name$ newValue) {
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
        this.myPubSubMiddleware.publish();
		}
    }    
    public  $generatedInfo.type.name$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    }    	
   
}; separator="\n"$  $endif$
     
    
