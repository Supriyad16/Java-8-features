package com.xworkz.lamdba;

public class BottleRunner {

    public static void main(String... args) {

       // Bottle bottle = (int no)->{   // data type is optional in lambda expression
//        Bottle bottle = (no)->{
//            System.out.println(no);
//            if(no>0){
//                return true;
//            }
//            return false;
//        };

    //    Bottle bottle = (int no)-> no>100;    // we can write without body
       // user.buy(bottle);

        User user = new User();
        user.buy((no)->no>0);     // another type

    }
}
