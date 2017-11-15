/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios.impl;

import logica.servicios.ExcepcionServiciosCancelaciones;
import logica.servicios.ServiciosCancelaciones;
import com.google.inject.Inject;
import entidades.Estudiante;
import entidades.PlanDeEstudios;
import entidades.SolicitudCancelacion;
import java.util.List;
import javax.persistence.PersistenceException;
import persistencia.EstudianteDAO;

/**
 *
 * @author boomEci
 */
public class ServiciosCancelacionesImpl implements ServiciosCancelaciones {

    @Inject
    private EstudianteDAO daoEst;
    
    @Override
    public Estudiante consultarEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try {
            return daoEst.loadByID(idEstudiante);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosCancelaciones("Error al realizar la consulta del estudiante:  "+idEstudiante+"..........."+ex.getLocalizedMessage(), ex);
        }
    }

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

    @Override
    public List<SolicitudCancelacion> consultarSolicitudCancelacionEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try{
            Estudiante estudiante = daoEst.loadByID(idEstudiante);
            return estudiante.getSolicitudes();            
        }catch(PersistenceException e){
            throw new ExcepcionServiciosCancelaciones("Error al realizar la consulta del estudiante:  "+idEstudiante+"..........."+e.getLocalizedMessage(), e);
        }   
    }

    @Override
    public List<SolicitudCancelacion> consultarTodasLasSolicitudesCancelacion() throws ExcepcionServiciosCancelaciones {
        return null;
    }

    @Override
    public List<SolicitudCancelacion> consultarSolicitudesTramitadas() throws ExcepcionServiciosCancelaciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SolicitudCancelacion> consultarSolicitudesNoTramitadas() throws ExcepcionServiciosCancelaciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanDeEstudios consultarImpactoPlanDeEstudios() throws ExcepcionServiciosCancelaciones {        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
