package com.xworkz.example.dto;

public class DressDto implements Comparable<DressDto> {

    private String type;
    private int price;

    public DressDto(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "DressDto{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }



    @Override
    public int compareTo(DressDto o) {

        if (o.getPrice()>this.getPrice()){
            return 1;
        }
        else if (o.getPrice()==this.getPrice()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
