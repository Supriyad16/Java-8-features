package com.xworkz.nation.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class DepartmentDTO {

    private String departmentName;
    private String headOfDepartment;
    private int employeeCount;
    private double annualBudget;

    private HeadOfDepartmentDTO headOfDepartmentDTO;
}






