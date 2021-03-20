package com.company.inheritance;

public class Vehicle {
    String VehicleType;
    int tyres;
    int gears;
    int handsteering;
    int speed;

    public Vehicle(String VehicleType, int tyres, int gears, int handsteering, int speed) {
        this.VehicleType = VehicleType;
        this.tyres = tyres;
        this.gears = gears;
        this.handsteering = handsteering;
        this.speed = speed;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public int getTyres() {
        return tyres;
    }

    public int getGears() {
        return gears;
    }

    public int getHandsteering() {
        return handsteering;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedTest(){
        System.out.println("vehicle.speedTest() is called");
    }
}
