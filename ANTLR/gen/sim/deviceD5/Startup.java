package sim.deviceD5;

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
	

		FakeTemperatureSensor fakeTemperatureSensorImpl = new FakeTemperatureSensor(myPubSub, deviceInfo); 
		new Thread(fakeTemperatureSensorImpl).start();
	    

		FakeFloorAvgTemp fakeFloorAvgTempImpl = new FakeFloorAvgTemp(myPubSub, deviceInfo); 
		new Thread(fakeFloorAvgTempImpl).start();
	    

		FakeRegulateTemp fakeRegulateTempImpl = new FakeRegulateTemp(myPubSub, deviceInfo); 
		new Thread(fakeRegulateTempImpl).start();
	    

		FakeBadgeReader fakeBadgeReaderImpl = new FakeBadgeReader(myPubSub, deviceInfo); 
		new Thread(fakeBadgeReaderImpl).start();
	    
	
}

private static Device setUpDeviceInfo() {
    
	 name = "D5";
	 id =  "";
	 type = "PC";
	networkAddress =  "128";
	
		
	abilities.add("TemperatureSensor"); abilities.add("FloorAvgTemp"); abilities.add("RegulateTemp"); abilities.add("BadgeReader");  
	
	List<String> regionIDs = new ArrayList<String>();
  List<String> regionLabels = new ArrayList<String>();
  
  regionIDs.add("15") ; regionIDs.add("21") ; regionIDs.add("2") ; 
  
  regionLabels.add("Center"); regionLabels.add("Floor"); regionLabels.add("Room"); 
	
	Device device = new Device(name , id , type, networkAddress, regionIDs, regionLabels , abilities);
	return device;    
}

@Override
public void startDevice() {
	setUpNode(setUpDeviceInfo());
	
}

}