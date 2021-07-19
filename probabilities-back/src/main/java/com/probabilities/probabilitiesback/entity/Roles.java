package com.probabilities.probabilitiesback.entity;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int roles_id;

    @Column(name = "name")
    String name;
    public Roles(){}

    public Roles(String name){
        this.name = name;
    }

    public int getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(int roles_id) {
        this.roles_id = roles_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}