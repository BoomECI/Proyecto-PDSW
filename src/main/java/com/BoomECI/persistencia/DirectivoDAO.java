/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia;

import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author BoomECI
 */
public interface DirectivoDAO {
    /**
     *Carga solicitudes tramitadas para el directivo
     *  @return lista de solicitudes
     */
    public List<SolicitudCancelacion> loadSolicitudesTramitadas();
    /**
     *Carga solicitudes no tramitadas para el directivo
     *  @return lista de solicitudes
     */
    public List<SolicitudCancelacion> loadSolicitudesNoTramitadas();    
}
