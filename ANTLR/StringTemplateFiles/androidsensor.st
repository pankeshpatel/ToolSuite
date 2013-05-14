package $SensorDriver.deviceImplPackageName$;

import framework.*;
import logic.*;
import android.content.BroadcastReceiver;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;


public class Android$SensorDriver.name$ implements I$SensorDriver.name$ {
    

	BroadcastReceiver myReceiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {

			
		}
	};
  
   public Android$SensorDriver.name$(Context context, Fake$SensorDriver.name$ obj) {
		
		Intent intent = new Intent(context, Android$SensorDriver.name$Service.class);
		context.startService(intent);

		IntentFilter receiverFilter = new IntentFilter();
		receiverFilter.addAction("$SensorDriver.name$");
		context.registerReceiver(myReceiver, receiverFilter);
	}
  
   $SensorDriver.allGeneratedInfo:{ generatedInfo | 
   
   @Override
   public  $generatedInfo.type.name$ get$generatedInfo.name; format="avoidCapital"$(){
       return null;
   }
      
   @Override
   public void get$generatedInfo.name; format="avoidCapital"$(Listener$generatedInfo.name$ handler){
   
   }   
      
}; separator="\n"$
  
  @Override
  public boolean isEventDriven() {
    // TODO Auto-generated method stub
    return true;
  }

}
