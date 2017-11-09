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
    private String avalConsejero;
    private String avalAcudiente;
    private String comentarioConsejero;
        
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
    
    public String getAvalConsejero() {
        return avalConsejero;
    }

    public void setAvalConsejero(String avalConsejero) {
        this.avalConsejero = avalConsejero;
    }

    public String getAvalAcudiente() {
        return avalAcudiente;
    }

    public void setAvalAcudiente(String avalAcudiente) {
        this.avalAcudiente = avalAcudiente;
    }

    public String getComentarioConsejero() {
        return comentarioConsejero;
    }

    public void setComentarioConsejero(String comentarioConsejero) {
        this.comentarioConsejero = comentarioConsejero;
    }
    
    
    
    
    
    
    
}
