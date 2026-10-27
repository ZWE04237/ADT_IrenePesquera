/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC06
 */
public abstract class Cita {
    protected Long id;
    protected LocalDateTime fechaHora;
    protected String anotaciones;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:MM");

    public Cita(){}
    
    public Cita(Long id, LocalDateTime fechaHora, String anotaciones) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.anotaciones = anotaciones;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public DateTimeFormatter getFormato() {
        return formato;
    }

    public void setFormato(DateTimeFormatter formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Cita{" + "id=" + id + ", fechaHora=" + fechaHora + ", anotaciones=" + anotaciones + ", formato=" + formato + '}';
    }
    
    
    
}
