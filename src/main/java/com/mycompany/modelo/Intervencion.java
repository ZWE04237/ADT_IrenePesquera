/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import java.time.LocalDateTime;
import java.util.Set;

/**
 *
 * @author PC06
 */
public class Intervencion extends Cita{
    private int duracion; //minutos
    private Long idEnfermero; // siempre 1
    private Set<Long> idCirujanos; // 1 o 2

    public Intervencion(){}
    
    public Intervencion(Long id, LocalDateTime fechaHora, String anotaciones, int duracion) {
        super(id, fechaHora, anotaciones);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Intervencion{" + "duracion=" + duracion + '}';
    }
    
    
    
}
