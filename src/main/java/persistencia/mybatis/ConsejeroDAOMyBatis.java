/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mybatis;
import entidades.SolicitudCancelacion;
import java.util.List;
import persistencia.ConsejeroDAO;
/**
 *
 * @author danie
 */
public class ConsejeroDAOMyBatis implements ConsejeroDAO {    
    
    @Override
    public List<SolicitudCancelacion> loadSolicitudes(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SolicitudCancelacion> loadSolicitudesTramitadas(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SolicitudCancelacion> loadMSolicitudesNoTramitadas(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
