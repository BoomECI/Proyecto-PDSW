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
import javax.persistence.PersistenceException;
import org.mybatis.guice.transactional.Transactional;
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
    
    @Transactional
    @Override
    public Estudiante consultarEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try {
            return daoEst.loadByID(idEstudiante);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosCancelaciones("Error al realizar la consulta del estudiante:  "+idEstudiante+"..........."+ex.getLocalizedMessage(), ex);
        }
    }
    @Transactional
    @Override
    public void agregarSolicitudCancelacionEstudiante(int idEstudiante, SolicitudCancelacion solicitudCancelacion) throws ExcepcionServiciosCancelaciones{
        try{
            Estudiante estudiante = daoEst.loadByID(idEstudiante);
            estudiante.getSolicitudes().add(solicitudCancelacion);
            daoEst.save(idEstudiante,solicitudCancelacion);
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCancelaciones("Error al agregar la solicitud de cancelacion del estudiante:  "+idEstudiante+"..........."+e.getLocalizedMessage(), e);
        }       
    }
    @Transactional
    @Override
    public List<SolicitudCancelacion> consultarSolicitudCancelacionEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try{
            Estudiante estudiante = daoEst.loadByID(idEstudiante);
            return estudiante.getSolicitudes();            
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCancelaciones("Error al realizar la consulta del estudiante:  "+idEstudiante+"..........."+e.getLocalizedMessage(), e);
        }   
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
       
}
