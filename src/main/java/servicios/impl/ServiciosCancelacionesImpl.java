/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.impl;

import entidades.Estudiante;
import entidades.Materia;
import entidades.SolicitudCancelacion;
import servicios.ServiciosCancelaciones;

/**
 *
 * @author camil
 */
public class ServiciosCancelacionesImpl implements ServiciosCancelaciones{

    @Override
    public void agregarSolicitudCancelacionEstudiante(int id, SolicitudCancelacion solicitudCancelacion) {
        
    }

    @Override
    public Estudiante consultarEstudiante(int idEstudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calcularImpacto(Estudiante estudianteActual, Materia materiaSeleccionada) {
        return 0;
    }
    
}
