/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

import java.util.List;

/**
 *
 * @author boomEci
 */
public class Consejero {
    
    private long id;
    private String nombre;
    private String correo;
    private List<Estudiante> estudiantesAconsejados;
    
    public Consejero(){}
    
    public Consejero(long id, String nombre, String correo, List<Estudiante> estudiantesAconsejados){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.estudiantesAconsejados = estudiantesAconsejados;
    }    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<Estudiante> getEstudiantesAconsejados() {
        return estudiantesAconsejados;
    }

    public void setEstudiantesAconsejados(List<Estudiante> estudiantesAconsejados) {
        this.estudiantesAconsejados = estudiantesAconsejados;
    }
    
    
    
    
    
}
