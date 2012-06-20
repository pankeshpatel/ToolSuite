package fr.inria.arles.pankesh.gen.logic;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.gen.RegulateTemp;
import fr.inria.arles.pankesh.gen.UserTempPref; import fr.inria.arles.pankesh.gen.AvgTempStruct; 	



public class FakeRegulateTemp extends RegulateTemp {

	public FakeRegulateTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}
	
		   
		    public void onNewtempPref( UserTempPref arg){
		    	//TODO : write code here
		    }	   	
			   
		    public void onNewavgTemperatureMeasurement( AvgTempStruct arg){
		    	//TODO : write code here
		    }	   	
			

}