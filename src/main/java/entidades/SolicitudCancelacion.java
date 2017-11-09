/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author camil
 */
public class SolicitudCancelacion {
    
    private Materia materiaSolicitada;
    private String descripcion;
    private Date fecha;
    private String estado;
    private Boolean avalConsejero;
    private Boolean avalAcudiente;
    private int id;
    private String comentario;
    private Estudiante estudiante;

    
    public SolicitudCancelacion(Date fecha, String estado, int id, Estudiante estudiante, String descripcion, Materia materiaSolicitada, String comentario) {
        this.materiaSolicitada = materiaSolicitada;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.id = id;
        this.estudiante = estudiante;
        this.comentario = comentario;
    }

    public Materia getMateriaSolicitada() {
        return materiaSolicitada;
    }

    public void setMateriaSolicitada(Materia materiaSolicitada) {
        this.materiaSolicitada = materiaSolicitada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
    

    
    
    

}
