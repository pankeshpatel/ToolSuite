package util;

import java.util.ArrayList;
import java.util.List;

public class RegionID {

	private String Center;

	public String getCenter() {
		return Center;
	}

	private String Floor;

	public String getFloor() {
		return Floor;
	}

	private String Room;

	public String getRoom() {
		return Room;
	}

	public RegionID(String Center, String Floor, String Room) {
		super();
		this.Center = Center;
		this.Floor = Floor;
		this.Room = Room;
	}

	public boolean equals(Object obj) {
		RegionID other = (RegionID) obj;
		return other.getCenter().equals(this.Center)
				&& other.getFloor().equals(this.Floor)
				&& other.getRoom().equals(this.Room);

	}

	@Override
	public int hashCode() {
		return Center.hashCode() + Floor.hashCode() + Room.hashCode();

	}

	public List<String> getAllRegionIDs() {
		ArrayList<String> allRegionIDs = new ArrayList<String>();
		allRegionIDs.add(getCenter());
		allRegionIDs.add(getFloor());
		allRegionIDs.add(getRoom());
		return allRegionIDs;
	}

	public RegionID(List<String> list) {
		this.Room = list.get(2);
		this.Floor = list.get(1);
		this.Center = list.get(0);
	}

}