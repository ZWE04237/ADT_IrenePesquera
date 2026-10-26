/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author PC06
 */
public class Secretariado extends Empleado{
    private int aniosExperiencia;

    public Secretariado(){}
    
    public Secretariado(int aniosExperiencia, String nombre, String apellidos, String telefono, String email, String nifnie, String direccion) {
        super(nombre, apellidos, telefono, email, nifnie, direccion);
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Secretariado{" + "aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    
    
}
