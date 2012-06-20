package fr.inria.arles.pankesh.semanticmodel;

public class SensorMeasurement extends Information {

	public SensorMeasurement(String name, DataType type) {
		super(name, type);

	}

	public DataType getDataType() {
		return type;
	}

}