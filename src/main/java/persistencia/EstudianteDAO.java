/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Estudiante;

/**
 *
 * @author BOOMECI
 */
public interface EstudianteDAO {
    public Estudiante loadByID(int id);
    public void loadAll();
    //public void actualizarEstudiante(Estudiante p);
    
    
}
