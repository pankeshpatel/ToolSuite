package util;

import java.util.ArrayList;
import java.util.List;

public class RegionLabel { 
	

		private String RoomLabel;  
		public String getRoomLabel() {
	        return RoomLabel;
	    }     		

		private String FloorLabel;  
		public String getFloorLabel() {
	        return FloorLabel;
	    }     		

		private String CenterLabel;  
		public String getCenterLabel() {
	        return CenterLabel;
	    }     		


public RegionLabel( String RoomLabel , String FloorLabel , String CenterLabel ) {
	super();
	this.RoomLabel = RoomLabel;this.FloorLabel = FloorLabel;this.CenterLabel = CenterLabel;	
}
	



public List<String> getAllRegionLabel() {
	ArrayList<String> allRegionLabels = new ArrayList<String>();
	allRegionLabels.add(getRoomLabel());allRegionLabels.add(getFloorLabel());allRegionLabels.add(getCenterLabel());
	return allRegionLabels;
}

public RegionLabel(List<String> list) {
		 this.RoomLabel = list.get(0);
		 this.FloorLabel = list.get(1);
		 this.CenterLabel = list.get(2);		
	}

   

}