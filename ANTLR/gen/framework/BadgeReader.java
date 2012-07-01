package framework;
import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;



public abstract class  BadgeReader implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public BadgeReader(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	private BadgeDetectedStruct badgeDetected;	
		public abstract void handlebadgeDetected();	
	    protected void setbadgeDetected( BadgeDetectedStruct newValue) {
	      if (badgeDetected != newValue) {
	        badgeDetected = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "BadgeReader",
					"Publishing badgeDetected");
	      
	        
	        this.myPubSubMiddleware.publish("badgeDetected", newValue, myDeviceInfo);
			}
	    }    
	    public  BadgeDetectedStruct getbadgeDetected() {
	      return  badgeDetected;
	    }  

	private BadgeDisappearedStruct badgeDisappeared;	
		public abstract void handlebadgeDisappeared();	
	    protected void setbadgeDisappeared( BadgeDisappearedStruct newValue) {
	      if (badgeDisappeared != newValue) {
	        badgeDisappeared = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "BadgeReader",
					"Publishing badgeDisappeared");
	      
	        
	        this.myPubSubMiddleware.publish("badgeDisappeared", newValue, myDeviceInfo);
			}
	    }    
	    public  BadgeDisappearedStruct getbadgeDisappeared() {
	      return  badgeDisappeared;
	    }  

 
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