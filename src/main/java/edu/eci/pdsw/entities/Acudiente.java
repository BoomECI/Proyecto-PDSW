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
    public void setNombre (String nombre){
        this.nombre=nombre;        
    }
    public String getNombre (){
        return nombre;        
    }
    public void setCedula (int cedula){
        this.cedula=cedula;        
    }
    public int getCedula (){
        return cedula;
    }    
    public void setCorreo (String correo){
        this.correo=correo;       
    }
    public String getCorreo (){
        return correo;        
    }
    public void setTelefono (int telefono){
        this.telefono=telefono;        
    }
    public int getTelefono (){
        return telefono;
    }  
    
}
