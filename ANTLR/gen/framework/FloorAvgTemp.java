package framework;


import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;




public abstract class  FloorAvgTemp implements Subscriber, Runnable, CommandListener{ 
			
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Floor";
	
	public FloorAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
    		  postInitialize();
    } 
	
	protected void postInitialize() {
      subscriberoomAvgTempMeasurement(); 
           
    }
    


        private TempStruct floorAvgTempMeasurement;
        protected void setfloorAvgTempMeasurement( TempStruct newValue) {
         
          if (floorAvgTempMeasurement != newValue) {
            floorAvgTempMeasurement = newValue; 
            
            Logger.log(myDeviceInfo.getName(),"FloorAvgTemp",
    				"Publishing floorAvgTempMeasurement");
            
         
            this.myPubSubMiddleware.publish("floorAvgTempMeasurement", newValue, myDeviceInfo);		
          }
        }    
        protected  TempStruct getfloorAvgTempMeasurement() {
          return  floorAvgTempMeasurement;
        }
            public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {
           
            if (methodName.equals("getFloorAvgTemp")) {
                return getfloorAvgTempMeasurement();
            }
            return null;
            }   
            

       
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
        try {	

                if (eventName.equals("roomAvgTempMeasurement"))  
                { 
                	 Logger.log(myDeviceInfo.getName(),"FloorAvgTemp",
             				"Notification Received roomAvgTempMeasurement");
                	
                   onNewroomAvgTempMeasurement((TempStruct) arg); 
                }
                
        
        	 } catch (Exception e) {
                 e.printStackTrace();
           }
        }
	  

	    	   
	    	    public abstract void onNewroomAvgTempMeasurement( TempStruct arg);	   		
	    	   	public void subscriberoomAvgTempMeasurement() {
	    	   		    
	    	   		List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   		
	    	   		
	    	   		
	             		this.myPubSubMiddleware.subscribe(this,"roomAvgTempMeasurement", regionInfo);
	    		}
	    		 		
		public void run() {	
		}	
        
 
}