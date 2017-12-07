/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

import java.util.Date;
import java.util.List;



/**
 *
 * @author BoomECI
 */
public class SolicitudCancelacion {
    
    private List<String> materias;
    private String[] justificaciones;
    private Date fecha;
    private String estado;
    private Boolean avalConsejero;
    private Boolean avalAcudiente;
    private int id;
    private String comentario;
    private int Estudiante;
   

    public SolicitudCancelacion(){}
    public SolicitudCancelacion(Date fecha, String estado, int id, String[] justificaciones, String comentario,Boolean avalAcudiente,Boolean avalConsejero,List<String> materias,int Estudiante ) {
        this.materias = materias;
        this.justificaciones = justificaciones;
        this.fecha = fecha;
        this.estado = estado;
        this.id = id;        
        this.comentario = comentario;
        this.Estudiante=Estudiante;
        this.avalAcudiente=avalAcudiente;
        this.avalConsejero=avalConsejero;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

    public String[] getJustificaciones() {
        return justificaciones;
    }

    public void setJustificaciones(String[] justificaciones) {
        this.justificaciones = justificaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAvalConsejero() {
        return avalConsejero;
    }

    public void setAvalConsejero(Boolean avalConsejero) {
        this.avalConsejero = avalConsejero;
    }

    public Boolean getAvalAcudiente() {
        return avalAcudiente;
    }

    public void setAvalAcudiente(Boolean avalAcudiente) {
        this.avalAcudiente = avalAcudiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(int Estudiante) {
        this.Estudiante = Estudiante;
    }
    
    
    
    
    

    
    
    

}
