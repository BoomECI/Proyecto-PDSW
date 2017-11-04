/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.servicios.impl;

import ClasesVacias.EstudianteDao;
import Lógica.servicios.ExcepcionServiciosCancelaciones;
import Lógica.servicios.ServiciosCancelaciones;
import com.google.inject.Inject;
import entidades.Estudiante;
import entidades.PlanDeEstudios;
import entidades.SolicitudCancelacion;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author boomEci
 */
public class ServiciosCancelacionesImpl implements ServiciosCancelaciones {

    @Inject
    private EstudianteDao daoEst;
    
    @Override
    public Estudiante consultarEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        try {
            return daoEst.load(idEstudiante);
        } catch (PersistenceException ex) {
            throw new ExcepcionServiciosCancelaciones("Error al realizar la consulta del estudiante:  "+idEstudiante+"..........."+ex.getLocalizedMessage(), ex);
        }
    }

    @Override
    public void agregarSolicitudCancelacionEstudiante(int idEstudiante, SolicitudCancelacion solicitudCancelacion) throws ExcepcionServiciosCancelaciones{
        try{
            Estudiante estudiante = consultarEstudiante(idEstudiante);
            //estudiante.getSolicitudCancelaciones().add(solicitudCancelacion);
        }catch(ExcepcionServiciosCancelaciones e){
          //  throw new ExcepcionServiciosCancelaciones("Error al realizar la consulta del estudiante:  "+idEstudiante+"..........."+ex.getLocalizedMessage(), ex);
        }
            
         
    }

    @Override
    public void consultarSolicitudCancelacionEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SolicitudCancelacion> consultarTodasLasSolicitudesCancelacion() throws ExcepcionServiciosCancelaciones {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
