package fr.inria.arles.pankesh.gen;



public class AvgTempStruct {    

    	private double avgTempValue;  
    	public double getavgTempValue() {
            return avgTempValue;
        }    
        public void setavgTempValue(double newValue) {
            this.avgTempValue = newValue;
        }			

    	private String unitOfMeasurement;  
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
        public void setunitOfMeasurement(String newValue) {
            this.unitOfMeasurement = newValue;
        }			

  
	public AvgTempStruct (double avgTempValue, String unitOfMeasurement) 
	{ 

		this.avgTempValue = avgTempValue;
		this.unitOfMeasurement = unitOfMeasurement;
    }
}