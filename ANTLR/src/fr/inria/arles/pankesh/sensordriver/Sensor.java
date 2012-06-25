package fr.inria.arles.pankesh.sensordriver;

public interface Sensor {

	public abstract SensorData getData();

	public abstract void getData(SensorListener handler);

}
