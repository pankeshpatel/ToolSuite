package fr.inria.arles.pankesh.gen;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.gen.util.Logger;


public abstract class  $SensorDriver.name$ implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public $SensorDriver.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	$SensorDriver.allAttributes:{ attribute | private $attribute.type$ $attribute.name; format="avoidCapital"$;
    protected void set$attribute.name; format="capital"$($attribute.type$ newValue) {
      if ($attribute.name; format="avoidCapital"$ != newValue) {
        $attribute.name; format="avoidCapital"$ = newValue; 
      }
    }    
    public $attribute.type$ get$attribute.name; format="capital"$() {
      return $attribute.name; format="avoidCapital"$;
    }
}; separator="\n"$
	$SensorDriver.allGeneratedInfo:{ generatedInfo | private $generatedInfo.type.name$ $generatedInfo.name; format="avoidCapital"$;	
	public abstract void handle$generatedInfo.name; format="capital"$();	
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type.name$ newValue) {
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
       
        Logger.log(myDeviceInfo.getName(), "$SensorDriver.name$",
				"Publishing $generatedInfo.name$");
        //System.out.println( "$generatedInfo.name; format="capital"$ | Publish |" + myDeviceInfo.getName() );
        
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="capital"$", newValue, myDeviceInfo);
		}
    }    
    public  $generatedInfo.type.name$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    }  
}; separator="\n"$
	 $if(SensorDriver.consumedInfo)$
	      $SensorDriver.allConsumedInfo:{ consumedInfo | protected abstract void $consumedInfo.name$();}; separator="\n"$
    		public final Object commandReceived(String methodName, Object arg) {
    		$SensorDriver.allConsumedInfo:{ consumedInfo |
    		if (methodName.equals("$consumedInfo.name$")) {
		   $consumedInfo.name$(); 
         return null;
      }}; separator=" else "$
} $endif$ 
      private boolean continueFlag = false;	    
	    public void run() {
			continueFlag = true;			
			while(true){				
				try {
					Thread.sleep(1000);					
					handleExpiryOfTimer();			
					if (!continueFlag)
						break;					
				} catch (InterruptedException e) {
					e.printStackTrace();
					continueFlag = false;
				}
			}
		}	    
	    protected abstract void handleExpiryOfTimer();
	    
	      
}




    
	
	
    

    