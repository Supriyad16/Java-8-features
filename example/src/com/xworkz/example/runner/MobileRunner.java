package com.xworkz.example.runner;

import com.xworkz.example.dto.MobileDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//without comparable

public class MobileRunner {

    public static void main(String[] args) {

        Comparator<MobileDto> mobileDtoComparator = ((p1,p2)->Integer.compare(p1.getBattery(), p2.getBattery()));

        List<MobileDto> mobileDto = new ArrayList<>();
        mobileDto.add(new MobileDto("Vivo",75));
        mobileDto.add(new MobileDto("Oppo",80));
        mobileDto.add(new MobileDto("Samsung",95));

        Collections.sort(mobileDto,mobileDtoComparator);


        mobileDto.forEach(n-> System.out.println(n));
    }
}
