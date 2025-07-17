package com.xworkz.nation.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class MinisterDTO {

    private String name;
    private String postName;
    private int age;
    private int experienceYears;

    private List<PortFolio> portFolio;
}
