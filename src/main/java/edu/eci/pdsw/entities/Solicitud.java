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
    
}
