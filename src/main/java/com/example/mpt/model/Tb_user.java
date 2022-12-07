package com.example.mpt.model;

import jakarta.persistence.*;

@Entity
public class Tb_user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameUser;
    private String lastname;
    private String surname;
    private String numberPhone;
    private String pasportSeries;
    private String pasportNumber;

    public Tb_user() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String name_user) {
        this.nameUser = name_user;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String number_phone) {
        this.numberPhone = number_phone;
    }

    public String getPasportSeries() {
        return pasportSeries;
    }

    public void setPasportSeries(String pasport_series) {
        this.pasportSeries = pasport_series;
    }

    public String getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(String pasport_number) {
        this.pasportNumber = pasport_number;
    }

    public Tb_user(Long id, String nameUser, String lastname, String surname,
                   String numberPhone, String pasportSeries, String pasportNumber) {
        this.id = id;
        this.nameUser = nameUser;
        this.lastname = lastname;
        this.surname = surname;
        this.numberPhone = numberPhone;
        this.pasportSeries = pasportSeries;
        this.pasportNumber = pasportNumber;
    }
}
