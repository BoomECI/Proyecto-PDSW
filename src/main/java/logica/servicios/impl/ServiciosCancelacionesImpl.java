/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios.impl;

import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ServiciosCancelaciones;
import logica.services.CalculoDeImpacto;
import com.google.inject.Inject;
import entidades.Estudiante;
import entidades.Materia;
import entidades.PlanDeEstudios;
import entidades.SolicitudCancelacion;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import org.mybatis.guice.transactional.Transactional;
import persistencia.ConsejeroDAO;
import persistencia.EstudianteDAO;
import persistencia.mybatis.mappers.EstudianteMapper;

/**
 *
 * @author boomEci
 */
public class ServiciosCancelacionesImpl implements ServiciosCancelaciones {

    @Inject
    private EstudianteDAO daoEst;
    
    @Inject
    private CalculoDeImpacto impacto;
    
    @Inject
    private ConsejeroDAO daoCon;
    
    @Transactional
    @Override
    public List<Estudiante> consultarEstudiantes() throws ExcepcionServiciosCancelaciones {
        try {
            return daoEst.loadAll();
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Transactional
    @Override
    public Estudiante consultarEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try {
            return daoEst.loadByID(idEstudiante);
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Transactional
    @Override
    public void agregarSolicitudCancelacionEstudiante(SolicitudCancelacion solicitudCancelacion) throws ExcepcionServiciosCancelaciones{
        try{            
            daoEst.save(solicitudCancelacion);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarSolicitudCancelacionEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try{
            Estudiante estudiante = daoEst.loadByID(idEstudiante);
            return estudiante.getSolicitudes();            
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return null;
    }
    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarTodasLasSolicitudesCancelacion() throws ExcepcionServiciosCancelaciones {
        return null;
    }
    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarSolicitudesTramitadas() throws ExcepcionServiciosCancelaciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarSolicitudesNoTramitadas() throws ExcepcionServiciosCancelaciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int consultarImpacto(Materia cancelada, Estudiante estudiante) throws ExcepcionServiciosCancelaciones {        
        return impacto.CalculoImpacto(cancelada, estudiante);
    }    

    
    @Override
    public List<SolicitudCancelacion> consultarCancelacionesTramitadasAconsejados(int id) throws ExcepcionServiciosCancelaciones {
        try{            
            return daoCon.loadSolicitudesTramitadas(id);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<SolicitudCancelacion> consultarCancelacionesNoTramitadasAconsejados(int id) throws ExcepcionServiciosCancelaciones {
        
        try{             
            return daoCon.loadMSolicitudesNoTramitadas(id);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void cambiarCreditosTotalesPorSemestre(int creditos) {
    }

    @Override
    public void agregarComentarioConsejero(int id_soli, String comentario) throws ExcepcionServiciosCancelaciones {
        try{
            daoCon.agregarComentarioConsejero(id_soli,comentario);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cambiarElestadoDeLaSolicitud(int id_soli, String estado) throws ExcepcionServiciosCancelaciones {
        try{
            daoCon.cambiarEstadoSolicitud(id_soli, estado);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cambiarElAvalDeConsejero(int id_soli, boolean aval) throws ExcepcionServiciosCancelaciones {
        try{
            daoCon.cambiarElAvalDeConsejero(id_soli, aval);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
       
}
 