/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVacias;

import entidades.Estudiante;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author Nicolás
 */
public interface EstudianteDao {
    public Estudiante loadByID(int id) throws PersistenceException;    
    public  List<Estudiante> loadAll();
    
    public Estudiante load();
        
    public void save();
    
    public void update(Estudiante paciente) throws PersistenceException;
}
