package com.xworkz.bigtask.dto;

public class ConstituencyDTO {

    public String demographic;
    public String reservation;
    public String signification;
    public String index;
    WardDTO wardDTO;

    public ConstituencyDTO(String demographic, String reservation, String signification, String index,WardDTO wardDTO) {
        this.demographic = demographic;
        this.reservation = reservation;
        this.signification = signification;
        this.index = index;
        this.wardDTO = wardDTO;
        System.out.println(this.demographic);
        System.out.println(this.reservation);
        System.out.println(this.signification);
        System.out.println( this.index );
    }



}

