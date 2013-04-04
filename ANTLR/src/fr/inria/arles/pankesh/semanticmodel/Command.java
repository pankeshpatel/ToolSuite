package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.List;



public class Command {

	private String name;
	private Parameter parameters;

	public Command(String name, Parameter parameters) {
		super();
		this.name = name;
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}

	public Parameter getParameters() {
		return parameters;
	}

	public List<Parameter> getAllParameter() {
		ArrayList<Parameter> allParameters = new ArrayList<Parameter>();
		allParameters.add(getParameters());
		return allParameters;
	}

	public boolean isParameter() {
		if (parameters != null)
			return true;
		else
			return false;
	}

}
