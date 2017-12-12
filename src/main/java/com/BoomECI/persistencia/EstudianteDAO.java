/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.persistencia;

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author BOOMECI
 */
public interface EstudianteDAO {
    /**
     *Carga estudiante dado el id
     * @param 
     *  @return Estudiante
     */
    public Estudiante loadByID(long id);
    /**
     *Carga todos los estudiantes
     * 
     *  @return lista con todos los estudiantes de la base de datos
     */
    public List<Estudiante> loadAll();
    /**
     *Carga las materias que esta viendo un estudiante especifico en el semestre actual 
     * @param id id del estudiante
     *  @return lista de materias actuales
     */
    public List<Materia> loadMateriasActuales(long id);
    /**
     *Carga las materias que ya curso un estudiante dado el id
     * @param id id del estudiante
     *  @return Lista de materias cursadas
     */
    public List<Materia> loadMateriasCursadas(long id);    
    //public void actualizarEstudiante(Estudiante p);
    /**
     *guarda una nueva solicitud de cancelacion
     * @param solicitudCancelacion solictud a agregar
     *
     */
    public void save(SolicitudCancelacion solicitudCancelacion);
    /**
     *Consulta el plan de estudios dado el id
     * @param id del plan de estudios
     *  @return Plan de estudios especifico
     */
    public PlanDeEstudios consultarPlanDeEstudio(int id);
    /**
     *Carga todas las solicitudes
     *
     *  @return lista de todas la solicitudes de cancelacion 
     */
    public List<SolicitudCancelacion> loadAllSolicitudes();
    
}
