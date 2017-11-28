/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.services;

import entidades.Grafo;
import entidades.Materia;
import entidades.PlanDeEstudios;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonArray;
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
    public JsonObject convertStringToJson(String st){
        JsonReader jsonReader = Json.createReader(new StringReader(st));
        JsonObject object = jsonReader.readObject();
        jsonReader.close();
        
        return object;

    }
    
    
    public Grafo convertJsonToGrafo(JsonObject jo){
        Grafo g = new Grafo();
        for (JsonValue i: jo.getJsonArray("materias")){
            JsonObject mat = jo.getJsonObject(i.toString().replaceAll("\"",""));
            Materia nueva = new Materia(i.toString().replaceAll("\"",""),mat.getJsonString("nombre").toString().replaceAll("\"",""),Integer.parseInt(mat.getJsonString("creditos").toString().replaceAll("\"","")));
            g.addNode(nueva);
            g.addCoNode(nueva);
            
            //g.addNode(new Materia(i.toString()));
        }
        for (JsonValue i: jo.getJsonArray("materias")){
            JsonObject mat = jo.getJsonObject(i.toString().replaceAll("\"",""));
            for (JsonValue j: mat.getJsonArray("pre")){
                g.addEdge(g.getMateria(i.toString().replaceAll("\"","")),g.getMateria(j.toString().replaceAll("\"","")));
            }
            for (JsonValue j: mat.getJsonArray("co")){
                g.addCoEdge(g.getMateria(i.toString().replaceAll("\"","")),g.getMateria(j.toString().replaceAll("\"","")));
            }
        }
            
        //System.out.println(jo.getJsonObject("fimf").getJsonString("co").toString());
        //System.out.println(jo.getJsonObject("fimf").getJsonArray("pre").toString());
        
        return g;
    
    }

    /**
     *
     * @param json
     * @return
     */
    @Override
    public Grafo convertStringToGrafo(String str) {
        return convertJsonToGrafo(convertStringToJson(str));
        
    }

}
