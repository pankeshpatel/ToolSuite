package framework;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;



public abstract class  ManageTemp implements Subscriber, Runnable{
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Center";
		
	public ManageTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
      postInitialize();
    } 
    
    protected void postInitialize() {
      subscribecenterAvgTempMeasurement(); 
           }
    


        protected  void Display(TempStruct arg ) {
      	    Logger.log( myDeviceInfo.getName() ,"ManageTemp" , "Sending command Display");
        	this.myPubSubMiddleware.sendCommand("Display",  arg   , myDeviceInfo );     
        }
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
	    try {
	      if (eventName.equals("centerAvgTempMeasurement"))  
	                { 
	      	    	 
	      	    	  Logger.log( myDeviceInfo.getName() ,"ManageTemp" , "Notification received centerAvgTempMeasurement");
	      	    	  onNewcenterAvgTempMeasurement((TempStruct) arg); 
	                }
	                         
         } catch (Exception e) {
              e.printStackTrace();
        }
        }	  
	    	   
	    	    public abstract void onNewcenterAvgTempMeasurement( TempStruct arg);	   		
	    	   	
	    	   	public void subscribecenterAvgTempMeasurement() {
	    	   	
	    	   	List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   	     		
	             		  this.myPubSubMiddleware.subscribe(this,"centerAvgTempMeasurement", regionInfo);
	    		}
	    				
		public void run() {
		}		
}