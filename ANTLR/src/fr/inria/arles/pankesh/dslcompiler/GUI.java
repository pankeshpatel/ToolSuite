package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.common.GlobalVariable;
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
import fr.inria.arles.pankesh.semanticmodel.Widget;

public class GUI {

	private GUIDriver guiDriver;
	private Set<Action> actions = new HashSet<Action>();
	private Set<Command> commands = new HashSet<Command>();
	private Parameter actionParameter;
	private Parameter commandParameter;
	private Set<Information> generatedInfo = new HashSet<Information>();
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private String GUIName;
	private String struct;
	private Widget widget;

	public GUI() {

	}

	public String getGUIName() {
		return GUIName;
	}

	public String getLowerCaseGUIName() {
		return GUIName.toLowerCase();
	}

	public void setGUIName(String computationalServiceName) {
		this.GUIName = computationalServiceName;
	}

	public void createGUIObject() {
		guiDriver = new GUIDriver(getGUIName(), getLowerCaseGUIName(), getActionList(), getCommandList(), getAttributeSet(), generatedInfo, null, getDataAccessList(), getRequestType(), getReqWidget());
	}

	// Code generator of the abstract classes and Logic files

	public void generateCode() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildAbstractClassoFGUIDriver(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

		if (GlobalVariable.activity.equals("generateDD")) {

			generateGUI(); // This function call will create a partial Logic
							// files
			generateGUIInterface(); // This function call will create Interface
									// of
									// GUI.
			generateGUIFactory();

			generateGUIFactoryImpl();

			generateGUILayout();
			generateGUIManifest();
		}

	}

	private void generateGUIFactoryImpl() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildImploFGUIFactory(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateGUIFactory() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildFactoryofGUI(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);
	}

	private void generateGUIInterface() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildGUIInterface(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateGUILayout() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildGUILayout(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	private void generateGUIManifest() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildGUIManifest(guiDriver);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

	public void generateGUI() {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildAbstractClassoFGUI(guiDriver);
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

	public void setRequestType(String struct) {
		this.struct = struct;
	}

	public String getRequestType() {
		return struct;
	}

	// Getter and Setter of Command

	public void addCommand(String actionName, Widget widget) {
		Command command = new Command(actionName, getCommandParameter(), widget);
		commands.add(command);
	}

	private Set<Command> getCommandList() {
		return commands;
	}

	// Getter and Setter of Action Parameters
	private Parameter getActionParameter() {
		return actionParameter;
	}

	public void addActionParameter(String parameterName, String parameterType) {
		actionParameter = new Parameter(parameterName, new DataType(parameterType));
	}

	// Getter and Setter of Command Parameters

	public void addCommandParameter(String parameterName) {
		commandParameter = new Parameter(parameterName, new DataType(getDatafromSymblTable(parameterName)));
	}

	public Parameter getCommandParameter() {
		return commandParameter;
	}

	// Getter and Setter of Action
	public void addAction(String actionName, String widgetName) {
		Action action = new Action(actionName, getActionParameter(), widgetName);
		actions.add(action);
	}

	private Set<Action> getActionList() {
		return actions;
	}

	// Getter and Setter of Attribute

	private Set<Attribute> attributeSet = new HashSet<Attribute>();

	public void addAttribute(String fieldName, String fieldType) {
		Attribute attribute = new Attribute(fieldName, new PrimitiveType(fieldType));
		attributeSet.add(attribute);
	}

	public Set<Attribute> getAttributeSet() {
		return attributeSet;
	}

	public void setReqWidget(String textbox, String button, String textview) {
		widget = new Widget(textbox, button, textview);
	}

	public Widget getReqWidget() {

		return widget;
	}

}
