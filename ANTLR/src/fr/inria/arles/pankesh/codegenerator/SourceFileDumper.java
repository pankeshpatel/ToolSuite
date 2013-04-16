package fr.inria.arles.pankesh.codegenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class SourceFileDumper {

	private File file;

	public SourceFileDumper() {

	}

	// public void dump(CompilationUnit units) throws IOException {
	// dumpCompilationUnit(units);
	// }

	public void dumpCompilationUnit(CompilationUnit template) {
		try {
			
			if (GlobalVariable.activity.equals("generateDD")) {			
			   myGenerateCompilationUnit(template, GlobalVariable.devicePCType);
			   myGenerateCompilationUnit(template, GlobalVariable.deviceAndroidType);
			}
			
			if(GlobalVariable.activity.equals("generateAF")){
				
				myGenerateCompilationUnit(template, "ApplicationLogic");				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
			new RuntimeException(e);
		}
	}

	private void myGenerateCompilationUnit(CompilationUnit unit, String deviceType) throws IOException {

		String content = unit.toString();

		if ((unit.getType()).equals("device")) { 

			new File(GlobalVariable.outputDirPath + GlobalVariable.deviceDirPath + unit.getObjectName()).mkdirs();
			String dirName = GlobalVariable.outputDirPath + GlobalVariable.deviceDirPath + unit.getObjectName();

			File dir = new File(dirName);
			file = new File(dir, unit.getName());

		} else if (unit.getType().equals("Logic")) { 
			
			   new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.logicDirPath).mkdirs();
			   file = new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.logicDirPath + "/" + unit.getName());			
			

		} else if (unit.getType().equals("Factory")) { 
			
			if (deviceType.equals("ApplicationLogic")){
				 // Do not generate any Factory class in Architecture Specification
			}else {			
			new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.factoryDirPath).mkdirs();
			file = new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.factoryDirPath + "/" + unit.getName());
			}

		} else if (unit.getType().equals("ImplFactory")) { 
			
			if (deviceType.equals("ApplicationLogic")){
				
				//Do not generate any  Impl java class in Architecture specification.
				
			}else {
			      new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.deviceImplDirPath).mkdirs();
				  file = new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.deviceImplDirPath + "/" + unit.getName());
			}
		   
	
		//	else {

			 // new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.deviceImplDirPath).mkdirs();
			  //file = new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.deviceImplDirPath + "/" + unit.getName());
			
			//}
		}

		else if (unit.getType().equals("Region")) { 

			new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.utilDirPath).mkdirs();
			file = new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.utilDirPath + "/" + unit.getName());

		} else if (unit.getType().equals("androidgui")){
		  	
			if(deviceType.equals("Android")) {
				
			     if (unit.getObjectName().equals("manifest")) {			      
			    
			         file = new File(GlobalVariable.frameworkRootDir + deviceType + "/" + unit.getName());
			     }
			     if (unit.getObjectName().equals("layout")){    	 
			    
  	 
			    	 file = new File(GlobalVariable.frameworkRootDir + deviceType + "/res/layout/"  + unit.getName());
			     }
			} else {
				//DO not generate  xml files
			}	
		}		
		else { 
			
				
       			new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.frameworkDirPath).mkdirs();
		    	file = new File(GlobalVariable.frameworkRootDir + deviceType + GlobalVariable.outputDirPath + GlobalVariable.frameworkDirPath + "/" + unit.getName());
				
			
		}

		if ( file != null ) {
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(content);
		writer.flush();
		writer.close();
		System.out.println("Done! --- " + unit.getName());
		}

	}

}
