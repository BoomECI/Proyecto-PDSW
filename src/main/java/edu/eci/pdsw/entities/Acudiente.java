/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entities;

/**
 *
 * @author user
 */
public class Acudiente {
    private String nombre;
    private int cedula;
    private String correo;
    private int telefono;
    
    public Acudiente(String nombre,int cedula,String correo,int telefono){
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
        this.cedula=cedula;
    }
    
    
}
