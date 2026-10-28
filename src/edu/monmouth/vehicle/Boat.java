package edu.monmouth.vehicle;

public class Boat implements Vehicle {
    private PowerTypes powerType;
    private int boatLength;

    
    public Boat(PowerTypes powerType, int boatLength) throws BoatException {
        setPowerType(powerType);
        setBoatLength(boatLength);
    }

    
    public PowerTypes getPowerType() {
        return powerType;
    }

    
    public void setPowerType(PowerTypes powerType) {
        this.powerType = powerType;
    }

    
    public int getBoatLength() {
        return boatLength;
    }

    
    
    public void setBoatLength(int boatLength) throws BoatException {
        
    	if (boatLength < VehicleConstants.MINLENGTH ||
            boatLength > VehicleConstants.MAXLENGTH) {
            throw new BoatException("Boat length has to be between "
            + VehicleConstants.MINLENGTH + " and "+ VehicleConstants.MAXLENGTH + ".");
        }

        this.boatLength = boatLength;
    }

    
    
    
    @Override
    public String toString() {
        return "Boat [Power Type: " + powerType + ", Boat Length: " + boatLength + "]";
    
    }













}