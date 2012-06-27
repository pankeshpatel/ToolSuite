package util;

import java.util.List;

public class DSConvert {

  public static RegionID convertListToObj(List<String> regionLabels) {

    int i = 0;
    

        String Center = regionLabels.get(i);
        i=i + 1;   

        String Floor = regionLabels.get(i);
        i=i + 1;   

        String Room = regionLabels.get(i);
        i=i + 1;   

    
     return new RegionID(Center , Floor , Room );
    

  }

}