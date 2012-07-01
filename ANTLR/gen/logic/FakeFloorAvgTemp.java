package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;
	   	


public class  FakeFloorAvgTemp extends FloorAvgTemp  { 


   public FakeFloorAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}   
    		
	

	    	   
	    	    public  void onNewroomAvgTempMeasurement( TempStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		 
}