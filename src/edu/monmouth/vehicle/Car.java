package edu.monmouth.vehicle;

public class Car implements Vehicle {
    private PowerTypes powerType;
    private int engineSize;

    public Car(PowerTypes powerType, int engineSize) throws CarException {
        setPowerType(powerType);
        setEngineSize(engineSize);
    
    }

   
    
    public PowerTypes getPowerType() {
        return powerType;
    }

    
    public void setPowerType(PowerTypes powerType) {
        this.powerType = powerType;
    }

    
    public int getEngineSize() {
        return engineSize;
    }

    
    
    public void setEngineSize(int engineSize) throws CarException {
       
    	if (engineSize < VehicleConstants.MINENGINESIZE ||
            engineSize > VehicleConstants.MAXENGINESIZE) {
            throw new CarException("Engine size has to be between "
            + VehicleConstants.MINENGINESIZE + " and "+ VehicleConstants.MAXENGINESIZE + ".");
        
        }

        this.engineSize = engineSize;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Car [Power Type: " + powerType + ", Engine Size: " + engineSize + "]";
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}