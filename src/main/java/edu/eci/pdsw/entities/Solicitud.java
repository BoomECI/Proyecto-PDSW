/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entities;

import java.util.Date;

/**
 *
 * @author user
 */
public class Solicitud {
    
    private Date fecha;
    private String estado;
    private int id;
    private Estudiante estudiante;
    private String justificacion;
    private String materia;
    
    public Solicitud(Date fecha,String estado,int id,Estudiante estudiante, String justificacion,String materia){
        this.estado=estado;
        this.id=id;
        this.justificacion=justificacion;
        this.materia=materia;
        this.fecha=fecha;
        this.estudiante=estudiante;        
    }
     public void setEstado (String estado){
        this.estado=estado;        
    }
    public String getEstado (){
        return estado;        
    }
    public void setJustificacion  (String justificacion){
        this.justificacion=justificacion;        
    }
    public String getJustificacion (){
        return justificacion;
    }    
    public void setMateria(String materia){
        this.materia=materia;       
    }
    public String getMateria (){
        return materia;        
    }
    public void setId (int id){
        this.id=id;        
    }
    public int getId (){
        return id;
    } 
    public void setFecha(Date fecha){
        this.fecha=fecha;        
    }
    public Date getFecha (){
        return fecha;
    } 
    public void setEstudiante (Estudiante estudiante){
        this.estudiante=estudiante;        
    }
    public Estudiante getEstudiante (){
        return estudiante;
    }
}
