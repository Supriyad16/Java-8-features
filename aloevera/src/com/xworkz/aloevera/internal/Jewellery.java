package com.xworkz.aloevera.internal;

public class Jewellery {

    String type;
    String material;
    int price;


    public Jewellery() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jewellery{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
