/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia.mybatis;

import com.BoomECI.entidades.SolicitudCancelacion;
import com.BoomECI.persistencia.DirectivoDAO;
import com.BoomECI.persistencia.mybatis.mappers.DirectivoMapper;
import com.google.inject.Inject;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author danie
 */
public class DirectivoDAOMyBatis implements DirectivoDAO{

    @Inject
    DirectivoMapper Dirmaper;         

    @Override
    public List<SolicitudCancelacion> loadSolicitudesNoFinalizadas(int carrera) {
        try{        
            List<SolicitudCancelacion> solicitudes= Dirmaper.loadSolicitudesNoFinalizadas(carrera);
            return solicitudes;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        } 
    }

    @Override
    public List<SolicitudCancelacion> loadSolicitudesFinalizadas(int carrera) {
        try{        
            List<SolicitudCancelacion> solicitudes= Dirmaper.loadSolicitudesFinalizadas(carrera);
            return solicitudes;
        }
        catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        }  
    }
    
}
