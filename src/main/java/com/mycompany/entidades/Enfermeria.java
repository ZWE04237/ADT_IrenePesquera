/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;


/**
 *
 * @author PC06
 */
public class Enfermeria extends Empleado{
    
    private char categoria;

    public Enfermeria() {}

    public Enfermeria(char categoria, String nombre, String apellidos, String telefono, String email, String nifnie, String direccion) {
        super(nombre, apellidos, telefono, email, nifnie, direccion);
        this.categoria = categoria;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Enfermeria{" + "categoria=" + categoria + '}';
    }

    
    
    
}
