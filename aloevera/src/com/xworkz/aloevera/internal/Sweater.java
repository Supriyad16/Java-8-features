package com.xworkz.aloevera.internal;

public class Sweater implements Cloneable{

    String colour;
    int price;

    public Sweater(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sweater{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
