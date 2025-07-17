package com.xworkz.nation.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class StaffDTO {


        private String staffName;
        private String designation;
        private double salary;
        private String joining;

        private DetailDTO detailDTO;


    }

