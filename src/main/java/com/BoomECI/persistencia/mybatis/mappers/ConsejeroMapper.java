/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia.mybatis.mappers;

import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author BoomECI
 */
public interface ConsejeroMapper {
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(@Param("ide") long id);
    public List<SolicitudCancelacion> loadSolicitudesNoTramitadas(@Param("ide") long id);
    public void cambiarEstadoSolicitud(@Param("ide")int id_soli,@Param("est") String estado);
    public void agregarComentarioConsejero(@Param("ide")int id_soli, @Param("com")String comentario);
    public void cambiarElAvalDeConsejero(@Param("ide")int id_soli, @Param("aval")Boolean aval);  
    public Consejero consultarConsejero(@Param("ide")long idConsejero);
}
