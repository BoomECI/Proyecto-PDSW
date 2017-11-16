/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;
import javax.json.JsonObject;
/**
 *
 * @author BoomEci
 */
public class PlanDeEstudios {
    
    String carrera;
    String grafo;
    int numeroDeCreditosTotales;
    int numeroDeAsignaturas;
    int numeroPlanDeEstudio;
    List<Materia> materias;
    
    public int getNumeroDeAsignaturas() {
        return numeroDeAsignaturas;
    }

    public void setNumeroDeAsignaturas(int numeroDeAsignaturas) {
        this.numeroDeAsignaturas = numeroDeAsignaturas;
    }
    
    public int getNumeroDeCreditosTotales() {
        return numeroDeCreditosTotales;
    }

    public void setNumeroDeCreditosTotales(int numeroDeCreditosTotales) {
        this.numeroDeCreditosTotales = numeroDeCreditosTotales;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrafo() {
        return grafo;
    }

    public void setGrafo(String grafo) {
        this.grafo = grafo;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getNumeroPlanDeEstudio() {
        return numeroPlanDeEstudio;
    }

    public void setNumeroPlanDeEstudio(int numeroPlanDeEstudio) {
        this.numeroPlanDeEstudio = numeroPlanDeEstudio;
    }
    
    
}
