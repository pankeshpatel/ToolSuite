package factory;

import fr.inria.arles.pankesh.device.AndroidHeater;
import framework.IHeater;

public class HeaterFactory {

	public static IHeater getHeater(String nameHeater) {

		if (nameHeater.equals("Android"))
			return new AndroidHeater();

		return null;

	}

}
