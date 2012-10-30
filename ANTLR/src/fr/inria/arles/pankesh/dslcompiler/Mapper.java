package fr.inria.arles.pankesh.dslcompiler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.semanticmodel.Device;

public class Mapper {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void MapperAlgo(List<Device> deviceList,
			List<DeployementConstraint> mappingConstraintList)
			throws IOException {

		Map<Device, Set<String>> taskMapper = TaskMapper.mapTasks(deviceList,
				mappingConstraintList);

		for (Entry<Device, Set<String>> entry : taskMapper.entrySet()) {

			Device device = MergeDeviceAbilities(entry.getKey(),
					entry.getValue(), "DBServer");

			genearateDeviceCode(device);

		}

	}

	private static Device MergeDeviceAbilities(Device device,
			Set<String> swComponentName, String filterAbility) {

		List<String> forLoopAbilities = new ArrayList<String>();
		forLoopAbilities.addAll(device.getAbilities());
		forLoopAbilities.addAll(swComponentName);

		Set<String> resultAbilities = new HashSet<String>();

		for (String ab : forLoopAbilities) {
			if (ab.equals(filterAbility)) {
				// Do nothing...
			} else {
				resultAbilities.add(ab);
				resultAbilities.addAll(swComponentName);
			}
		}

		return new Device(device.getName(), device.getId(), device.getType(),
				device.getNetworkAddress(), device.getRegion(),
				device.getRegionLabels(), resultAbilities,
				device.getSoftwarePlatform());
	}

	private static void genearateDeviceCode(Device device) {
		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice
				.buildAbstractClassoFDevice(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

}
