package fr.inria.arles.pankesh.semanticmodel;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class SensorDriver extends SoftwareComponent<SensorMeasurement> {

	protected static Set<SensorDriver> allSensorDriver = new HashSet<SensorDriver>();

	public SensorDriver(String name, Set<Attribute> attributes,
			Set<SensorMeasurement> generateInfo,
			Set<SensorMeasurement> consumeInfo) {
		super(name, attributes, generateInfo, consumeInfo, "NoInstance");

	}

	private String packageName;

	public String getPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getFactoryPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;

	}

}
