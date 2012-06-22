package util;

import java.util.ArrayList;
import java.util.List;

public class RegionLabel {

	private String CenterLabel;

	public String getCenterLabel() {
		return CenterLabel;
	}

	private String FloorLabel;

	public String getFloorLabel() {
		return FloorLabel;
	}

	private String RoomLabel;

	public String getRoomLabel() {
		return RoomLabel;
	}

	public RegionLabel(String CenterLabel, String FloorLabel, String RoomLabel) {
		super();
		this.CenterLabel = CenterLabel;
		this.FloorLabel = FloorLabel;
		this.RoomLabel = RoomLabel;
	}

	public List<String> getAllRegionLabel() {
		ArrayList<String> allRegionLabels = new ArrayList<String>();
		allRegionLabels.add(getCenterLabel());
		allRegionLabels.add(getFloorLabel());
		allRegionLabels.add(getRoomLabel());
		return allRegionLabels;
	}

	public RegionLabel(List<String> list) {
		this.RoomLabel = list.get(2);
		this.FloorLabel = list.get(1);
		this.CenterLabel = list.get(0);
	}

}