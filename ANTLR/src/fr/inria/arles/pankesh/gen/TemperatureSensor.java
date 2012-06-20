package fr.inria.arles.pankesh.gen;
import fr.inria.arles.pankesh.common.*;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;


public abstract class  TemperatureSensor implements Runnable { 
   
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	public TemperatureSensor(PubSubMiddleware pubSubM,  Device deviceInfo) {      
	  this.myPubSubMiddleware = pubSubM;
	  this.myDeviceInfo = deviceInfo;	  
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

	private TempStruct tempMeasurement;	
		public abstract void handletempMeasurement();	
	    protected void settempMeasurement( TempStruct newValue) {
	      if (tempMeasurement != newValue) {
	        tempMeasurement = newValue; 
	       
	        Logger.log(myDeviceInfo.getName(), "TemperatureSensor",
					"Publishing tempMeasurement");
	        //System.out.println( "tempMeasurement | Publish |" + myDeviceInfo.getName() );
	        
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