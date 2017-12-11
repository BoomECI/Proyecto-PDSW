/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia.mybatis.mappers;

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author BOOMECI
 */
public interface EstudianteMapper {   
    
    public Estudiante loadEstudianteById(@Param("ide") long id);
    
    public List<Estudiante> consultarEstudiantes();
    
    public List<Materia> loadMateriasActualesById (@Param("ide")long id);
    
    public List<Materia> loadMateriasCursadasById (@Param("ide")long id);
    
    public void insertarSolicitud(@Param("sol") SolicitudCancelacion solicitud);
    
    //public void insertarEstudiante(@Param("est")Estudiante e);
    
    //public void actualizarEstudiante(@Param("uest") Estudiante e );

    public PlanDeEstudios loadPlanDeEstudiosById(@Param("ide") long id);
}
