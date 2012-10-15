package fr.inria.arles.pankesh.codegenerator;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.semanticmodel.ActuatorDriver;
import fr.inria.arles.pankesh.semanticmodel.ComputationalService;
import fr.inria.arles.pankesh.semanticmodel.Controller;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.semanticmodel.Regions;
import fr.inria.arles.pankesh.semanticmodel.SensorDriver;
import fr.inria.arles.pankesh.semanticmodel.SensorMeasurement;
import fr.inria.arles.pankesh.semanticmodel.StorageService;
import fr.inria.arles.pankesh.semanticmodel.Structure;

public class JavaFrameworkFromST {

	/*
	 * private StringTemplateGroup group = new StringTemplateGroup("myGroup",
	 * "./StringTemplateFiles/", DefaultTemplateLexer.class);
	 */

	private StringTemplateGroup group = new StringTemplateGroup("myGroup",
			GlobalVariable.stringTemplatePath, DefaultTemplateLexer.class);

	public CompilationUnit buildAbstractClassoFSensorDriver(
			SensorDriver sensorDriver) {

		StringTemplate templateOfSensorDriver = group
				.getInstanceOf("sensordriver");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + ".java",
				templateOfSensorDriver, "sensorDriver", "Future");
	}

	public CompilationUnit buildAbstractClassoFSensor(SensorDriver sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("LSensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("Fake" + sensorDriver.getName() + ".java",
				templateOfSensorDriver, "Logic", "sensor");
	}
	
	public CompilationUnit buildAbstractClassoFSensorInterface (SensorDriver sensorDriver){
		
		StringTemplate templateOfSensorDriver = group.getInstanceOf("ISensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);		
		return new CompilationUnit("I" + sensorDriver.getName() + ".java", 
				templateOfSensorDriver, "Interface", "sensor");		
	}
	
	public CompilationUnit buildAbstractClassoFSensorListener(SensorMeasurement sensorMeasurement){
		
		StringTemplate templateOfSensorDriver = group.getInstanceOf("SensorListener");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorMeasurement);		
		return new CompilationUnit( "Listener" + sensorMeasurement.getName()  + ".java",
					templateOfSensorDriver, "Listener" , "sensor" );
		
	}
	
	
	

	public CompilationUnit buildAbstractClassoFActuatorDriver(
			ActuatorDriver actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("actuatordriver");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + ".java",
				templateOfActuatorDriver, "actuatorDriver", "Future");
	}

	public CompilationUnit buildAbstractClassoFActuator(
			ActuatorDriver actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group
				.getInstanceOf("LActuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Fake" + actuatorDriver.getName() + ".java",
				templateOfActuatorDriver, "Logic", "actuator");
	}

	public CompilationUnit buildAbstractClassOFStorageService(
			StorageService storageService) {

		StringTemplate templateOfStorageService = group
				.getInstanceOf("storageservice");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + ".java",
				templateOfStorageService, "storageService", "Future");
	}
	
	public CompilationUnit buildClassOFStorageInterface(StorageService storageService){
		StringTemplate templateOfStorageService = group.getInstanceOf("storageinterface");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("I" + storageService.getName() + ".java", 
				templateOfStorageService, "storageService", "Future");
	}

	public CompilationUnit buildAbstractClassOFStorage(
			StorageService storageService) {

		StringTemplate templateOfStorageService = group
				.getInstanceOf("LStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("Fake" + storageService.getName() + ".java",
				templateOfStorageService, "Logic", "storage");
	}

	public CompilationUnit buildAbstractClassoFCS(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("cs");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit(computationalService.getName() + ".java",
				templateOfComputationalService, "computationalService",
				"Future");
	}

	public CompilationUnit buildAbstractClassoFCSLogic(
			ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("LComputation");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit("Fake" + computationalService.getName()
				+ ".java", templateOfComputationalService, "Logic", "Future");
	}

	public CompilationUnit buildAbstractClassoFController(Controller controller) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("controller");
		templateOfComputationalService.setAttribute("CS", controller);
		return new CompilationUnit(controller.getName() + ".java",
				templateOfComputationalService, "controller", "Future");

	}

	public CompilationUnit buildAbstractClassoFControllerLogic(
			Controller controller) {

		StringTemplate templateOfComputationalService = group
				.getInstanceOf("LController");
		templateOfComputationalService.setAttribute("CS", controller);
		return new CompilationUnit("Fake" + controller.getName() + ".java",
				templateOfComputationalService, "Logic", "Future");

	}

	public CompilationUnit buildAbstractClassOFStructure(Structure struct) {

		StringTemplate templateOfStructure = group.getInstanceOf("structure");
		templateOfStructure.setAttribute("struct", struct);
		return new CompilationUnit(struct.getName() + ".java",
				templateOfStructure, "structure", "Future");
	}

	public CompilationUnit buildAbstractClassoFDevice(Device device) {

		StringTemplate templateOfDevice = group.getInstanceOf("device");
		templateOfDevice.setAttribute("device", device);
		return new CompilationUnit("Startup" + ".java", templateOfDevice,
				"device", device.getName());
	}

	public CompilationUnit buildAbstractClassOFRegion(Regions region,
			String className) {

		StringTemplate templateOfStructure = group.getInstanceOf(className);
		templateOfStructure.setAttribute("region", region);
		return new CompilationUnit(className + ".java", templateOfStructure,
				"Region", "Future");
	}

}
