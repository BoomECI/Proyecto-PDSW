/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mybatis;

import com.google.inject.Inject;
import entidades.Estudiante;
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
        
            return Estmaper.consultarEstudiantes();
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
    public void save(int idEstudiante, SolicitudCancelacion solicitudCancelacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
