package fr.inria.arles.pankesh.semanticmodel;

import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.dslcompiler.Struct;

public class SensorMeasurement extends Information {

	public Struct data;

	public SensorMeasurement(String name, DataType type, Struct data) {
		super(name, type);
		this.data = data;

	}

	public DataType getDataType() {
		return type;
	}

	private String packageName;

	public String getPackageName() {

		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

}