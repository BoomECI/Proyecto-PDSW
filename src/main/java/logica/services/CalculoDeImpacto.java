/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.services;

import entidades.Estudiante;
import entidades.Materia;
import entidades.PlanDeEstudios;
import java.util.List;

/**
 *
 * @author boomEci
 */
public interface CalculoDeImpacto {
    
    public int CalculoImpacto(Materia cancelada, Estudiante estudiante);
    
}
