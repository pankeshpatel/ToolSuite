package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.List;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class Regions {

	private List<RegionFields> fields = new ArrayList<RegionFields>();

	public Regions(List<RegionFields> fields) {
		this.fields = fields;

	}

	private List<RegionFields> getFields() {
		return fields;

	}

	public List<RegionFields> getAllRegions() {
		ArrayList<RegionFields> allregionFields = new ArrayList<RegionFields>();
		allregionFields.addAll(getFields());
		return allregionFields;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}

}
