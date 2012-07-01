//package fr.inria.arles.pankesh.gen;

package framework;

public class TempStruct {    

    	private double tempValue;  
    	public double gettempValue() {
            return tempValue;
        }    
     			

    	private String unitOfMeasurement;  
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
     			

  
	public TempStruct (double tempValue, String unitOfMeasurement) 
	{ 

		this.tempValue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
    }
}