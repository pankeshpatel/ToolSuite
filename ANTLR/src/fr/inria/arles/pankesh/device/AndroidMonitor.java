package fr.inria.arles.pankesh.device;

import framework.IMonitor;
import framework.TempStruct;

public class AndroidMonitor implements IMonitor {

	@Override
	public void Display(TempStruct arg) {
		System.out.println("<<<<<<<<<Display() is called>>>>>>>");

	}

}
