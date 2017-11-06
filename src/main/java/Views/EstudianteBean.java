package Views;
import Logic.ServiciosCancelacionesImpl;
import Logic.ServiciosCancelacionesFactory;
import Logic.Estudiante;
import Logic.Materia;
import Logic.SolicitudCancelacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Logic.ServiciosCancelaciones;
import java.util.Date;


@ManagedBean(name="beanSolicitudEstudiante")
@SessionScoped
public class EstudianteBean implements Serializable {
    
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    private Estudiante estudianteActual= new Estudiante(2110805,"Juan David Ramirez Mendoza");
    //private Materia materiaSeleccionada;
    private String materiaSeleccionada;

    /*private int idEstudiante;
    private String nombreEstudiante;
    private String nemonicoMateriaSeleccionada;
    private String nombreMateriaSeleccionada;*/
    private Date fechaCancelacion;
    private String descripcionCancelacion;
    private List<Materia> materiasCursando;
    private int creditosRestantes = 56;
    
    
    
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

    public List<Materia> getMateriasCursando(){
        materiasCursando = new ArrayList<Materia>();
        materiasCursando.add(new Materia("ACFI","Analisis contable y financiero",3));
        materiasCursando.add(new Materia("PRON","Procesos de negocios",3));
        materiasCursando.add(new Materia("PDSW","Procesos de desarrollo de software",4));
        materiasCursando.add(new Materia("FRED","Fundamentos de redes",3));
        materiasCursando.add(new Materia("APMU","Apreciacion musical",3));
        return materiasCursando;
    }

    public void setMateriasCursando(List<Materia> materiasCursando) {
        this.materiasCursando = materiasCursando;
    }
    
   
   /* public String getNemonicoMateriaSeleccionada(){
        return nemonicoMateriaSeleccionada;
    }
    
    public void setNemonicoMateriaSeleccionada(String nemonicoMateriaSeleccionada){
        this.nemonicoMateriaSeleccionada = nemonicoMateriaSeleccionada;
        
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
*/
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
    
    /*public Estudiante getEstudianteActual() {
        estudianteActual =  new Estudiante();
        estudianteActual.setId(2110805);
        estudianteActual.setNombre("Juan David Ramirez Mendoza");
        ArrayList<Materia> materias = new ArrayList<Materia>();
        
        materias.add(new Materia("PDSW", "Procesos de desarrollo de sofware",4));
        materias.add(new Materia("PRON", "Procesos de negocio",3));
        materias.add(new Materia("APMU", "Apreciacion musical",3));
        materias.add(new Materia("FRED", "Fundamentos de redes",3));
        materias.add(new Materia("ACFI", "Analisis contable y financiero",3));
        
        estudianteActual.setMateriasCursando(materias);
        return estudianteActual;
    }

    public void setEstudianteActual(Estudiante estudianteActual) {
        this.estudianteActual = estudianteActual;
    }*/
    
    
    
   /* public void setNombreEstudiante(String nombreEstudiante){
        this.nombreEstudiante = nombreEstudiante;
    }
    
    public String getNombreEstudiante(){
        return nombreEstudiante;
    }
    */
    
    public void cancelarMateria(){
        servCanc.agregarSolicitudCancelacionEstudiante(estudianteActual.getId(), new SolicitudCancelacion(comparar(), descripcionCancelacion, fechaCancelacion));
    }
    
    public void analizarSolicitud(){
        //creditosRestantes = cancEstudiantes.calcularImpacto(estudianteActual, comparar());
    }
    
    public String cancelarSolicitud(){
        return "solicitudcancelada.xhtml";
    }
    
    public String finalizar(){
        return "esperarsolicitud.xhtml";
    }

    public Materia comparar(){
        Materia mt = null;
        for (Materia i: materiasCursando){
            if(i.getNemonico().equals(materiaSeleccionada)){
                mt = i;
            }
        }
        return mt;
    }
    
}
