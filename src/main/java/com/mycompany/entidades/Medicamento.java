/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

/**
 *
 * @author PC06
 */
public class Medicamento {
    private Long id;
    private String nombre;
    private String principioActivo;
    private int dosisMax; //mg

    public Medicamento(){}
    
    public Medicamento(Long id, String nombre, String principioActivo, int dosisMax) {
        this.id = id;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.dosisMax = dosisMax;
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

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public int getDosisMax() {
        return dosisMax;
    }

    public void setDosisMax(int dosisMax) {
        this.dosisMax = dosisMax;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nombre=" + nombre + ", principioActivo=" + principioActivo + ", dosisMax=" + dosisMax + '}';
    }
    
    
}
