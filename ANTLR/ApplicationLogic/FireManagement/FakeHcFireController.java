package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeHcFireController extends HcFireController {

	private int numHouse = 0;
	private final int NUM_HOUSE = 2;

	public FakeHcFireController(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewhouseFireState(SmokePresenceStruct arg) {

		System.out
				.println(" Receiving data OnNewHouseFireState---HcFireController");

		if (arg.getsmokePresence() == true) {

			synchronized (this) {

				numHouse = numHouse + 1;

				if (numHouse == NUM_HOUSE) {
					numHouse = 0;
					SwitchOn();
				}
			}

		}
		else
		{
			SwitchOff();
		}

	}

}