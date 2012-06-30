package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.*;
import framework.*;

public class FakeHouseFireComputation extends HouseFireComputation {

	private boolean smokePresence = false;
	private long timeStamp = ((long) (System.currentTimeMillis())) * 1000000;
	private double tempValue = 0;
	private String unitOfMeasurement = "C";

	public FakeHouseFireComputation(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewsmokePresence(SmokePresenceStruct arg) {

		System.out.println("Receiving data --OnNewSmokePresence");

		this.smokePresence = arg.getsmokePresence();
		this.timeStamp = arg.gettimeStamp();

		if (this.tempValue >= 55 && (this.unitOfMeasurement).equals("C")
				&& this.smokePresence == true) {
			SmokePresenceStruct smokePresenceStruct = new SmokePresenceStruct(
					this.smokePresence, this.timeStamp);
			sethouseFireState(smokePresenceStruct);
		}

	}

	public void onNewhouseAvgTemp(TempStruct arg) {

		System.out.println("Receiving data --onNewhouseAvgTemp");

		this.tempValue = arg.gettempValue();
		this.unitOfMeasurement = arg.getunitOfMeasurement();

		if (this.tempValue >= 55 && (this.unitOfMeasurement).equals("C")
				&& this.smokePresence == true) {
			SmokePresenceStruct smokePresenceStruct = new SmokePresenceStruct(
					this.smokePresence, this.timeStamp);
			sethouseFireState(smokePresenceStruct);
		}

	}

}