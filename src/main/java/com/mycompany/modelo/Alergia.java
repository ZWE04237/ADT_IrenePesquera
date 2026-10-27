/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import java.io.Serializable;

/**
 *
 * @author PC06
 */
public class Alergia implements Serializable{
    private Long id;
    private String nombre;
    private Medicamento medicamento;
    private Long idHistorialAlergia;

    public Alergia(){}
    
    public Alergia(Long id, String nombre, Medicamento medicamento ) {
        this.id = id;
        this.nombre = nombre;
        this.medicamento = medicamento;
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

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Long getIdHistorialAlergia() {
        return idHistorialAlergia;
    }

    public void setIdHistorialAlergia(Long idHistorialAlergia) {
        this.idHistorialAlergia = idHistorialAlergia;
    }

    
    
    
}
