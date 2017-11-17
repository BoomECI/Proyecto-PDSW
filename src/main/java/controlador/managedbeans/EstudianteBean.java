package controlador.managedbeans;


import entidades.Acudiente;
import entidades.Consejero;
import entidades.Estudiante;
import entidades.Materia;
import entidades.PlanDeEstudios;
import entidades.SolicitudCancelacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;
import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;



@ManagedBean(name="beanSolicitudEstudiante")
@SessionScoped
public class EstudianteBean implements Serializable{
    
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    private Date fechaCancelacion;                         
    private List<SolicitudCancelacion> solicitudes;
    private PlanDeEstudios planDeEstudios;
    private List<Materia> materiasCursadas;
    private List<Materia> materiasActuales;
    private Estudiante estudianteActual;
    private String materiaSeleccionada;
    private String descripcionCancelacion;
    private int creditosRestantes;
    private SolicitudCancelacion solicitudEstudiante;
    
    
    public EstudianteBean(){
        fechaCancelacion = new Date();
        ArrayList<Materia> mA = new ArrayList<Materia>();
        mA.add(new Materia("APMU","Apreciacion musical", 3, null, null));
        mA.add(new Materia("FRED","Fundamentos de redes", 3, null, null));
        mA.add(new Materia("PRON","Procesos de negocios", 3, null, null));
        mA.add(new Materia("ACFI","Analisis contable y financiero", 3, null, null));
        mA.add(new Materia("PDSW","Procesos de desarrollo de software", 4, null, null));
        ArrayList<Materia> mC = new ArrayList<Materia>();
        mC.add(new Materia("IINS","Introduccion a la ingenieria de sistemas",3,null,null));
        mC.add(new Materia("MMIN","Modelos matematicos para la informatica",3,null,null));
        mC.add(new Materia("DEPD","Deporte dirigido",3,null,null));
        mC.add(new Materia("ALLI","Algebra lineal",4,null,null));
        PlanDeEstudios PDE = new PlanDeEstudios();
        PDE.setNumeroDeCreditosTotales(154);
        estudianteActual= new Estudiante(2110805,"Juan David Ramirez Mendoza","juanda@hotmail.com",12345,new Consejero(12,"Oswaldo","oswald.com"), new Acudiente(23,"Giovanni","gio.com",1234),
                                                            1019138849,"cc",mA,mC,PDE,null);
        materiasCursadas = estudianteActual.getMateriasCursadas();
        materiasActuales = estudianteActual.getMateriasActuales();
        planDeEstudios = estudianteActual.getPlanDeEstudios();
        solicitudes = estudianteActual.getSolicitudes();
    }
    
    public EstudianteBean(Estudiante estudianteActual) throws ExcepcionServiciosCancelaciones{
        this.estudianteActual = estudianteActual;
    }

    public SolicitudCancelacion getSolicitudEstudiante() {
        return solicitudEstudiante;
    }

    public void setSolicitudEstudiante(SolicitudCancelacion solicitudEstudiante) {
        this.solicitudEstudiante = solicitudEstudiante;
    }
    
    
    public ServiciosCancelaciones getServCanc(){
        return servCanc;
    }

    public int getCreditosRestantes() {
        return creditosRestantes;
    }

    public void setCreditosRestantes(int creditosRestantes) {
        this.creditosRestantes = creditosRestantes;
    }
    
    
    public Estudiante getEstudianteActual() {
        return estudianteActual;
    }

    public void setEstudianteActual(Estudiante estudianteActual) {
        this.estudianteActual = estudianteActual;
    }

    public String getMateriaSeleccionada() {
        return materiaSeleccionada;
    }

    public void setMateriaSeleccionada(String materiaSeleccionada) {
        this.materiaSeleccionada = materiaSeleccionada;
    }

    public List<Materia> getMateriasActuales(){
        return materiasActuales;
    }

    public void setMateriasActuales(List<Materia> materiasActuales) {
        this.materiasActuales = materiasActuales;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String getDescripcionCancelacion() {
        return descripcionCancelacion;
    }

    public void setDescripcionCancelacion(String descripcionCancelacion) {
        this.descripcionCancelacion = descripcionCancelacion;
    }
    
   // public void cancelarMateria() throws ExcepcionServiciosCancelaciones{
       // solicitudEstudiante = new SolicitudCancelacion(fechaCancelacion, "Esperando respuesta", 1, descripcionCancelacion, materiaSeleccionada , "nada",2110805);
     //   servCanc.agregarSolicitudCancelacionEstudiante( solicitudEstudiante);
   // }
    
    public void analizarSolicitud() throws ExcepcionServiciosCancelaciones{
       creditosRestantes = servCanc.consultarImpacto(comparar(), estudianteActual);
    }

    public PlanDeEstudios getPlanDeEstudios() {
        return planDeEstudios;
    }

    public void setPlanDeEstudios(PlanDeEstudios planDeEstudios) {
        this.planDeEstudios = planDeEstudios;
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(List<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public List<SolicitudCancelacion> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudCancelacion> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    public String cancelarSolicitud(){
        return "solicitudcancelada.xhtml";
    }
    
    public String finalizar(){
        return "esperarsolicitud.xhtml";
    }
    
    public String irAtras(){
        return "serviciocancelaciones.xhtml";
    }

    public Materia comparar(){
        Materia mt = null;
        for (Materia i: materiasActuales){
            if(i.getNemonico().equals(materiaSeleccionada)){
                mt = i;
            }
        }
        return mt;
    }
}
