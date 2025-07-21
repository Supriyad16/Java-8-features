package com.xworkz.example.dto;


public class MobileDto  {
    private String model;
    private int battery;

    public MobileDto(String model, int battery) {
        this.model = model;
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "MobileDto{" + "model='" + model + '\'' + ", battery=" + battery + '}';
    }

}

