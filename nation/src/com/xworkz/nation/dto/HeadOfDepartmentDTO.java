package com.xworkz.nation.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class HeadOfDepartmentDTO {

        private String hodName;
        private String qualification;
        private int yearsOfExperience;
        private String departmentName;

        private List<StaffDTO> staffDTO ;

    }

