/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.SolicitudCancelacion;
import java.util.List;

/**
 *
 * @author Boomeci
 * 
 */
public interface ServiciosCancelaciones {
    /**
     * Consultar un estudiante dado su carnet.
     * @param idEstudiante carnet del estudiante
     * @return el paciente con el carnet dado
     * @throws ExcepcionServiciosCancelaciones si el estudiante no existe
     */
    public abstract Estudiante consultarEstudiante(long idEstudiante) throws ExcepcionServiciosCancelaciones;
    
    /**
     * Agrega una solicitud de cancelación a un estudiante ya registrado     
     * @param solicitudCancelacion la solicitud de cancelación a ser agregada
     * @throws ExcepcionServiciosCancelaciones si se presenta algún error de persistencia o si el paciente no existe.
     */
    public abstract void agregarSolicitudCancelacionEstudiante(SolicitudCancelacion solicitudCancelacion) throws ExcepcionServiciosCancelaciones;
    
    
    /**
     * Consultar las cancelaciones de un estudiante en particular
     * @param idEstudiante el identificador del paciente     
     * @return Lista de solicitudes    
     * @throws ExcepcionServiciosCancelaciones Si el estudiante no existe o se genere un error de persistencia
     */
    public abstract List<SolicitudCancelacion> consultarSolicitudCancelacionEstudiante(long idEstudiante) throws ExcepcionServiciosCancelaciones;
    
    
    /**
     * Consulta todas las solicitudes de cancelaciones que se han realizado
     * @return Lista con todas las cancelaciones solicitadas 
     * @throws ExcepcionServiciosCancelaciones Si el estudiante no existe o se genere un error de persistencia
     */
    public abstract List<SolicitudCancelacion> consultarTodasLasSolicitudesCancelacion() throws ExcepcionServiciosCancelaciones;
    
    
    /**
     * Consulta todas las solicitudes de cancelaciones que han sido tramitadas, es decir,
     * que tenga el aval del consejero y visto bueno del acudiente(si aplica)
     * @return Lista con todas las solicitudes tramitadas 
     * @throws ExcepcionServiciosCancelaciones Si el estudiante no existe o se genere un error de persistencia
     */
    
    public abstract List<SolicitudCancelacion> consultarSolicitudesTramitadas() throws  ExcepcionServiciosCancelaciones;
    
    /**
     * Consulta todas las solicitudes que NO han sido tramitadas, es decir,
     * si esta pendiente el aval del consejero y/o falta el visto bueno del acudiente(si aplica)
     * @return Lista con todas las cancelaciones solicitadas 
     * @throws ExcepcionServiciosCancelaciones Si el estudiante no existe o se genere un error de persistencia
     */
    public abstract List<SolicitudCancelacion> consultarSolicitudesNoTramitadas() throws  ExcepcionServiciosCancelaciones;
    
    /**
     * Consulta plan de estudios si se cancela la asignatura.
     * @param canceladas materia para simular cancelar
     * @param estudiante estudiante que va consultar el impacto
     * @return Entero que e
     * @throws ExcepcionServiciosCancelaciones Si la materia no se puede cancelar o no existe o si se genera un error de persistencia
     */
    public abstract int consultarImpacto(List<Materia> canceladas, Estudiante estudiante) throws ExcepcionServiciosCancelaciones;    
   
    
    
    /**
     * Consulta todos los estudiantes registrados
     * @return lista de los estudiantes
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract List<Estudiante> consultarEstudiantes() throws ExcepcionServiciosCancelaciones;
    
    
    /**
     * Consulta todas las solicitudes de cancelacion tramitadas de los aconsejados dado el
     * @param id del consejero
     * @return Lista de solicitudes de cancelaciones
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract List<SolicitudCancelacion> consultarCancelacionesTramitadasAconsejados(long id) throws ExcepcionServiciosCancelaciones;
    
    /**
     * Consultar todas las solicitudes de cancelacion no tramitadas de los aconsejados dado el
     * @param id del consejero
     * @return Lista de solicitudes de cancelaciones
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract List<SolicitudCancelacion> consultarCancelacionesNoTramitadasAconsejados(long id) throws ExcepcionServiciosCancelaciones;

    
    /**
     * Agrega el comentario a la solicitud que en el momento este utilizando
     * @param id_soli de la solicitud
     * @param comentario del consejero
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract void agregarComentarioConsejero(int id_soli, String comentario) throws ExcepcionServiciosCancelaciones;
            
    /**
     * Cambia el estado de la solicitud de cancelacion del estudiante. 
     * Cambia de pendiente a tramitada.
     * @param id_soli de la solicitud
     * @param estado de la solicitud
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract void cambiarElestadoDeLaSolicitud(int id_soli, String estado) throws ExcepcionServiciosCancelaciones;     
    
    /**
     * Cambia el aval del consejero con respecto a la solicitud de cancelacion
     * Da la aprobacion(True) o no la aprueba(False)     * 
     * @param id_soli de la solicitud
     * @param aval del consejero
     */
    public abstract void cambiarElAvalDeConsejero(int id_soli, boolean aval)throws ExcepcionServiciosCancelaciones;
    
    public abstract void cambiarCreditosTotalesPorSemestre(int creditosActuales)throws ExcepcionServiciosCancelaciones;

    public List<List<String>> calcularProyeccion(Estudiante estudianteActual, List<String> materiasSeleccionadas, Grafo grafo);
    
    /**
     * Da todas las solicitudes de los estudiantes que ya han sido tramitadas
     * @return Lista de solicitudes Tramitadas de todos los estudiantes
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract List<SolicitudCancelacion> consultarCancelacionesTramitadas() throws ExcepcionServiciosCancelaciones;
    
    /**
     * Da todas las solicitudes de los estudiantes que NO han sido tramitadas
     * @return Lista de solicitudes NO tramitadas de todos los estudiantes
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract List<SolicitudCancelacion> consultarCancelacionesNoTramitadas() throws ExcepcionServiciosCancelaciones;
    
    /**
     * Consulta un consejero dado su id
     * @return un consejero 
     * @throws ExcepcionServiciosCancelaciones 
     */
    public abstract Consejero consultarConsejero(long idConsejero) throws ExcepcionServiciosCancelaciones;
    
    
}    
