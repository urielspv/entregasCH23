package com.generation.cohorte23.jpa.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    private String nombre;
    private String email;
    private long id;
    private Integer prioridad;
    public UsuarioModel(String nombre, String email, long id, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
        this.prioridad = prioridad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Integer getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}