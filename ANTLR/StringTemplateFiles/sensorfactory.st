package $SensorDriver.factoryPackageName$;

import $SensorDriver.PackageName$.*;
import android.app.Activity;
import logic.*;
import deviceImpl.*;

public class  $SensorDriver.name$Factory  { 
   
   public static I$SensorDriver.name$ get$SensorDriver.name$(String name$SensorDriver.name$, Activity context,
     Fake$SensorDriver.name$ obj) {  
  		
        if (name$SensorDriver.name$.equals("PC"))   
           return new PC$SensorDriver.name$(); 
      
        if (name$SensorDriver.name$.equals("Android"))  
           return new Android$SensorDriver.name$(context, obj);  
                
        return null;       
    }
}