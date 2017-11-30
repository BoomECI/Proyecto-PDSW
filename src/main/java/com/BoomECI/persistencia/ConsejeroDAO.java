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
 * @author BoomEci
 */
public interface ConsejeroDAO {    
    
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(int id);
    public List<SolicitudCancelacion> loadSolicitudesNoTramitadas(int id);    
    public void cambiarEstadoSolicitud(int id_soli, String estado);
    public void agregarComentarioConsejero(int id_soli, String comentario);
    public void cambiarElAvalDeConsejero(int id_soli, boolean aval);
    
}
