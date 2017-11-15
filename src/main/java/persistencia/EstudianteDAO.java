/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Estudiante;
import entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author BOOMECI
 */
public interface EstudianteDAO {
    public Estudiante loadByID(int id);
    public List<Estudiante> loadAll();
    //public void actualizarEstudiante(Estudiante p);
    public void save(int idEstudiante, SolicitudCancelacion solicitudCancelacion);
    
    
}
