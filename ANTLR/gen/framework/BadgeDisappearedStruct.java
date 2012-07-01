//package fr.inria.arles.pankesh.gen;

package framework;

public class BadgeDisappearedStruct {    

    	private String badgeID;  
    	public String getbadgeID() {
            return badgeID;
        }    
     			

    	private long timeStamp;  
    	public long gettimeStamp() {
            return timeStamp;
        }    
     			

  
	public BadgeDisappearedStruct (String badgeID, long timeStamp) 
	{ 

		this.badgeID = badgeID;
		this.timeStamp = timeStamp;
    }
}