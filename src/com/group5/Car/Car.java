package com.group5.Car;

import java.util.ArrayList;

public class Car {
    
    private int carID;
    private Make make;
    private Model model;
    private Specifications specs;
    private ArrayList<Part> parts = new ArrayList<>();


    public Car (int carID, Make make, Model model, Specifications specs, ArrayList<Part> parts) {
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.specs = specs;
        this.parts = parts;
    }


    public String getName() {
        return make.getName() + " " + model.getName();
    }
    
}
