package $Actuatordriver.factoryPackageName$;

import $Actuatordriver.PackageName$.*;
import framework.*;
import deviceImpl.*;

public class  $Actuatordriver.name$Factory  { 
   
   public static I$Actuatordriver.name$ get$Actuatordriver.name$(String name$Actuatordriver.name$) {
  
		// TODO : Developers should replace "Impl" word with appropriate 
		//  name for readability.
  
        if (name$Actuatordriver.name$.equals("Impl"))
          return new Impl$Actuatordriver.name$();  // Register  device specific driver
        
       // if (name$Actuatordriver.name$.equals("iOS"))
          // return new IOS$Actuatordriver.name$();     
    
    return null;       
}

}