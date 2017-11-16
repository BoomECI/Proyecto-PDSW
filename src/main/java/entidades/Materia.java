
package entidades;

import java.util.List;

public class Materia {
    private String nemonico;
    private String nombre;
    private int creditos;
    List<Materia> prerequisitos;
    List<Materia> corequisitos;


    public Materia(String nemonico, String nombre, int creditos, List<Materia> prerequisitos, List<Materia> corequisitos ){
        this.nemonico = nemonico;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerequisitos = prerequisitos;
        this.corequisitos = corequisitos;
    }
    public Materia (String nemonico){
        this.nemonico=nemonico;
    }

    public String getNemonico() {
        return nemonico;
    }

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Materia> getPrerequisitos() {
        return prerequisitos;
    }

    public void setPrerequisitos(List<Materia> prerequisitos) {
        this.prerequisitos = prerequisitos;
    }

    public List<Materia> getCorequisitos() {
        return corequisitos;
    }

    public void setCorequisitos(List<Materia> corequisitos) {
        this.corequisitos = corequisitos;
    }
    
    


    
}
