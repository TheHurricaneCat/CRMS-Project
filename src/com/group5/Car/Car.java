package com.group5.Car;

import java.util.ArrayList;

public class Car {
    
    private String name;
    private int carID;
    private Make make;
    private Model model;
    private ArrayList<Part> parts = new ArrayList<>();
    private RentStatus status;
    private String licensePlate;


    public Car (String name, int carID, Make make, Model model, ArrayList<Part> parts, RentStatus status, String licensePlate) {
        this.name = name;
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.parts = parts;
        this.status = status;
        this.licensePlate = licensePlate;
    }

    public String getName () {
        return name;
    }

    public int getCarID () {
        return carID;
    }

    public Make getMake () {
        return make;
    }

    public Model getModel () {
        return model;
    }

    public ArrayList<Part> getParts () {
        return parts;
    }

    public RentStatus getStatus () {
        return status;
    }
    
    public String getLicensePlate () {
        return licensePlate;
    }
    
}
