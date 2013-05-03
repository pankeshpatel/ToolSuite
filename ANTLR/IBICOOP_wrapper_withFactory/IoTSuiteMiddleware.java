package fr.inria.arles.pankesh.pubsubmiddleware;

import java.util.List;

import fr.inria.arles.pankesh.semanticmodel.Device;

public interface IoTSuiteMiddleware {	
	    
	public abstract void publish(String topicName, Object arg, Device deviceInfo);
	
	public abstract void subscribe(Subscriber s, String topicName, List<String> regionInfo);
	
}
