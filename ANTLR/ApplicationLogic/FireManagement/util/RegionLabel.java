package util;

import java.util.ArrayList;
import java.util.List;

public class RegionLabel {

	private String HousingCommunityLabel;

	public String getHousingCommunityLabel() {
		return HousingCommunityLabel;
	}

	private String HouseLabel;

	public String getHouseLabel() {
		return HouseLabel;
	}

	public RegionLabel(String HousingCommunityLabel, String HouseLabel) {
		super();
		this.HousingCommunityLabel = HousingCommunityLabel;
		this.HouseLabel = HouseLabel;
	}

	public List<String> getAllRegionLabel() {
		ArrayList<String> allRegionLabels = new ArrayList<String>();
		allRegionLabels.add(getHousingCommunityLabel());
		allRegionLabels.add(getHouseLabel());
		return allRegionLabels;
	}

	public RegionLabel(List<String> list) {
		this.HousingCommunityLabel = list.get(0);
		this.HouseLabel = list.get(1);
	}

}