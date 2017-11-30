/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import java.util.List;

/**
 *
 * @author boomEci
 */
public interface CalculoDeImpacto {
    
    public int CalculoImpacto(List<Materia> canceladas, Estudiante estudiante);
    
}
