package logic;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;



public class FakeManageTemp extends ManageTemp {

	public FakeManageTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}
	
		   
		    public void onNewcenterAvgTempMeasurement( TempStruct arg){
		    	//TODO : write code here
		    }	   	
			

}