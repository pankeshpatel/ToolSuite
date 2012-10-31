package factory;

import framework.*;

public class  TemperatureSensorFactory  { 
   
   public static ITemperatureSensor getTemperatureSensor(String nameTemperatureSensor) {
  
       // if (nameTemperatureSensor.equals("Android"))
        //  return new AndroidBadgeReader();  // Register  device specific driver
        
       // if (nameTemperatureSensor.equals("iOS"))
          // return new IOSBadgeReader();     
    
    return null;       
}

}