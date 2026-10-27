/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author PC06
 */
public class SesionUsuario {
    public enum TipoUsuario{
        ENFERMERIA, SECRETARIADO, CIRUJANO
    }
    
    private String username;
    private String nombre;
    private TipoUsuario rol;

    public SesionUsuario(String username, String nombre, TipoUsuario rol) {
        this.username = username;
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoUsuario getRol() {
        return rol;
    }

    public void setRol(TipoUsuario rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "SesionUsuario{" + "username=" + username + ", nombre=" + nombre + ", rol=" + rol + '}';
    }
    
    
}
