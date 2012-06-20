package fr.inria.arles.pankesh.gen.sim.device$device.name$;

import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.dslcompiler.DeviceStartup;
import java.util.Set;
import java.util.HashSet;
import fr.inria.arles.pankesh.gen.util.RegionID;
import fr.inria.arles.pankesh.gen.util.RegionLabel;


import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
$device.abilities:{ sc | import fr.inria.arles.pankesh.gen.logic.Fake$sc$; }; separator="\n"$


public class Startup implements DeviceStartup {
	
	private static String name ;
	private static String id ;
	private static String type ;
	private static String networkAddress;
	private static Set<String> abilities = new HashSet<String>();
	private static PubSubMiddleware myPubSub = PubSubMiddleware.getInstance();

public static void main(String[] args) {
            
	setUpNode(setUpDeviceInfo());
        
}

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
	networkAddress =  "$device.networkAddress$";
	
		
	$device.abilities:{ sc | abilities.add("$sc$"); }$ 
	
	RegionID regionIDs = new RegionID( $device.region.allRegionIDs:{ region | "$region$" }; separator=","$ );
	
	RegionLabel regionLabels = new RegionLabel( $device.RegionLabels.allRegionLabel:{ region | "$region$" }; separator=","$);
	
	Device device = new Device(name , id , type, networkAddress, regionIDs, regionLabels , abilities);
	return device;    
}

@Override
public void startDevice() {
	setUpNode(setUpDeviceInfo());
	
}

}