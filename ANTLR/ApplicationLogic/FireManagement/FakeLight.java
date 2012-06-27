package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeLight extends Light {

	public FakeLight(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void SwitchOn() {
		System.out.println("Light -- SwitchOn() is invoked");

	}

	@Override
	protected void SwitchOff() {
		System.out.println("Light -- SwitchOff() is invoked");

	}

}