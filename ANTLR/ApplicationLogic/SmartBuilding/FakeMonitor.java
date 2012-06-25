package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.Monitor;
import framework.TempStruct;

public class FakeMonitor extends Monitor {

	public FakeMonitor(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void Display(TempStruct arg) {
		System.out.println("Monitor is receiving Temperature Data >>>>"
				+ arg.gettempValue());

	}

}