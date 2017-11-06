/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Juan David
 */
public interface ServiciosCancelaciones {
    public void agregarSolicitudCancelacionEstudiante(int id, SolicitudCancelacion solicitudCancelacion);
    public Estudiante consultarEstudiante(int idEstudiante);
    public int calcularImpacto(Estudiante estudianteActual, Materia materiaSeleccionada);
}
