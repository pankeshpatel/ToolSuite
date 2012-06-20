package fr.inria.arles.pankesh.gen;
import fr.inria.arles.pankesh.common.*;
import util.RegionID;
import util.*;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.CommandListener;
import fr.inria.arles.pankesh.pubsubmiddleware.Subscriber;
import fr.inria.arles.pankesh.semanticmodel.Device;

public abstract class  AvgTemp implements Subscriber, Runnable, CommandListener{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "room";
	
	public AvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribetempMeasurement(); 
           
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



        private AvgTempStruct avgTemperatureMeasurement;
        protected void setavgTemperatureMeasurement( AvgTempStruct newValue) {
         
          if (avgTemperatureMeasurement != newValue) {
            avgTemperatureMeasurement = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"AvgTemp",
    				"Publishing avgTemperatureMeasurement");
            
           //System.out.println("avgTemperatureMeasurement | Publish | " + myDeviceInfo.getName());
            this.myPubSubMiddleware.publish("avgTemperatureMeasurement", newValue, myDeviceInfo);		
          }
        }    
        protected  AvgTempStruct getavgTemperatureMeasurement() {
          return  avgTemperatureMeasurement;
        }
            public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {
           
            if (methodName.equals("getAvgTemp")) {
                return getavgTemperatureMeasurement();
            }
            return null;
            }   
            

       
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	

                if (eventName.equals("tempMeasurement"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"AvgTemp",
             				"Notification Received tempMeasurement");
                	
                   onNewtempMeasurement((TempStruct) arg); 
                }
                
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewtempMeasurement( TempStruct arg);	   		
	    	   	public void subscribetempMeasurement() {
	    	   		    
	    	   		RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"tempMeasurement", regionInfo);
	    		}
	    		 		
		public void run() {	
		}		
 
}