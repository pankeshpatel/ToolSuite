package fr.inria.arles.pankesh.sensordriver.tempsensor;

import fr.inria.arles.pankesh.sensordriver.SensorData;

public class TemperatureData extends SensorData {

	private double tempvalue;
	private String unitOfMeasurement;

	public TemperatureData(double tempValue, String unitOfMeasurement,
			long timestamp) {
		super(timestamp);
		this.tempvalue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public double getTempvalue() {
		return tempvalue;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

}
