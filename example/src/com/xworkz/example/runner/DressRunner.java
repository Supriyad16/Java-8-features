package com.xworkz.example.runner;

import com.xworkz.example.dto.DressDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//with comparable

public class DressRunner {

    public static void main(String[] args) {


        List<DressDto> dressDtoList = new ArrayList<>();

        dressDtoList.add(new DressDto("Lehenga",2500));
        dressDtoList.add(new DressDto("Tshirt", 250));
        dressDtoList.add(new DressDto("Kurti",350));


        Collections.sort(dressDtoList);

        dressDtoList.forEach(n-> System.out.println(n));
    }
}
