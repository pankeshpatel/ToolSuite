package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;
  
   
public  class  FakeHeater extends Heater  {	

	public FakeHeater(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}	
	
        
        @Override
        protected  void Off() {
          //TODO : write code here
        
        }
        
        
        
        @Override
        protected  void SetTemp(TempStruct arg ) {
          //TODO : write code here
        
        }
        
        
	
}