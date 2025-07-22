package com.xworkz.aloevera.internal;

public class Cupboard {

   String material;
   int noOfCompartments;
   int price;
   String colour;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNoOfCompartments() {
        return noOfCompartments;
    }

    public void setNoOfCompartments(int noOfCompartments) {
        this.noOfCompartments = noOfCompartments;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "material='" + material + '\'' +
                ", noOfCompartments=" + noOfCompartments +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}

