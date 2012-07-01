package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;
  
   
public  class  FakeMonitor extends Monitor  {	

	public FakeMonitor(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}	
	
        
        @Override
        protected  void Display(TempStruct arg ) {
          //TODO : write code here
        
        }
        
        
	
}