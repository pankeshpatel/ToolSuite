package fr.inria.arles.pankesh.pubsubmiddleware;

import fr.inria.arles.pankesh.semanticmodel.Device;

public class IoTSuiteFactory {
	
	static Object singletonInstance;
	
public static Object getInstance(String middlewareName, Device device, Object context) {
	
		
	if(middlewareName.equals("ibicoop")) {		

		if (singletonInstance == null) {
			singletonInstance = new PubSubMiddleware(device.getType(), device.getName(), context);
		}
		return singletonInstance;
	}
	
	return null;
}

}
