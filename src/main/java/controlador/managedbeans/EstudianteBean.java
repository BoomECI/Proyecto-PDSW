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
import logica.servicios.ExcepcionServiciosCancelaciones;
import logica.servicios.ServiciosCancelaciones;
import logica.servicios.ServiciosCancelacionesFactory;


@ManagedBean(name="beanSolicitudEstudiante")
@SessionScoped
public class EstudianteBean implements Serializable {
    
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    private List<SolicitudCancelacion> solicitudes=new ArrayList<SolicitudCancelacion>();
    private List<Materia> materiasActuales=new ArrayList<Materia>();                          
    private List<Materia> materiasCursadas=new ArrayList<Materia>();
    private PlanDeEstudios planDeEstudios= new PlanDeEstudios();
    private Estudiante estudianteActual= new Estudiante(2110805,"Juan David Ramirez Mendoza","juanda@hotmail.com",12345,new Consejero(12,"Oswaldo","oswald.com"), new Acudiente(23,"Giovanni","gio.com",1234),
                                                            1019138849,"cc",materiasActuales,materiasCursadas,planDeEstudios,solicitudes);

    
   
    //private Materia materiaSeleccionada;
    private String materiaSeleccionada;

    /*private int idEstudiante;
    private String nombreEstudiante;
    private String nemonicoMateriaSeleccionada;
    private String nombreMateriaSeleccionada;*/
    private Date fechaCancelacion = new Date();
    private String descripcionCancelacion;
    private int creditosRestantes = 56;
    private SolicitudCancelacion solicitudEstudiante;

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
    
    public EstudianteBean(){
      
        materiasActuales.add(new Materia("ACFI","Analisis contable y financiero",3,null,null));
        materiasActuales.add(new Materia("PRON","Procesos de negocios",3,null,null));
        materiasActuales.add(new Materia("PDSW","Procesos de desarrollo de software",4,null,null));
        materiasActuales.add(new Materia("FRED","Fundamentos de redes",3,null,null));
        materiasActuales.add(new Materia("APMU","Apreciacion musical",3,null,null));
        //materiasCursando = cancEstudiantes.consultarEstudiante(estudianteActual.getId()).getMateriasCursando();
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
    
    public void cancelarMateria() throws ExcepcionServiciosCancelaciones{
        solicitudEstudiante = new SolicitudCancelacion(fechaCancelacion, "Esperando respuesta", 1, descripcionCancelacion, materiaSeleccionada , "nada");
        servCanc.agregarSolicitudCancelacionEstudiante(estudianteActual.getCodigo(), solicitudEstudiante);
    }
    
    public void analizarSolicitud(){
       
    }
    
    public String cancelarSolicitud(){
        return "solicitudcancelada.xhtml";
    }
    
    public String finalizar(){
        return "esperarsolicitud.xhtml";
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
