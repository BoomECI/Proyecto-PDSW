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
import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;



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
    private List<String> materiasSeleccionadas;
    private String[] justificacionesCancelacion;
    private int creditosRestantes;
    private SolicitudCancelacion solicitudEstudiante;
    private TabView tablaMaterias;
    
    
    public EstudianteBean() throws ExcepcionServiciosCancelaciones{
        fechaCancelacion = new Date();
        estudianteActual = servCanc.consultarEstudiante(2110805);
        materiasCursadas = estudianteActual.getMateriasCursadas();
        materiasActuales = estudianteActual.getMateriasActuales();
        planDeEstudios = estudianteActual.getPlanDeEstudios();
        solicitudes = estudianteActual.getSolicitudes();
        tablaMaterias = new TabView();
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

    public List<String> getMateriasSeleccionadas() {
        return materiasSeleccionadas;
    }

    public void setMateriasSeleccionadas(List<String> materiasSeleccionadas) {
        this.materiasSeleccionadas = materiasSeleccionadas;
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

    public String[] getJustificacionesCancelacion() {
        return justificacionesCancelacion;
    }

    public void setJustificacionesCancelacion(String[] justificacionesCancelacion) {
        this.justificacionesCancelacion = justificacionesCancelacion;
    }
    
   public void cancelarMateria() throws ExcepcionServiciosCancelaciones{
       for(int i = 0; i < materiasSeleccionadas.size(); i++){
            solicitudEstudiante = new SolicitudCancelacion(fechaCancelacion, "Pendiente", solicitudes.size()+1, justificacionesCancelacion[i], "", false, false, materiasSeleccionadas.get(i) ,estudianteActual.getCodigo());
            servCanc.agregarSolicitudCancelacionEstudiante(solicitudEstudiante);
       }
       
   }
    
    public void analizarSolicitud() throws ExcepcionServiciosCancelaciones{
       justificacionesCancelacion = new String[materiasSeleccionadas.size()];
       for(int i = 0; i < materiasSeleccionadas.size(); i++){
           Tab tab = new Tab();
           tab.setTitle(materiasSeleccionadas.get(i));
           InputTextarea ita = new InputTextarea();
           ita.setValue(justificacionesCancelacion[i]);
           tab.getChildren().add(ita);
           tablaMaterias.getChildren().add(tab);
       }
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

    public TabView getTablaMaterias() {
        return tablaMaterias;
    }

    public void setTablaMaterias(TabView tablaMaterias) {
        this.tablaMaterias = tablaMaterias;
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

    public List<Materia> comparar(){
        List<Materia> mt = new ArrayList<Materia>();
        List<String> mSels = materiasSeleccionadas;
        
        int k = 0;
        while (mSels.size() > 0){
            for(Materia i: materiasActuales){
                if(i.getNemonico().equals(mSels.get(k))){
                    mt.add(i);
                    mSels.remove(k);
                }
            }
        }
       
        return mt;
    }
}
