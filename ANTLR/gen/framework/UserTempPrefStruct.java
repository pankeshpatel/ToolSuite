//package fr.inria.arles.pankesh.gen;

package framework;

public class UserTempPrefStruct {    

    	private double tempValue;  
    	public double gettempValue() {
            return tempValue;
        }    
     			

    	private String unitOfMeasurement;  
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
     			

    	private long timeStamp;  
    	public long gettimeStamp() {
            return timeStamp;
        }    
     			

  
	public UserTempPrefStruct (double tempValue, String unitOfMeasurement, long timeStamp) 
	{ 

		this.tempValue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
		this.timeStamp = timeStamp;
    }
}