package com.probabilities.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "proyecciones")
public class Proyeccion {
    @Id
    @Column(name = "codigo_curso", length = 6)
    private String Codigo;

    @Id
    @Column(name = "nombre")
    private String name;

    @Column(name = "cantidad_alumnos_aptos")
    private int cantidad_alumnos;

    public Proyeccion(String codigo, String name, int cantidad_alumnos) {
        Codigo = codigo;
        this.name = name;
        this.cantidad_alumnos = cantidad_alumnos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(int cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }
}
