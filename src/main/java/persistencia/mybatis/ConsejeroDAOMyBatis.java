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
import persistencia.ConsejeroDAO;
import persistencia.mybatis.mappers.ConsejeroMapper;
import persistencia.mybatis.mappers.EstudianteMapper;
/**
 *
 * @author danie
 */
public class ConsejeroDAOMyBatis {       
    
    /**@Inject
    ConsejeroMapper Conmaper;
    
    
    @Override
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(int id){
        try{        
            List<SolicitudCancelacion> solicitudes= Conmaper.loadSolicitudesTramitadas(id);
            return solicitudes;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public List<SolicitudCancelacion> loadMSolicitudesNoTramitadas(int id){
        try{        
            List<SolicitudCancelacion> solicitudes= Conmaper.loadMSolicitudesNoTramitadas(id);
            return solicitudes;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void cambiarEstadoSolicitud(int id_soli, String estado) {
        try{
            Conmaper.cambiarEstadoSolicitud(id_soli,estado);
        }catch(Exception e){
            throw new PersistenceException("Error al cambiar el estado de la solicitud:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarComentarioConsejero(int id_soli, String comentario) {
         try{
            Conmaper.agregarComentarioConsejero(id_soli, comentario);
        }catch(Exception e){
            throw new PersistenceException("Error al agregar comentario del consejero:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void cambiarElAvalDeConsejero(int id_soli, boolean aval) {
        try{
            Conmaper.cambiarElAvalDeConsejero(id_soli, aval);
        }catch(Exception e){
            throw new PersistenceException("Error al cambiar el aval del consejero:"+e.getLocalizedMessage(), e);
        }
    }**/

    
    
}
