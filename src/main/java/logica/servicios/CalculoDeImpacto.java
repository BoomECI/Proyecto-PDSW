/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import entidades.Materia;
import entidades.PlanDeEstudios;
import java.util.List;

/**
 *
 * @author boomEci
 */
interface CalculoDeImpacto {
    
    public int CalculoImpacto(Materia cancelada, List<Materia> vistas, PlanDeEstudios plan);
    
}
