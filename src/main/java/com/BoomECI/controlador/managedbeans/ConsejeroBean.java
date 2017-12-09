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
import java.util.Collections;

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
    private String nombreConsejero;
    private long idConsejero;
    private List<String> nombresSolicitantesSi;
    private List<String> nombresSolicitantesNo;
    
    
    public ConsejeroBean() throws ExcepcionServiciosCancelaciones{
        solicitudSeleccionada = new SolicitudCancelacion();
        consejeroActual = servCanc.consultarConsejero(2345678);
        nombreConsejero = consejeroActual.getNombre();
        idConsejero = consejeroActual.getId();
        solicitudesTramitadas = servCanc.consultarCancelacionesTramitadasAconsejados(idConsejero);
        solicitudesNoTramitadas = servCanc.consultarCancelacionesNoTramitadasAconsejados(idConsejero);
        Collections.sort(solicitudesTramitadas);
        Collections.sort(solicitudesNoTramitadas);
        for(SolicitudCancelacion i: solicitudesTramitadas){
            nombresSolicitantesSi.add(servCanc.consultarEstudiante(i.getEstudiante()).getNombre());
        }
        for(SolicitudCancelacion j: solicitudesNoTramitadas){
            nombresSolicitantesNo.add(servCanc.consultarEstudiante(j.getEstudiante()).getNombre());
        }
        
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

    public String getNombreConsejero() {
        return nombreConsejero;
    }

    public void setNombreConsejero(String nombreConsejero) {
        this.nombreConsejero = nombreConsejero;
    }

    public long getIdConsejero() {
        return idConsejero;
    }

    public void setIdConsejero(long idConsejero) {
        this.idConsejero = idConsejero;
    }

    public List<String> getNombresSolicitantesSi() {
        return nombresSolicitantesSi;
    }

    public void setNombresSolicitantesSi(List<String> nombresSolicitantesSi) {
        this.nombresSolicitantesSi = nombresSolicitantesSi;
    }

    public List<String> getNombresSolicitantesNo() {
        return nombresSolicitantesNo;
    }

    public void setNombresSolicitantesNo(List<String> nombresSolicitantesNo) {
        this.nombresSolicitantesNo = nombresSolicitantesNo;
    }
    
    
    
    
    public String tramitar() throws ExcepcionServiciosCancelaciones{
        servCanc.agregarComentarioConsejero(solicitudSeleccionada.getId(), comentario);
        servCanc.cambiarElAvalDeConsejero(solicitudSeleccionada.getId(), aval);
        servCanc.cambiarElestadoDeLaSolicitud(solicitudSeleccionada.getId(), "Tramitada");
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
    
    public String tramitarSolicitud() throws ExcepcionServiciosCancelaciones{
        nombreEstudianteSolicitud = servCanc.consultarEstudiante(solicitudSeleccionada.getEstudiante()).getNombre();
        return "tramitarsolicitud.xhtml";
    }
    
    public String irAtras(){
        return "listadosolcancel.xhtml";
    }

    
    
    
}
