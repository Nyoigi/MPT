package com.example.mpt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CityName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String city_name) {
        this.CityName = city_name;
    }

    public City() {

    }

    public City(String CityName) {
        this.CityName = CityName;
    }

}
