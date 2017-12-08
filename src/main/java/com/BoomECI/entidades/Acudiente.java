/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

/**
 *
 * @author BoomEci
 */
public class Acudiente {
    
    private long cedula;
    private String nombre;
    private String correo;
    private long telefono;

    public Acudiente(){
    }
    public Acudiente(long id, String nombre, String correo, long telefono){
        this.cedula = id;
        this.nombre = nombre;
        this.correo = correo;    
        this.telefono = telefono;
    }

    public long getId() {
        return cedula;
    }

    public void setId(long id) {
        this.cedula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
}
