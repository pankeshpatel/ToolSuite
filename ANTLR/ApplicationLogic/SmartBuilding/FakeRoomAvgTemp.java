package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.RoomAvgTemp;
import framework.TempStruct;

public class FakeRoomAvgTemp extends RoomAvgTemp {

	final List<Double> temps = Collections
			.synchronizedList(new ArrayList<Double>());
	private double currentAverage;
	private int numSample = 0;
	private final int NUM_SAMPLE_FOR_AVG = 2;

	public FakeRoomAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewtempMeasurement(TempStruct arg) {

		synchronized (this.temps) {
			numSample = numSample + 1;
			if (numSample <= NUM_SAMPLE_FOR_AVG) {
				temps.add(arg.gettempValue());
				currentAverage = 0;
				for (Double temp : temps) {
					currentAverage += temp;
				}
				currentAverage /= temps.size();
			}

			if (numSample == NUM_SAMPLE_FOR_AVG) {
				numSample = 0;

				TempStruct avgTempMeasurement = new TempStruct(currentAverage,
						arg.getunitOfMeasurement());
				setroomAvgTempMeasurement(avgTempMeasurement);
			}
		}
	}

}