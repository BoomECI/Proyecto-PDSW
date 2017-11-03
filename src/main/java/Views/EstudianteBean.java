package Views;
import Logic.CancelacionesEstudiantes;
import Logic.CancelacionesEstudiantesFactory;
import Logic.Estudiante;
import Logic.Materia;
import Logic.SolicitudCancelacion;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2110805
 */

@ManagedBean(name="beanSolicitudEstudiante")
@SessionScoped
public class EstudianteBean implements Serializable {
    
    private final CancelacionesEstudiantes cancEstudiantes = CancelacionesEstudiantesFactory.getInstance().getCancelacionesEstudiantes();
    private String nombreEstudiante = "Juan Perez";
    private int idEstudiante;
    private Materia materiaSeleccionada;
    private String fechaCancelacion;
    private String descripcionCancelacion;

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
    
    
    
    public void setNombreEstudiante(String nombreEstudiante){
        this.nombreEstudiante = nombreEstudiante;
    }
    
    public String getNombreEstudiante(){
        return nombreEstudiante;
    }
    
    
    public void cancelarMateria(){
        cancEstudiantes.agregarSolicitudCancelacionEstudiante(idEstudiante, new SolicitudCancelacion(materiaSeleccionada, descripcionCancelacion, fechaCancelacion));
    }
    
    public void setMateriaSeleccionada(Materia materiaSeleccionada){
        this.materiaSeleccionada = materiaSeleccionada;
    }
    
    public Materia getMateriaSeleccionada(){
        return materiaSeleccionada;
    }
    
}
