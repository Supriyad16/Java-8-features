package com.xworkz.nation.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class PortFolio {

    private String portfolioName;
    private String ministryLevel;
    private double budgetAllocated;
    private int numberOfDepartments;

    private  DepartmentDTO departmentDTO;




}
