package com.xworkz.nation.dto;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class CountryDTO {

    private String name;
    private String continent;
    private String currency;
    private String capital;

    private List<StateDTO> stateDTO;
}
