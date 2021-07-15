package com.probabilities.probabilitiesback.entity;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class Usuario {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="surname", nullable = false)
    private String surname;

    @Column(name = "email", nullable = false)
    private String email;

//Ver como es lo de foreign key
    @ManyToOne
    @JoinColumn (name = "role_id", nullable = false)
    private Roles role_id;

    public Usuario(){

    }

    public Usuario( int id , String name,  String surname, String email, Roles role_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.role_id = role_id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRole_id() {
        return role_id;
    }

    public void setRole_id(Roles role_id) {
        this.role_id = role_id;
    }

    public Roles getRol() {
        return role_id;
    }

    public void setRol(Roles role_id) {
        this.role_id = role_id;
    }


}
