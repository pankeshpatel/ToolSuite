package framework;


import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;




public abstract class  Proximity implements Subscriber, Runnable, CommandListener{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Room";
	
	public Proximity(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribebadgeDetected(); 
          subscribebadgeDisappeared(); 
           
    }
    


        private UserTempPrefStruct tempPref;
        protected void settempPref( UserTempPrefStruct newValue) {
         
          if (tempPref != newValue) {
            tempPref = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"Proximity",
    				"Publishing tempPref");
            
         
            this.myPubSubMiddleware.publish("tempPref", newValue, myDeviceInfo);		
          }
        }    
        protected  UserTempPrefStruct gettempPref() {
          return  tempPref;
        }
            public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {
           
            if (methodName.equals("getProximity")) {
                return gettempPref();
            }
            return null;
            }   
            

       
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	

                if (eventName.equals("badgeDetected"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"Proximity",
             				"Notification Received badgeDetected");
                	
                   onNewbadgeDetected((BadgeDetectedStruct) arg); 
                }
                
                if (eventName.equals("badgeDisappeared"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"Proximity",
             				"Notification Received badgeDisappeared");
                	
                   onNewbadgeDisappeared((BadgeDisappearedStruct) arg); 
                }
                
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewbadgeDetected( BadgeDetectedStruct arg);	   		
	    	   	public void subscribebadgeDetected() {
	    	   		    
	    	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"badgeDetected", regionInfo);
	    		}
	    		
	    	   
	    	    public abstract void onNewbadgeDisappeared( BadgeDisappearedStruct arg);	   		
	    	   	public void subscribebadgeDisappeared() {
	    	   		    
	    	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"badgeDisappeared", regionInfo);
	    		}
	    		 		
		public void run() {	
		}	
        

				    protected  TempStruct getprofile(String arg) {
				    	 Logger.log(myDeviceInfo.getName(),"Proximity",
				     				"Sending command getprofile");
				    	return (TempStruct) this.myPubSubMiddleware.sendCommand("getprofile", arg , myDeviceInfo );     
				    }
				 
}