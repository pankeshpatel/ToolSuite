package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.parser.antlr.Context;
import fr.inria.arles.pankesh.semanticmodel.Action;
import fr.inria.arles.pankesh.semanticmodel.Attribute;
import fr.inria.arles.pankesh.semanticmodel.Command;
import fr.inria.arles.pankesh.semanticmodel.DataAccess;
import fr.inria.arles.pankesh.semanticmodel.DataType;
import fr.inria.arles.pankesh.semanticmodel.GUIDriver;
import fr.inria.arles.pankesh.semanticmodel.Information;
import fr.inria.arles.pankesh.semanticmodel.Parameter;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;

public class GUI {

	private GUIDriver guiDriver;
	private Set<Action> actions = new HashSet<Action>();
	private Set<Command> commands = new HashSet<Command>();
	private Parameter parameter;
	private Set<Information> generatedInfo = new HashSet<Information>();
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private String GUIName;
	private String struct;

	public GUI() {

	}

	public String getGUIName() {
		return GUIName;
	}

	public void setGUIName(String computationalServiceName) {
		this.GUIName = computationalServiceName;
	}

	public void createGUIObject() {
		guiDriver = new GUIDriver(getGUIName(), getActionList(), getCommandList(),
				getAttributeSet(), generatedInfo, null, getDataAccessList(), getRequestType() );
	}

	// Code generator of the abstract classes and Logic files

	public void generateCode() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.buildAbstractClassoFGUIDriver(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
		generateGUI(); // This function call will create a partial Logic
						// files
		generateGUIInterface(); // This function call will create Interface of
								// GUI.
		generateGUIFactory();

		generateGUIFactoryImpl();

	}

	private void generateGUIFactoryImpl() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.buildImploFGUIFactory(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateGUIFactory() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.buildFactoryofGUI(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateGUIInterface() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.buildGUIInterface(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	public void generateGUI() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver
				.buildAbstractClassoFGUI(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	public String getDatafromSymblTable(String variableName) {
		return Context.getSymblTableData(variableName);
	}

	public void getDataAccessListFromSymblTable(String dataAccessStr) {
		this.dataAccessList = Context.getDataAccessSymblTable(dataAccessStr);
	}

	public Set<DataAccess> getDataAccessList() {
		return dataAccessList;
	}
	
	public void setRequestType(String struct){
		this.struct=struct;
	}
	
	public String getRequestType(){
		return struct;
	}

	// Getter and Setter of Command

	public void addCommand(String actionName) {
		Command command = new Command(actionName, getParameters());
		commands.add(command);
	}

	private Set<Command> getCommandList() {
		return commands;
	}

	// Getter and Setter of Parameters
	private Parameter getParameters() {
		return parameter;
	}

	public void addParameter(String parameterName) {
		parameter = new Parameter(parameterName, new DataType(
				getDatafromSymblTable(parameterName)));
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
		Action action = new Action(actionName, getParameter());
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
