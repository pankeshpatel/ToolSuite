package util;

import java.util.ArrayList;
import java.util.List;

public class RegionID { 
	

		private String Room;  
		public String getRoom() {
	        return Room;
	    }     		

		private String Floor;  
		public String getFloor() {
	        return Floor;
	    }     		

		private String Center;  
		public String getCenter() {
	        return Center;
	    }     		


public RegionID( String Room , String Floor , String Center ) {
	super();
	this.Room = Room;this.Floor = Floor;this.Center = Center;	
}
	public boolean equals(Object obj) {
	RegionID other = (RegionID) obj;
	return 
		other.getRoom().equals(this.Room)&& 
		other.getFloor().equals(this.Floor)&& 
		other.getCenter().equals(this.Center);		
			
}

@Override
public int hashCode() {
	return Room.hashCode()+ Floor.hashCode()+ Center.hashCode();
				
}


public List<String> getAllRegionIDs() {
	ArrayList<String> allRegionIDs = new ArrayList<String>();
	allRegionIDs.add(getRoom());allRegionIDs.add(getFloor());allRegionIDs.add(getCenter());
	return allRegionIDs;
}

public RegionID(List<String> list) {
		 this.Room = list.get(0);
		 this.Floor = list.get(1);
		 this.Center = list.get(2);		
	}



   

}