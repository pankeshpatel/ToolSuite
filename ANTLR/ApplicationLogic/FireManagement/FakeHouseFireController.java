package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeHouseFireController extends HouseFireController {

	public FakeHouseFireController(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewhouseFireState(SmokePresenceStruct arg) {

		System.out
				.println(" Receiving data OnNewHouseFireState---HouseFireController");

		if (arg.getsmokePresence()) {
			Activate();
			Start();
			Unlock();
		} else {
			DeActivate();
			Stop();

		}

	}

}