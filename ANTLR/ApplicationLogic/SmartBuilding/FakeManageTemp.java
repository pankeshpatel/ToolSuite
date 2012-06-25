package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.ManageTemp;
import framework.TempStruct;

public class FakeManageTemp extends ManageTemp {

	public FakeManageTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewcenterAvgTempMeasurement(TempStruct arg) {

		TempStruct avgTemp = new TempStruct(arg.gettempValue(),
				arg.getunitOfMeasurement());
		Display(avgTemp);
	}

}