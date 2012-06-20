package fr.inria.arles.pankesh.gen.logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.gen.Proximity;
import fr.inria.arles.pankesh.gen.UserProfileStruct; 
import fr.inria.arles.pankesh.gen.BadgeDisappearedStruct; 
import fr.inria.arles.pankesh.gen.BadgeDetectedStruct;    	
	   	


public class  FakeProximity extends Proximity  { 


   public FakeProximity(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}   
    		
	

	    	   
	    	    public  void onNewprofile( UserProfileStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		

	    	   
	    	    public  void onNewbadgeDisappeared( BadgeDisappearedStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		

	    	   
	    	    public  void onNewbadgeDetected( BadgeDetectedStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		 
}