package com.xworkz.nation.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class EducationDTO {

        private String degree;
        private String institution;
        private int yearOfPassing;
        private double percentage;

    private  UniversityDTO universityDTO;
    }


