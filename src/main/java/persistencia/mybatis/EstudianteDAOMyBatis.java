/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mybatis;

import com.google.inject.Inject;
import entidades.Estudiante;
import entidades.Materia;
import entidades.SolicitudCancelacion;
import java.util.List;
import javax.persistence.PersistenceException;
import persistencia.EstudianteDAO;
import persistencia.mybatis.mappers.EstudianteMapper;

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
    public Estudiante loadByID(int id) {
        try{
        
            return Estmaper.loadEstudianteById(id);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void save(Estudiante estudiante, SolicitudCancelacion solicitudCancelacion) {
        try{
            Estmaper.insertarSolicitud(estudiante, solicitudCancelacion);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        }
    }
    
    @Override
    public List<Materia> loadMateriasActuales(int id){
       try{
           return Estmaper.loadMateriasActualesById(id);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        } 
    }
    
    @Override
    
    public List<Materia> loadMateriasCursadas(int id){
       try{
           return Estmaper.loadMateriasCursadasById(id);
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar el estudiante:"+e.getLocalizedMessage(), e);
        } 
    }
    
}
