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
    
    
    
    public ConsejeroBean() throws ExcepcionServiciosCancelaciones{
        solicitudSeleccionada = new SolicitudCancelacion();
        solicitudesTramitadas = new ArrayList<SolicitudCancelacion>();
        solicitudesNoTramitadas = new ArrayList<SolicitudCancelacion>();
        solicitudesTramitadas.add(new SolicitudCancelacion(new Date(117,11,22), "Tramitada", 1, "No voy bien y no entiendo nada", "Vaya a clase vago", false, false, "ACFI", 1));
        solicitudesNoTramitadas.add(new SolicitudCancelacion(new Date(116,05,14), "Pendiente", 1, "No tengo tiempo para estudiar la correccion de algoritmos", null, false, false, "TPRO", 2));
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
    
    public void tramitar() throws ExcepcionServiciosCancelaciones{
        servCanc.agregarComentarioConsejero(consejeroActual.getId(), solicitudSeleccionada.getComentario());
        servCanc.cambiarElAvalDeConsejero(consejeroActual.getId(), solicitudSeleccionada.getAvalConsejero());
        servCanc.cambiarElestadoDeLaSolicitud(consejeroActual.getId(), "Tramitada");
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
