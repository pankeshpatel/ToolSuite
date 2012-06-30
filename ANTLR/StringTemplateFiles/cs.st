package $CS.packageName$;


import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;




public abstract class  $CS.name$ implements Subscriber, Runnable, CommandListener{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "$CS.PartitionAttributeVal$";
	
	public $CS.name$(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      $CS.allConsumedInfo:{consumedInfo|subscribe$consumedInfo.name; format="capital"$(); 
    }$ 
    }
    
	$CS.allAttributes:{ attribute |
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

    $CS.allGeneratedInfo:{ generatedInfo |
    private $generatedInfo.type.name$ $generatedInfo.name; format="avoidCapital"$;
    protected void set$generatedInfo.name; format="capital"$( $generatedInfo.type.name$ newValue) {
     
      if ($generatedInfo.name; format="avoidCapital"$ != newValue) {
        $generatedInfo.name; format="avoidCapital"$ = newValue; 
        
        Logger.log(myDeviceInfo.getName(),"$CS.name$",
				"Publishing $generatedInfo.name$");
        
     
        this.myPubSubMiddleware.publish("$generatedInfo.name; format="capital"$", newValue, myDeviceInfo);		
      }
    }    
    protected  $generatedInfo.type.name$ get$generatedInfo.name; format="capital"$() {
      return  $generatedInfo.name; format="avoidCapital"$;
    }
        public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {
       
        if (methodName.equals("get$CS.name$")) {
            return get$generatedInfo.name; format="capital"$();
        }
        return null;
        }   
        
}; separator="\n"$
       
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	
        $CS.allConsumedInfo:{ consumedInfo | 
        if (eventName.equals("$consumedInfo.name$"))  
        { 
        	 Logger.log(myDeviceInfo.getName(),"$CS.name$",
     				"Notification Received $consumedInfo.name$");
        	
           onNew$consumedInfo.name; format="capital"$(($consumedInfo.type.name$) arg); 
        }
        }$
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  
	    $CS.allConsumedInfo:{ consumedInfo | 
	   
	    public abstract void onNew$consumedInfo.name; format="capital"$( $consumedInfo.type.name$ arg);	   		
	   	public void subscribe$consumedInfo.name; format="capital"$() {
	   		    
	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
					partitionAttribute, myDeviceInfo.getRegionLabels(),
					myDeviceInfo.getRegion());
	   		
	   		
	   		
         		this.myPubSubMiddleware.subscribe(this,"$consumedInfo.name$", regionInfo);
		}
		}$ 		
		public void run() {	
		}	
        
		$CS.allDataAccess:{ dataAccess |
		    protected  $dataAccess.generatedInfo.type.name$ get$dataAccess.dataAccessName; format="capital"$($dataAccess.query.type.name; format="capital" $ arg) {
		    	 Logger.log(myDeviceInfo.getName(),"$CS.name$",
		     				"Sending command get$dataAccess.dataAccessName$");
		    	return ($dataAccess.generatedInfo.type.name$) this.myPubSubMiddleware.sendCommand("get$dataAccess.dataAccessName; format="capital"$", arg , myDeviceInfo );     
		    }
		}; separator="\n"$ 
}




    
	
	
    

    