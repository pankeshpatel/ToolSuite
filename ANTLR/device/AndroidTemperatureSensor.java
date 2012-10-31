package fr.inria.arles.pankesh.device;

import framework.ITemperatureSensor;
import framework.ListenertempMeasurement;
import framework.TempStruct;

public class AndroidTemperatureSensor implements ITemperatureSensor {

	@Override
	public TempStruct gettempMeasurement() {
		return new TempStruct(25, "C");
	}

	@Override
	public void gettempMeasurement(ListenertempMeasurement handler) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEventDriven() {
		// TODO Auto-generated method stub
		return false;
	}

}
