package factory;

import framework.*;



public class  ProfileDBFactory  { 
   
   public static IProfileDB getProfileDB(String nameProfileDB) {
  
       // if (nameProfileDB.equals("mysql"))
        //  return new AndroidBadgeReader();  // Register  device specific driver
        
       // if (nameProfileDB.equals("mongodb"))
          // return new IOSBadgeReader();     
    
    return null;       
}

}