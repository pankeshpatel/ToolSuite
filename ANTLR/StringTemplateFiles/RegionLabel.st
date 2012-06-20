package fr.inria.arles.pankesh.gen.util;

import java.util.ArrayList;
import java.util.List;

public class RegionLabel { 
	
	$region.allRegions:{field |
	private $field.type$ $field.name; format="avoidCapital"$Label;  
	public $field.type$ get$field.name$Label() {
        return $field.name; format="avoidCapital"$Label;
    }     		
}$

public RegionLabel( $region.allRegions:{ param | $param.type.name$ $param.name$Label }; separator=", "$) {
	super();
	$region.allRegions:{field | this.$field.name$Label = $field.name$Label;}$	
}
	



public List<String> getAllRegionLabel() {
	ArrayList<String> allRegionLabels = new ArrayList<String>();
	$region.allRegions:{ field | allRegionLabels.add(get$field.name$Label());}$
	return allRegionLabels;
}

public RegionLabel(List<String> list) {
		 this.RoomLabel = list.get(0);
		 this.FloorLabel = list.get(1);
		 this.CenterLabel = list.get(2);		
	}

   

}

