package sim.deviceD2;

import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import fr.inria.arles.pankesh.pubsubmiddleware.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import logic.*;





public class Startup implements DeviceStartup {
	
	private static String name ;
	private static String id ;
	private static String type ;
	private static String networkAddress;
	private static Set<String> abilities = new HashSet<String>();
	private static PubSubMiddleware myPubSub = PubSubMiddleware.getInstance();



private static void setUpNode(Device deviceInfo)	{	
	

		FakeHeater fakeHeaterImpl = new FakeHeater(myPubSub, deviceInfo); 
		new Thread(fakeHeaterImpl).start();
	    

		FakeTemperatureSensor fakeTemperatureSensorImpl = new FakeTemperatureSensor(myPubSub, deviceInfo); 
		new Thread(fakeTemperatureSensorImpl).start();
	    
	
}

private static Device setUpDeviceInfo() {
    
	 name = "D2";
	 id =  "";
	 type = "PC";
	networkAddress =  "128";
	
		
	abilities.add("Heater"); abilities.add("TemperatureSensor");  
	
	List<String> regionIDs = new ArrayList<String>();
  List<String> regionLabels = new ArrayList<String>();
  
  regionIDs.add("15") ; regionIDs.add("11") ; regionIDs.add("0") ; 
  
  regionLabels.add("Center"); regionLabels.add("Floor"); regionLabels.add("Room"); 
	
	Device device = new Device(name , id , type, networkAddress, regionIDs, regionLabels , abilities);
	return device;    
}

@Override
public void startDevice() {
	setUpNode(setUpDeviceInfo());
	
}

}