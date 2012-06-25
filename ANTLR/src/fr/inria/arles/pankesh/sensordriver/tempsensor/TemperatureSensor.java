package fr.inria.arles.pankesh.sensordriver.tempsensor;

import fr.inria.arles.pankesh.sensordriver.Sensor;

public abstract interface TemperatureSensor extends Sensor {

	public abstract TemperatureData getData();

	// public abstract void getData(TemperatureListener handler);

}
