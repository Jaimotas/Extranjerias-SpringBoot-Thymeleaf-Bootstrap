package com.es.models;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
public class Extranjero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 60, nullable = false)
    private String nombre;
    
    @Column(length = 120, nullable = false)
    private String apellidos;
    
    @Column(length = 50)
    private String nacionalidad;
    
    private Date fechaNacimiento;
    
    @Column(length = 15, unique = true, nullable = false)
    private String NIE;
    
    private boolean genero;
    
    @Column(length = 20)
    private String estado; 
    
    private Date fechaBaja;
    
    // Getters y Setters
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getNIE() {
        return NIE;
    }
    public void setNIE(String NIE) {
        this.NIE = NIE;
    }
    public boolean isGenero() {
        return genero;
    }
    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Date getFechaBaja() {
        return fechaBaja;
    }
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
