package com.example.mpt.model;

import jakarta.persistence.*;

@Entity
public class Tb_user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
