/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayDeque;
import java.util.ArrayList;
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
    Map<Materia, Set<Materia>> correquisitos;
    
    public Grafo(){
        grafo = new HashMap<>();
        correquisitos = new HashMap<>();
    }
    
    public void setNodes(){
        
    }
    
    public void addNode(Materia nodo){
        if (grafo.get(nodo) == null){
            grafo.put(nodo, new HashSet());
            
        }
    }
    
    public void addCoNode(Materia nodo){
        if (correquisitos.get(nodo) == null){
            correquisitos.put(nodo, new HashSet());
            
        }
    }
    
    public void addCoEdge(Materia m1, Materia m2){
        if (correquisitos.get(m1) != null){
           Set<Materia> materia=correquisitos.get(m1);
           materia.add(m2);
           correquisitos.put(m1, materia);           
        }
    }
    
    public void addEdge(Materia m1, Materia m2){
        if (grafo.get(m1) != null){
           Set<Materia> materia=grafo.get(m1);
           materia.add(m2);
           grafo.put(m1, materia);           
        }
    }
    
    public Materia getMateria(String mat){
        Materia res = null;
        for (Map.Entry<Materia, Set<Materia>> entry : grafo.entrySet()){
            if (mat.equals(entry.getKey().getNemonico())){
                res = entry.getKey();
            }
        }
        return res;
    }
    
    public void printNodes(){
        for (Map.Entry<Materia, Set<Materia>> entry : grafo.entrySet()){
            System.out.println(entry.getKey().getNemonico() + ": " + entry.getValue().toString() );
        }
    }
    
    public void printCoNodes(){
        for (Map.Entry<Materia, Set<Materia>> entry : correquisitos.entrySet()){
            System.out.println(entry.getKey().getNemonico() + ": " + entry.getValue().toString() );
        }
    }
    
    public Boolean validarGrafo() throws Exception{
        List<Materia> ord;
        ord = ordenamientoTopologico();
        for (Materia m : ord){
            System.out.println(m.getNombre());
        }
        System.out.println(ord.size());
    
        return true;
    }
    
    public List<Materia> ordenamientoTopologico() throws Exception{
        Map<Materia, Integer> inDegree;
        inDegree = new HashMap<>();
        for (Map.Entry<Materia, Set<Materia>> entry : grafo.entrySet()){
            inDegree.put(entry.getKey(), 0);
        }
        for (Map.Entry<Materia, Set<Materia>> entry : grafo.entrySet()){
            for (Materia mat: entry.getValue()){
                inDegree.put(mat, inDegree.get(mat)+1);
            }
        }
        ArrayDeque<Materia> queue = new ArrayDeque();
        for (Map.Entry<Materia, Integer> entry : inDegree.entrySet()){
            if(entry.getValue() == 0){
                queue.addFirst(entry.getKey());
            }
        }
        
        List<Materia > lista = new ArrayList();
        while (!queue.isEmpty()){
            Materia u = queue.removeLast();
            lista.add(u);
            for (Materia v: grafo.get(u)){
                inDegree.put(v, inDegree.get(v)-1);
                if (inDegree.get(v) == 0){
                    queue.addFirst(v);
                }
            }
        }
        if (lista.size() == grafo.size()){
            return lista;
        }
        else{
            throw new Exception("Grafo no es aciclico");
        }
    }
    
    public List<List<String>> calcularPlanDeEstudios(List<Materia> materiasActuales, List<Materia> materiasCursadas){
        
        return null;
    }
    
    public void printGraph(){
        
    }
}
