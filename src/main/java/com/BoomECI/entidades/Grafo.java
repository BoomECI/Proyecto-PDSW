/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

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
    List<Materia> lista;
    public Grafo(List<Materia> lista){
        grafo = new HashMap<>();
        correquisitos = new HashMap<>();
        this.lista = lista;       
    }
    
    public Grafo() {
        grafo = new HashMap<>();
        correquisitos = new HashMap<>();
        lista = new ArrayList();
    } 
    
    public void setNodes(){
        
    }
    
    public void printLista(){
        for(Materia m : this.lista){
            System.out.println(m.getNemonico());
        }
    }
    
    public List<List<String>> calcularPlanDeEstudios(Estudiante estudiante,List<String> materiasCanceladas){
        List<List<String>> total = new ArrayList<>();
        List<String> semestre = new ArrayList<>();
        int creditos=0;       
        List <Materia> porVer = this.getMateriasPorVer(estudiante.getMateriasActuales(),estudiante.getMateriasCursadas(),this.getcorrequisito(materiasCanceladas));        
        while (!porVer.isEmpty()){
            semestre.clear();
            creditos=0;
            List<Materia> posibles = new ArrayList<>();
            for (Materia i: porVer){
                if (isPossible(i,porVer)){
                    posibles.add(i);                   
                }
            }            
            for (Materia i:posibles){                
                if((creditos+i.getCreditos()<=18)&&(semestre.size()<5)){
                    if (i.getCreditos()==3){
                        creditos+=3;
                        semestre.add(i.getNemonico());
                        porVer.remove(i);
                    }
                    if (i.getCreditos()==4){
                        creditos+=4;
                        semestre.add(i.getNemonico());
                        porVer.remove(i);
                    }
                    if (i.getCreditos()==2){
                        creditos+=2;
                        semestre.add(i.getNemonico());
                        porVer.remove(i);
                    }
                    if (i.getCreditos()==0){
                        creditos+=0;
                        semestre.add(i.getNemonico());
                        porVer.remove(i);
                    }
                }
            }
            total.add(semestre);          
        }
        return total;
    }
    
     public List<String> getcorrequisito(List<String> canceladas){
         List<String> nueva = new ArrayList<String>();
         for(String ca : canceladas){
             nueva.add(ca);
         }         
         for(Materia m: lista){             
             for (String ca : canceladas){                  ;
                 for(String co: m.getCorequisitos()){
                     if (ca.equals(co)){                         
                         if (!canceladas.contains(m.getNemonico())){
                             nueva.add(m.getNemonico());                            
                         }                         
                     }
                 }
             }       
         }        
         return nueva;         
         
     }
     
    public List<Materia> getMateriasPorVer(List<Materia> materiasActuales, List<Materia> materiasCursadas,List<String> canceladas){        
        List<Materia> materiasPorVer = new ArrayList();
        for(Materia m: lista){            
            if(isNotHere(m,materiasCursadas)){                  
                   if(isNotHere(m,materiasActuales)){                                               
                            materiasPorVer.add(m);         
                       
                   }else if(canceladas.contains(m.getNemonico())){  
                       materiasPorVer.add(m);                 
                   }             
            }
        }
        return materiasPorVer;
    }
  
    public boolean isPossible(Materia mat, List<Materia> porVer ){
        for (Materia p: porVer ){          
            for(String pre :mat.getPrerequisitos()){
                if(pre.equals(p.getNemonico())){                    
                    return false;
                }
            }
            for (String co :mat.getCorequisitos()){
                if(co.equals(p.getNemonico())){
                    return false;
                }
            }
        }
        return true;
    }  
    
    public boolean isNotHere(Materia mat, List<Materia> vistas ){
        for (Materia p: vistas ){ 
            if(p.equals(mat)){
                return false;
            }
        }
        return true;
    }  
    
    public void printGraph(){
        
    }
}
