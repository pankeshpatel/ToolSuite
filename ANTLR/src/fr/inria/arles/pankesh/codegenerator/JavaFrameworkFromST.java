package fr.inria.arles.pankesh.codegenerator;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.semanticmodel.ActuatorDriver;
import fr.inria.arles.pankesh.semanticmodel.ComputationalService;
import fr.inria.arles.pankesh.semanticmodel.Controller;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.semanticmodel.GUIDriver;
import fr.inria.arles.pankesh.semanticmodel.Regions;
import fr.inria.arles.pankesh.semanticmodel.SensorDriver;
import fr.inria.arles.pankesh.semanticmodel.SensorMeasurement;
import fr.inria.arles.pankesh.semanticmodel.StorageService;
import fr.inria.arles.pankesh.semanticmodel.Structure;

public class JavaFrameworkFromST {

	private StringTemplateGroup group = new StringTemplateGroup("myGroup", GlobalVariable.stringTemplatePath, DefaultTemplateLexer.class);

	// For Vocabulary Framework generation

	public CompilationUnit buildAbstractClassoFSensorDriver(SensorDriver sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("sensordriver");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + ".java", templateOfSensorDriver, "sensorDriver", "Future", sensorDriver);
	}

	public CompilationUnit buildAbstractClassoFSensor(SensorDriver sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("LSensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("Fake" + sensorDriver.getName() + ".java", templateOfSensorDriver, "Logic", "sensor", sensorDriver);
	}

	public CompilationUnit buildAbstractClassoFSensorInterface(SensorDriver sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("ISensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("I" + sensorDriver.getName() + ".java", templateOfSensorDriver, "Interface", "sensor", sensorDriver);
	}

	public CompilationUnit buildImploFSensorFactory(SensorDriver sensorDriver) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("implsensor");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit("Impl" + sensorDriver.getName() + ".java", templateOfSensorDriver, "ImplFactory", "sensor", sensorDriver);
	}

	public CompilationUnit buildAbstractClassoFSensorFactory(SensorDriver sensorDriver) {
		StringTemplate templateOfSensorDriver = group.getInstanceOf("sensorfactory");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorDriver);
		return new CompilationUnit(sensorDriver.getName() + "Factory" + ".java", templateOfSensorDriver, "Factory", "Sensor", sensorDriver);
	}

	public CompilationUnit buildAbstractClassoFSensorListener(SensorMeasurement sensorMeasurement) {

		StringTemplate templateOfSensorDriver = group.getInstanceOf("SensorListener");
		templateOfSensorDriver.setAttribute("SensorDriver", sensorMeasurement);
		return new CompilationUnit("Listener" + sensorMeasurement.getName() + ".java", templateOfSensorDriver, "Listener", "sensor", sensorMeasurement);

	}

	public CompilationUnit buildAbstractClassoFActuatorDriver(ActuatorDriver actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("actuatordriver");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + ".java", templateOfActuatorDriver, "actuatorDriver", "Future", actuatorDriver);
	}

	public CompilationUnit buildFactoryofActuator(ActuatorDriver actuatorDriver) {
		StringTemplate templateOfActuatorDriver = group.getInstanceOf("actuatorfactory");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit(actuatorDriver.getName() + "Factory" + ".java", templateOfActuatorDriver, "Factory", "Actuator", actuatorDriver);
	}

	public CompilationUnit buildActuatorInterface(ActuatorDriver actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("iactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("I" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "Interface", "actuator", actuatorDriver);
	}

	public CompilationUnit buildAbstractClassoFActuator(ActuatorDriver actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("LActuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Fake" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "Logic", "actuator", actuatorDriver);
	}

	public CompilationUnit buildImploFActuatorFactory(ActuatorDriver actuatorDriver) {

		StringTemplate templateOfActuatorDriver = group.getInstanceOf("implactuator");
		templateOfActuatorDriver.setAttribute("Actuatordriver", actuatorDriver);
		return new CompilationUnit("Impl" + actuatorDriver.getName() + ".java", templateOfActuatorDriver, "ImplFactory", "actuator", actuatorDriver);
	}

	public CompilationUnit buildAbstractClassoFGUIDriver(GUIDriver guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guidriver");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + ".java", templateOfGUIDriver, "guiDriver", "Future", guiDriver);
	}

	public CompilationUnit buildAbstractClassoFGUI(GUIDriver guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("LGUI");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Fake" + guiDriver.getName() + ".java", templateOfGUIDriver, "Logic", "gui", guiDriver);
	}

	public CompilationUnit buildFactoryofGUI(GUIDriver guiDriver) {
		StringTemplate templateOfGUIDriver = group.getInstanceOf("guifactory");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName() + "Factory" + ".java", templateOfGUIDriver, "Factory", "gui", guiDriver);
	}

	public CompilationUnit buildGUIInterface(GUIDriver guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("igui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("I" + guiDriver.getName() + ".java", templateOfGUIDriver, "Interface", "gui", guiDriver);
	}

	public CompilationUnit buildImploFGUIFactory(GUIDriver guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("implgui");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("Impl" + guiDriver.getName() + ".java", templateOfGUIDriver, "ImplFactory", "java", guiDriver);
	}

	public CompilationUnit buildGUILayout(GUIDriver guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guiLayout");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit(guiDriver.getName().toLowerCase() + "layout" + ".xml", templateOfGUIDriver, "androidgui", "layout", guiDriver);
	}

	public CompilationUnit buildGUIManifest(GUIDriver guiDriver) {

		StringTemplate templateOfGUIDriver = group.getInstanceOf("guiManifest");
		templateOfGUIDriver.setAttribute("GUIdriver", guiDriver);
		return new CompilationUnit("AndroidManifest.xml", templateOfGUIDriver, "androidgui", "manifest", guiDriver);
	}

	public CompilationUnit buildAbstractClassOFStorageService(StorageService storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("storageservice");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + ".java", templateOfStorageService, "storageService", "Future", storageService);
	}

	public CompilationUnit buildImploFStorageFactory(StorageService storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("implstorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("Impl" + storageService.getName() + ".java", templateOfStorageService, "ImplFactory", "actuator", storageService);
	}

	public CompilationUnit buildAbstractClassoFStorageFactory(StorageService storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("storagefactory");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit(storageService.getName() + "Factory" + ".java", templateOfStorageService, "Factory", "Future", storageService);
	}

	public CompilationUnit buildClassOFStorageInterface(StorageService storageService) {
		StringTemplate templateOfStorageService = group.getInstanceOf("storageinterface");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("I" + storageService.getName() + ".java", templateOfStorageService, "storageService", "Future", storageService);
	}

	public CompilationUnit buildAbstractClassOFStorage(StorageService storageService) {

		StringTemplate templateOfStorageService = group.getInstanceOf("LStorage");
		templateOfStorageService.setAttribute("Storageservice", storageService);
		return new CompilationUnit("Fake" + storageService.getName() + ".java", templateOfStorageService, "Logic", "storage", storageService);
	}

	public CompilationUnit buildAbstractClassOFRegion(Regions region, String className) {

		StringTemplate templateOfStructure = group.getInstanceOf(className);
		templateOfStructure.setAttribute("region", region);
		return new CompilationUnit(className + ".java", templateOfStructure, "Region", "Future", region);
	}

	/*
	 * This is used for architecture specification.
	 */

	public CompilationUnit buildAbstractClassoFCS(ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("cs");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit(computationalService.getName() + ".java", templateOfComputationalService, "computationalService", "Future", computationalService);
	}

	public CompilationUnit buildAbstractClassoFCSLogic(ComputationalService computationalService) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("LComputation");
		templateOfComputationalService.setAttribute("CS", computationalService);
		return new CompilationUnit("Fake" + computationalService.getName() + ".java", templateOfComputationalService, "Logic", "Future", computationalService);
	}

	public CompilationUnit buildAbstractClassoFController(Controller controller) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("controller");
		templateOfComputationalService.setAttribute("CS", controller);
		return new CompilationUnit(controller.getName() + ".java", templateOfComputationalService, "controller", "Future", controller);

	}

	public CompilationUnit buildAbstractClassoFControllerLogic(Controller controller) {

		StringTemplate templateOfComputationalService = group.getInstanceOf("LController");
		templateOfComputationalService.setAttribute("CS", controller);
		return new CompilationUnit("Fake" + controller.getName() + ".java", templateOfComputationalService, "Logic", "Future", controller);

	}

	public CompilationUnit buildAbstractClassOFStructure(Structure struct) {

		StringTemplate templateOfStructure = group.getInstanceOf("structure");
		templateOfStructure.setAttribute("struct", struct);
		return new CompilationUnit(struct.getName() + ".java", templateOfStructure, "structure", "Future", struct);
	}
	
	/*
	 * 
	 * This is end of  use for  Architecture specification
	 * 
	 * 
	 */
	
	
	
	

	public CompilationUnit buildClassoFStartup(Device device) {

		StringTemplate templateOfDevice = group.getInstanceOf("device");
		templateOfDevice.setAttribute("device", device);
		return new CompilationUnit("Startup" + ".java", templateOfDevice, "device", device.getName() , device);

	}

	public CompilationUnit buildClassoFExecution(Device device) {

		if (device.getType().equals("PC")) {

			StringTemplate templateOfDevice = group.getInstanceOf("deskexecution");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit(device.getName() + "Main" + ".java", templateOfDevice, "device", device.getName(), device);

		} else {

			StringTemplate templateOfDevice = group.getInstanceOf("androidexecution");
			templateOfDevice.setAttribute("device", device);
			return new CompilationUnit("MainActivity" + ".java", templateOfDevice, "device", device.getName(), device);

		}

	}

}
