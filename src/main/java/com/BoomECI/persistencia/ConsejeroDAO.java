/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia;

import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author BoomEci
 */
public interface ConsejeroDAO {    
    
    /**
     *Carga la solicitudes tramitadas dado el id.
     * @param id
     * @return lista de solicitudes
     */
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(long id);
    /**
     *Carga la solicitudes no tramitadas dado el id.
     * @param id
     * @return lista de solicitudes
     */
    
    public List<SolicitudCancelacion> loadSolicitudesNoTramitadas(long id);    
    /**
     *Cambia el estado de una solicitud
     * @param id_soli id de la solicitud
     * @param estado nuevo estado
     * 
     */
    
    public void cambiarEstadoSolicitud(int id_soli, String estado);
    /**
     *agrega comentario del consejero
     *  @param id_soli id de la solicitud
     * @param comentario nuevo comentario
     */
    public void agregarComentarioConsejero(int id_soli, String comentario);
    /**
     *Cambia el estado de aval del consejero
     *  @param id_soli id de la oslicitud
     * @param aval nuevo estado de aval
     */
    public void cambiarElAvalDeConsejero(int id_soli, Boolean aval);
    /**
     *Consulta un consejero por id
     * @param idConsejero
     * @return Consejero
     */
    public Consejero consultarConsejero(long idConsejero);
    
}
