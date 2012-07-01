package framework;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;

public abstract class  Monitor implements Runnable, CommandListener  {	
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
	
	public Monitor(PubSubMiddleware pubSubM, Device deviceInfo) {  
	
		 this.myPubSubMiddleware = pubSubM;
		 this.myDeviceInfo = deviceInfo;
		postInitialize();
		
    } 
    
    protected void postInitialize() {
      subscribeDisplay(); 
           }

	
    protected abstract void Display(TempStruct arg ); 
	
    public final Object commandReceived(String methodName, Object arg, Device deviceInfo) { 

        if (methodName.equals("Display")   && arg instanceof TempStruct) {
        	
        	Logger.log( myDeviceInfo.getName() ,"Monitor" , "Display has been received");
        	
        	
    		   Display((TempStruct)arg );
    		   return null;
          } 
    		  return null;
    }	
    
   

         	public void subscribeDisplay() {
                this.myPubSubMiddleware.registerInstance(this,"Display");
        		}
           		
   		  		
   	 public void run() {  }
}	
