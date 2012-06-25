package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import framework.AvgTempStruct;
import framework.CenterAvgTemp;

public class FakeCenterAvgTemp extends CenterAvgTemp {

	final List<Double> temps = Collections
			.synchronizedList(new ArrayList<Double>());
	private double currentAverage;
	private int numSample = 0;
	private final int NUM_SAMPLE_FOR_AVG = 1;

	public FakeCenterAvgTemp(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);
	}

	public void onNewfloorAvgTempMeasurement(AvgTempStruct arg) {

		synchronized (this.temps) {

			numSample = numSample + 1;
			if (numSample <= NUM_SAMPLE_FOR_AVG) {

				temps.add(arg.getavgTempValue());

				currentAverage = 0;

				for (Double temp : temps) {
					currentAverage += temp;
				}

				currentAverage /= temps.size();

			}

			if (numSample == NUM_SAMPLE_FOR_AVG) {

				AvgTempStruct avgTemp = new AvgTempStruct(currentAverage, "C");
				setcenterAvgTempMeasurement(avgTemp);
			}
		}

	}

}