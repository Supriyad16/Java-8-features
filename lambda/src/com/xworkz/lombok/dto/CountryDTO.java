package com.xworkz.lombok.dto;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class CountryDTO {

        private String name;
        private int pinCode;
        private double populationInMillions;
        private int noOfStates;
        private double massInSqKms;
        private String primeMinister;
        private String primaryLang;
        private String secondaryLang;
        private String gdp;
    }





