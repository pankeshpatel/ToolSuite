package fr.inria.arles.pankesh.gen;



public class BadgeDetectedStruct {    

    	private String badgeID;  
    	public String getbadgeID() {
            return badgeID;
        }    
        public void setbadgeID(String newValue) {
            this.badgeID = newValue;
        }			

    	private String badgeDetectedTimeStamp;  
    	public String getbadgeDetectedTimeStamp() {
            return badgeDetectedTimeStamp;
        }    
        public void setbadgeDetectedTimeStamp(String newValue) {
            this.badgeDetectedTimeStamp = newValue;
        }			

  
	public BadgeDetectedStruct (String badgeID, String badgeDetectedTimeStamp) 
	{ 

		this.badgeID = badgeID;
		this.badgeDetectedTimeStamp = badgeDetectedTimeStamp;
    }
}