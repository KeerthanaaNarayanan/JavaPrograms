package com.company.inheritance;

public class Benz extends Car{
    int version;

    public Benz(String VehicleType, int tyres, int gears, int handsteering, int speed) {
        super(VehicleType, tyres, gears, handsteering, speed);
    }

    public Benz(String VehicleType, int tyres, int gears, int handsteering, int speed, int version) {
        super(VehicleType, tyres, gears, handsteering, speed);
        this.version = version;
    }

    public Benz(String VehicleType, int tyres, int gears, int handsteering, int speed, int seats, int aircondition, int version) {
        super(VehicleType, tyres, gears, handsteering, speed, seats, aircondition);
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    @Override
    public void speedTest() {
        System.out.println("Benz.speedTest() is called");
        super.speedTest();
    }
}
