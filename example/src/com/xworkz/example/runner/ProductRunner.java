package com.xworkz.example.runner;

import com.xworkz.example.dto.ProductDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//without comparable

public class ProductRunner {

    public static void main(String[] args) {


        Comparator<ProductDto> productDtoComparator = ((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
        List<ProductDto> productRunnerList = new ArrayList<>();

        productRunnerList.add(new ProductDto("Doll", 250));
        productRunnerList.add(new ProductDto("Fridge",15000));
        productRunnerList.add(new ProductDto("Iron Box",3000));

        Collections.sort(productRunnerList, productDtoComparator);

        productRunnerList.forEach(n-> System.out.println(n));
    }
}