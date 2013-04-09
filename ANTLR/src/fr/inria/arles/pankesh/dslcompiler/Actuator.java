package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.semanticmodel.Action;
import fr.inria.arles.pankesh.semanticmodel.ActuatorDriver;
import fr.inria.arles.pankesh.semanticmodel.Attribute;
import fr.inria.arles.pankesh.semanticmodel.DataType;
import fr.inria.arles.pankesh.semanticmodel.Parameter;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;

public class Actuator {

	private ActuatorDriver actuatorDriver;
	private Set<Action> actions = new HashSet<Action>();
	private Parameter parameter;

	public Actuator() {

	}

	public Actuator(String actuatorName) {
		actuatorDriver = new ActuatorDriver(actuatorName, getActionList(),
				getAttributeSet(), null, null);
	}

	// Code generator of the abstract classes and Logic files

	public void generateCode() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.buildAbstractClassoFActuatorDriver(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
		generateActuator(); // This function call will create a partial Logic
							// files
		generateActuatorInterface(); // This function call will create Interface of Actuator.		
		generateActuatorFactory();
		
		generateActuatorFactoryImpl();
		
	//	generateGUIActuator();
		
	}

	private void generateActuatorFactoryImpl() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver.buildImploFActuatorFactory(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);	
		
	}

	private void generateActuatorFactory() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver.buildFactoryofActuator(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);		
	}

	private void generateActuatorInterface() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver.buildActuatorInterface(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);
		
	}

	public void generateActuator() {
		JavaFrameworkFromST generatedActuatorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedActuatorDriver
				.buildAbstractClassoFActuator(actuatorDriver);
		SourceFileDumper dumpGeneratedActuatorDriver = new SourceFileDumper();
		dumpGeneratedActuatorDriver.dumpCompilationUnit(generatedCU);

	}

	// Getter and Setter of Parameters

	public void addParameter(String parameterName, String parameterType) {
		parameter = new Parameter(parameterName, new DataType(parameterType));
	}

	public Parameter getParameter() {
		return parameter;
	}

	// Getter and Setter of Action
	public void addAction(String actionName) {
		Action action = new Action(actionName, getParameter(), null);
		actions.add(action);
	}

	private Set<Action> getActionList() {
		return actions;
	}

	// Getter and Setter of Attribute

	private Set<Attribute> attributeSet = new HashSet<Attribute>();

	public void addAttribute(String fieldName, String fieldType) {
		Attribute attribute = new Attribute(fieldName, new PrimitiveType(
				fieldType));
		attributeSet.add(attribute);
	}

	public Set<Attribute> getAttributeSet() {
		return attributeSet;
	}

}
