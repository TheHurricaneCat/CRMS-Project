package com.group5.Car;

public class Make {
    
    private String name;
    private String country;


    public Make (String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName () {
        return name;
    }

    public String getCountry () {
        return country;
    }
    
}
