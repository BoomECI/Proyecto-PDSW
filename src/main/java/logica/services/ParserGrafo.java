/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.services;

import entidades.Grafo;
import entidades.PlanDeEstudios;
import javax.json.JsonObject;

/**
 *
 * @author Boom
 */
public interface ParserGrafo {
    public JsonObject convertStringToGrafo(String st);

    /**
     *
     * @param jo
     * @return
     */
    public Grafo convertJsonToGrafo(JsonObject jo);
}
