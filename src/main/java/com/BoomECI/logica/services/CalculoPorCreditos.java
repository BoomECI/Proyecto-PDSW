/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import java.util.List;

/**
 *
 * @author BoomEci
 */
public class CalculoPorCreditos implements CalculoDeImpacto{
    private int creditosPorVer;
    @Override
    public int CalculoImpacto(List<Materia> canceladas, Estudiante estudiante){
        creditosPorVer=0;
        for(Materia m: estudiante.getMateriasCursadas()){
            creditosPorVer += m.getCreditos();
        } 
        for(Materia m: estudiante.getMateriasActuales()){
            creditosPorVer += m.getCreditos();
        }
        
        for(Materia m: canceladas){
            creditosPorVer -= m.getCreditos();
        }        
        
        creditosPorVer = estudiante.getPlanDeEstudios().getNumeroDeCreditosTotales()- creditosPorVer;
        
        return creditosPorVer;        
    }

    
}
