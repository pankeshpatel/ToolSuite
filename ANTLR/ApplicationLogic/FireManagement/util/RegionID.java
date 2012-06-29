package util;

import java.util.ArrayList;
import java.util.List;

public class RegionID {

	private String HousingCommunity;

	public String getHousingCommunity() {
		return HousingCommunity;
	}

	private String House;

	public String getHouse() {
		return House;
	}

	public RegionID(String HousingCommunity, String House) {
		super();
		this.HousingCommunity = HousingCommunity;
		this.House = House;
	}

	public boolean equals(Object obj) {
		RegionID other = (RegionID) obj;
		return other.getHousingCommunity().equals(this.HousingCommunity)
				&& other.getHouse().equals(this.House);

	}

	@Override
	public int hashCode() {
		return HousingCommunity.hashCode() + House.hashCode();

	}

	public List<String> getAllRegionIDs() {
		ArrayList<String> allRegionIDs = new ArrayList<String>();
		allRegionIDs.add(getHousingCommunity());
		allRegionIDs.add(getHouse());
		return allRegionIDs;
	}

	public RegionID(List<String> list) {
		this.HousingCommunity = list.get(0);
		this.House = list.get(1);
	}

}