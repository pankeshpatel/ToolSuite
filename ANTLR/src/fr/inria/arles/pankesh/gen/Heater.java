package fr.inria.arles.pankesh.gen;

import fr.inria.arles.pankesh.common.*;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.CommandListener;
import fr.inria.arles.pankesh.semanticmodel.Device;

public abstract class  Heater implements Runnable, CommandListener  {	
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	public Heater(PubSubMiddleware pubSubM, Device deviceInfo) {  
	
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
		postInitialize();
		
    } 
    
    protected void postInitialize() {
      subscribeSetTemp(); 
          subscribeOn(); 
          subscribeOff(); 
           }


   	    private String manufacturerName;
   	    protected void setmanufacturerName(String newValue) {
   	      if (manufacturerName != newValue) {
   	        manufacturerName = newValue; 
   	      }
   	    }  
   	    public String getmanufacturerName() {
   	      return manufacturerName;
   	    }

	
    protected abstract void SetTemp(SetTempStruct arg ); 
    protected abstract void On(); 
    protected abstract void Off(); 
	
    public final Object commandReceived(String methodName, Object arg, Device deviceInfo) { 

        if (methodName.equals("SetTemp")   && arg instanceof SetTempStruct) {
        	
        	Logger.log( myDeviceInfo.getName() ,"Heater" , "SetTemp has been received");
        	
        	
    		   SetTemp((SetTempStruct)arg );
    		   return null;
          }  else 
        if (methodName.equals("On")   ) {
        	
        	Logger.log( myDeviceInfo.getName() ,"Heater" , "On has been received");
        	
        	
    		   On();
    		   return null;
          }  else 
        if (methodName.equals("Off")   ) {
        	
        	Logger.log( myDeviceInfo.getName() ,"Heater" , "Off has been received");
        	
        	
    		   Off();
    		   return null;
          } 
    		  return null;
    }	
    
   

         	public void subscribeSetTemp() {
                this.myPubSubMiddleware.registerInstance(this,"SetTemp");
        		}
         
         	public void subscribeOn() {
                this.myPubSubMiddleware.registerInstance(this,"On");
        		}
         
         	public void subscribeOff() {
                this.myPubSubMiddleware.registerInstance(this,"Off");
        		}
           		
   		  		
   	 public void run() {  }
}	
