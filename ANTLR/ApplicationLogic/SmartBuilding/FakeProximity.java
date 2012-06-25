package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.BadgeDetectedStruct;
import framework.BadgeDisappearedStruct;
import framework.Proximity;
import framework.UserProfileStruct;
import framework.UserTempPrefStruct;

public class FakeProximity extends Proximity {

	public FakeProximity(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewbadgeDetected(BadgeDetectedStruct arg) {

		UserProfileStruct userprofileStruct = getprofile("BadgeID-d001");

		UserTempPrefStruct userTempPref = new UserTempPrefStruct(
				userprofileStruct.gettempPref(), "C", 25);
		settempPref(userTempPref);

	}

	public void onNewbadgeDisappeared(BadgeDisappearedStruct arg) {

		UserProfileStruct userprofileStruct = getprofile("BadgeID-d001");

		UserTempPrefStruct userTempPref = new UserTempPrefStruct(
				userprofileStruct.gettempPref(), "C", 25);
		settempPref(userTempPref);
		getprofile("BadgeID-d001");

	}

}