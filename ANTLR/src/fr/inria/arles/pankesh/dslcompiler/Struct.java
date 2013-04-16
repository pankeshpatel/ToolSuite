package fr.inria.arles.pankesh.dslcompiler;

import java.util.ArrayList;
import java.util.List;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;
import fr.inria.arles.pankesh.semanticmodel.StructField;
import fr.inria.arles.pankesh.semanticmodel.Structure;

public class Struct {

	private Structure createdStructure;
	private List<StructField> StructFieldSet = new ArrayList<StructField>();
	private String structName;

	public Struct() {
	}

	public Struct(String structName) {
		this.structName = structName;
		createdStructure = new Structure(structName, getStructFieldSet());
	}

	// Add new field to current structure
	public void addField(String fieldName, String fieldType) {
		StructField Field = new StructField(fieldName, new PrimitiveType(fieldType));
		StructFieldSet.add(Field);
	}

	// Generate code after all the fields have been parsed
	public void generateCode() {
		JavaFrameworkFromST generatedStruct = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStruct.buildAbstractClassOFStructure(createdStructure);
		SourceFileDumper dumpGeneratedStruct = new SourceFileDumper();
		dumpGeneratedStruct.dumpCompilationUnit(generatedCU);
	}

	public List<StructField> getStructFieldSet() {
		return StructFieldSet;
	}

	public String getStructName() {
		return structName;
	}

}
