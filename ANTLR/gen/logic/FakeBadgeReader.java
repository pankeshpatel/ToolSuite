package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class  FakeBadgeReader extends BadgeReader  { 
   
	public FakeBadgeReader(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}	
	
		
		
		@Override
		public void handlebadgeDetected()	{
		     // TODO : write code Here
		}
	   

		
		
		@Override
		public void handlebadgeDisappeared()	{
		     // TODO : write code Here
		}
	   

		
		@Override
		protected void handleExpiryOfTimer() {
			//TODO: For periodic sensing : it is  for 10 seconds	
			
		}	
	
}