package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.AvgTempStruct;
import framework.RegulateTemp;
import framework.SetTempStruct;
import framework.UserTempPrefStruct;

public class FakeRegulateTemp extends RegulateTemp {

	public FakeRegulateTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewtempPref(UserTempPrefStruct arg) {

		On();
	}

	public void onNewroomAvgTempMeasurement(AvgTempStruct arg) {

		SetTempStruct setTempStruct = new SetTempStruct(arg.getavgTempValue(),
				"C");
		SetTemp(setTempStruct);
	}

}