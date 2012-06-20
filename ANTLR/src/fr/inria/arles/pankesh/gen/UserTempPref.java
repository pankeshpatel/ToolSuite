package fr.inria.arles.pankesh.gen;



public class UserTempPref {    

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

    	private double accuracy;  
    	public double getaccuracy() {
            return accuracy;
        }    
        public void setaccuracy(double newValue) {
            this.accuracy = newValue;
        }			

  
	public UserTempPref (double tempValue, String unitOfMeasurement, double accuracy) 
	{ 

		this.tempValue = tempValue;
		this.unitOfMeasurement = unitOfMeasurement;
		this.accuracy = accuracy;
    }
}