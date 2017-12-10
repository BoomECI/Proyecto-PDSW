/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.controlador.managedbeans;

import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ParserGrafo;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelacionesFactory;
import java.util.Collections;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

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
    private int creditosRestantes;
    private int creditosCarrera;
    private int anoGraduacion;
    private TreeNode root;
    private Estudiante estudianteSolicitud;
    private PlanDeEstudios planDeEstudiosEstudianteSolicitud;
    private Date fechaSolicitud;
    private String materiaCanceladaSolicitud;
    private List<List<String>> proyeccion;
    
    public ConsejeroBean() throws ExcepcionServiciosCancelaciones{
        nombresSolicitantesSi = new ArrayList();
        nombresSolicitantesNo = new ArrayList();
        solicitudSeleccionada = new SolicitudCancelacion();
        consejeroActual = servCanc.consultarConsejero(2345678);
        nombreConsejero = consejeroActual.getNombre();
        idConsejero = consejeroActual.getId();
        solicitudesTramitadas = servCanc.consultarCancelacionesTramitadasAconsejados(idConsejero);
        //System.out.println("TRAMITADAS"+solicitudesTramitadas.size());
        //System.out.println(solicitudesTramitadas.get(0));
        solicitudesNoTramitadas = servCanc.consultarCancelacionesNoTramitadasAconsejados(idConsejero);
        //System.out.println("PENDIENTES"+solicitudesNoTramitadas.size());
        //System.out.println(solicitudesNoTramitadas.get(0).getFecha());
        if(solicitudesTramitadas.size()>1){
            Collections.sort(solicitudesTramitadas);
        }
        if(solicitudesNoTramitadas.size()>1){
            Collections.sort(solicitudesNoTramitadas);
        }
        for(SolicitudCancelacion i: solicitudesTramitadas){
            System.out.println(i+"   "+i.getEstudiante());
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

    public int getCreditosRestantes() {
        return creditosRestantes;
    }

    public void setCreditosRestantes(int creditosRestantes) {
        this.creditosRestantes = creditosRestantes;
    }

    public int getCreditosCarrera() {
        return creditosCarrera;
    }

    public void setCreditosCarrera(int creditosCarrera) {
        this.creditosCarrera = creditosCarrera;
    }

    public Estudiante getEstudianteSolicitud() {
        return estudianteSolicitud;
    }

    public void setEstudianteSolicitud(Estudiante estudianteSolicitud) {
        this.estudianteSolicitud = estudianteSolicitud;
    }
    
    

    public int getAnoGraduacion() {
        return anoGraduacion;
    }

    public void setAnoGraduacion(int anoGraduacion) {
        this.anoGraduacion = anoGraduacion;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public PlanDeEstudios getPlanDeEstudiosEstudianteSolicitud() {
        return planDeEstudiosEstudianteSolicitud;
    }

    public void setPlanDeEstudiosEstudianteSolicitud(PlanDeEstudios planDeEstudiosEstudianteSolicitud) {
        this.planDeEstudiosEstudianteSolicitud = planDeEstudiosEstudianteSolicitud;
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getMateriaCanceladaSolicitud() {
        return materiaCanceladaSolicitud;
    }

    public void setMateriaCanceladaSolicitud(String materiaCanceladaSolicitud) {
        this.materiaCanceladaSolicitud = materiaCanceladaSolicitud;
    }

    public List<List<String>> getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(List<List<String>> proyeccion) {
        this.proyeccion = proyeccion;
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
        ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        
        estudianteSolicitud = servCanc.consultarEstudiante(solicitudSeleccionada.getEstudiante());
        nombreEstudianteSolicitud = estudianteSolicitud.getNombre();
        planDeEstudiosEstudianteSolicitud = estudianteSolicitud.getPlanDeEstudios();
        Grafo grafo = p.convertStringToGrafo(planDeEstudiosEstudianteSolicitud.getGrafo());
        creditosCarrera = planDeEstudiosEstudianteSolicitud.getNumeroDeCreditosTotales();
        fechaSolicitud = solicitudSeleccionada.getFecha();
        List<Materia> cancelada = new ArrayList();
        materiaCanceladaSolicitud = solicitudSeleccionada.getMateria();
        List<String> canceladaString = new ArrayList();
        canceladaString.add(materiaCanceladaSolicitud);
        cancelada.add(comparar());
        creditosRestantes = servCanc.consultarImpacto(cancelada, estudianteSolicitud);
        proyeccion = servCanc.calcularProyeccion(estudianteSolicitud, canceladaString, grafo);
        root = new DefaultTreeNode("Proyeccion", null);
        for(int i=0; i<proyeccion.size(); i++){
           TreeNode semestre = new DefaultTreeNode("en "+(i+1)+" Semestres", root);
           for(int j=0; j<proyeccion.get(i).size(); j++){
               TreeNode materia = new DefaultTreeNode(proyeccion.get(i).get(j), semestre);
           }
        }
        anoGraduacion = (fechaSolicitud.getYear()+1900) + (int)(proyeccion.size()/2);
        
        return "tramitarsolicitud.xhtml";
    }
    
    public String irAtras(){
        return "listadosolcancel.xhtml";
    }
    
    public Materia comparar(){
        List<Materia> materias = estudianteSolicitud.getMateriasActuales();
        for(Materia i: materias){
            if(i.getNemonico().equals(materiaCanceladaSolicitud)){
                return i;
            }
        }
        return null;
    }

    
    
    
}
