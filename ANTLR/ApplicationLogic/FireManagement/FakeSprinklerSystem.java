package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeSprinklerSystem extends SprinklerSystem {

	public FakeSprinklerSystem(PubSubMiddleware myPubSubMiddleware,
			Device deviceInfo) {
		super(myPubSubMiddleware, deviceInfo);

	}

	@Override
	protected void Stop() {
		System.out.println("Sprinkler -- Stop() is invoked");

	}

	@Override
	protected void Start() {
		System.out.println("Sprinkler -- Start() is invoked");

	}

}