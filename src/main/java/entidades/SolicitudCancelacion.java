/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author BOOMECI
 */
public class SolicitudCancelacion {
    private Date fecha;
    private String justificacion;
    private Materia materia;
    private Boolean avalConsejero;
    private Boolean avalAcudiente;
    private String comentarioConsejero;
    private int id;
    private Estudiante estudiente;
    private String estado;
        
    public SolicitudCancelacion(Date fecha, String justificacion, Materia materia){
        this.fecha = fecha;
        this.justificacion = justificacion;
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getjustificacion() {
        return justificacion;
    }

    public void setjustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
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

    public String getComentarioConsejero() {
        return comentarioConsejero;
    }

    public void setComentarioConsejero(String comentarioConsejero) {
        this.comentarioConsejero = comentarioConsejero;
    }
    
    
    
    
    
    
    
}
