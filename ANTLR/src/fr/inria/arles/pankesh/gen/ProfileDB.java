package fr.inria.arles.pankesh.gen;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.pubsubmiddleware.CommandListener;
import fr.inria.arles.pankesh.semanticmodel.Device;
import java.util.HashMap;

import fr.inria.arles.pankesh.common.*;



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
	
   	private String responseFormat;
   	    protected void setresponseFormat(String newValue) {
   	      if (responseFormat != newValue) {
   	        responseFormat = newValue; 
   	      }
   	    }    
   	    public String getresponseFormat() {
   	      return responseFormat;
   	    }

  

		
	  	private HashMap<String, UserProfileStruct > profile 
		= new HashMap<String, UserProfileStruct>();
		
		protected void setprofile 
				(String newIndex  , UserProfileStruct  newprofileValue ) {
			profile.put(newIndex, newprofileValue );
		}
		
		protected UserProfileStruct getprofile(String index) {
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