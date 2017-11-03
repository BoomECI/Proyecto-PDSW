/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author danie
 */
public class SolicitudCancelacion {
    
    private Date fecha;
    private String razon;
    private Materia materia;
    private String avalConsejero;
    private String avalAcudiente;

        
    public SolicitudCancelacion(Date fecha, String razon, Materia materia){
        this.fecha = fecha;
        this.razon = razon;
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
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
    
    
    
    
    
    
    
}
