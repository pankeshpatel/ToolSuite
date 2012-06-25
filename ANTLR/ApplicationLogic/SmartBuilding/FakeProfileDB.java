package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.ProfileDB;
import framework.UserProfileStruct;

public class FakeProfileDB extends ProfileDB {
	public FakeProfileDB(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
		UserProfileStruct userProfile = new UserProfileStruct("BadgeID-d001",
				35);
		setprofile("BadgeID-d001", userProfile);
	}
}