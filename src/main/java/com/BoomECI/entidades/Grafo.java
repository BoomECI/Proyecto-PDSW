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
 * @author BoomECI
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
    

    
    public void setNodes(){
        
    }
    
    public void printLista(){
        for(Materia m : this.lista){
            System.out.println(m.getNemonico());
        }
    }
    /**
     *Calcula plan de estudios de algun estudiante especifico
     * @param  estudiante estudiante que va a realizar la cancelacion 
     * @param materiasCanceladas lista con las materias que el estudiante desea cancelar
     *  @return Una matriz con las materias que le quedarian por ver organizadas por semestre
     */
    public List<List<String>> calcularPlanDeEstudios(Estudiante estudiante,List<String> materiasCanceladas){
        List<List<String>> total = new ArrayList<>();
        int creditos=0;       
        List <Materia> porVer = this.getMateriasPorVer(estudiante.getMateriasActuales(),estudiante.getMateriasCursadas(),this.getcorrequisito(materiasCanceladas));        
        
        while (!porVer.isEmpty()){
            List<String> semestre = new ArrayList();
            creditos=0;
            List<Materia> posibles = new ArrayList<>();
            for (Materia i: porVer){
                if (isPossible(i,porVer)){
                    posibles.add(i);                   
                }
            }
            
            for (Materia i:posibles){
                if((creditos+i.getCreditos()<=18)&&(semestre.size()<7)){
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
    
    
    public Materia getMateria(String materia){
        for (Materia i :lista){
            if (i.getNemonico().equals(materia)){
                return i;
            }
        }  
        return null;
    }
    public int getSemestre(Estudiante estudiante){
        int creditos=0;
        for (Materia i: estudiante.getMateriasCursadas()){
            creditos+=this.getMateria(i.getNemonico()).getCreditos();            
        }       
        double semestre= (creditos*100/estudiante.getPlanDeEstudios().getNumeroDeCreditosTotales())*0.1;        
        int semestreAct=(int)semestre;
        return semestreAct;
    }

    public int CalculoImpacto(List<String> canceladas, Estudiante estudiante) {
        List <Materia> porVer = this.getMateriasPorVer(estudiante.getMateriasActuales(),estudiante.getMateriasCursadas(),this.getcorrequisito(canceladas)); 
        int suma = 0;
        for(Materia i : porVer){
            suma+=i.getCreditos();
        }
        return suma;     
    }

    public List<Materia> getLista() {
        return lista;
    }
    

}
