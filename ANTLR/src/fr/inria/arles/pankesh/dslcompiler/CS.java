package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.parser.antlr.Context;
import fr.inria.arles.pankesh.semanticmodel.Attribute;
import fr.inria.arles.pankesh.semanticmodel.ComputationalService;
import fr.inria.arles.pankesh.semanticmodel.DataAccess;
import fr.inria.arles.pankesh.semanticmodel.DataType;
import fr.inria.arles.pankesh.semanticmodel.Information;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;

public class CS {

	private ComputationalService computationalService;
	private Set<Information> generatedInfo = new HashSet<Information>();
	private Set<Information> consumedInfo = new HashSet<Information>();
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private String partitionAttributeValue;
	private String computationalServiceName;

	public CS() {
	}

	public String getComputationalServiceName() {
		return computationalServiceName;
	}

	public void setComputationalServiceName(String computationalServiceName) {
		this.computationalServiceName = computationalServiceName;
	}

	public void createCSObject() {
		computationalService = new ComputationalService(getComputationalServiceName(), getAttributeSet(), getGeneratedInfo(), getConsumedInfo(), getDataAccessList(), getPartitionAttributeVal());
	}

	// Code generator of abstract files and Logic files

	public void generateCode() {
		
		if(GlobalVariable.activity.equals("generateAF")) {
		
		  JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		  CompilationUnit generatedCU = generatedComputationalService.buildAbstractClassoFCS(computationalService);
		  SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		  dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
		  generateComputationalLogicCode(); // This function call will generate
											// partial file of Logic files
		}	
		
	}

	public void generateComputationalLogicCode() {
		JavaFrameworkFromST generatedComputationalService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedComputationalService.buildAbstractClassoFCSLogic(computationalService);
		SourceFileDumper dumpGeneratedComputationalService = new SourceFileDumper();
		dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
	}

	/*
	 * public void dataAccess(Information query, Information generatedInfo) {
	 * DataAccess dataAccess = new DataAccess(query, generatedInfo);
	 * dataAccessList.add(dataAccess); }
	 */

	public Set<DataAccess> getDataAccessList() {
		return dataAccessList;
	}

	public void getDataAccessListFromSymblTable(String dataAccessStr) {
		this.dataAccessList = Context.getDataAccessSymblTable(dataAccessStr);
	}

	// Getter and Setter of Partition Attribute
	public void addPartitionAttribute(String regionName) {
		partitionAttributeValue = regionName;

	}

	public String getPartitionAttributeVal() {
		return partitionAttributeValue;
	}

	// Getter and Setter of Consumed Info

	public Set<Information> getConsumedInfo() {
		return consumedInfo;
	}

	public void addConsumedInfo(String variableName) {
		consumedInfo.add(new Information(variableName, new DataType(getDatafromSymblTable(variableName))));
	}

	public String getDatafromSymblTable(String variableName) {
		return Context.getSymblTableData(variableName);
	}

	// Getter and setter of Generated Info
	public Set<Information> getGeneratedInfo() {
		return generatedInfo;
	}

	public void addGeneratedInfo(String variableName, String variableType) {
		generatedInfo.add(new Information(variableName, new DataType(variableType)));
	}

	// Getter and Setter of Attribute
	private Set<Attribute> attributeSet = new HashSet<Attribute>();

	public Set<Attribute> getAttributeSet() {
		return attributeSet;
	}

	public void addAttribute(String fieldName, String fieldType) {
		Attribute attribute = new Attribute(fieldName, new PrimitiveType(fieldType));
		attributeSet.add(attribute);
	}
}