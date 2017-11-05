/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.List;

/**
 *
 * @author camil
 */
public class Estudiante {
    
    private int id;
    private String nombre;
    private List<Materia> materiasCursando;
    
    public Estudiante(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public List<Materia> getMateriasCursando() {
        return materiasCursando;
    }

    public void setMateriasCursando(List<Materia> materiasCursando) {
        this.materiasCursando = materiasCursando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    
}
