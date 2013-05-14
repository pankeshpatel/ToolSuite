package fr.inria.arles.pankesh.dslcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import fr.inria.arles.pankesh.codegenerator.CompilationUnit;
import fr.inria.arles.pankesh.codegenerator.JavaFrameworkFromST;
import fr.inria.arles.pankesh.codegenerator.SourceFileDumper;
import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.semanticmodel.Device;

public class Mapper {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void MapperAlgo(List<Device> deviceList, List<DeployementConstraint> mappingConstraintList) throws IOException {

		Map<Device, Set<String>> taskMapper = TaskMapper.mapTasks(deviceList, mappingConstraintList);

		for (Entry<Device, Set<String>> entry : taskMapper.entrySet()) {

			Device device = MergeDeviceAbilities(entry.getKey(), entry.getValue(), "DBServer");

			multiplyTemplate(device);
			genearateStartupCode(device);
			genearateExecutionCode(device);
			genearateProjectFileCode(device);

			/*
			 * if(device.getType().equals("Android")){
			 * System.out.println("Abilities:>>>>" + device.getAbilities());
			 * generateDeviceManifest(device); }
			 */

		}
	}

	private static Device MergeDeviceAbilities(Device device, Set<String> swComponentName, String filterAbility) {

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

		return new Device(device.getName(), device.getType(), device.getNetworkAddress(), device.getRegion(), device.getRegionLabels(), resultAbilities, device.getMobileFlag());
	}

	public static void multiplyTemplate(Device unit) {

		if (unit.getType().equals("Android")) {
			System.out.println("Abilities:>>>>" + unit.getAbilities());
			generateDeviceManifest(unit);
		}

		// The following line take the template from the
		// GlobalVariable.frameworkRootDir
		File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "DeviceDrivers" + "/" + unit.getType());
		// File destFolder = new File(GlobalVariable.frameworkRootDir +
		// unit.getType() + "Device" + unit.getName());

		// The following line set the destination folder.
		new File(GlobalVariable.frameworkRootDir + GlobalVariable.deploymentFolderPath).mkdirs();
		File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + unit.getType() + unit.getName());

		// make sure source exists
		if (!srcFolder.exists()) {

			System.out.println("Directory does not exist.");
			// just exit
			System.exit(0);

		} else {

			try {
				copyFolder(srcFolder, destFolder);
			} catch (IOException e) {
				e.printStackTrace();
				// error, just exit
				System.exit(0);
			}
		}

	}

	public static void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				// System.out.println("Directory copied from "
				// + src + "  to " + dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			// System.out.println("File copied from " + src + " to " + dest);
		}
	}

	private static void genearateStartupCode(Device device) {
		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice.buildClassoFStartup(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

	private static void genearateExecutionCode(Device device) {
		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice.buildClassoFExecution(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

	private static void genearateProjectFileCode(Device device) {
		JavaFrameworkFromST generateDevice = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateDevice.buildClassoFProjectFile(device);
		SourceFileDumper dumpGeneratedDevice = new SourceFileDumper();
		dumpGeneratedDevice.dumpCompilationUnit(generatedCU);
	}

	private static void generateDeviceManifest(Device device) {
		JavaFrameworkFromST generatedGUIDriver = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedGUIDriver.buildDeviceManifest(device);
		SourceFileDumper dumpGeneratedGUIDriver = new SourceFileDumper();
		dumpGeneratedGUIDriver.dumpCompilationUnit(generatedCU);

	}

}
