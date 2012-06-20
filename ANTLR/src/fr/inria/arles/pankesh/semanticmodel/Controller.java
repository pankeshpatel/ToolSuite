package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class Controller extends SoftwareComponent {

	private Set<Action> actions = new HashSet<Action>();

	public Controller(String name, Set<Attribute> attributes,
			Set<Action> actions, Set<Information> consumeInfo,
			String partitionAttributeValue) {
		super(name, attributes, null, consumeInfo, partitionAttributeValue);
		this.actions = actions;
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
	public String getPackageName(){
		packageName =  GlobalVariable.convertPathTopackage(GlobalVariable.frameworkDirPath);	
		return packageName;		
	}
	
	public String getLogicPackageName(){
		packageName =  GlobalVariable.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;		
	}
	
	public String getUtilPackageName(){
		packageName = GlobalVariable.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}

}
