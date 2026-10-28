package edu.monmouth.vehicle;

public class Airplane implements Vehicle {

    private PowerTypes powerSource;

    public Airplane(PowerTypes powerSource) {
        setPowerSource(powerSource);
    }

    
    
    public PowerTypes getPowerSource() {
        return powerSource;
    }

    
    
    public void setPowerSource(PowerTypes powerSource) {
        this.powerSource = powerSource;
    }

    
    
    @Override
    public PowerTypes getPowerType() {
        return powerSource;
    }

    
    
    public void go() {
        System.out.println("The airplane is flying");
    }

    
    
    
    public void stop() {
        System.out.println("The airplane is grounded");
    }

    
    public PowerTypes powerBy() {
        return getPowerSource();
    }

    
    
    @Override
    public String toString() {
        return "Airplane power source: " + powerSource;
    }
    
    
    
    
    
    
    
}