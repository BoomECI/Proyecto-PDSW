/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia;

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author BOOMECI
 */
public interface EstudianteDAO {
    public Estudiante loadByID(long id);
    public List<Estudiante> loadAll();
    public List<Materia> loadMateriasActuales(long id);
    public List<Materia> loadMateriasCursadas(long id);    
    //public void actualizarEstudiante(Estudiante p);
    public void save(SolicitudCancelacion solicitudCancelacion);
    
    
}
