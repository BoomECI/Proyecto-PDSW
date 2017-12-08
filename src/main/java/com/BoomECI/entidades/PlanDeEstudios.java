/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

import java.util.List;
/**
 *
 * @author BoomEci
 */
public class PlanDeEstudios {
    
    private String carrera;
    private String grafo;
    private int numeroDeCreditosTotales;
    private int numeroDeAsignaturas;
    private int numeroPlanDeEstudio;
    private List<Materia> materias;
    public static final int creditosPorSemestre = 18;
    
    public PlanDeEstudios(){}
    
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
