/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import java.time.LocalDate;
import java.util.Set;

/**
 *
 * @author PC06
 */
public class Paciente {
    private Long id;
    private String nombre;
    private LocalDate fechaNac;
    private String telefono;
    private String email;
    private String direccion;
    private String nifnie;
    private Set<Tratamiento> tratamientos;
    private Long idHistorial;
    
    public Paciente(){}

    public Paciente(Long id, String nombre, LocalDate fechaNac, String telefono, String email, String direccion, String nifnie) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.nifnie = nifnie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNifnie() {
        return nifnie;
    }

    public void setNifnie(String nifnie) {
        this.nifnie = nifnie;
    }

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Set<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(Set<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + ", nifnie=" + nifnie + ", tratamientos=" + tratamientos +'}';
    }

    
    
}
