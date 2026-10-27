/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import java.time.LocalDateTime;

/**
 *
 * @author PC06
 */
public class Revision extends Cita{

    public Revision(){}
    
    public Revision(Long id, LocalDateTime fechaHora, String anotaciones) {
        super(id, fechaHora, anotaciones);
    }

    
}
