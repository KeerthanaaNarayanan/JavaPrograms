package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    public String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
