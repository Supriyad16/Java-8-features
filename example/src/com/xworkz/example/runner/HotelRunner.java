package com.xworkz.example.runner;

import com.xworkz.example.dto.HotelDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//without comparable

public class HotelRunner {

    public static void main(String[] args) {


        Comparator<HotelDto> hotelDtoComparator = ((p1,p2)->Integer.compare(p1.getPrice(), p2.getPrice()));
        List<HotelDto> hotelDtos = new ArrayList<>();

        hotelDtos.add(new HotelDto("Burger",250));
        hotelDtos.add(new HotelDto("Pasta", 80));
        hotelDtos.add(new HotelDto("noodles",360));

        Collections.sort(hotelDtos,hotelDtoComparator);

        hotelDtos.forEach(n-> System.out.println(n));
    }
}
