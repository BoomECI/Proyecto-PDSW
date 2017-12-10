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
        solicitudesNoTramitadas = servCanc.consultarCancelacionesNoTramitadasAconsejados(idConsejero);
        Collections.sort(solicitudesTramitadas);
        Collections.sort(solicitudesNoTramitadas);
        
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
        Grafo grafo = p.convertStringToGrafo("{\n" +
"	\"materias\": [\"CALD\",\"MMIN\",\"ALLI\",\"IINS\",\"EALE\",\"CIED\",\"LCAL\",\"FIMF\",\"PIMB\",\"MDIS\",\"FIEM\",\"MBDA\",\"PIMO\",\"EHU1\",\"PDIS\",\"TPRO\",\"ARQC\",\n" +
"	\"ELCB\",\"POOB\",\"ESTI\",\"TCOM\",\"FRED\",\"TSOR\",\"PDSW\",\"FUNE\",\"SEGI\",\"SOPC\",\"PRON\",\"ARSW\",\"ACFI\",\"AREM\",\"COSW\", \"EHU2\",\"FGPR\",\"ET01\", \n" +
"	\"SOSW\", \"EHU3\", \"ELEA\", \"ET02\", \"PGR1\", \"CRIP\", \"ET03\", \"CLE1\", \"PGR2\", \"CLE2\"],\n" +
"	\"CALD\": {\"nombre\" : \"Calculo diferencial\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"AGEO\",\"PRE\"]}, \n" +
"	\"MMIN\": {\"nombre\" : \"Modelos matematicos para informatica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"FFIS\": {\"nombre\" : \"Fundamentos de Fisica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"FMAT\": {\"nombre\" : \"Fundamentos de Matematicas\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"AGEO\": {\"nombre\" : \"Analisis Geometrico\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"PREM\": {\"nombre\" : \"Precalculo\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FMAT\"]},\n" +
"	\"EXOE\": {\"nombre\" : \"Expresion Oral y Escrita\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"DEPD\": {\"nombre\" : \"Deporte Dirigido\", \n" +
"			\"creditos\":\"0\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"ALLI\": {\"nombre\" : \"Algebra lineal\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PREM\",\"AGEO\"]}, \n" +
"	\"IINS\": {\"nombre\" : \"Introduccion a la ingenieria de sistemas\", \n" +
"			\"creditos\":\"2\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"EALE\": {\"nombre\" : \"Electiva en el area de lengua espanola\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EXOE\"]}, \n" +
"	\"CIED\": {\"nombre\" : \"Calculo integral y ecuaciones diferenciales\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CALD\"]}, \n" +
"	\"LCAL\": {\"nombre\" : \"Logica calculativa\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"MMIN\"]}, \n" +
"	\"FIMF\": {\"nombre\" : \"Fisica mecanica y fluidos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [\"CALD\"], \n" +
"			\"pre\" : [\"FFIS\"]}, \n" +
"	\"PIMB\": {\"nombre\" : \"Programacion imperativa basica\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"MDIS\": {\"nombre\" : \"Matematicas discretas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"LCAL\"]}, \n" +
"	\"FIEM\": {\"nombre\" : \"Fisica del electromagnetismo\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [\"CIED\"], \n" +
"			\"pre\" : [\"FIMF\"]}, \n" +
"	\"MBDA\": {\"nombre\" : \"Modelos y bases de datos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"LCAL\",\"PIMB\"]}, \n" +
"	\"PIMO\": {\"nombre\" : \"Programacion imperativa modular\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMB\", \"LCAL\"]}, \n" +
"	\"EHU1\": {\"nombre\" : \"Electiva humanistica 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EALE\"]}, \n" +
"	\"PDIS\": {\"nombre\" : \"Probabilidad discreta\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CIED\"]}, \n" +
"	\"TPRO\": {\"nombre\" : \"Teoria de la programacion\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"MDIS\",\"PIMO\"]}, \n" +
"	\"ARQC\": {\"nombre\" : \"Arquitectura del computador\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FIEM\"]}, \n" +
"	\"ELCB\": {\"nombre\" : \"Electiva en ciencias basicas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"POOB\": {\"nombre\" : \"Programacion orientada a objetos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMO\"]}, \n" +
"	\"ESTI\": {\"nombre\" : \"Estadistica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PDIS\"]}, \n" +
"	\"TCOM\": {\"nombre\" : \"Teoria de la computacion\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"POOB\",\"MDIS\"]}, \n" +
"	\"FRED\": {\"nombre\" : \"Fundamentos de redes\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ARQC\"]}, \n" +
"	\"TSOR\": {\"nombre\" : \"Teoria de sistemas y organizaciones\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PDSW\": {\"nombre\" : \"Procesos de desarrollo de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"POOB\",\"MBDA\"]}, \n" +
"	\"FUNE\": {\"nombre\" : \"Fundamentos de economia\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CALD\"]}, \n" +
"	\"SEGI\": {\"nombre\" : \"Seguridad informatica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FRED\"]}, \n" +
"	\"SOPC\": {\"nombre\" : \"Sistemas operativos y plataformas computacionales\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ARQC\"]}, \n" +
"	\"PRON\": {\"nombre\" : \"Procesos de negocio\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"TSOR\"]}, \n" +
"	\"ARSW\": {\"nombre\" : \"Arquitectura de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FRED\",\"PDSW\"]}, \n" +
"	\"ACFI\": {\"nombre\" : \"Analisis contable y financiero\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FUNE\"]}, \n" +
"	\"AREM\": {\"nombre\" : \"Arquitecturas empresariales\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PRON\"]}, \n" +
"	\"COSW\": {\"nombre\" : \"Construccion de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PRON\",\"ARSW\"]}, \n" +
"	\"EHU2\": {\"nombre\" : \"Electiva humanistica 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EHU1\"]}, \n" +
"	\"FGPR\": {\"nombre\" : \"Fundamentos y gerencia de proyectos\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ACFI\"]}, \n" +
"	\"ET01\": {\"nombre\" : \"Electiva tecnica 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"SOSW\": {\"nombre\" : \"Soluciones de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"AREM\",\"ARSW\"]}, \n" +
"	\"EHU3\": {\"nombre\" : \"Electiva humanistica 3\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EHU2\"]}, \n" +
"	\"ELEA\": {\"nombre\" : \"Electiva economico-administrativa\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ET02\": {\"nombre\" : \"Electiva tecnica 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ET01\"]}, \n" +
"	\"PGR1\": {\"nombre\" : \"Proyecto de grado 1\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FGPR\"]}, \n" +
"	\"CRIP\": {\"nombre\" : \"Colombia: realidad e instituciones politicas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ET03\": {\"nombre\" : \"Electiva tecnica 3\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ET02\"]}, \n" +
"	\"CLE1\": {\"nombre\" : \"Curso de libre eleccion 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PGR2\": {\"nombre\" : \"Proyecto de grado 2\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PGR1\"]}, \n" +
"	\"CLE2\": {\"nombre\" : \"Curso de libre eleccion 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}\n" +
"}");
        //Grafo grafo = p.convertStringToGrafo(planDeEstudiosEstudianteSolicitud.getGrafo());
        creditosCarrera = planDeEstudiosEstudianteSolicitud.getNumeroDeCreditosTotales();
        fechaSolicitud = solicitudSeleccionada.getFecha();
        materiaCanceladaSolicitud = solicitudSeleccionada.getMateria();
        List<String> canceladaString = new ArrayList();
        canceladaString.add(materiaCanceladaSolicitud);
        creditosRestantes = servCanc.consultarImpacto(canceladaString, estudianteSolicitud, grafo);
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
    
    public String consultarEstudianteNombre(long id) throws ExcepcionServiciosCancelaciones{
        return servCanc.consultarEstudiante(id).getNombre();
    }

    
    
    
}
