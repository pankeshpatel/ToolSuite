package fr.inria.arles.pankesh.gen;



public class TempStruct {    

    	private double tempValue;  
    	public double gettempValue() {
            return tempValue;
        }    
        public void settempValue(double newValue) {
            this.tempValue = newValue;
        }			

    	private String unitOfMeasurement;  
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
        public void setunitOfMeasurement(String newValue) {
            this.unitOfMeasurement = newValue;
        }			

  
	public TempStruct (double tempValue, String unitOfMeasurement) 
	{ 

		this.tempValue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
    }
}