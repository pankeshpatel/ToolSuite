package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.AvgTempStruct;
import framework.ManageTemp;
import framework.SetTempStruct;

public class FakeManageTemp extends ManageTemp {

	public FakeManageTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewcenterAvgTempMeasurement(AvgTempStruct arg) {

		SetTempStruct avgTemp = new SetTempStruct(arg.getavgTempValue(), "C");
		Display(avgTemp);
	}

}