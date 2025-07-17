package com.xworkz.bigtask.dto;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WardDTO {

    public String administrative;
    public String electoral;
    public String area;
    public String Service;

    public WardDTO(String administrative, String electoral, String area, String service) {
        this.administrative = administrative;
        this.electoral = electoral;
        this.area = area;
          this.Service = service;
        System.out.println(  this.administrative);
        System.out.println( this.electoral);
        System.out.println(  this.area);
        System.out.println( this.Service);

    }
}
