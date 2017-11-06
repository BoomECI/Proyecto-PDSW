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
public class Consejero {
    private String nombre;
    private int codigo;
    private String correo;
    
    public Consejero(String nombre,int codigo,String correo){
        this.codigo=codigo;
        this.correo=correo;
        this.nombre=correo;
        
    }
    public void setNombre (String nombre){
        this.nombre=nombre;        
    }
    public String getNombre (){
        return nombre;        
    }
    public void setCodigo (int cedula){
        this.codigo=cedula;        
    }
    public int getCodigo (){
        return codigo;
    }    
    public void setCorreo (String correo){
        this.correo=correo;       
    }
    public String getCorreo (){
        return correo;        
    }   
    
}
