/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

import com.BoomECI.entidades.Grafo;

/**
 *
 * @author BoomECI
 */
public interface ParserGrafo {
    
    /**
     *
     * @param str estructura de grafo escrita en xml o json
     * @return Tipo grafo con el plan de estudios obtenido de la base datos
     */
    public Grafo convertStringToGrafo(String str);
}
