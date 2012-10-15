package logic;

import java.util.Random;

import fr.inria.arles.pankesh.factory.TemperatureSensorFactory;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.sensordriver.temperaturesensor.ITemperatureSensor;
import framework.TempStruct;
import framework.TemperatureSensor;

public class FakeTemperatureSensor extends TemperatureSensor {

	Random randomGenerator = new Random();

	public FakeTemperatureSensor(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void handletempMeasurement() {
		// TODO : write code Here
	}

	private boolean continueFlag = false;

	@Override
	public void run() {
		continueFlag = true;
		// while (true) {
		for (int i = 0; i <= 5; i++) {

			try {
				Thread.sleep(1000);
				handleExpiryOfTimer();
				// if (!continueFlag)
				// break;
			} catch (InterruptedException e) {
				e.printStackTrace();
				continueFlag = false;
			}
			// }
		}
	}

	@Override
	protected void handleExpiryOfTimer() {

		ITemperatureSensor tempSensor = TemperatureSensorFactory
				.getTemperatureSensor("motorola");
		TempStruct tempData = tempSensor.getTemperatureData();

		settempMeasurement(tempData);

	}

}