/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author boomEci
 */
public class Estudiante {
    
    private int codigo;
    private String nombre;
    private String correo;
    private int telefono;
    private Consejero consejero;
    private Acudiente acudiente;
    private int identificacion;
    private String tipo_id;
    private List<Materia> materiasActuales;
    private List<Materia> materiasCursadas;
    private PlanDeEstudios planDeEstudios;
    
    private String carrera;
        
    public Estudiante(int codigo, String nombre, String correo,
                      int telefono,Consejero consejero, Acudiente acudiente,
                      int identificacion,String tipo_id,List<Materia> materiasActuales,
                      List<Materia> materiasCursadas, PlanDeEstudios planDeEstudios,String carrera){
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.consejero = consejero;
        this.acudiente = acudiente; 
        this.identificacion = identificacion;
        this.tipo_id = tipo_id;
        this.materiasActuales = materiasActuales;
        this.materiasCursadas = materiasCursadas;
        this.planDeEstudios = planDeEstudios;
        this.carrera = carrera; // NO SE SABE SI VA O NO
        
    }    

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public Consejero getConsejero() {
        return consejero;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getTipo_id() {
        return tipo_id;
    }

    public List<Materia> getMateriasActuales() {
        return materiasActuales;
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public PlanDeEstudios getPlanDeEstudios() {
        return planDeEstudios;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setConsejero(Consejero consejero) {
        this.consejero = consejero;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipo_id(String tipo_id) {
        this.tipo_id = tipo_id;
    }

    public void setMateriasActuales(List<Materia> materiasActuales) {
        this.materiasActuales = materiasActuales;
    }

    public void setMateriasCursadas(List<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public void setPlanDeEstudios(PlanDeEstudios planDeEstudios) {
        this.planDeEstudios = planDeEstudios;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

   
}
