package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;


import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.parser.antlr.Context;
import fr.inria.arles.pankesh.semanticmodel.Attribute;
import fr.inria.arles.pankesh.semanticmodel.DataAccess;
import fr.inria.arles.pankesh.semanticmodel.DataType;
import fr.inria.arles.pankesh.semanticmodel.Information;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;
import fr.inria.arles.pankesh.semanticmodel.StorageService;

public class Storage {

	private StorageService storageService;
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private Information queryIndex;
	private Information generatedInfo;
	private String storageServiceName;

	public Storage() {

	}

	public String getStorageServiceName() {
		return storageServiceName;
	}

	public void setStorageServiceName(String storageServiceName) {
		this.storageServiceName = storageServiceName;
	}

	public void createStorageObject() {
		storageService = new StorageService(getStorageServiceName(),
				getAttributeSet(), getDataAccessList(), null);
	}

	// Next two functions generate abstract class and partial logic files.
	public void generateCode() {
		JavaFrameworkFromST generatedStorageService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStorageService
				.buildAbstractClassOFStorageService(storageService);
		SourceFileDumper dumpGeneratedStorageService = new SourceFileDumper();
		dumpGeneratedStorageService.dumpCompilationUnit(generatedCU);
		generateStorage(); // This function call will generate partial logic
							// file of storage
		generateStorageInterface(); // This function will generate
									// StorageService Interface.

		generateStorageFactory(); // This function will generate StorageService
									// Interface.
		generateStorageImplFactory();
		
	}

	private void generateStorageImplFactory() {
		JavaFrameworkFromST generateStorageFactory = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageFactory.buildImploFStorageFactory(storageService);
		SourceFileDumper dumpGeneratedStorageFactory = new SourceFileDumper();
		dumpGeneratedStorageFactory.dumpCompilationUnit(generatedCU);		
	}

	private void generateStorageFactory() {
		JavaFrameworkFromST generateStorageFactory = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageFactory
				.buildAbstractClassoFStorageFactory(storageService);
		SourceFileDumper dumpGeneratedStorageFactory = new SourceFileDumper();
		dumpGeneratedStorageFactory.dumpCompilationUnit(generatedCU);
	}

	private void generateStorageInterface() {
		JavaFrameworkFromST generateStorageInterface = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageInterface
				.buildClassOFStorageInterface(storageService);
		SourceFileDumper dumpGeneratedStorageInterface = new SourceFileDumper();
		dumpGeneratedStorageInterface.dumpCompilationUnit(generatedCU);

	}

	private void generateStorage() {
		JavaFrameworkFromST generatedStorageService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStorageService
				.buildAbstractClassOFStorage(storageService);
		SourceFileDumper dumpGeneratedStorageService = new SourceFileDumper();
		dumpGeneratedStorageService.dumpCompilationUnit(generatedCU);
	}

	// Getter and Setter of Data Access List

	public Set<DataAccess> getDataAccessList() {
		return dataAccessList;
	}

	public void addDataAccess() {
		DataAccess dataAccess = new DataAccess(getDataAccessIndex(),
				getGeneratedInfo());
		dataAccessList.add(dataAccess);
		Context.constructDataAccessSymblTable(getGeneratedInfo().getName(),
				dataAccessList);

	}

	// getter and Setter of generatedInfo

	public void addGeneratedInfo(String variableName, String variableType) {
		generatedInfo = new Information(variableName,
				new DataType(variableType));
	}

	public Information getGeneratedInfo() {
		return generatedInfo;
	}

	// Getter and Setter of DataAccessIndex

	public void addDataAccessIndex(String variableName, String variableType) {
		queryIndex = new Information(variableName, new DataType(variableType));
	}

	public Information getDataAccessIndex() {
		return queryIndex;
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
