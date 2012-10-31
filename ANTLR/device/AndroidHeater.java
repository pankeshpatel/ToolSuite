package fr.inria.arles.pankesh.device;

import framework.IHeater;
import framework.TempStruct;

public class AndroidHeater implements IHeater {

	@Override
	public void Off() {
		System.out.println("<<<<<<Off() is called>>>>>>");

	}

	@Override
	public void SetTemp(TempStruct setTemp) {
		System.out.println("<<<<<<<SetTemp() method is called>>>>>>>");

	}

}
