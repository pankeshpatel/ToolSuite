package $SensorDriver.logicPackageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.factory.*;
import fr.inria.arles.pankesh.semanticmodel.*;

import $SensorDriver.PackageName$.*;

public class  Fake$SensorDriver.name$ extends $SensorDriver.name$  { 
   
	public Fake$SensorDriver.name$(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}	
	
	$SensorDriver.allGeneratedInfo:{ generatedInfo | 	
	
	/*@Override
	public void handle$generatedInfo.name; format="capital"$()	{
	     // TODO : write code Here
	} */
   
}; separator="\n"$
		
		private boolean continueFlag = false;

@Override
public void run() {
	continueFlag = true;
	// while (true) {
	for (int i = 0; i <= 5; i++) {

		try {
			Thread.sleep(1000);
			handleExpiryOfTimer();
			// if (!continueFlag)
			// break;
		} catch (InterruptedException e) {
			e.printStackTrace();
			continueFlag = false;
		}
		// }

	}
}

	$SensorDriver.allGeneratedInfo:{ generatedInfo | 	
	
	
	Listener$generatedInfo.name; format="capital"$  $generatedInfo.name; format="capital"$Event = new Listener$generatedInfo.name; format="capital"$() {
		
		@Override
		public void onNew$generatedInfo.name; format="capital"$($generatedInfo.type.name$ response) {

			$generatedInfo.type.name$ s$generatedInfo.type.name$ = new $generatedInfo.type.name$(
					response.getbadgeID(), response.gettimeStamp());
			set$generatedInfo.name; format="capital"$(s$generatedInfo.type.name$);
		}
		
		
	};
   
}; separator="\n"$

		
		
		
		@Override
		protected void handleExpiryOfTimer() {
	
	
			
			
	I$SensorDriver.name$ obj$SensorDriver.name$ = $SensorDriver.name$Factory
			.get$SensorDriver.name$(myDeviceInfo.getSoftwarePlatform());

	if (obj$SensorDriver.name$.isEventDriven()) {

		$SensorDriver.allGeneratedInfo:{ generatedInfo | 
		
			obj$SensorDriver.name$.get$generatedInfo.name; format="capital"$($generatedInfo.name; format="capital"$Event);
		
	}; separator="\n"$

	} else {
		
		$SensorDriver.allGeneratedInfo:{ generatedInfo | 	
		
		$generatedInfo.type.name$ s$generatedInfo.type.name$ = obj$SensorDriver.name$.get$generatedInfo.name; format="capital"$();
		set$generatedInfo.name; format="capital"$(s$generatedInfo.type.name$);		
	   
	}; separator="\n"$
		
		

		

	}

	
			
			
	
			
		}	
	
}
	
	
	
	
	


    
	
	
    

    