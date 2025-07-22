package com.xworkz.aloevera.external;

import com.xworkz.aloevera.internal.Jewellery;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JewelleryRunner {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<Jewellery> constructor = Jewellery.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        Jewellery jewellery = constructor.newInstance();

        jewellery.setType("Ring");
        jewellery.setMaterial("Silver");
        jewellery.setPrice(600);

        System.out.println(jewellery);

    }
}
