package com.xworkz.example.dto;

public class FootwareDto implements Comparable<FootwareDto>{

    private String material;
    private int price;

    public FootwareDto(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FootwareDto{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(FootwareDto o) {

        if (o.getPrice()>this.getPrice()){
            return 1;
        } else if (o.getPrice()==this.getPrice()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
