package com.xworkz.nation.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class DetailDTO {

    private int id;
    private String name;
    private String status;
    private String category;

    private EducationDTO educationDTO;


}

