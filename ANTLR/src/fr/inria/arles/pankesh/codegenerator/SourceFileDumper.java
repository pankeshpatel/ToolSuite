package fr.inria.arles.pankesh.codegenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class SourceFileDumper {

	private File file;

	public SourceFileDumper() {

	}

//	public void dump(CompilationUnit units) throws IOException {
//		dumpCompilationUnit(units);
//	}

	public void dumpCompilationUnit(CompilationUnit template) {
		try {
			myGenerateCompilationUnit(template, "PC");
		    myGenerateCompilationUnit(template, "Android");
		} catch (IOException e) {
			e.printStackTrace();
			new RuntimeException(e);
		}
	}

	private void myGenerateCompilationUnit(CompilationUnit unit, String deviceType)
			throws IOException {

		String content = unit.toString();

		if ((unit.getType()).equals("device")) {  // No need to separate this for vocabulary framework
			
			new File(GlobalVariable.outputDirPath
					+ GlobalVariable.deviceDirPath + unit.getObjectName())
					.mkdirs();
			String dirName = GlobalVariable.outputDirPath
					+ GlobalVariable.deviceDirPath + unit.getObjectName();

			File dir = new File(dirName);
			file = new File(dir, unit.getName());

		} else if (unit.getType().equals("Logic")) {  //  I have to separate this  for Vocabulary framework

			new File( GlobalVariable.frameworkRootDir +  deviceType + GlobalVariable.outputDirPath + GlobalVariable.logicDirPath)
					.mkdirs();
			file = new File( GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath
					+ GlobalVariable.logicDirPath + "/" + unit.getName());

		} else if (unit.getType().equals("Factory")) {  // This would be  okay for generating Vocabulary framework

			new File( GlobalVariable.frameworkRootDir +  deviceType + GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath).mkdirs();

			file = new File( GlobalVariable.frameworkRootDir +  deviceType + GlobalVariable.outputDirPath
					+ GlobalVariable.factoryDirPath + "/" + unit.getName());

		} else if (unit.getType().equals("ImplFactory")) {  // This would be  okay for generating Vocabulary framework
			
			new File( GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath
			 +  GlobalVariable.deviceImplDirPath).mkdirs();
			
			file = new File( GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath
			     + GlobalVariable.deviceImplDirPath + "/" + unit.getName());			
		}
		
		else if (unit.getType().equals("Region")) {  // This would be okay for generating 


			new File( GlobalVariable.frameworkRootDir +  deviceType + GlobalVariable.outputDirPath + GlobalVariable.utilDirPath)
					.mkdirs();
			file = new File( GlobalVariable.frameworkRootDir +  deviceType + GlobalVariable.outputDirPath
					+ GlobalVariable.utilDirPath + "/" + unit.getName());
			
		}
		
		else {     // I have to separate this for Vocabulary framework.
			
			new File( GlobalVariable.frameworkRootDir +  deviceType + GlobalVariable.outputDirPath
					+ GlobalVariable.frameworkDirPath).mkdirs();
			file = new File( GlobalVariable.frameworkRootDir + deviceType  + GlobalVariable.outputDirPath
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
