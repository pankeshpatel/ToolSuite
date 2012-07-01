package logic;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;



public class FakeRegulateTemp extends RegulateTemp {

	public FakeRegulateTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}
	
		   
		    public void onNewroomAvgTempMeasurement( TempStruct arg){
		    	//TODO : write code here
		    }	   	
			   
		    public void onNewtempPref( UserTempPrefStruct arg){
		    	//TODO : write code here
		    }	   	
			

}