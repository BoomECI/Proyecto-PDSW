/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

import java.util.Date;

/**
 *
 * @author BoomECI
 */
public class SolicitudCancelacion {
    
    private String materia;
    private String justificacion;
    private Date fecha;
    private String estado;
    private Boolean avalConsejero;
    private Boolean avalAcudiente;
    private int id;
    private String comentario;
    private long estudiante;
   

    public SolicitudCancelacion(){}
    public SolicitudCancelacion(Date fecha, String estado, int id, String justificacion, String comentario,Boolean avalAcudiente,Boolean avalConsejero,String materia,long estudiante ) {
        this.materia = materia;
        this.justificacion = justificacion;
        this.fecha = fecha;
        this.estado = estado;
        this.id = id;        
        this.comentario = comentario;
        this.estudiante=estudiante;
        this.avalAcudiente=avalAcudiente;
        this.avalConsejero=avalConsejero;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
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

    public long getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(long estudiante) {
        this.estudiante = estudiante;
    }
    
    
    
    
    

    
    
    

}
