package com.company.inheritance;

public class Car extends Vehicle{
    int seats;
    int aircondition;

    public Car(String VehicleType, int tyres, int gears, int handsteering, int speed) {
        super(VehicleType, tyres, gears, handsteering, speed);
    }

    public Car(String VehicleType, int tyres, int gears, int handsteering, int speed, int seats, int aircondition) {
        super(VehicleType, tyres, gears, handsteering, speed);
        this.seats = seats;
        this.aircondition = aircondition;
    }

    public int getSeats() {
        return seats;
    }

    public int getAircondition() {
        return aircondition;
    }

    @Override
    public void speedTest() {
        System.out.println("Car.speedTest() is called");
        super.speedTest();
    }
}
