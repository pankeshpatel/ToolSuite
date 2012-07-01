package sim.deviceD7;

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
	

		FakeMonitor fakeMonitorImpl = new FakeMonitor(myPubSub, deviceInfo); 
		new Thread(fakeMonitorImpl).start();
	    

		FakeTemperatureSensor fakeTemperatureSensorImpl = new FakeTemperatureSensor(myPubSub, deviceInfo); 
		new Thread(fakeTemperatureSensorImpl).start();
	    

		FakeFloorAvgTemp fakeFloorAvgTempImpl = new FakeFloorAvgTemp(myPubSub, deviceInfo); 
		new Thread(fakeFloorAvgTempImpl).start();
	    

		FakeBadgeReader fakeBadgeReaderImpl = new FakeBadgeReader(myPubSub, deviceInfo); 
		new Thread(fakeBadgeReaderImpl).start();
	    
	
}

private static Device setUpDeviceInfo() {
    
	 name = "D7";
	 id =  "";
	 type = "PC";
	networkAddress =  "128";
	
		
	abilities.add("Monitor"); abilities.add("TemperatureSensor"); abilities.add("FloorAvgTemp"); abilities.add("BadgeReader");  
	
	List<String> regionIDs = new ArrayList<String>();
  List<String> regionLabels = new ArrayList<String>();
  
  regionIDs.add("16") ; regionIDs.add("14") ; regionIDs.add("3") ; 
  
  regionLabels.add("Center"); regionLabels.add("Floor"); regionLabels.add("Room"); 
	
	Device device = new Device(name , id , type, networkAddress, regionIDs, regionLabels , abilities);
	return device;    
}

@Override
public void startDevice() {
	setUpNode(setUpDeviceInfo());
	
}

}