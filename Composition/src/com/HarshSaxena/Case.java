package com.HarshSaxena;

public class Case {
    private String  model;
    private String manufacturer;
    private int powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, int powerSupply, Dimensions dimesions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimesions;
    }
    public void pressPowerbutton(){
        System.out.println("Power button is pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimesions() {
        return dimensions;
    }
}
