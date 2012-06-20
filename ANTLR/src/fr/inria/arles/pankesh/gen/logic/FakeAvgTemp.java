package fr.inria.arles.pankesh.gen.logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.gen.AvgTemp;
import fr.inria.arles.pankesh.gen.TempStruct;    	
	   	


public class  FakeAvgTemp extends AvgTemp  { 


   public FakeAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}   
    		
	

	    	   
	    	    public  void onNewtempMeasurement( TempStruct arg){	    
	    	    //TODO : write code here.
	    	    
	    	    }	   		
	    	   	
	    		 
}