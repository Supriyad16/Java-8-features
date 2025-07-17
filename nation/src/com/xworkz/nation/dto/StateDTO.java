package com.xworkz.nation.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class StateDTO {

        private String name;
        private String chiefMinister;
        private String food;
        private String capital;

        private List<MinisterDTO> ministerDTO ;

    }


