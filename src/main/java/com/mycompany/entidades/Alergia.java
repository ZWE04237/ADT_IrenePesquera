/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author PC06
 */
public class Alergia {
    private Long id;
    private String nombre;
    private Medicamento medicamento;
    private Long idHistorialAlergia;

    public Alergia(){}
    
    public Alergia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
