package com.xworkz.aloevera.external;


// using new keyword

import com.xworkz.aloevera.internal.Cupboard;

public class CupboardRunner {

    public static void main(String[] args) {

        Cupboard cupboard = new Cupboard();
        cupboard.setMaterial("Wood");
        cupboard.setNoOfCompartments(4);
        cupboard.setPrice(3500);
        cupboard.setColour("Brown");

        System.out.println("Materail: "+cupboard.getMaterial()+" Compartments: "+cupboard.getNoOfCompartments()+" Price: "+cupboard.getPrice()+" Colour: "+cupboard.getColour());

    }
}
