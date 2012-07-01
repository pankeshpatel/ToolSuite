package framework;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;

public abstract class  Heater implements Runnable, CommandListener  {	
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	public Heater(PubSubMiddleware pubSubM, Device deviceInfo) {  
	
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
		postInitialize();
		
    } 
    
    protected void postInitialize() {
      subscribeOff(); 
          subscribeSetTemp(); 
           }

	
    protected abstract void Off(); 
    protected abstract void SetTemp(TempStruct arg ); 
	
    public final Object commandReceived(String methodName, Object arg, Device deviceInfo) { 

        if (methodName.equals("Off")   ) {
        	
        	Logger.log( myDeviceInfo.getName() ,"Heater" , "Off has been received");
        	
        	
    		   Off();
    		   return null;
          }  else 
        if (methodName.equals("SetTemp")   && arg instanceof TempStruct) {
        	
        	Logger.log( myDeviceInfo.getName() ,"Heater" , "SetTemp has been received");
        	
        	
    		   SetTemp((TempStruct)arg );
    		   return null;
          } 
    		  return null;
    }	
    
   

         	public void subscribeOff() {
                this.myPubSubMiddleware.registerInstance(this,"Off");
        		}
         
         	public void subscribeSetTemp() {
                this.myPubSubMiddleware.registerInstance(this,"SetTemp");
        		}
           		
   		  		
   	 public void run() {  }
}	
