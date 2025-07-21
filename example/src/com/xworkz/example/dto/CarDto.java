package com.xworkz.example.dto;


public class CarDto implements Comparable<CarDto> {
    private String brand;
    private int speed;

    public CarDto(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "CarDto{" + "brand='" + brand + '\'' + ", speed=" + speed + '}';
    }


    @Override
    public int compareTo(CarDto o) {

        if (o.getSpeed()>this.getSpeed()){
            return 1;
        } else if (o.getSpeed()==this.getSpeed()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
