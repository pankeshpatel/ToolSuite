package fr.inria.arles.pankesh.gen;



public class BadgeDisappearedStruct {    

    	private String badgeID;  
    	public String getbadgeID() {
            return badgeID;
        }    
        public void setbadgeID(String newValue) {
            this.badgeID = newValue;
        }			

    	private String badgeDisappearedTimeStamp;  
    	public String getbadgeDisappearedTimeStamp() {
            return badgeDisappearedTimeStamp;
        }    
        public void setbadgeDisappearedTimeStamp(String newValue) {
            this.badgeDisappearedTimeStamp = newValue;
        }			

  
	public BadgeDisappearedStruct (String badgeID, String badgeDisappearedTimeStamp) 
	{ 

		this.badgeID = badgeID;
		this.badgeDisappearedTimeStamp = badgeDisappearedTimeStamp;
    }
}