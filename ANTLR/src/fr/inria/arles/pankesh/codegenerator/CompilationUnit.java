package fr.inria.arles.pankesh.codegenerator;

import org.antlr.stringtemplate.StringTemplate;

public class CompilationUnit {

	private final String fileName;
	private final StringTemplate template;
	private final String type;
	private final String objectName;

	public CompilationUnit(String fileName, StringTemplate template, String type, String objectName) {
		super();
		this.fileName = fileName;
		this.template = template;
		this.type = type;
		this.objectName = objectName;

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

}
