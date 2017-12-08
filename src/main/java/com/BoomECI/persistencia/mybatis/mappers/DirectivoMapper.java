/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia.mybatis.mappers;

import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author BoomECI
 */
public interface DirectivoMapper {
    public List<SolicitudCancelacion> loadSolicitudesTramitadas();
    public List<SolicitudCancelacion> loadSolicitudesNoTramitadas();
}
