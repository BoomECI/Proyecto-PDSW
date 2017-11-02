/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author boomEci
 */
public class Estudiante {
    
    private int id;
    private String nombre;
    private String carrera;
    private String correo;
    private Consejero consejero;
    private Acudiente acudiente;
    
    public Estudiante(int id, String nombre, String carrera, String correo, Consejero consejero, Acudiente acudiente){
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.correo = correo;
        this.consejero = consejero;
        this.acudiente = acudiente;    
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Consejero getConsejero() {
        return consejero;
    }

    public void setConsejero(Consejero consejero) {
        this.consejero = consejero;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }
    
       
    
}
