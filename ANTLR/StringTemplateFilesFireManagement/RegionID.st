package $region.PackageName$;

import java.util.ArrayList;
import java.util.List;

public class RegionID { 
	
	$region.allRegions:{field |
	private $field.type$ $field.name; format="avoidCapital"$;  
	public $field.type$ get$field.name$() {
        return $field.name; format="avoidCapital"$;
    }     		
}$

public RegionID( $region.allRegions:{ param | $param.type.name$ $param.name$ }; separator=", "$) {
	super();
	$region.allRegions:{field | this.$field.name$ = $field.name$;}$	
}
	public boolean equals(Object obj) {
	RegionID other = (RegionID) obj;
	return $region.allRegions:{ field | 
		other.get$field.name$().equals(this.$field.name$)}; separator="&& "$;		
			
}

@Override
public int hashCode() {
	return $region.allRegions:{ field | $field.name$.hashCode()}; separator="+ "$;
				
}


public List<String> getAllRegionIDs() {
	ArrayList<String> allRegionIDs = new ArrayList<String>();
	$region.allRegions:{ field | allRegionIDs.add(get$field.name$());}$
	return allRegionIDs;
}

public RegionID(List<String> list) {
	this.HousingCommunity = list.get(0);
	this.House = list.get(1);	
	}   

}

