/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia.mybatis;
import com.BoomECI.entidades.Consejero;
import com.google.inject.Inject;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;
import javax.persistence.PersistenceException;
import com.BoomECI.persistencia.ConsejeroDAO;
import com.BoomECI.persistencia.mybatis.mappers.ConsejeroMapper;

/**
 *
 * @author BoomEci
 */
public class ConsejeroDAOMyBatis implements ConsejeroDAO{       
    

    @Inject
    ConsejeroMapper Conmaper;  
    
    @Override
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(long id){
        try{        
            List<SolicitudCancelacion> solicitudes= Conmaper.loadSolicitudesTramitadas(id);
            return solicitudes;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        }
    }
    
    @Override
    public List<SolicitudCancelacion> loadSolicitudesNoTramitadas(long id){
        try{        
            List<SolicitudCancelacion> solicitudes= Conmaper.loadSolicitudesNoTramitadas(id);
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
    }


    @Override
    public Consejero consultarConsejero(long idConsejero) {
        try{
            return Conmaper.consultarConsejero(idConsejero);
        }catch(Exception e){
            throw new PersistenceException("Error al consultar consejero:"+e.getLocalizedMessage(), e);
        }
    }
   
    
}
