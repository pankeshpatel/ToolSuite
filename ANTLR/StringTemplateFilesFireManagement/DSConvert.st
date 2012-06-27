package $region.PackageName$;

import java.util.List;

public class DSConvert {

  public static RegionID convertListToObj(List<String> regionLabels) {

    int i = 0;
    
    $region.allRegions:{field |
    $field.type$ $field.name; format="avoidCapital"$ = regionLabels.get(i);
    i=i + 1;   
}$
    
     return new RegionID($region.allRegions:{ param | $param.name$ }; separator=", "$);
    

  }

}
