package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;

import framework.RegulateTemp;
import framework.TempStruct;
import framework.UserTempPrefStruct;

public class FakeRegulateTemp extends RegulateTemp {

	public FakeRegulateTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewtempPref(UserTempPrefStruct arg) {

		On();
	}

	public void onNewroomAvgTempMeasurement(TempStruct arg) {

		TempStruct setTempStruct = new TempStruct(arg.gettempValue(),
				arg.getunitOfMeasurement());
		SetTemp(setTempStruct);
	}

}