package com.xworkz.example.runner;

import com.xworkz.example.dto.CarDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// with comparable

public class CarRunner {

    public static void main(String[] args) {


        List<CarDto> carDtoList = new ArrayList<>();

        carDtoList.add(new CarDto("Toyota",450));
        carDtoList.add(new CarDto("Hyndai",250));
        carDtoList.add(new CarDto("Tesla",850));
        carDtoList.add(new CarDto("Maruthi",120));

        Collections.sort(carDtoList);

        carDtoList.forEach(n-> System.out.println(n));



    }


}
