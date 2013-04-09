package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;


import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.parser.antlr.Context;
import fr.inria.arles.pankesh.semanticmodel.Action;
import fr.inria.arles.pankesh.semanticmodel.Attribute;
import fr.inria.arles.pankesh.semanticmodel.Controller;
import fr.inria.arles.pankesh.semanticmodel.DataType;
import fr.inria.arles.pankesh.semanticmodel.Information;
import fr.inria.arles.pankesh.semanticmodel.Parameter;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;

public class ControllerService {

	// private Information information;
	private Controller controller;

	private Set<Information> consumedInfo = new HashSet<Information>();
	private Set<Action> actions = new HashSet<Action>();
	private String partitionAttributeValue;
	private Parameter parameter;

	private String controllerName;

	public ControllerService() {
	}

	public String getControllerName() {
		return controllerName;
	}

	public void setControllerName(String controllerName) {
		this.controllerName = controllerName;
	}

	public void createCSObject() {
		controller = new Controller(getControllerName(), getAttributeSet(),
				getActionList(), getConsumedInfo(), getPartitionAttributeVal());
	}

	// Next two function generates abstract file and Logic files.
	public void generateCode() {
		JavaFrameworkFromST generatedController = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedController
				.buildAbstractClassoFController(controller);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
		genearteControllerLogicCode(); // This function call will generate
										// partial Logic files
	}

	public void genearteControllerLogicCode() {
		JavaFrameworkFromST generatedController = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedController
				.buildAbstractClassoFControllerLogic(controller);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	// Getter and Setter of Partition attribute

	public void setPartitionAttribute(String regionName) {
		this.partitionAttributeValue = regionName;
	}

	public String getPartitionAttributeVal() {
		return partitionAttributeValue;
	}

	// Getter and Setter of Command

	public void addCommand(String actionName) {
		Action action = new Action(actionName, getParameters(),null);
		actions.add(action);
	}

	// Getter and Setter of Parameters
	private Parameter getParameters() {
		return parameter;
	}

	public void addParameter(String parameterName) {
		parameter = new Parameter(parameterName, new DataType(
				getDatafromSymblTable(parameterName)));
	}

	public String getDatafromSymblTable(String variableName) {
		return Context.getSymblTableData(variableName);
	}

	private Set<Action> getActionList() {
		return actions;
	}

	// Getter and Setter of Consumed Information

	public Set<Information> getConsumedInfo() {
		return consumedInfo;
	}

	public void addConsumedInfo(String variableName) {
		consumedInfo.add(new Information(variableName, new DataType(
				getDatafromSymblTable(variableName))));
	}

	// Getter and Setter of Attribute

	private Set<Attribute> attributeSet = new HashSet<Attribute>();

	public Set<Attribute> getAttributeSet() {
		return attributeSet;
	}

	public void addAttribute(String fieldName, String fieldType) {
		Attribute attribute = new Attribute(fieldName, new PrimitiveType(
				fieldType));
		attributeSet.add(attribute);
	}

}
