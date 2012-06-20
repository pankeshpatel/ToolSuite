package fr.inria.arles.pankesh.parser.antlr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.inria.arles.pankesh.dslcompiler.Actuator;
import fr.inria.arles.pankesh.dslcompiler.CS;
import fr.inria.arles.pankesh.dslcompiler.ControllerService;
import fr.inria.arles.pankesh.dslcompiler.DeployementConstraint;
import fr.inria.arles.pankesh.dslcompiler.DeviceNetwork;
import fr.inria.arles.pankesh.dslcompiler.MappingConstraint;
import fr.inria.arles.pankesh.dslcompiler.RegionsGenerator;
import fr.inria.arles.pankesh.dslcompiler.Sensor;
import fr.inria.arles.pankesh.dslcompiler.Storage;
import fr.inria.arles.pankesh.dslcompiler.Struct;
import fr.inria.arles.pankesh.semanticmodel.Device;

/**
 * Context with complete symbols table
 * 
 * @author Lisong GUO
 * @date 8 June 2012
 * 
 */
public class Context {

	public static Map<String, String> symblTable = new HashMap<String, String>();

	public static List<Device> deviceList = new ArrayList<Device>();

	public static List<DeployementConstraint> deploymentConstraintsList = new ArrayList<DeployementConstraint>();

	// Getter and Setter of DeploymentConstrinstsSymblTable

	public static void addDeploymentConstraints(DeployementConstraint dc) {
		deploymentConstraintsList.add(dc);
	}

	public static List<DeployementConstraint> getDeploymentConstrainsList() {
		return deploymentConstraintsList;
	}

	// Getter and Setter of DeviceSymblTable

	public static void addDeviceinSymblTable(Device deviceObj) {
		deviceList.add(deviceObj);
	}

	public static List<Device> getDeviceList() {
		return deviceList;
	}

	public static String getSymblTableData(String variableName) {
		return symblTable.get(variableName);
	}

	public static void constructSymbTable(String variableName,
			String variableType) {

		if (symblTable.containsKey(variableName)) {

			// Set<SensorMeasurement> tempSet = symblTable.get(structName);
			// tempSet.add(s);
		} else { // If SymblTable does not have varaibleName, then add element
			symblTable.put(variableName, variableType);
		}
	}

	// Cursor to current structure
	public Struct currentStruct;

	public Sensor currentSensor;

	public Actuator currentActuator;

	public Storage currentStorageService;

	public CS currentComputationalService;

	public ControllerService currentController;

	public RegionsGenerator currentRegion;

	public DeviceNetwork currentNetwork;

	public MappingConstraint currentMappingConstraint;

	public Context() {

	}

}
