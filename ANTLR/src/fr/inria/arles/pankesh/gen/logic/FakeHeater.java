package fr.inria.arles.pankesh.gen.logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.gen.Heater;
  import fr.inria.arles.pankesh.gen.SetTempStruct;   
  
      
   
public  class  FakeHeater extends Heater  {	

	public FakeHeater(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}	
	
        
        @Override
        protected  void SetTemp(SetTempStruct arg ) {
          //TODO : write code here
        
        }
        
        
        
        @Override
        protected  void On() {
          //TODO : write code here
        
        }
        
        
        
        @Override
        protected  void Off() {
          //TODO : write code here
        
        }
        
        
	
}