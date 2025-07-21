package com.xworkz.example.dto;

public class ProductDto {
    private String name;
    private double price;

    public ProductDto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "ProductDto{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}

