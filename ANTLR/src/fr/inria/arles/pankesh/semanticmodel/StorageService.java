package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import fr.inria.arles.pankesh.common.GlobalVariable;

public class StorageService extends SoftwareComponent {

	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();

	public StorageService(String name, Set<Attribute> attributes,
			Set<DataAccess> dataAccess, Set<Information> consumeInfo) {
		super(name, attributes, null, null, "NoInstance");

		this.dataAccess = dataAccess;

	}

	public Set<DataAccess> getDataAccess() {
		return dataAccess;
	}

	public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
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
	
		public String getDeviceImplPackageName(){
		
		packageName  = GlobalVariable.convertPathTopackage(GlobalVariable.deviceImplDirPath);
		return packageName;		
	}

}
