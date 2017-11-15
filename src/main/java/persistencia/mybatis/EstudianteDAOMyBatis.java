/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.mybatis;

import entidades.Estudiante;
import entidades.SolicitudCancelacion;
import persistencia.EstudianteDAO;

/**
 *
 * @author BOOMECI 
 */
public class EstudianteDAOMyBatis implements EstudianteDAO {

    @Override
    public void loadAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudiante loadByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(int idEstudiante, SolicitudCancelacion solicitudCancelacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
