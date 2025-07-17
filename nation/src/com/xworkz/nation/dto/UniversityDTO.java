package com.xworkz.nation.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class UniversityDTO {

    private String name;
    private String location;
    private int establishedYear;
    private String accreditation;

    private ChancellorDTO chancellorDTO;


}

