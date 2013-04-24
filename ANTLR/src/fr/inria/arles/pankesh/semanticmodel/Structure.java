package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.List;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class Structure extends DataType {

	private List<StructField> fields = new ArrayList<StructField>();

	public Structure(String name, List<StructField> fields) {
		super(name);
		this.fields = fields;

	}

	public List<StructField> getFields() {
		return fields;
	}

	public List<StructField> getAllStructFields() {
		ArrayList<StructField> allStructFields = new ArrayList<StructField>();
		allStructFields.addAll(getFields());
		return allStructFields;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

}
