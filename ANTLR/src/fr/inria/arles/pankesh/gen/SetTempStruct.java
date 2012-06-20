package fr.inria.arles.pankesh.gen;



public class SetTempStruct {    

    	private double setTemp;  
    	public double getsetTemp() {
            return setTemp;
        }    
        public void setsetTemp(double newValue) {
            this.setTemp = newValue;
        }			

    	private String unitOfMeasurement;  
    	public String getunitOfMeasurement() {
            return unitOfMeasurement;
        }    
        public void setunitOfMeasurement(String newValue) {
            this.unitOfMeasurement = newValue;
        }			

  
	public SetTempStruct (double setTemp, String unitOfMeasurement) 
	{ 

		this.setTemp = setTemp;
		this.unitOfMeasurement = unitOfMeasurement;
    }
}