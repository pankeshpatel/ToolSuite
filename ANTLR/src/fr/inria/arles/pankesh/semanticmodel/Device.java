package fr.inria.arles.pankesh.semanticmodel;

import java.util.HashSet;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;

import util.RegionID;
import util.RegionLabel;

public class Device {

	private String name;
	private String id;
	private String type;
	private String networkAddress;
	private RegionID region;
	private RegionLabel regionLabel;

	private Set<String> abilities = new HashSet<String>();

	public Device(String name, String id, String type, String networkAddress,
			RegionID region, RegionLabel regionLabel, Set<String> abilities) {

		this.name = name;
		this.id = id;
		this.type = type;
		this.networkAddress = networkAddress;
		this.region = region;
		this.regionLabel = regionLabel;
		this.abilities = abilities;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getNetworkAddress() {
		return networkAddress;
	}

	public RegionLabel getRegionLabels() {
		return regionLabel;
	}

	public RegionID getRegion() {
		return region;
	}

	public Set<String> getAbilities() {
		return abilities;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceDirPath) + getName();
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getUtilPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}

}
