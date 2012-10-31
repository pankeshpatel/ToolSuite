package factory;

import framework.*;

public class  BadgeReaderFactory  { 
   
   public static IBadgeReader getBadgeReader(String nameBadgeReader) {
  
       // if (nameBadgeReader.equals("Android"))
        //  return new AndroidBadgeReader();  // Register  device specific driver
        
       // if (nameBadgeReader.equals("iOS"))
          // return new IOSBadgeReader();     
    
    return null;       
}

}