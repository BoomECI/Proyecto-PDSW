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
    private String justificacionCancelacion;
    private int creditosRestantes;
    private SolicitudCancelacion solicitudEstudiante;
    
    
    public EstudianteBean() throws ExcepcionServiciosCancelaciones{
        fechaCancelacion = new Date();
        estudianteActual = servCanc.consultarEstudiante(2110805);
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

    public String getJustificacionCancelacion() {
        return justificacionCancelacion;
    }

    public void setJustificacionCancelacion(String justificacionCancelacion) {
        this.justificacionCancelacion = justificacionCancelacion;
    }
    
   public void cancelarMateria() throws ExcepcionServiciosCancelaciones{
       solicitudEstudiante = new SolicitudCancelacion(fechaCancelacion, "Pendiente", solicitudes.size()+1, justificacionCancelacion, "", false, false, materiaSeleccionada ,estudianteActual.getCodigo());
       servCanc.agregarSolicitudCancelacionEstudiante(solicitudEstudiante);
   }
    
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
