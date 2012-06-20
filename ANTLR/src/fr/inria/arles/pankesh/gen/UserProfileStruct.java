package fr.inria.arles.pankesh.gen;



public class UserProfileStruct {    

    	private String badgeID;  
    	public String getbadgeID() {
            return badgeID;
        }    
        public void setbadgeID(String newValue) {
            this.badgeID = newValue;
        }			

    	private double tempPref;  
    	public double gettempPref() {
            return tempPref;
        }    
        public void settempPref(double newValue) {
            this.tempPref = newValue;
        }			

  
	public UserProfileStruct (String badgeID, double tempPref) 
	{ 

		this.badgeID = badgeID;
		this.tempPref = tempPref;
    }
}