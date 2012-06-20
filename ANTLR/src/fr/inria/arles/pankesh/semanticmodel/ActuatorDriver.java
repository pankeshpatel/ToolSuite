package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class ActuatorDriver extends SoftwareComponent<Information> {

	private Set<Action> actions = new HashSet<Action>();

	public ActuatorDriver(String name, Set<Action> actionsList,
			Set<Attribute> attributes, Set<Information> generateInfo,
			Set<Information> consumeInfo) {
		super(name, attributes, generateInfo, consumeInfo, "NoInstance");
		this.actions = actionsList;
	}

	public Set<Action> getActions() {
		return actions;
	}

	public List<Action> getAllActions() {
		ArrayList<Action> allGeneratedInfo = new ArrayList<Action>();
		allGeneratedInfo.addAll(getActions());
		return allGeneratedInfo;
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


}
