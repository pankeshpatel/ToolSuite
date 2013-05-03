package $SensorDriver.logicPackageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import factory.*;
import fr.inria.arles.pankesh.semanticmodel.*;
import android.app.Activity;
import android.app.Dialog;
import framework.*;

import $SensorDriver.PackageName$.*;

public class  Fake$SensorDriver.name$ extends $SensorDriver.name$  { 

	I$SensorDriver.name$ obj$SensorDriver.name$;
	Activity ui;
	public Fake$SensorDriver.name$ obj = this;
	Device deviceInfo;	
	public String deviceType;
   
	public Fake$SensorDriver.name$(PubSubMiddleware pubSubM, final Device deviceInfo, final Object ui) {
		super(pubSubM, deviceInfo);
		
		deviceType = deviceInfo.getType();
		
		if (deviceType.equals("PC")) {
		   // DO nothing		    
		}else {
		
		this.ui = (Activity) ui;
		   this.ui.runOnUiThread(new Runnable() {
				public void run() {
					obj$SensorDriver.name$ = $SensorDriver.name$Factory.get$SensorDriver.name$(deviceInfo.getType(), (Activity) ui, obj);
					((Dialog) obj$SensorDriver.name$).show();
				}
			});
		}
		
		

	}	
	
	$SensorDriver.allGeneratedInfo:{ generatedInfo | 
	
   
}; separator="\n"$
		
		private boolean continueFlag = false;

@Override
public void run() {
	continueFlag = true;
	   while (true) {
	//for (int i = 0; i <= 5; i++) {

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
			$generatedInfo.data.StructFieldSet:{ StructFieldSet | response.get$StructFieldSet.name$()}; separator=", "$);
			set$generatedInfo.name; format="capital"$(s$generatedInfo.type.name$);
		}
		
		
	};
   
}; separator="\n"$

		
		
		
		@Override
		protected void handleExpiryOfTimer() {
	
	
			if (deviceType.equals("PC")) {
			
	I$SensorDriver.name$ obj$SensorDriver.name$ = $SensorDriver.name$Factory
			.get$SensorDriver.name$(myDeviceInfo.getType(), null, null);

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
	
	
	if (deviceType.equals("Android")) { 			
	
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

	
			
			
	
			
			
	
}  }
	
	
	
	
	


    
	
	
    

    