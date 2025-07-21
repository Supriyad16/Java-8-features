package com.xworkz.example.runner;

import com.xworkz.example.dto.FootwareDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//with comparable

public class FootwareRunner {

    public static void main(String[] args) {


        List<FootwareDto> footwareDtos = new ArrayList<>();

        footwareDtos.add(new FootwareDto("Rubber",650));
        footwareDtos.add(new FootwareDto("Leather",2500));
        footwareDtos.add(new FootwareDto("Thermoplastic",850));

        Collections.sort(footwareDtos);

        footwareDtos.forEach(n-> System.out.println(n));
    }
}