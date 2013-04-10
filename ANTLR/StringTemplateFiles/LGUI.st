package $GUIdriver.logicPackageName$;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import android.app.Activity;
import android.app.Dialog;
import fr.inria.arles.pankesh.semanticmodel.*;
import $GUIdriver.PackageName$.*;
import factory.*;
  
   
public  class  Fake$GUIdriver.name$ extends $GUIdriver.name$  {	

	I$GUIdriver.name$ driver$GUIdriver.name$;
	Activity ui;
	public Fake$GUIdriver.name$ obj=this;

	public Fake$GUIdriver.name$(PubSubMiddleware myPubSubMiddleware, final Device deviceInfo, final Object ui) {
		super(myPubSubMiddleware, deviceInfo);
		this.ui = (Activity) ui;

		this.ui.runOnUiThread(new Runnable() {

			public void run() {

				 driver$GUIdriver.name$ = $GUIdriver.name$Factory.get$GUIdriver.name$Driver(deviceInfo.getType(),(Activity) ui,obj);
				((Dialog) driver$GUIdriver.name$).show();

			}
		});	
	
	
	}
	
    $GUIdriver.allActions:{ action |     
    @Override
    protected  void $action.name$(final $action.allParameter:{ param | $param.type.name$ arg }; separator=", "$) {
    	
    	this.ui.runOnUiThread(new Runnable() {

			public void run() {
		
				driver$GUIdriver.name$.$action.name$GUI($action.allParameter:{ param | arg }; separator=", "$);
				
			}
		});
			
	}

    }; separator="\n"$
	
}
