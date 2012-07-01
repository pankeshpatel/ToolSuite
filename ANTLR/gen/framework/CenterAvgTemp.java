package framework;


import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;




public abstract class  CenterAvgTemp implements Subscriber, Runnable, CommandListener{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Center";
	
	public CenterAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscribefloorAvgTempMeasurement(); 
           
    }
    


        private TempStruct centerAvgTempMeasurement;
        protected void setcenterAvgTempMeasurement( TempStruct newValue) {
         
          if (centerAvgTempMeasurement != newValue) {
            centerAvgTempMeasurement = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"CenterAvgTemp",
    				"Publishing centerAvgTempMeasurement");
            
         
            this.myPubSubMiddleware.publish("centerAvgTempMeasurement", newValue, myDeviceInfo);		
          }
        }    
        protected  TempStruct getcenterAvgTempMeasurement() {
          return  centerAvgTempMeasurement;
        }
            public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {
           
            if (methodName.equals("getCenterAvgTemp")) {
                return getcenterAvgTempMeasurement();
            }
            return null;
            }   
            

       
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	

                if (eventName.equals("floorAvgTempMeasurement"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"CenterAvgTemp",
             				"Notification Received floorAvgTempMeasurement");
                	
                   onNewfloorAvgTempMeasurement((TempStruct) arg); 
                }
                
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewfloorAvgTempMeasurement( TempStruct arg);	   		
	    	   	public void subscribefloorAvgTempMeasurement() {
	    	   		    
	    	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"floorAvgTempMeasurement", regionInfo);
	    		}
	    		 		
		public void run() {	
		}	
        
 
}