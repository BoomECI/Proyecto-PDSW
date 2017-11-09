/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.servicios;

import entidades.Materia;
import entidades.PlanDeEstudios;
import java.util.List;

/**
 *
 * @author BoomEci
 */
public class CalculoPorCreditos implements CalculoDeImpacto{

    @Override
    public int CalculoImpacto(Materia cancelada, List<Materia> vistas, PlanDeEstudios plan){
        int impacto = 0;
        for(Materia m: vistas){
            impacto += m.getCreditos();
        }        
        impacto += cancelada.getCreditos();        
        impacto = plan.getNumeroDeCreditosTotales() - impacto;
        
        return impacto;        
    }
    
}
