package fr.inria.arles.pankesh.gen;
import fr.inria.arles.pankesh.common.*;
import util.*;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.Subscriber;
import fr.inria.arles.pankesh.semanticmodel.Device;


public abstract class  RegulateTemp implements Subscriber, Runnable{
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	private String partitionAttribute = "room";
		
	public RegulateTemp(PubSubMiddleware pubSubM, Device deviceInfo) {   
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
      postInitialize();
    } 
    
    protected void postInitialize() {
      subscribetempPref(); 
          subscribeavgTemperatureMeasurement(); 
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



        protected  void SetTemp(SetTempStruct arg ) {
      	    Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Sending command SetTemp");
        	this.myPubSubMiddleware.sendCommand("SetTemp",  arg   , myDeviceInfo );     
        }


        protected  void Off() {
      	    Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Sending command Off");
        	this.myPubSubMiddleware.sendCommand("Off",  null  , myDeviceInfo );     
        }


        protected  void On() {
      	    Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Sending command On");
        	this.myPubSubMiddleware.sendCommand("On",  null  , myDeviceInfo );     
        }
        
        public void notifyReceived(String eventName, Object arg, Device deviceInfo) { 
	    try {
	      if (eventName.equals("tempPref"))  
	                { 
	      	    	 
	      	    	  Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Notification received tempPref");
	      	    	  onNewtempPref((UserTempPref) arg); 
	                }
	                if (eventName.equals("avgTemperatureMeasurement"))  
	                { 
	      	    	 
	      	    	  Logger.log( myDeviceInfo.getName() ,"RegulateTemp" , "Notification received avgTemperatureMeasurement");
	      	    	  onNewavgTemperatureMeasurement((AvgTempStruct) arg); 
	                }
	                         
         } catch (Exception e) {
              e.printStackTrace();
        }
        }	  
	    	   
	    	    public abstract void onNewtempPref( UserTempPref arg);	   		
	    	   	
	    	   	public void subscribetempPref() {
	    	   	
	    	   	RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   	     		
	             		  this.myPubSubMiddleware.subscribe(this,"tempPref", regionInfo);
	    		}
	    			   
	    	    public abstract void onNewavgTemperatureMeasurement( AvgTempStruct arg);	   		
	    	   	
	    	   	public void subscribeavgTemperatureMeasurement() {
	    	   	
	    	   	RegionID regionInfo = RegionSubscription.getSubscriptionRequest(
	    					partitionAttribute, myDeviceInfo.getRegionLabels(),
	    					myDeviceInfo.getRegion());
	    	   	     		
	             		  this.myPubSubMiddleware.subscribe(this,"avgTemperatureMeasurement", regionInfo);
	    		}
	    				
		public void run() {
		}		
}