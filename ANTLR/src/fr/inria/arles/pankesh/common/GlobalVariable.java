package fr.inria.arles.pankesh.common;

public class GlobalVariable {

	public static String vocabSpec;
	public static String archSpec;
	public static String networkSpec;
	
	public static String frameworkRootDir;
	
	
	public static String frameworkDirPath = "/framework";
	public static String outputDirPath = "./gen";
	public static String logicDirPath = "/logic";
	public static String deviceDirPath = "/sim/device";
	public static String utilDirPath = "/util";
	public static String factoryDirPath = "/factory";
	public static String deviceImplDirPath = "/deviceImpl";
	public static String stringTemplatePath;
	public static String activity;
	

	/*
	 * public static String convertPathTopackage(String pathName) {
	 * 
	 * return pathName.substring(pathName.lastIndexOf("/") + 1); }
	 */

	public static String convertPathTopackage(String pathName) {

		String modifiedPathName;

		if (pathName.substring(0, 1).equals(".")
				|| pathName.substring(0, 1).equals(".")) {
			modifiedPathName = pathName.substring(2).replace("/", ".");
		} else {
			modifiedPathName = pathName.replace("/", ".").substring(1);
		}

		return modifiedPathName;
	}

}
