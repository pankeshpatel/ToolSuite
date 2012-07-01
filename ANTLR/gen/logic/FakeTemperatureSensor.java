package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class  FakeTemperatureSensor extends TemperatureSensor  { 
   
	public FakeTemperatureSensor(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}	
	
		
		
		@Override
		public void handletempMeasurement()	{
		     // TODO : write code Here
		}
	   

		
		@Override
		protected void handleExpiryOfTimer() {
			//TODO: For periodic sensing : it is  for 10 seconds	
			
		}	
	
}