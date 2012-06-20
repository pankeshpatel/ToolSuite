package fr.inria.arles.pankesh.dslcompiler;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.semanticmodel.Attribute;
import fr.inria.arles.pankesh.semanticmodel.DataType;
import fr.inria.arles.pankesh.semanticmodel.PrimitiveType;
import fr.inria.arles.pankesh.semanticmodel.SensorDriver;
import fr.inria.arles.pankesh.semanticmodel.SensorMeasurement;

public class Sensor {

	private SensorDriver sensorDriver;

	private Set<SensorMeasurement> generatedInfo = new HashSet<SensorMeasurement>();

	public Sensor() {}

	public Sensor(String sensorName) {
		sensorDriver = new SensorDriver(sensorName, getAttributeSet(),
				getGeneratedInfo(), null);
	}	

	// This function generates logic file of Sensor
	public void generateSensorCode() {
		JavaFrameworkFromST generateSensor = new JavaFrameworkFromST();
		CompilationUnit generateCU = generateSensor
				.buildAbstractClassoFSensor(sensorDriver);
		SourceFileDumper dumpGenerateSensor = new SourceFileDumper();
		dumpGenerateSensor.dumpCompilationUnit(generateCU);

	}

	public void generateCode() {
		JavaFrameworkFromST generatedSensorDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedSensorDriver
				.buildAbstractClassoFSensorDriver(sensorDriver);
		SourceFileDumper dumpGeneratedSensorDriver = new SourceFileDumper();
		dumpGeneratedSensorDriver.dumpCompilationUnit(generatedCU);
		generateSensorCode();
	}

	// Getter and Setter of GeneratedInfo

	public Set<SensorMeasurement> getGeneratedInfo() {
		return generatedInfo;
	}

	public void addSensorMeasurement(String measurementName,
			String measurementStruct) {
		SensorMeasurement sensorMeasurement = new SensorMeasurement(
				measurementName, new DataType(measurementStruct));
		generatedInfo.add(sensorMeasurement);
	}

	// Getter and setter of Attribute
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
