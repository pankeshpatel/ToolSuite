package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;
	   	


public class  FakeCenterAvgTemp extends CenterAvgTemp  { 


   public FakeCenterAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}   
    		
	

	    	   
	    	    public  void onNewfloorAvgTempMeasurement( TempStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		 
}