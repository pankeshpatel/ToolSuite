package framework;
import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;



public abstract class  TemperatureSensor implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public TemperatureSensor(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
    } 	
	
	private TempStruct tempMeasurement;	
		public abstract void handletempMeasurement();	
	    protected void settempMeasurement( TempStruct newValue) {
	      if (tempMeasurement != newValue) {
	        tempMeasurement = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "TemperatureSensor",
					"Publishing tempMeasurement");
	      
	        
	        this.myPubSubMiddleware.publish("tempMeasurement", newValue, myDeviceInfo);
			}
	    }    
	    public  TempStruct gettempMeasurement() {
	      return  tempMeasurement;
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