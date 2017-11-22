/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.managedbeans;

import entidades.Consejero;
import entidades.Estudiante;
import entidades.SolicitudCancelacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;

/**
 *
 * @author camil
 */

@ManagedBean(name="beanSolicitudConsejero")
@SessionScoped
public class ConsejeroBean implements Serializable{
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    private List<SolicitudCancelacion> solicitudes;
    private Consejero consejeroActual;
    private List<SolicitudCancelacion> solicitudesNoTramitadas;
    private List<SolicitudCancelacion> solicitudesTramitadas;
    private SolicitudCancelacion solicitudSeleccionada;
    
    
    
    public ConsejeroBean() throws ExcepcionServiciosCancelaciones{
       
        solicitudes = new ArrayList<SolicitudCancelacion>();
        solicitudes.add(new SolicitudCancelacion(new Date(117,11,22), "Pendiente", 1, "No voy bien y no entiendo nada", "", false, false, "ACFI", 1));
        solicitudes.add(new SolicitudCancelacion(new Date(116,05,14), "Pendiente", 1, "No tengo tiempo para estudiar la correccion de algoritmos", "", false, false, "TPRO", 2));
        consejeroActual = new Consejero(222340, "Rodrigo Lopez", "rodrigo.lopez@escuelaing.edu.co", null);
        //solicitudes = servCanc.consultarCancelacionesAconsejados(consejeroActual.getId());
        //solicitudesNoTramitadas = servCanc.consultarCancelacionesNoTramitadasAconsejados(consejeroActual.getId());
        //solicitudesTramitadas = servCanc.consultarCancelacionesTramitadasAconsejados(consejeroActual.getId());
    }

    public ServiciosCancelaciones getServCanc() {
        return servCanc;
    }

    public List<SolicitudCancelacion> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudCancelacion> solicitudes) {
        this.solicitudes = solicitudes;
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
    
    public String irASolicitud(){
        return "detallesolicitud.xhtml";
    }
    
    
    
    
}
