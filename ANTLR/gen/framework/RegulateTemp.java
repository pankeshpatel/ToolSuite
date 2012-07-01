package framework;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.List;



public abstract class  RegulateTemp implements Subscriber, Runnable{
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "Room";
		
	public RegulateTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
      postInitialize();
    } 
    
    protected void postInitialize() {
      subscriberoomAvgTempMeasurement(); 
          subscribetempPref(); 
           }
    


        protected  void Off() {
      	    Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Sending command Off");
        	this.myPubSubMiddleware.sendCommand("Off",  null  , myDeviceInfo );     
        }


        protected  void SetTemp(TempStruct arg ) {
      	    Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Sending command SetTemp");
        	this.myPubSubMiddleware.sendCommand("SetTemp",  arg   , myDeviceInfo );     
        }
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
	    try {
	      if (eventName.equals("roomAvgTempMeasurement"))  
	                { 
	      	    	 
	      	    	  Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Notification received roomAvgTempMeasurement");
	      	    	  onNewroomAvgTempMeasurement((TempStruct) arg); 
	                }
	                if (eventName.equals("tempPref"))  
	                { 
	      	    	 
	      	    	  Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Notification received tempPref");
	      	    	  onNewtempPref((UserTempPrefStruct) arg); 
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
	    			   
	    	    public abstract void onNewtempPref( UserTempPrefStruct arg);	   		
	    	   	
	    	   	public void subscribetempPref() {
	    	   	
	    	   	List<String> regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   	     		
	             		  this.myPubSubMiddleware.subscribe(this,"tempPref", regionInfo);
	    		}
	    				
		public void run() {
		}		
}