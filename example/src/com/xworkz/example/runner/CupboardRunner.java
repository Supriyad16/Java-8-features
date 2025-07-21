package com.xworkz.example.runner;

import com.xworkz.example.dto.CupboardDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//with comparable

public class CupboardRunner {

    public static void main(String[] args) {

        List<CupboardDTO> cupboardDTOList = new ArrayList<>();

        cupboardDTOList.add(new CupboardDTO("Pastic",10));
        cupboardDTOList.add(new CupboardDTO("Wooden",5));
        cupboardDTOList.add(new CupboardDTO("Iron",4));

        Collections.sort(cupboardDTOList);

        cupboardDTOList.forEach(n-> System.out.println(n));

    }
}
