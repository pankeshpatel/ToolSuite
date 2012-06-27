package util;

import java.util.List;

public class DSConvert {

	public static RegionID convertListToObj(List<String> regionLabels) {

		int i = 0;

		String HousingCommunity = regionLabels.get(i);
		i = i + 1;

		String House = regionLabels.get(i);
		i = i + 1;

		return new RegionID(HousingCommunity, House);

	}

}