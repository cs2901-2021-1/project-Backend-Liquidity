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

    @Column(name = "nombre")
    private String name;

    @Column(name = "Area_curso")
    private String area;

    @Column(name = "cantidad_alumnos_aptos")
    private int cantidad_alumnos;

    @Column(name = "ciclo")
    private String ciclo = "2021-2";

    public Proyeccion(String codigo, String name, int cantidad_alumnos, String ciclo) {
        Codigo = codigo;
        this.name = name;
        this.cantidad_alumnos = cantidad_alumnos;
        this.ciclo = ciclo;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCantidad_alumnos() {
        return cantidad_alumnos;
    }

    public void setCantidad_alumnos(int cantidad_alumnos) {
        this.cantidad_alumnos = cantidad_alumnos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
