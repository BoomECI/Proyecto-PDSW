package Views;
import Logic.CancelacionesEstudiantes;
import Logic.CancelacionesEstudiantesFactory;
import Logic.Estudiante;
import Logic.Materia;
import Logic.SolicitudCancelacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="beanSolicitudEstudiante")
@SessionScoped
public class EstudianteBean implements Serializable {
    
    //private final CancelacionesEstudiantes cancEstudiantes = CancelacionesEstudiantesFactory.getInstance().getCancelacionesEstudiantes();
    private Estudiante estudianteActual;

    
    private int idEstudiante;
    private String nemonicoMateriaSeleccionada;
    //private Materia materiaSeleccionada;
    private String fechaCancelacion;
    private String descripcionCancelacion;
    
    public EstudianteBean(){
        
    }
    public String getNemonicoMateriaSeleccionada(){
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

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String getDescripcionCancelacion() {
        return descripcionCancelacion;
    }

    public void setDescripcionCancelacion(String descripcionCancelacion) {
        this.descripcionCancelacion = descripcionCancelacion;
    }
    
    public Estudiante getEstudianteActual() {
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
    }
    
    
    
    /*public void setNombreEstudiante(String nombreEstudiante){
        this.nombreEstudiante = nombreEstudiante;
    }
    
    public String getNombreEstudiante(){
        return "Pedro perez";
        //return nombreEstudiante;
    }*/
    
    
    /*public void cancelarMateria(){
        cancEstudiantes.agregarSolicitudCancelacionEstudiante(idEstudiante, new SolicitudCancelacion(materiaSeleccionada, descripcionCancelacion, fechaCancelacion));
    }*/
    
   /* public void setMateriaSeleccionada(Materia materiaSeleccionada){
        this.materiaSeleccionada = materiaSeleccionada;
    }
    
    public Materia getMateriaSeleccionada(){
        return materiaSeleccionada;
    }*/
    
}
