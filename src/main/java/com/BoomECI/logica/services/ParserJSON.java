/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;


/**
 *
 * @author Boom
 */
public class ParserJSON implements ParserGrafo{

    /*@Override
    public PlanDeEstudios jsonToPlanDeEstudios(JsonObject js) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    /**
     *Convierte una cadena en un JsonObject
     * @param st cadena
     * @return JsonObject obtenido de leer la cadena
     */
    public JsonObject convertStringToJson(String st){
        JsonReader jsonReader = Json.createReader(new StringReader(st));
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        
        return object;

    }
    
    /**
     *Convierte un JsonObject en el objeto Grafo
     * @param jo JsonObject
     * @return tipo grafo
     */
    public Grafo convertJsonToGrafo(JsonObject jo){
        List<Materia> listaMaterias = new ArrayList();
        List<String> pre = new ArrayList();
        List<String> correq = new ArrayList();
        for (JsonValue i: jo.getJsonArray("materias")){
            pre = new ArrayList();
            correq = new ArrayList();
            JsonObject mat = jo.getJsonObject(i.toString().replaceAll("\"",""));
            for (JsonValue j: mat.getJsonArray("pre")){
                pre.add(j.toString().replaceAll("\"",""));
            }
            for (JsonValue j: mat.getJsonArray("co")){
                correq.add(j.toString().replaceAll("\"",""));
            }

            Materia nueva = new Materia(i.toString().replaceAll("\"",""),mat.getJsonString("nombre").toString().replaceAll("\"",""),Integer.parseInt(mat.getJsonString("creditos").toString().replaceAll("\"","")),pre,correq);
            listaMaterias.add(nueva);

        }
        
        Grafo g = new Grafo(listaMaterias);
        return g;
    }
    

    @Override
    public Grafo convertStringToGrafo(String str) {
        return convertJsonToGrafo(convertStringToJson(str));
        
    }

}
