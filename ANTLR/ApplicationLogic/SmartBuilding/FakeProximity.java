package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.BadgeDetectedStruct;
import framework.BadgeDisappearedStruct;
import framework.Proximity;
import framework.TempStruct;
import framework.UserProfileStruct;
import framework.UserTempPrefStruct;

public class FakeProximity extends Proximity {

	public FakeProximity(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewbadgeDetected(BadgeDetectedStruct arg) {

		TempStruct userprofile = getprofile(arg.getbadgeID());

		UserTempPrefStruct userTempPref = new UserTempPrefStruct(
				userprofile.gettempValue(), userprofile.getunitOfMeasurement(), arg.gettimeStamp());
		settempPref(userTempPref);   

	}

	public void onNewbadgeDisappeared(BadgeDisappearedStruct arg) {

		TempStruct userprofile = getprofile(arg.getbadgeID());

		UserTempPrefStruct userTempPref = new UserTempPrefStruct(
				userprofile.gettempValue(), userprofile.getunitOfMeasurement(), arg.gettimeStamp());
		settempPref(userTempPref);
		getprofile("BadgeID-d001");

	}

}