package com.xworkz.example.dto;

public class HotelDto {

    private String items;
    private int price;

    public HotelDto(String items, int price) {
        this.items = items;
        this.price = price;
    }

    public String getItems() {
        return items;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HotelDto{" +
                "items='" + items + '\'' +
                ", price=" + price +
                '}';
    }
}
