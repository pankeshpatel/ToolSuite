package $Storageservice.packageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import java.util.HashMap;




public abstract class  $Storageservice.name$  implements Runnable, CommandListener {
	
	protected final PubSubMiddleware myPubSubMiddleware;
	protected final Device myDeviceInfo;
    
	public $Storageservice.name$(PubSubMiddleware pubSubM,  Device deviceInfo) {     
	 
		 this.myPubSubMiddleware = pubSubM;
		this.myDeviceInfo = deviceInfo;
		postInitialize();	
    }   
	
	protected void postInitialize() {
	      $Storageservice.allDataAccess:{dataAccess|subscribe$dataAccess.dataAccessName; format="capital"$(); 
	    }$ 
	    }
	
   	$Storageservice.allAttributes:{ attribute | private $attribute.type$ $attribute.name; format="avoidCapital"$;
    protected void set$attribute.name; format="capital"$($attribute.type$ newValue) {
      if ($attribute.name; format="avoidCapital"$ != newValue) {
        $attribute.name; format="avoidCapital"$ = newValue; 
      }
    }    
    public $attribute.type$ get$attribute.name; format="capital"$() {
      return $attribute.name; format="avoidCapital"$;
    }
}; separator="\n"$
  
	$Storageservice.allDataAccess:{ dataAccess | 
	
  	private HashMap<$dataAccess.query.type.name; format="capital" $, $dataAccess.generatedInfo.type.name$ > $dataAccess.dataAccessName$ 
	= new HashMap<$dataAccess.query.type.name; format="capital" $, $dataAccess.generatedInfo.type.name$>();
	
	protected void set$dataAccess.dataAccessName; format="capital"$ 
			($dataAccess.query.type.name; format="capital" $ newIndex  , $dataAccess.generatedInfo.type.name$  new$dataAccess.dataAccessName; format="capital"$Value ) {
		$dataAccess.dataAccessName$.put(newIndex, new$dataAccess.dataAccessName; format="capital"$Value );
	}
	
	protected $dataAccess.generatedInfo.type.name$ get$dataAccess.dataAccessName$($dataAccess.query.type.name; format="capital" $ index) {
	      return $dataAccess.dataAccessName$.get(index);   
	      }
	
	public final Object commandReceived(String methodName, Object arg, Device deviceInfo)  {

	    if (methodName.equals("get$dataAccess.dataAccessName$")) {
	    	
	    	Logger.log(myDeviceInfo.getName(),"$Storageservice.name$",
					"CommandReceived get$dataAccess.dataAccessName$");
	      return get$dataAccess.dataAccessName$(($dataAccess.query.type.name; format="capital" $)arg);
	    }
	    return null;
	      
	    }
	
	public void subscribe$dataAccess.dataAccessName$() {
		this.myPubSubMiddleware.registerInstance(this, "get$dataAccess.dataAccessName$");
	}
	
	
}$    		
	   		
	 public void run() {   }

}


  

        
    
	
	
    

    