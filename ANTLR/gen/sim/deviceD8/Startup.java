package sim.deviceD8;

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
	

		FakeProfileDB fakeProfileDBImpl = new FakeProfileDB(myPubSub, deviceInfo); 
		new Thread(fakeProfileDBImpl).start();
	    

		FakeHeater fakeHeaterImpl = new FakeHeater(myPubSub, deviceInfo); 
		new Thread(fakeHeaterImpl).start();
	    

		FakeTemperatureSensor fakeTemperatureSensorImpl = new FakeTemperatureSensor(myPubSub, deviceInfo); 
		new Thread(fakeTemperatureSensorImpl).start();
	    

		FakeProximity fakeProximityImpl = new FakeProximity(myPubSub, deviceInfo); 
		new Thread(fakeProximityImpl).start();
	    

		FakeManageTemp fakeManageTempImpl = new FakeManageTemp(myPubSub, deviceInfo); 
		new Thread(fakeManageTempImpl).start();
	    

		FakeRegulateTemp fakeRegulateTempImpl = new FakeRegulateTemp(myPubSub, deviceInfo); 
		new Thread(fakeRegulateTempImpl).start();
	    

		FakeRoomAvgTemp fakeRoomAvgTempImpl = new FakeRoomAvgTemp(myPubSub, deviceInfo); 
		new Thread(fakeRoomAvgTempImpl).start();
	    

		FakeCenterAvgTemp fakeCenterAvgTempImpl = new FakeCenterAvgTemp(myPubSub, deviceInfo); 
		new Thread(fakeCenterAvgTempImpl).start();
	    
	
}

private static Device setUpDeviceInfo() {
    
	 name = "D8";
	 id =  "";
	 type = "PC";
	networkAddress =  "128";
	
		
	abilities.add("ProfileDB"); abilities.add("Heater"); abilities.add("TemperatureSensor"); abilities.add("Proximity"); abilities.add("ManageTemp"); abilities.add("RegulateTemp"); abilities.add("RoomAvgTemp"); abilities.add("CenterAvgTemp");  
	
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