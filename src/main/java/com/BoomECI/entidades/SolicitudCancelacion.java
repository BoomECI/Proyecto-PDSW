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
    
    private List<String> materiaSolicitada;
    private String justificacion;
    private Date fecha;
    private String estado;
    private Boolean avalConsejero;
    private Boolean avalAcudiente;
    private int id;
    private String comentario;
    private int Estudiante;
   

    public SolicitudCancelacion(){}
    public SolicitudCancelacion(Date fecha, String estado, int id, String justificacion, String comentario,Boolean avalAcudiente,Boolean avalConsejero,List<String> materiaSolicitada,int Estudiante ) {
        this.materiaSolicitada = materiaSolicitada;
        this.justificacion = justificacion;
        this.fecha = fecha;
        this.estado = estado;
        this.id = id;        
        this.comentario = comentario;
        this.Estudiante=Estudiante;
        this.avalAcudiente=avalAcudiente;
        this.avalConsejero=avalConsejero;
    }

    public List<String> getMateriaSolicitada() {
        return materiaSolicitada;
    }

    public void setMateriaSolicitada(List<String> materiaSolicitada) {
        this.materiaSolicitada = materiaSolicitada;
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

    public int getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(int Estudiante) {
        this.Estudiante = Estudiante;
    }
    
    
    
    
    

    
    
    

}
