package factory;

import logic.Fake$GUIdriver.name$;
import android.app.Activity;
import deviceImpl.Android$GUIdriver.name$;
import framework.I$GUIdriver.name$;

public class $GUIdriver.name$Factory {

	public static I$GUIdriver.name$ get$GUIdriver.name$(String nameMonitor,
			Activity context, Fake$GUIdriver.name$ obj) {

		if (nameMonitor.equals("Android")) {

			Android$GUIdriver.name$ driver = new Android$GUIdriver.name$(context,obj);

			return driver;

		}
		// Register device specific driver

		// if (nameMonitor.equals("iOS"))
		// return new IOSMonitor();
		return null;
	}

}