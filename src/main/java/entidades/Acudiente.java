/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author BoomEci
 */
public class Acudiente {
    
    private int cedula;
    private String nombre;
    private String correo;
    private int telefono;

    public Acudiente(){
    }
    public Acudiente(int id, String nombre, String correo, int telefono){
        this.cedula = id;
        this.nombre = nombre;
        this.correo = correo;    
        this.telefono = telefono;
    }

    public int getId() {
        return cedula;
    }

    public void setId(int id) {
        this.cedula = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
