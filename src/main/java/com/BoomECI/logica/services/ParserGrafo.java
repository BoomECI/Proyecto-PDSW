/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.PlanDeEstudios;
import javax.json.JsonObject;

/**
 *
 * @author Boom
 */
public interface ParserGrafo {
    
    /**
     *
     * @param str
     * @return
     */
    public Grafo convertStringToGrafo(String str);
}
