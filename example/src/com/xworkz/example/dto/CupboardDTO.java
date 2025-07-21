package com.xworkz.example.dto;

public class CupboardDTO implements Comparable<CupboardDTO> {

    private String material;
    private int compartments;


    public CupboardDTO(String material, int compartments) {
        this.material = material;
        this.compartments = compartments;
    }

    public String getMaterial() {
        return material;
    }

    public int getCompartments() {
        return compartments;
    }

    @Override
    public String toString() {
        return "CupboardDTO{" +
                "material='" + material + '\'' +
                ", compartments=" + compartments +
                '}';
    }

  @Override
    public int compareTo(CupboardDTO o) {

        if (o.getCompartments()>this.getCompartments()){
            return 1;

        } else if (o.getCompartments()==this.getCompartments()) {
            return 0;
        }
        else {
            return 0;
        }
    }
}
