/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author PC06
 */
public class HistorialAlergia {
    private Long idHistorialAlergia;
    private Long idHistorial;
    private Long idAlergia;

    public HistorialAlergia(Long idHistorialAlergia, Long idHistorial, Long idAlergia) {
        this.idHistorialAlergia = idHistorialAlergia;
        this.idHistorial = idHistorial;
        this.idAlergia = idAlergia;
    }

    public Long getIdHistorialAlergia() {
        return idHistorialAlergia;
    }

    public void setIdHistorialAlergia(Long idHistorialAlergia) {
        this.idHistorialAlergia = idHistorialAlergia;
    }

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Long getIdAlergia() {
        return idAlergia;
    }

    public void setIdAlergia(Long idAlergia) {
        this.idAlergia = idAlergia;
    }

    @Override
    public String toString() {
        return "HistorialAlergia{" + "idHistorialAlergia=" + idHistorialAlergia + ", idHistorial=" + idHistorial + ", idAlergia=" + idAlergia + '}';
    }
    
    
    
    
}
