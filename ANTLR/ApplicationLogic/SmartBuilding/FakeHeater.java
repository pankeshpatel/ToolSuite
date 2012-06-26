package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.Heater;
import framework.TempStruct;

public class FakeHeater extends Heater {

	public FakeHeater(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void SetTemp(TempStruct arg) {
		System.out.println("Receiving Temeprature from RegulateTemp"
				+ arg.gettempValue() + arg.getunitOfMeasurement());

	}

	@Override
	protected void Off() {
		System.out.println("Off() procedure of Heater is invoked");

	}

	

}