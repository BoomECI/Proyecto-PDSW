/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia.mybatis;

import com.google.inject.Inject;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;
import javax.persistence.PersistenceException;
import com.BoomECI.persistencia.EstudianteDAO;
import com.BoomECI.persistencia.mybatis.mappers.EstudianteMapper;

/**
 *
 * @author BOOMECI 
 */
public class EstudianteDAOMyBatis implements EstudianteDAO {
    
    @Inject
    EstudianteMapper Estmaper;
    
    @Override
    
    public List<Estudiante> loadAll() {
        try{        
            List<Estudiante> estudiantes= Estmaper.consultarEstudiantes();
            for(Estudiante i : estudiantes){
                i.setMateriasActuales(Estmaper.loadMateriasActualesById(i.getCodigo())); 
                i.setMateriasCursadas(Estmaper.loadMateriasCursadasById(i.getCodigo()));
            }
            return estudiantes;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar los estudienates:"+e.getLocalizedMessage(), e);
        }
    }    

    @Override
    public Estudiante loadByID(long id) {
        try{
        
            Estudiante x = Estmaper.loadEstudianteById(id);
            x.setMateriasActuales(Estmaper.loadMateriasActualesById(x.getCodigo()));
            x.setMateriasCursadas(Estmaper.loadMateriasCursadasById(x.getCodigo()));
            //PlanDeEstudios p = Estmaper.loadPlanDeEstudiosById(x.getCodigo());            
            //x.setPlanDeEstudios(Estmaper.loadPlanDeEstudiosById(x.getCodigo()));
            return x;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void save(SolicitudCancelacion solicitudCancelacion) {
        try{
            Estmaper.insertarSolicitud(solicitudCancelacion);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        }
    }
    
    @Override
    public List<Materia> loadMateriasActuales(long id){
       try{
           return Estmaper.loadMateriasActualesById(id);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        } 
    }
    
    @Override
    
    public List<Materia> loadMateriasCursadas(long id){
       try{
           return Estmaper.loadMateriasCursadasById(id);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        } 
    }

    @Override
    public PlanDeEstudios consultarPlanDeEstudio(int id) {
        try{
           return Estmaper.loadPlanDeEstudiosById(id);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el Plan de estudios:"+e.getLocalizedMessage(), e);
        } 
    }
}
