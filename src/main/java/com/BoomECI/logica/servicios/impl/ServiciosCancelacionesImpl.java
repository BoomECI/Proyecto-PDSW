/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.servicios.impl;

import com.BoomECI.entidades.Consejero;
import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.google.inject.Inject;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import org.mybatis.guice.transactional.Transactional;
import com.BoomECI.persistencia.ConsejeroDAO;
import com.BoomECI.persistencia.DirectivoDAO;
import com.BoomECI.persistencia.EstudianteDAO;


/**
 *
 * @author BoomEci
 */
public class ServiciosCancelacionesImpl implements ServiciosCancelaciones {

    @Inject
    private EstudianteDAO daoEst;
    
    
    @Inject
    private ConsejeroDAO daoCon;
    
    @Inject
    private DirectivoDAO daoDir;
    
    
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
    public Estudiante consultarEstudiante(long idEstudiante) throws ExcepcionServiciosCancelaciones {
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
    public List<SolicitudCancelacion> consultarSolicitudCancelacionEstudiante(long idEstudiante) throws ExcepcionServiciosCancelaciones {
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
    public int consultarImpacto(List<String> canceladas, Estudiante estudiante, Grafo grafo) throws ExcepcionServiciosCancelaciones {        
        return grafo.CalculoImpacto(canceladas, estudiante);
    }    

    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarCancelacionesTramitadasAconsejados(long id) throws ExcepcionServiciosCancelaciones {
        try{            
            return daoCon.loadSolicitudesTramitadas(id);
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarCancelacionesNoTramitadasAconsejados(long id) throws ExcepcionServiciosCancelaciones {
        
        try{             
            return daoCon.loadSolicitudesNoTramitadas(id);
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

    @Override
    public List<List<String>> calcularProyeccion(Estudiante estudianteActual, List<String> materiasSeleccionadas, Grafo grafo) {
        return grafo.calcularPlanDeEstudios(estudianteActual, materiasSeleccionadas);
    }

    @Override
    public List<SolicitudCancelacion> consultarCancelacionesTramitadas() throws ExcepcionServiciosCancelaciones {
        try{
            return daoDir.loadSolicitudesTramitadas();
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<SolicitudCancelacion> consultarCancelacionesNoTramitadas() throws ExcepcionServiciosCancelaciones {
        try{
            return daoDir.loadSolicitudesNoTramitadas();
        }catch(PersistenceException ex){
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Transactional
    @Override
    public Consejero consultarConsejero(long idConsejero) throws ExcepcionServiciosCancelaciones {
         try {
            return daoCon.consultarConsejero(idConsejero);
        } catch (PersistenceException ex) {
            Logger.getLogger(ServiciosCancelacionesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    
    
       
}
 