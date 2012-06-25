package logic;

import java.util.Random;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.sensordriver.dummydevice.DummyTempSensor;
import fr.inria.arles.pankesh.sensordriver.tempsensor.TemperatureData;
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

	@Override
	protected void handleExpiryOfTimer() {

		TemperatureData tempData = DummyTempSensor.getInstance().getData();

		TempStruct tempStruct = new TempStruct(tempData.getTempvalue(),
				tempData.getUnitOfMeasurement());
		settempMeasurement(tempStruct);

	}

}