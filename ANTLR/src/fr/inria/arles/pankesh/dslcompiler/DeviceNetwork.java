package fr.inria.arles.pankesh.dslcompiler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.inria.arles.pankesh.parser.antlr.Context;
import fr.inria.arles.pankesh.semanticmodel.Device;

public class DeviceNetwork {

	private Device device;
	private Set<String> deviceAbilities = new HashSet<String>();
	private List<String> regionLabels = new ArrayList<String>();
	private List<String> regionValue = new ArrayList<String>();
	private String deviceID;
	private String deviceType;
	private String networkAddress;
	private String deviceName;
	private String softwarePlatform;

	private List<Device> deviceList = new ArrayList<Device>();

	public DeviceNetwork() {
	}

	public void addDeviceObj() {

		device = new Device(getDeviceName(), getDeviceID(), getDeviceType(),
				getNetworkAddress(), getRegionValues(), getRegionLabel(),
				deviceAbilities, softwarePlatform);

		Context.addDeviceinSymblTable(device);

	}

	// Getter and Setter of Software Platform

	public void setSoftwarePlatform(String softwarePlatform) {
		this.softwarePlatform = softwarePlatform;
	}

	public String getSoftwarePlatform() {
		return softwarePlatform;
	}

	// Getter and Setter of DeviceName
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	// Getter and setter of DeviceID
	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	// Getter and Setter of DeviceType

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	// Getter and Setter of NetworkAddress

	public String getNetworkAddress() {
		return networkAddress;
	}

	public void setNetworkAddress(String networkAddress) {
		this.networkAddress = networkAddress;
	}

	// Getter and Setter Region Type

	public void addRegionValue(String value) {
		regionValue.add(value);
	}

	public List<String> getRegionValues() {
		return regionValue;
	}

	// Getter and Setter of RegionLabels

	public void addRegionLabel(String regionLabel) {
		regionLabels.add(regionLabel);
	}

	public List<String> getRegionLabel() {
		return regionLabels;
	}

	// Getter and Setter of Device Abilities

	public void addDeviceAbilities(String deviceAbilitiesStr) {

		this.deviceAbilities.add(deviceAbilitiesStr);

	}

	public Set<String> getDeviceAbilities() {
		return deviceAbilities;
	}

	// Getter and setter Region Label

	public Device getDevice() {
		return device;
	}

	public List<String> getRegionLabels() {
		return regionLabels;
	}

	public List<String> getRegionValue() {
		return regionValue;
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

}
