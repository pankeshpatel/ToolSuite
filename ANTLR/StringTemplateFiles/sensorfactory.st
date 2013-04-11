package $SensorDriver.factoryPackageName$;

import $SensorDriver.PackageName$.*;

import deviceImpl.*;

public class  $SensorDriver.name$Factory  { 
   
   public static I$SensorDriver.name$ get$SensorDriver.name$(String name$SensorDriver.name$) {
  
  		// TODO : Developers should replace "Impl" word with appropriate 
  		//  name for readability.
  
        if (name$SensorDriver.name$.equals("Impl"))
          return new Impl$SensorDriver.name$();  // Register  device specific driver
        
       // if (name$SensorDriver.name$.equals("iOS"))
          // return new IOS$SensorDriver.name$();     
    
    return null;       
}

}