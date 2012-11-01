package fr.inria.arles.pankesh.codegenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class SourceFileDumper {

	private File file;

	public SourceFileDumper() {

	}

	public void dump(CompilationUnit units) throws IOException {
		dumpCompilationUnit(units);
	}

	public void dumpCompilationUnit(CompilationUnit template) {
		try {
			myGenerateCompilationUnit(template);
		} catch (IOException e) {
			e.printStackTrace();
			new RuntimeException(e);
		}
	}

	private void myGenerateCompilationUnit(CompilationUnit unit)
			throws IOException {

		String content = unit.toString();

		if ((unit.getType()).equals("device")) {

			/*
			 * new File("./src/fr/inria/arles/pankesh/gen/sim/device" +
			 * unit.getObjectName()).mkdir(); String dirName =
			 * "./src/fr/inria/arles/pankesh/gen/sim/device" +
			 * unit.getObjectName();
			 */

			new File(GlobalVariable.outputDirPath
					+ GlobalVariable.deviceDirPath + unit.getObjectName())
					.mkdirs();
			String dirName = GlobalVariable.outputDirPath
					+ GlobalVariable.deviceDirPath + unit.getObjectName();

			File dir = new File(dirName);
			file = new File(dir, unit.getName());

		} else if (unit.getType().equals("Logic")) {

			// new File("./src/fr/inria/arles/pankesh/gen/logic").mkdir();
			/*
			 * file = new File("./src/fr/inria/arles/pankesh/gen/logic/" +
			 * unit.getName());
			 */

			new File(GlobalVariable.outputDirPath + GlobalVariable.logicDirPath)
					.mkdirs();
			file = new File(GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/" + unit.getName());

		} else if (unit.getType().equals("Factory")) {

			new File(GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();

			file = new File(GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/" + unit.getName());

		} else if (unit.getType().equals("ImplFactory")) {
			
			new File(GlobalVariable.outputDirPath
			 +  GlobalVariable.deviceImplDirPath).mkdirs();
			
			file = new File(GlobalVariable.outputDirPath
			     + GlobalVariable.deviceImplDirPath + "/" + unit.getName());			
		}
		
		else if (unit.getType().equals("Region")) {

			// new File("./src/fr/inria/arles/pankesh/gen/util").mkdir();
			/*
			 * file = new File("./src/fr/inria/arles/pankesh/gen/util/" +
			 * unit.getName());
			 */

			new File(GlobalVariable.outputDirPath + GlobalVariable.utilDirPath)
					.mkdirs();
			file = new File(GlobalVariable.outputDirPath
					+ GlobalVariable.utilDirPath + "/" + unit.getName());
		} else {
			// new File("./src/fr/inria/arles/pankesh/gen").mkdir();
			/*
			 * file = new File("./src/fr/inria/arles/pankesh/gen/" +
			 * unit.getName());
			 */
			new File(GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath).mkdirs();
			file = new File(GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath + "/" + unit.getName());

		}

		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(content);
		writer.flush();
		writer.close();
		System.out.println("Done! --- " + unit.getName());

	}

}
