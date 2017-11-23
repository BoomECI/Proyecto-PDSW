/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author USER
 */
public class Grafo {
    Map<Materia, Set<Materia>> grafo;
    
    public Grafo(){
        grafo = new HashMap<>();
    }
    
    public void setNodes(){
        
    }
    
    public void addNode(Materia nodo){
        if (grafo.get(nodo) == null){
            grafo.put(nodo, new HashSet());
            
        }
    }
    
    public void printNodes(){
        for (Map.Entry<Materia, Set<Materia>> entry : grafo.entrySet()){
            System.out.println(entry.getKey().getNemonico() );
        }
    }
    
}
