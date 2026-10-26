/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author PC06
 */
public class Tratamiento {
    private Long id;
    private String nombre;
    private LocalDate fechaIni = LocalDate.now();
    private boolean consentimiento = false; 
    private Long idPaciente;
    private ArrayList<Cita> citas;

    public Tratamiento(){}
    
    public Tratamiento(Long id, String nombre, Paciente paciente, ArrayList<Cita> citas) {
        this.id = id;
        this.nombre = nombre;
        this.idPaciente = paciente.getId();
        this.citas = citas; 
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

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public boolean isConsentimiento() {
        return consentimiento;
    }

    public void setConsentimiento(boolean consentimiento) {
        this.consentimiento = consentimiento;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "id=" + id + ", nombre=" + nombre + ", fechaIni=" + fechaIni + ", consentimiento=" + consentimiento + ", idPaciente=" + idPaciente + ", citas=" + citas + '}';
    }
    
    
    
}
