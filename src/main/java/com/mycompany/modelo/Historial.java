/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author PC06
 */
public class Historial {
    private int numHistoria;
    private String descripcion;
    private Long idPaciente;
    private Long idHistorialAlergia;
    

    public Historial(){}
    
    public Historial(int numHistoria, String descripcion) {
        this.numHistoria = numHistoria;
        this.descripcion = descripcion;
    }

    public int getNumHistoria() {
        return numHistoria;
    }

    public void setNumHistoria(int numHistoria) {
        this.numHistoria = numHistoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdHistorialAlergia() {
        return idHistorialAlergia;
    }

    public void setIdHistorialAlergia(Long idHistorialAlergia) {
        this.idHistorialAlergia = idHistorialAlergia;
    }

    @Override
    public String toString() {
        return "Historial{" + "numHistoria=" + numHistoria + ", descripcion=" + descripcion + ", idPaciente=" + idPaciente + ", idHistorialAlergia=" + idHistorialAlergia + '}';
    }

    
    
    
    
}
