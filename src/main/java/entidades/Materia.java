/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Nicolás
 */
public class Materia {
    private String nemonico;
    private String nombre;
    private int creditos;
    List<Materia> prerequisitos;
    List<Materia> coorequisitos;

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setPrerequisitos(List<Materia> prerequisitos) {
        this.prerequisitos = prerequisitos;
    }

    public void setCoorequisitos(List<Materia> coorequisitos) {
        this.coorequisitos = coorequisitos;
    }

    public String getNemonico() {
        return nemonico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public List<Materia> getPrerequisitos() {
        return prerequisitos;
    }

    public List<Materia> getCoorequisitos() {
        return coorequisitos;
    }
    
}
