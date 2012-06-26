package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.ProfileDB;
import framework.TempStruct;

public class FakeProfileDB extends ProfileDB {
	
	double[] tempArray = {30, 20};	
	
	
	public FakeProfileDB(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

		TempStruct userPref = new TempStruct(35, "C");
		setprofile("BadgeID-d001", userPref);
	}
	

}