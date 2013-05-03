package $SensorDriver.deviceImplPackageName$;

import framework.*;
import android.content.Context;
import logic.*;
import android.app.Dialog;
import android.os.Bundle;
   

public class Android$SensorDriver.name$ extends Dialog implements I$SensorDriver.name$ {

    private Context myContext;
  
   public Android$SensorDriver.name$(Context context, Fake$SensorDriver.name$ obj) {
		super(context);
		this.myContext = context;
		//this.fn = (Fake$SensorDriver.name$) obj;
	}
	
	
	public void onCreate(Bundle savedInstanceState) {
	
		//setContentView(R.layout.activity_main);
		super.onCreate(savedInstanceState);

	
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
