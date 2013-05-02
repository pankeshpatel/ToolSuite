package fr.inria.arles.pankesh.codegenerator;

import org.antlr.stringtemplate.StringTemplate;

import fr.inria.arles.pankesh.semanticmodel.Device;

public class CompilationUnit {

	private final String fileName;
	private final StringTemplate template;
	private final String type;
	private final String objectName;
	private Object myObj;

	public CompilationUnit(String fileName, StringTemplate template, String type, String objectName, Object obj) {
		super();
		this.fileName = fileName;
		this.template = template;
		this.type = type;
		this.objectName = objectName;
		this.myObj = obj;
	}

	public Device geObjectInside() {
		return (Device) myObj;
	}

	public String getObjectName() {
		return objectName;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return fileName;
	}

	@Override
	public String toString() {
		return template.toString();
	}

	public String getFileName() {
		return fileName;
	}

}
