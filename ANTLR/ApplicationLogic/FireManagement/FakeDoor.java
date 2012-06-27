package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeDoor extends Door {

	public FakeDoor(PubSubMiddleware myPubSubMiddleware, Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void Unlock() {
		System.out.println("FakeDoor -- Unlock() is invoked");

	}

}