package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.Heater;
import framework.SetTempStruct;

public class FakeHeater extends Heater {

	public FakeHeater(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void SetTemp(SetTempStruct arg) {
		System.out.println("Receiving Temeprature from RegulateTemp"
				+ arg.getsetTemp());

	}

	@Override
	protected void Off() {
		System.out.println("Off() procedure of Heater is invoked");

	}

	@Override
	protected void On() {
		System.out.println("On() procedure of Heater is invoked");

	}

}