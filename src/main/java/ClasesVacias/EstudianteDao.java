/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVacias;

import entidades.Estudiante;
import javax.persistence.PersistenceException;

/**
 *
 * @author Nicolás
 */
public interface EstudianteDao {
    public Estudiante load(int id) throws PersistenceException;    
}
