package com.probabilities.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "usuarios")
public class Usuario {

    @NotNull
    @Column(name = "email", unique = true)
    private String email;
    @NotNull
    @Column(name = "rol", unique = true)
    private String rol;

    @NotNull
    @Column(name = "id_token", unique = true)
    private String id_token;

    public Usuario() {
    }

    public Usuario(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getId_token() {
        return id_token;
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }
}
