package framework;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.HashMap;




public abstract class  ProfileDB  implements Runnable, CommandListener {
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
    
	public ProfileDB(PubSubMiddleware pubSubM,  Device deviceInfo) {     
	 
		 this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();	
    }   
	
	protected void postInitialize() {
	      subscribeprofile(); 
	      	     
	    }
	
  

		
	  	private HashMap<String, TempStruct > profile 
		= new HashMap<String, TempStruct>();
		
		protected void setprofile 
				(String newIndex  , TempStruct  newprofileValue ) {
			profile.put(newIndex, newprofileValue );
		}
		
		protected TempStruct getprofile(String index) {
		      return profile.get(index);   
		      }
		
		public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {

		    if (methodName.equals("getprofile")) {
		    	
		    	Logger.log(myDeviceInfo.getName(),"ProfileDB",
						"CommandReceived getprofile");
		      return getprofile((String)arg);
		    }
		    return null;
		      
		    }
		
		public void subscribeprofile() {
			this.myPubSubMiddleware.registerInstance(this, "getprofile");
		}
		
		
    		
	   		
	 public void run() {   }

}