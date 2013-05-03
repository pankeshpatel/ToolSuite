package $Actuatordriver.factoryPackageName$;

import $Actuatordriver.PackageName$.*;
import framework.*;
import deviceImpl.*;
import logic.*;
import android.app.Activity;


public class  $Actuatordriver.name$Factory  { 
   
   public static I$Actuatordriver.name$ get$Actuatordriver.name$(String name$Actuatordriver.name$, 
                 Activity context, Fake$Actuatordriver.name$ obj) {
  
		// TODO : Developers should replace "Impl" word with appropriate 
		//  name for readability.
  
        if (name$Actuatordriver.name$.equals("PC"))
          return new PC$Actuatordriver.name$();  // Register  device specific driver
       
          if (name$Actuatordriver.name$.equals("Android"))
          return new Android$Actuatordriver.name$(context, obj);  // Register  device specific driver
        
       // if (name$Actuatordriver.name$.equals("iOS"))
          // return new IOS$Actuatordriver.name$();     
    
    return null;       
}

}