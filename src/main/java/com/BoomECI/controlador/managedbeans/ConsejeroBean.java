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
import com.BoomECI.javamail.core.Email;
import com.BoomECI.javamail.core.EmailConfiguration;
import com.BoomECI.javamail.core.EmailSender;
import com.BoomECI.javamail.core.SimpleEmail;
import com.BoomECI.javamail.core.SimpleEmailSender;
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
import com.BoomECI.seguridad.bean.ShiroLoginBean;
import java.util.Collections;
import javax.faces.bean.ManagedProperty;
import javax.mail.MessagingException;
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
    @ManagedProperty(value = "#{loginBean}")
    private ShiroLoginBean seguridad;
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
    private int ciclo;

    
    
    public ConsejeroBean() throws ExcepcionServiciosCancelaciones{
        nombresSolicitantesSi = new ArrayList();
        nombresSolicitantesNo = new ArrayList();
        solicitudSeleccionada = new SolicitudCancelacion();
        
        
    }

    

    public Consejero getConsejeroActual() throws ExcepcionServiciosCancelaciones {
        if (consejeroActual==null){
            consejeroActual = servCanc.consultarConsejero(Integer.parseInt(seguridad.getUsername()));
            nombreConsejero = consejeroActual.getNombre();
            idConsejero = consejeroActual.getId();
            solicitudesTramitadas = servCanc.consultarCancelacionesTramitadasAconsejados(idConsejero);
            solicitudesNoTramitadas = servCanc.consultarCancelacionesNoTramitadasAconsejados(idConsejero);
            Collections.sort(solicitudesTramitadas);
            Collections.sort(solicitudesNoTramitadas);
        }
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
    
    
    public ShiroLoginBean getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(ShiroLoginBean seguridad) {
        this.seguridad = seguridad;
    }
    

    public void setSolicitudSeleccionada(SolicitudCancelacion solicitudSeleccionada) {
        this.solicitudSeleccionada = solicitudSeleccionada;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    public String getNombreEstudianteSolicitud() {
        return nombreEstudianteSolicitud;
    }

    public void setNombreEstudianteSolicitud(String nombreEstudianteSolicitud) {
        this.nombreEstudianteSolicitud = nombreEstudianteSolicitud;
    }

    public String getNombreConsejero() throws ExcepcionServiciosCancelaciones {
        if (consejeroActual==null){
            consejeroActual = servCanc.consultarConsejero(Integer.parseInt(seguridad.getUsername()));
            nombreConsejero = consejeroActual.getNombre();
            idConsejero = consejeroActual.getId();
            solicitudesTramitadas = servCanc.consultarCancelacionesTramitadasAconsejados(idConsejero);
            solicitudesNoTramitadas = servCanc.consultarCancelacionesNoTramitadasAconsejados(idConsejero);
            Collections.sort(solicitudesTramitadas);
            Collections.sort(solicitudesNoTramitadas);
        }
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
        servCanc.cambiarElAvalDeConsejero(solicitudSeleccionada.getId(), (Boolean)aval);
        servCanc.cambiarElestadoDeLaSolicitud(solicitudSeleccionada.getId(), "Tramitada");
        Estudiante estudianteActual=servCanc.consultarEstudiante(solicitudSeleccionada.getEstudiante());
        if ((Boolean)aval){
            Email email = new SimpleEmail(estudianteActual.getConsejero().getCorreo(), estudianteActual.getCorreo(), "SOLICITUD DE CANCELACION APROVADA", "Buen dia "+estudianteActual.getNombre()+ "\n La presente es para informarle"
                                                                                                                 + " que su solicitud de cancelación por la materia"+ solicitudSeleccionada.getMateria() +" se encuentra aprobada.\n"
                                                                                                                 + "El consejero" + consejeroActual.getNombre() + " ha comentado:\n"
                                                                                                                 + solicitudSeleccionada.getComentario()
                                                                                                                 + "\n Para más información por favor ingresar a " + "https://proyectopdsw.herokuapp.com/estudiante/serviciocancelaciones.xhtml"
                                                                                                                 + "\n Gracias por su atención."
                                                                                                                 + "\n Este correo es autogenerado*  ");
        EmailSender sender = new SimpleEmailSender(new EmailConfiguration());
        try {
            sender.send(email);
            System.out.println("Sent message successfully!");
        } catch (MessagingException e) {
            System.err.println("Message not sent!");
            e.printStackTrace();
        }
        }
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
        materiaCanceladaSolicitud = solicitudSeleccionada.getMateria();
        List<String> canceladaString = new ArrayList();
        canceladaString.add(materiaCanceladaSolicitud);
        creditosRestantes = servCanc.consultarImpacto(canceladaString, estudianteSolicitud, grafo);
        proyeccion = servCanc.calcularProyeccion(estudianteSolicitud, canceladaString, grafo);
        root = new DefaultTreeNode("Proyeccion", null);
       for(int i=0; i<proyeccion.size(); i++){
           TreeNode semestre = null;
           if (i==0){
               semestre = new DefaultTreeNode("Para el próximo semestre:", root);
           }
           else{
               semestre = new DefaultTreeNode("Para dentro de "+(i+1)+" Semestres", root);
           }
           for(int j=0; j<proyeccion.get(i).size(); j++){
               TreeNode materia = new DefaultTreeNode(proyeccion.get(i).get(j), semestre);
           }
       }
       anoGraduacion = (fechaSolicitud.getYear()+1900) + (int)(proyeccion.size()/2);
       ciclo = proyeccion.size()/2;
       if ((ciclo*2)==proyeccion.size()){
           ciclo=2;
           
       }
       else{
           ciclo=1;
           anoGraduacion+=1;
       }
        
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
    
    public String consultarEstudianteNombre(long id) throws ExcepcionServiciosCancelaciones{
        return servCanc.consultarEstudiante(id).getNombre();
    }
    
    public String booleanToString(Boolean bool){
        return bool==null? "No aplica": (bool? "Aceptada": "Rechazada");
    }

    
    
    
}
