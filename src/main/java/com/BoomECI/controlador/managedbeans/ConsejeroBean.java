/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.controlador.managedbeans;

import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelacionesFactory;

/**
 *
 * @author BoomEci
 */

@ManagedBean(name="beanSolicitudConsejero")
@SessionScoped
public class ConsejeroBean implements Serializable{
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    private Consejero consejeroActual;
    private List<SolicitudCancelacion> solicitudesNoTramitadas;
    private List<SolicitudCancelacion> solicitudesTramitadas;
    private SolicitudCancelacion solicitudSeleccionada;
    private String nombreEstudianteSolicitud;
    private String comentario;
    private boolean aval;
    
    
    public ConsejeroBean() throws ExcepcionServiciosCancelaciones{
        solicitudSeleccionada = new SolicitudCancelacion();
        solicitudesTramitadas = new ArrayList<>();
        solicitudesNoTramitadas = new ArrayList<>();
        //solicitudesTramitadas.add(new SolicitudCancelacion(new Date(117,11,22), "Tramitada",1, "No voy bien y no entiendo nada", "Vaya a clase vago", false, false, "ACFI", 1));
        //solicitudesNoTramitadas.add(new SolicitudCancelacion(new Date(116,05,14), "Pendiente",1, "No tengo tiempo para estudiar la correccion de algoritmos", null, false, false, "TPRO", 2));
        consejeroActual = new Consejero(222340, "Rodrigo Lopez", "rodrigo.lopez@escuelaing.edu.co", null);
    }

    public ServiciosCancelaciones getServCanc() {
        return servCanc;
    }

    public Consejero getConsejeroActual() {
        return consejeroActual;
    }

    public void setConsejeroActual(Consejero consejeroActual) {
        this.consejeroActual = consejeroActual;
    }

    public List<SolicitudCancelacion> getSolicitudesNoTramitadas() {
        return solicitudesNoTramitadas;
    }

    public List<SolicitudCancelacion> getSolicitudesTramitadas() {
        return solicitudesTramitadas;
    }

    public SolicitudCancelacion getSolicitudSeleccionada() {
        return solicitudSeleccionada;
    }

    public void setSolicitudSeleccionada(SolicitudCancelacion solicitudSeleccionada) {
        this.solicitudSeleccionada = solicitudSeleccionada;
    }

    public String getNombreEstudianteSolicitud() {
        return nombreEstudianteSolicitud;
    }

    public void setNombreEstudianteSolicitud(String nombreEstudianteSolicitud) {
        this.nombreEstudianteSolicitud = nombreEstudianteSolicitud;
    }
    
    public String tramitar() throws ExcepcionServiciosCancelaciones{
        servCanc.agregarComentarioConsejero(consejeroActual.getId(), comentario);
        servCanc.cambiarElAvalDeConsejero(consejeroActual.getId(), aval);
        servCanc.cambiarElestadoDeLaSolicitud(consejeroActual.getId(), "Tramitada");
        return "listadosolcancel.xhtml";
        
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isAval() {
        return aval;
    }

    public void setAval(boolean aval) {
        this.aval = aval;
    }
    
    public String consultarSolicitud() throws ExcepcionServiciosCancelaciones{
        nombreEstudianteSolicitud = servCanc.consultarEstudiante(solicitudSeleccionada.getEstudiante()).getNombre();
        return "consultarsolicitud.xhtml";
    }
    
    public String tramitarSolicitud() throws ExcepcionServiciosCancelaciones{
        nombreEstudianteSolicitud = servCanc.consultarEstudiante(solicitudSeleccionada.getEstudiante()).getNombre();
        return "tramitarsolicitud.xhtml";
    }
    
    public String irAtras(){
        return "listadosolcancel.xhtml";
    }
    
    
    
}
