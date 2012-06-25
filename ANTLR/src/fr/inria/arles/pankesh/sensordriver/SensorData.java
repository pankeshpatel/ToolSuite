package fr.inria.arles.pankesh.sensordriver;

public abstract class SensorData {

	public final long timestamp;

	protected SensorData(long timestamp) {
		this.timestamp = timestamp;
	}

	public long getTimestamp() {
		return timestamp;
	}

}
