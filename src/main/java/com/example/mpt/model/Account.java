package com.example.mpt.model;
import jakarta.persistence.*;


@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;

    @ManyToOne
    private Role_us role_id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_ID")
    private Tb_user user_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role_us getRole_id() {
        return role_id;
    }

    public void setRole_id(Role_us role_us) {
        this.role_id = role_us;
    }

    public Tb_user getUser_id() {
        return user_id;
    }

    public void setUser_id(Tb_user user_id) {
        this.user_id = user_id;
    }

    public Account(Long id, String email, String password, Role_us role_id, Tb_user user_id) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
        this.user_id = user_id;
    }

    public Account() {

    }
}
