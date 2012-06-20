package fr.inria.arles.pankesh.gen;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.Subscriber;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.gen.util.Logger;
import fr.inria.arles.pankesh.gen.util.RegionSubscription;
import fr.inria.arles.pankesh.gen.util.RegionID;


public abstract class  $CS.name$ implements Subscriber, Runnable{
	
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
    }$ }
    
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

    $CS.allActions:{ action |
    protected  void $action.name; format="capital"$($action.allParameter:{ param | $param.type.name$ arg }; separator=" , "$) {
  	    Logger.log( myDeviceInfo.getName() ,"$CS.name$" , "Sending command $action.name$");
    	this.myPubSubMiddleware.sendCommand("$action.name; format="capital"$", $if(action.Parameter)$ $action.allParameter: { param | arg }; separator=" , "$ $else$ null $endif$ , myDeviceInfo );     
    }
}; separator="\n"$        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
	    try {
	      $CS.allConsumedInfo:{ consumedInfo | if (eventName.equals("$consumedInfo.name$"))  
          { 
	    	 
	    	  Logger.log( myDeviceInfo.getName() ,"$CS.name$" , "Notification received $consumedInfo.name$");
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
	   	
	   	RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
					partitionAttribute, myDeviceInfo.getRegionLabels(),
					myDeviceInfo.getRegion());
	   	     		
         		  this.myPubSubMiddleware.subscribe(this,"$consumedInfo.name$", regionInfo);
		}
		}$		
		public void run() {
		}		
}




    
	
	
    

    