package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.ProfileDB;
import framework.TempStruct;

public class FakeProfileDB extends ProfileDB {

	public FakeProfileDB(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

		TempStruct userPref = new TempStruct(35, "C");
		setprofile("8", userPref);
	}

}