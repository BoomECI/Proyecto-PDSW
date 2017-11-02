/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.servicios;

/**
 *
 * @author Boomeci
 */
public interface ServiciosCancelaciones {
    /**
     * Consultar un estudiante dado su carnet.
     * @param idEstudiante carnet del estudiante
     * @return el paciente con el carnet dado
     * @throws ExcepcionServiciosCancelaciones si el estudiante no existe
     */
    public abstract Estudiante consultarEstudiante(int idEstudiante) throws ExcepcionServiciosCancelaciones;
    
    /**
     * Agrega una consulta a un paciente ya registrado
     * @param idEstudiante el identificador del paciente
     * @param solicitudCancelacion la solicitud de cancelación a ser agregada
     * @throws ExcepcionServiciosCancelaciones si se presenta algún error de persistencia o si el paciente no existe.
     */
    public abstract void agregarSolicitudCancelacionEstudiante(int idEstudiante, SolicitudCancelacion solicitudCancelacion) throws ExcepcionServiciosCancelaciones;
        
}


public interface ServiciosPacientes {
    
    
   

        
    /**
     * Consultar todos los pacientes .
     * @return el paciente con el identificador dado
     * @throws ExcepcionServiciosPacientes error en la persistencia al momento de consultar los pacientes
     */
    public abstract List<Paciente> consultarPacientes() throws ExcepcionServiciosPacientes;
    
    /**
     * Registra un nuevo PACIENTE en el sistema
     * @param paciente El nuevo paciente
     * @throws ExcepcionServiciosPacientes error en la persistencia al momento de registrar un nuevo paciente
     */
    public abstract void registrarNuevoPaciente(Paciente paciente) throws ExcepcionServiciosPacientes;
    
    /**
     * Agrega una consulta a un paciente ya registrado
     * @param idPaciente el identificador del paciente
     * @param tipoid el tipo de identificación
     * @param consulta la consulta a ser agregada
     * @throws ExcepcionServiciosPacientes si se presenta algún error de persistencia o si el paciente no existe.
     */
    public abstract void agregarConsultaPaciente(int idPaciente,String tipoid,Consulta consulta) throws ExcepcionServiciosPacientes;
        
    
    /**
     * Consultar las consultas de una eps con un rango de fechas
     * @param nameEps El nombre de la Eps en cuestion
     * @param fechaInicio fecha inicial del rango de las consultas a tener encuenta
     * @param fechaFin fecha final del rango de las consultas a tener encuenta
     * @return las consultas asociadas a una Eps en un rango de fechas dado
     * @throws ExcepcionServiciosPacientes si se presenta algún error lógico
     * o de persistencia (por ejemplo, si el paciente ya existe).
     */
    public abstract List<Consulta> obtenerConsultasEpsPorFecha(String nameEps,Date fechaInicio,Date fechaFin) throws ExcepcionServiciosPacientes;
    
    /**
     * Consultar el costo total de una eps con un rango de fechas
     * @param nameEps El nombre de la Eps en cuestion
     * @param fechaInicio fecha inicial del rango de las consultas a tener encuenta
     * @param fechaFin fecha final del rango de las consultas a tener encuenta
     * @return Deuda total de las consultas asociadas a una Eps en un rango de fechas dado
     * @throws ExcepcionServiciosPacientes si se presenta algún error lógico
     * o de persistencia (por ejemplo, si el paciente ya existe).
     */
    public abstract long obtenerCostoEpsPorFecha(String nameEps,Date fechaInicio,Date fechaFin) throws ExcepcionServiciosPacientes;
    
    /**
     * Obtiene todas las consultas asociadas a una EPS dada
     * @param nameEps nombre de la Eps en cuestion
     * @return Lista con todas las consultas asociadas a dicha Eps
     * @throws ExcepcionServiciosPacientes si se presenta algún error lógico
     * o de persistencia.
     */
    public abstract List<Consulta> obtenerConsultasEps(String nameEps) throws ExcepcionServiciosPacientes;
    

    /**
     * Obtiene todas las EPSs registradas en el sistema
     * @return Lista con todas las EPSs registradas.
     * @throws ExcepcionServiciosPacientes si se presenta algún error lógico
     * o de persistencia.
     */
    public abstract List<Eps> obtenerEPSsRegistradas() throws ExcepcionServiciosPacientes;
    
    
    
    
}