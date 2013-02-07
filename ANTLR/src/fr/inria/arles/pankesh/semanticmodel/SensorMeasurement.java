package fr.inria.arles.pankesh.semanticmodel;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class SensorMeasurement extends Information {

	public SensorMeasurement(String name, DataType type) {
		super(name, type);

	}

	public DataType getDataType() {
		return type;
	}

	private String packageName;

	public String getPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

}