package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeSmokeDetector extends SmokeDetector {

	public FakeSmokeDetector(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void handlesmokePresence() {
		// TODO : write code Here
	}

	@Override
	protected void handleExpiryOfTimer() {
		// TODO: For periodic sensing : it is for 10 seconds

	}

}