/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

import java.util.List;

public class Estudiante {
    
    private int codigo;
    private String nombre;
    private String correo;
    private int telefono;
    private Consejero consejero;
    private Acudiente acudiente;
    private int identificacion;
    private String tipo_id;
    private List<Materia> materiasActuales;
    private List<Materia> materiasCursadas;
    private PlanDeEstudios planDeEstudios;
    private List<SolicitudCancelacion> solicitudes;
    
    public Estudiante(){}
    public Estudiante(int codigo, String nombre, String correo,
                      int telefono,Consejero consejero, Acudiente acudiente,
                      int identificacion,String tipo_id,List<Materia> materiasActuales,
                      List<Materia> materiasCursadas, PlanDeEstudios planDeEstudios,List<SolicitudCancelacion> solicitudes){
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.consejero = consejero;
        this.acudiente = acudiente; 
        this.identificacion = identificacion;
        this.tipo_id = tipo_id;
        this.materiasActuales = materiasActuales;
        this.materiasCursadas = materiasCursadas;
        this.planDeEstudios = planDeEstudios;
        this.solicitudes=solicitudes;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Consejero getConsejero() {
        return consejero;
    }

    public void setConsejero(Consejero consejero) {
        this.consejero = consejero;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }

    public List<Materia> getMateriasActuales() {
        return materiasActuales;
    }

    public void setMateriasActuales(List<Materia> materiasActuales) {
        this.materiasActuales = materiasActuales;
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(List<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public PlanDeEstudios getPlanDeEstudios() {
        return planDeEstudios;
    }

    public void setPlanDeEstudios(PlanDeEstudios planDeEstudios) {
        this.planDeEstudios = planDeEstudios;
    }

    public List<SolicitudCancelacion> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudCancelacion> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    
    
}

