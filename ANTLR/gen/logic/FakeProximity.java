package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;
	   	


public class  FakeProximity extends Proximity  { 


   public FakeProximity(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}   
    		
	

	    	   
	    	    public  void onNewbadgeDetected( BadgeDetectedStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		

	    	   
	    	    public  void onNewbadgeDisappeared( BadgeDisappearedStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		 
}