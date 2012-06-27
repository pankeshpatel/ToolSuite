package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeAlarm extends Alarm {

	public FakeAlarm(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void DeActivate() {
		System.out.println("FakeAlarm -- DeActivate() is invoked");

	}

	@Override
	protected void Activate() {
		System.out.println("FakeAlarm -- Activate() is invoked");

	}

}