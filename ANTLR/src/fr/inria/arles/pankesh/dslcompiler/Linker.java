package fr.inria.arles.pankesh.dslcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class Linker {

	public static void linkerAlgo(){
		File folder = new File(GlobalVariable.frameworkRootDir + GlobalVariable.deploymentFolderPath);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isDirectory()) {
				if (listOfFiles[i].getName().startsWith("PC")) {
					
					System.out.println("PC");
					copyDeviceDrivers("PC",listOfFiles[i].getName());
					copyFactory("PC",listOfFiles[i].getName());
					copyFramework("PC",listOfFiles[i].getName());
					copyLogic("PC",listOfFiles[i].getName());
					copyApplicationLogic("PC",listOfFiles[i].getName());
				
				} else{
					
					System.out.println("Android");
					copyDeviceDrivers("Android", listOfFiles[i].getName());
					copyFactory("Android",listOfFiles[i].getName());
					copyFramework("Android",listOfFiles[i].getName());
					copyLogic("Android",listOfFiles[i].getName());
					copyApplicationLogic("Android", listOfFiles[i].getName());
				}
			}
		}
	}
	
	public static void copyDeviceDrivers(String type , String name){
		 
    	File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + type + "/gen/deviceImpl" );
    	File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/gen/"  + "deviceImpl");
    	copyFiles(srcFolder, destFolder);
    	
	}
	
	public static void copyFactory(String type , String name){
    	
    	File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + type + "/gen/factory" );
    	File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/gen/"  + "factory");
    	copyFiles(srcFolder, destFolder);
    	
	}
	
	public static void copyFramework(String type , String name){
    	
    	File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "ApplicationLogic/gen/framework" );
    	File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/gen/"  + "framework");
    	copyFiles(srcFolder, destFolder);
    	
	}
	
	public static void copyLogic(String type , String name){
    	
    	File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "ApplicationLogic/gen/logic" );
    	File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/gen/"  + "logic");
    	copyFiles(srcFolder, destFolder);
    	
	}
	
	public static void copyApplicationLogic(String type , String name){
    	
    	File srcFolder = new File(GlobalVariable.frameworkRootDir + "/" + "ApplicationLogic/gen/logic");
    	File destFolder = new File(GlobalVariable.frameworkRootDir + "/" + GlobalVariable.deploymentFolderPath + "/" + name + "/gen/" + "logic" );
    	copyFiles(srcFolder, destFolder);

	}
	
	public static void copyFiles(File srcFolder,File destFolder){
    	//make sure source exists
    	if(!srcFolder.exists()){
 
           System.out.println("Directory does not exist.");
           //just exit
           System.exit(0);
 
        }else{
 
           try{
        	copyFolder(srcFolder,destFolder);
           }catch(IOException e){
        	e.printStackTrace();
        	//error, just exit
                System.exit(0);
           }
        }
 
    	//System.out.println("Done");

	}
	
	public static void copyFolder(File src, File dest) throws IOException{
	
	if(src.isDirectory()){
	
	//if directory not exists, create it
	if(!dest.exists()){
	   dest.mkdir();
	   //System.out.println("Directory copied from " 
	    //              + src + "  to " + dest);
	}
	
	//list all the directory contents
	String files[] = src.list();
	
	for (String file : files) {
	   //construct the src and dest file structure
	   File srcFile = new File(src, file);
	   File destFile = new File(dest, file);
	   //recursive copy
	   copyFolder(srcFile,destFile);
	}
	
	}else{
	//if file, then copy it
	//Use bytes stream to support all file types
	InputStream in = new FileInputStream(src);
	    OutputStream out = new FileOutputStream(dest); 
	
	    byte[] buffer = new byte[1024];
	
	    int length;
	    //copy the file content in bytes 
	    while ((length = in.read(buffer)) > 0){
		   out.write(buffer, 0, length);
	    }
	
	    in.close();
	    out.close();
	    //System.out.println("File copied from " + src + " to " + dest);
	}
	}
	
}
