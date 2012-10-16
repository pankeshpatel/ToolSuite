package $device.PackageName$;

import fr.inria.arles.pankesh.semanticmodel.*;
import fr.inria.arles.pankesh.common.*;
import fr.inria.arles.pankesh.pubsubmiddleware.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import $device.logicPackageName$.*;

public class Startup implements DeviceStartup {
	
	private static String name ;
	private static String id ;
	private static String type ;
	private static String softwarePlatform;
	private static String networkAddress;
	private static Set<String> abilities = new HashSet<String>();
	private static PubSubMiddleware myPubSub = PubSubMiddleware.getInstance();



private static void setUpNode(Device deviceInfo)	{	
	
	$device.abilities:{ sc |	
	Fake$sc$ fake$sc$Impl = new Fake$sc$(myPubSub, deviceInfo); 
	new Thread(fake$sc$Impl).start();
    }; separator="\n"$
	
}

private static Device setUpDeviceInfo() {
    
	 name = "$device.name$";
	 id =  "$device.Id$";
	 type = "$device.type$";
	 softwarePlatform = "Android";
	networkAddress =  "$device.networkAddress$";
	
		
	$device.abilities:{ sc | abilities.add("$sc$"); }$ 
	
	List<String> regionIDs = new ArrayList<String>();
  List<String> regionLabels = new ArrayList<String>();
  
  $device.region:{ region | regionIDs.add("$region$") ; } $
  
  $device.RegionLabels:{ region | regionLabels.add("$region$"); } $
	
	Device device = new Device(name , id , type, networkAddress, regionIDs, regionLabels , abilities, softwarePlatform);
	return device;    
}

@Override
public void startDevice() {
	setUpNode(setUpDeviceInfo());
	
}

}