package factory;

import fr.inria.arles.pankesh.device.AndroidMonitor;
import framework.IMonitor;

public class MonitorFactory {

	public static IMonitor getMonitor(String nameMonitor) {

		if (nameMonitor.equals("Android")) {
			return new AndroidMonitor();
		}
		return null;
	}

}
