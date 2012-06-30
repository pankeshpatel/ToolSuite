package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class Device {

	private String name;
	private String id;
	private String type;
	private String networkAddress;
	// private RegionID region;
	// private RegionLabel regionLabel;

	private List<String> regionIDs = new ArrayList<String>();
	private List<String> regionLabels = new ArrayList<String>();

	private Set<String> abilities = new HashSet<String>();

	public Device(String name, String id, String type, String networkAddress,
			List<String> regionIDs, List<String> regionLabels,
			Set<String> abilities) {

		this.name = name;
		this.id = id;
		this.type = type;
		this.networkAddress = networkAddress;
		this.regionIDs = regionIDs;
		this.regionLabels = regionLabels;
		// this.region = region;
		// this.regionLabel = regionLabel;
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

	/*
	 * public RegionLabel getRegionLabels() { return regionLabel; }
	 * 
	 * public RegionID getRegion() { return region; }
	 */
	public List<String> getRegionLabels() {
		return regionLabels;
	}

	public List<String> getRegion() {
		return regionIDs;
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
