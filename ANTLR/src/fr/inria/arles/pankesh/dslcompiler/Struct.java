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

	public Struct() {
	}

	public Struct(String structName) {
		createdStructure = new Structure(structName, getStructFieldSet());
	}

	/*
	 * public Structure createStructure(String structName) { createdStructure =
	 * new Structure(structName, getStructFieldSet());
	 * generateStructCode(createdStructure); return createdStructure; } public
	 * void generateStructCode(Structure struct) { JavaFrameworkFromST
	 * generatedStruct = new JavaFrameworkFromST(); CompilationUnit generatedCU
	 * = generatedStruct .buildAbstractClassOFStructure(struct);
	 * SourceFileDumper dumpGeneratedStruct = new SourceFileDumper();
	 * dumpGeneratedStruct.dumpCompilationUnit(generatedCU); }
	 */

	// Add new field to current structure
	public void addField(String fieldName, String fieldType) {
		StructField Field = new StructField(fieldName, new PrimitiveType(
				fieldType));
		StructFieldSet.add(Field);
	}

	// Generate code after all the fields have been parsed
	public void generateCode() {
		JavaFrameworkFromST generatedStruct = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStruct
				.buildAbstractClassOFStructure(createdStructure);
		SourceFileDumper dumpGeneratedStruct = new SourceFileDumper();
		dumpGeneratedStruct.dumpCompilationUnit(generatedCU);
	}

	public List<StructField> getStructFieldSet() {
		return StructFieldSet;
	}

}
