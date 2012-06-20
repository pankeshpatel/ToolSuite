package fr.inria.arles.pankesh.gen;
import fr.inria.arles.pankesh.common.*;
import util.*;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.CommandListener;
import fr.inria.arles.pankesh.pubsubmiddleware.Subscriber;
import fr.inria.arles.pankesh.semanticmodel.Device;

public abstract class  Proximity implements Subscriber, Runnable, CommandListener{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "room";
	
	public Proximity(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribeprofile(); 
          subscribebadgeDisappeared(); 
          subscribebadgeDetected(); 
           
    }
    

	    private String responseFormat;
	    protected void setresponseFormat(String newValue) {
	      if (responseFormat != newValue) {
	        responseFormat = newValue; 
	      }
	    }    
	    public String getresponseFormat() {
	      return responseFormat;
	    }



        private UserTempPref tempPref;
        protected void settempPref( UserTempPref newValue) {
         
          if (tempPref != newValue) {
            tempPref = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"Proximity",
    				"Publishing tempPref");
            
           //System.out.println("tempPref | Publish | " + myDeviceInfo.getName());
            this.myPubSubMiddleware.publish("tempPref", newValue, myDeviceInfo);		
          }
        }    
        protected  UserTempPref gettempPref() {
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

                if (eventName.equals("profile"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"Proximity",
             				"Notification Received profile");
                	
                   onNewprofile((UserProfileStruct) arg); 
                }
                
                if (eventName.equals("badgeDisappeared"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"Proximity",
             				"Notification Received badgeDisappeared");
                	
                   onNewbadgeDisappeared((BadgeDisappearedStruct) arg); 
                }
                
                if (eventName.equals("badgeDetected"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"Proximity",
             				"Notification Received badgeDetected");
                	
                   onNewbadgeDetected((BadgeDetectedStruct) arg); 
                }
                
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewprofile( UserProfileStruct arg);	   		
	    	   	public void subscribeprofile() {
	    	   		    
	    	   		RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"profile", regionInfo);
	    		}
	    		
	    	   
	    	    public abstract void onNewbadgeDisappeared( BadgeDisappearedStruct arg);	   		
	    	   	public void subscribebadgeDisappeared() {
	    	   		    
	    	   		RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"badgeDisappeared", regionInfo);
	    		}
	    		
	    	   
	    	    public abstract void onNewbadgeDetected( BadgeDetectedStruct arg);	   		
	    	   	public void subscribebadgeDetected() {
	    	   		    
	    	   		RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"badgeDetected", regionInfo);
	    		}
	    		 		
		public void run() {	
		}		
 
}