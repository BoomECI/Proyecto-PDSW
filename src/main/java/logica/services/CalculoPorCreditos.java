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
 * @author BoomEci
 */
public class CalculoPorCreditos implements CalculoDeImpacto{
    private int creditosPorVer=0;
    @Override
    public int CalculoImpacto(Materia cancelada, Estudiante estudiante, PlanDeEstudios plan){
        
        for(Materia m: estudiante.getMateriasCursadas()){
            creditosPorVer += m.getCreditos();
        } 
        for(Materia m: estudiante.getMateriasActuales()){
            creditosPorVer += m.getCreditos();
        }  
        creditosPorVer -= cancelada.getCreditos();        
        creditosPorVer = plan.getNumeroDeCreditosTotales() - creditosPorVer;
        
        return creditosPorVer;        
    }

    
}
