/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mybatis.mappers;

import entidades.SolicitudCancelacion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author 2108419
 */
public interface ConsejeroMapper {
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(@Param("ide") int id);
    public List<SolicitudCancelacion> loadMSolicitudesNoTramitadas(@Param("ide") int id);
    public void cambiarEstadoSolicitud(@Param("ide")int id_soli,@Param("est") String estado);
    public void agregarComentarioConsejero(@Param("ide")int id_soli, @Param("com")String comentario);
    public void cambiarElAvalDeConsejero(@Param("ide")int id_soli, @Param("aval")boolean aval);
            
    
    
}
