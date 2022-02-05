/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cersocode.app.modelo;

/**
 *
 * @author vicec
 */
public class Credenciales {
    private String nombre;
    private String pass;

    public Credenciales() {
    }

    public Credenciales(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Credenciales{" + "nombre=" + nombre + ", pass=" + pass + '}';
    }
    
    
    
}
