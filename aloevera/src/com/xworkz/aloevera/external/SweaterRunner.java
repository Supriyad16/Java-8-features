package com.xworkz.aloevera.external;

//using clone

import com.xworkz.aloevera.internal.Sweater;

public class SweaterRunner {

    public static void main(String[] args) {

        try {
            Sweater sweater1 = new Sweater("Pink", 850);
            Sweater sweater2 = new Sweater("Black", 640);
            Sweater sweater3 = new Sweater("Blue", 1000);


            Sweater clone = (Sweater) sweater1.clone();
            Sweater clone2 = (Sweater) sweater2.clone();
            Sweater clone3 = (Sweater) sweater3.clone();

            System.out.println(sweater1);
            System.out.println(sweater2);
            System.out.println(sweater3);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}



