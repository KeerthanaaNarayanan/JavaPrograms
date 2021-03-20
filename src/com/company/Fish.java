package com.company;

public class Fish extends Animal{
    private int fins;
    private int gills;
    private int eyes;

    public Fish(String name, int size, int weight, int fins, int gills, int eyes) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(){
        moveMuscles();
        moveBackFin();
    }
}
