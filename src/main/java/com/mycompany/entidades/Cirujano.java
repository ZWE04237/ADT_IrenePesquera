/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import java.util.ArrayList;

/**
 *
 * @author PC06
 */
public class Cirujano extends Empleado{
    private ArrayList<Especialidades> especialidades;

    public Cirujano(){};

    public Cirujano(ArrayList<Especialidades> especialidades, String nombre, String apellidos, String telefono, String email, String nifnie, String direccion) {
        super(nombre, apellidos, telefono, email, nifnie, direccion);
        this.especialidades = especialidades;
    }

    public ArrayList<Especialidades> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidades> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return "Cirujano{" + "Especialidades=" + especialidades + '}';
    }

    
}
