package fr.inria.arles.pankesh.sensordriver.dummydevice;

import fr.inria.arles.pankesh.sensordriver.SensorListener;
import fr.inria.arles.pankesh.sensordriver.tempsensor.TemperatureData;
import fr.inria.arles.pankesh.sensordriver.tempsensor.TemperatureSensor;

public class DummyTempSensor implements TemperatureSensor {

	static DummyTempSensor singletonInstance;

	public static DummyTempSensor getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new DummyTempSensor();
		}
		return singletonInstance;
	}

	@Override
	public void getData(SensorListener handler) {
		// TODO Auto-generated method stub

	}

	@Override
	public TemperatureData getData() {
		long timestamp = ((long) (System.currentTimeMillis())) * 1000000;

		double tempValue = (Math.random() * 100.0d);

		return new TemperatureData(tempValue, "C", timestamp);
	}

}
