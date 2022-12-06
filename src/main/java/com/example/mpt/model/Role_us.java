package com.example.mpt.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
public class Role_us {

    @GeneratedValue
    @Id
    private Long id;

    private String nameRole;

    @OneToMany
    private List<Account> accounts;

    public Role_us() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Role_us(Long id, String nameRole, List<Account> accounts) {
        this.id = id;
        this.nameRole = nameRole;
        this.accounts = accounts;
    }
}
