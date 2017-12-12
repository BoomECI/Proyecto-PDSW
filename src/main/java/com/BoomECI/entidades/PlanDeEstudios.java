/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.entidades;

import java.util.List;
/**
 *
 * @author BoomEci
 */
public class PlanDeEstudios {

    public static int creditosPorSemestre = 18;
    
    
    private String carrera;    
    private int numeroPlanDeEstudio;    
    private String grafo;
    private int numeroDeCreditosTotales;
    private int numeroDeAsignaturas;        
    
    public PlanDeEstudios(){
    }
    
    public PlanDeEstudios(int numeroPlanDeEstudio){
        this.numeroPlanDeEstudio = numeroPlanDeEstudio;
        if(numeroPlanDeEstudio ==1 ){
            grafo = sistemas();
        }
        else if(numeroPlanDeEstudio == 10){
            grafo = industrial();
        }
    }
    
    public PlanDeEstudios(String carrera, int numeroPlanDeEstudio, String grafo, int numeroCreditos, int numeroAsignaturas) {
        this.numeroPlanDeEstudio = numeroPlanDeEstudio;
        if(numeroPlanDeEstudio == 1 ){
            grafo = sistemas();
        }
        else if(numeroPlanDeEstudio == 10){
            grafo = industrial();
        }
        this.carrera = carrera;        
        this.numeroDeCreditosTotales = numeroCreditos;
        this.numeroDeAsignaturas = numeroAsignaturas;        
    }
    
    public int getNumeroDeAsignaturas() {
        return numeroDeAsignaturas;
    }

    public void setNumeroDeAsignaturas(int numeroDeAsignaturas) {
        this.numeroDeAsignaturas = numeroDeAsignaturas;
    }
    
    public int getNumeroDeCreditosTotales() {
        return numeroDeCreditosTotales;
    }

    public void setNumeroDeCreditosTotales(int numeroDeCreditosTotales) {
        this.numeroDeCreditosTotales = numeroDeCreditosTotales;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrafo() {
        return grafo;
    }

    public void setGrafo(String grafo) {
        this.grafo = grafo;
    }    

    public int getNumeroPlanDeEstudio() {
        return numeroPlanDeEstudio;
    }

    public void setNumeroPlanDeEstudio(int numeroPlanDeEstudio) {
        this.numeroPlanDeEstudio = numeroPlanDeEstudio;
    }

    public static String sistemas() {
        return "{\n" +
"       \"materias\": [\"CALD\",\"MMIN\",\"ALLI\",\"IINS\",\"EALE\",\"CIED\",\"LCAL\",\"FIMF\",\"PIMB\",\"MDIS\",\"FIEM\",\"MBDA\",\"PIMO\",\"EHU1\",\"PDIS\",\"TPRO\",\"ARQC\",\n" +
"       \"ELCB\",\"POOB\",\"ESTI\",\"TCOM\",\"FRED\",\"TSOR\",\"PDSW\",\"FUNE\",\"SEGI\",\"SOPC\",\"PRON\",\"ARSW\",\"ACFI\",\"AREM\",\"COSW\",\"EHU2\",\"FGPR\",\"ET01\",\n" +
"       \"SOSW\", \"EHU3\",\"ELEA\",\"ET02\",\"PGR1\",\"CRIP\", \"ET03\",\"CLE1\", \"PGR2\", \"CLE2\"],\n" +
"       \"CALD\": {\"nombre\" : \"Calculo diferencial\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"MMIN\": {\"nombre\" : \"Modelos matematicos para informatica\",\n"+
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"ALLI\": {\"nombre\" : \"Algebra lineal\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"IINS\": {\"nombre\" : \"Introduccion a la ingenieria de sistemas\",\n" +
"               \"creditos\":\"2\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"EALE\": {\"nombre\" : \"Electiva en el area de lengua espanola\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"CIED\": {\"nombre\" : \"Calculo integral y ecuaciones diferenciales\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"CALD\"]},\n" +
"       \"LCAL\": {\"nombre\" : \"Logica calculativa\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"MMIN\"]},\n" +
"       \"FIMF\": {\"nombre\" : \"Fisica mecanica y fluidos\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [\"CALD\"],\n" +
"               \"pre\" : []},\n" +
"       \"PIMB\": {\"nombre\" : \"Programacion imperativa basica\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"MDIS\": {\"nombre\" : \"Matematicas discretas\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"LCAL\"]},\n" +
"       \"FIEM\": {\"nombre\" : \"Fisica del electromagnetismo\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [\"CIED\"],\n" +
"               \"pre\" : [\"FIMF\"]},\n" +
"       \"MBDA\": {\"nombre\" : \"Modelos y bases de datos\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"LCAL\",\"PIMB\"]},\n" +
"       \"PIMO\": {\"nombre\" : \"Programacion imperativa modular\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"PIMB\"]},\n" +
"       \"EHU1\": {\"nombre\" : \"Electiva humanistica 1\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"PDIS\": {\"nombre\" : \"Probabilidad discreta\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"CIED\"]},\n" +
"       \"TPRO\": {\"nombre\" : \"Teoria de la programacion\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"MDIS\",\"PIMO\"]},\n" +
"       \"ARQC\": {\"nombre\" : \"Arquitectura del computador\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"FIEM\"]},\n" +
"       \"ELCB\": {\"nombre\" : \"Electiva en ciencias basicas\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"POOB\": {\"nombre\" : \"Programacion orientada a objetos\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"PIMO\"]},\n" +
"       \"ESTI\": {\"nombre\" : \"Estadistica\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"PDIS\"]},\n" +
"       \"TCOM\": {\"nombre\" : \"Teoria de la computacion\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"MDIS\",\"POOB\"]},\n" +
"       \"FRED\": {\"nombre\" : \"Fundamentos de redes\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"ARQC\"]},\n" +
"       \"TSOR\": {\"nombre\" : \"Teoria de sistemas y organizaciones\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"PDSW\": {\"nombre\" : \"Procesos de desarrollo de software\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"MBDA\", \"POOB\"]},\n" +
"       \"FUNE\": {\"nombre\" : \"Fundamentos de economia\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"CALD\"]},\n" +
"       \"SEGI\": {\"nombre\" : \"Seguridad informatica\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"FRED\"]},\n" +
"       \"SOPC\": {\"nombre\" : \"Sistemas operativos y plataformas computacionales\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"ARQC\"]},\n" +
"       \"PRON\": {\"nombre\" : \"Procesos de negocio\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"TSOR\"]},\n" +
"       \"ARSW\": {\"nombre\" : \"Arquitectura de software\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"PDSW\", \"FRED\"]},\n" +
"       \"ACFI\": {\"nombre\" : \"Analisis contable y financiero\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"FUNE\"]},\n" +
"       \"AREM\": {\"nombre\" : \"Arquitecturas empresariales\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"PRON\"]},\n" +
"       \"COSW\": {\"nombre\" : \"Construccion de software\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"ARSW\",\"PRON\"]},\n" +
"       \"EHU2\": {\"nombre\" : \"Electiva humanistica 2\",\n" +
"               \"creditos\":\"3\",\n"  +
"               \"co\" : [],\n" + 
"               \"pre\" : []},\n" +
"       \"FGPR\": {\"nombre\" : \"Fundamentos y gerencia de proyectos\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"ACFI\"]},\n" +
"       \"ET01\": {\"nombre\" : \"Electiva tecnica 1\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"SOSW\": {\"nombre\" : \"Soluciones de software\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"ARSW\",\"AREM\"]},\n" +
"       \"EHU3\": {\"nombre\" : \"Electiva humanistica 3\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"ELEA\": {\"nombre\" : \"Electiva economico-administrativa\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"ET02\": {\"nombre\" : \"Electiva tecnica 2\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"PGR1\": {\"nombre\" : \"Proyecto de grado 1\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"FGPR\"]},\n" +
"       \"CRIP\": {\"nombre\" : \"Colombia: realidad e instituciones politicas\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"ET03\": {\"nombre\" : \"Electiva tecnica 3\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"CLE1\": {\"nombre\" : \"Curso de libre eleccion 1\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []},\n" +
"       \"PGR2\": {\"nombre\" : \"Proyecto de grado 2\",\n" +
"               \"creditos\":\"4\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : [\"PGR1\"]},\n" +
"       \"CLE2\": {\"nombre\" : \"Curso de libre eleccion 2\",\n" +
"               \"creditos\":\"3\",\n" +
"               \"co\" : [],\n" +
"               \"pre\" : []}\n" +
"}";
    }

    public static String industrial() {
        return "{\n" +
"	\"materias\": [\"CALD\", \"ALLI\", \"BIOL\", \"EGR1\", \"IINI\", \"EALE\", \"CALI\", \"FIMF\", \"QUIM\", \"EGR2\", \"EHU1\", \"CALV\", \"FIEM\", \"MSOL\", \"HYSE\", \"EHU2\", \"ECDI\", \"FICO\", \"MTRL\", \"LMTR\", \"SPPC\", \"ERGO\", \"LCTR\", \"PRBA\", \"TMDN\", \"PIND\", \"LPIN\", \"FUNE\", \"EHU3\", \"ESTI\", \"MMAT\", \"ELET\", \"LETC\", \"DPRD\", \"LDPR\", \"ACFI\", \"CLE1\", \"ELCB\", \"OPDO\", \"ETTR\", \"GORG\", \"CMAN\", \"CLE2\", \"MOES\", \"PCPI\", \"DPIN\", \"CLDD\", \"GCHU\", \"FEPR\", \"EPF1\", \"EPF3\", \"OGI1\", \"GCAB\", \"PMLI\", \"CRIP\", \"EPF2\", \"OGI2\", \"NEGO\"],\n" +
"	\"CALD\": {\n" +
"		\"nombre\": \"Calculo diferencial\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"ALLI\": {\n" +
"		\"nombre\": \"Algebra lineal\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"BIOL\": {\n" +
"		\"nombre\": \"Biologia\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"EGR1\": {\n" +
"		\"nombre\": \"Expresion grafica 1\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"IINI\": {\n" +
"		\"nombre\": \"Introduccion a la ingenieria industrial\",\n" +
"		\"creditos\": \"2\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"EALE\": {\n" +
"		\"nombre\": \"Electiva en el area de lengua espanola\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"CALI\": {\n" +
"		\"nombre\": \"Calculo integral\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"CALD\"]\n" +
"	},\n" +
"	\"FIMF\": {\n" +
"		\"nombre\": \"Fisica mecanica y fluidos\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [\"CALD\"],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"QUIM\": {\n" +
"		\"nombre\": \"Quimica\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"EGR2\": {\n" +
"		\"nombre\": \"Expresion grafica 2\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"EGR1\"]\n" +
"	},\n" +
"	\"EHU1\": {\n" +
"		\"nombre\": \"Electiva humanistica 1\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"CALV\": {\n" +
"		\"nombre\": \"Calculo vectorial\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ALLI\", \"CALI\"]\n" +
"	},\n" +
"	\"FIEM\": {\n" +
"		\"nombre\": \"Fisica del electromagnetismo\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [\"CALI\"],\n" +
"		\"pre\": [\"FIMF\"]\n" +
"	},\n" +
"	\"MSOL\": {\n" +
"		\"nombre\": \"Mecanica de solidos\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"CALD\", \"FIMF\"]\n" +
"	},\n" +
"	\"HYSE\": {\n" +
"		\"nombre\": \"Higiene y seguridad\",\n" +
"		\"creditos\": \"2\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"IINI\"]\n" +
"	},\n" +
"	\"EHU2\": {\n" +
"		\"nombre\": \"Electiva humanistica 2\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"ECDI\": {\n" +
"		\"nombre\": \"Ecuaciones diferenciales\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"CALV\"]\n" +
"	},\n" +
"	\"FICO\": {\n" +
"		\"nombre\": \"Fisica de calor, ondas y estr.atomica\",\n" +
"		\"creditos\": \"4\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"FIEM\"]\n" +
"	},\n" +
"	\"MTRL\": {\n" +
"		\"nombre\": \"Materiales\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"FIEM\", \"QUIM\"]\n" +
"	},\n" +
"	\"LMTR\": {\n" +
"		\"nombre\": \"Laboratorio de materiales\",\n" +
"		\"creditos\": \"1\",\n" +
"		\"co\": [\"MTRL\"],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"SPPC\": {\n" +
"		\"nombre\": \"Soluciones de problemas por computador\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ALLI\", \"CALD\"]\n" +
"	},\n" +
"	\"ERGO\": {\n" +
"		\"nombre\": \"Ergonomia\",\n" +
"		\"creditos\": \"2\",\n" +
"		\"co\": [\"LCTR\"],\n" +
"		\"pre\": [\"HYSE\"]\n" +
"	},\n" +
"	\"LCTR\": {\n" +
"		\"nombre\": \"Laboratorio condiciones de trabajo\",\n" +
"		\"creditos\": \"1\",\n" +
"		\"co\": [\"ERGO\"],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"PRBA\": {\n" +
"		\"nombre\": \"Probabilidad\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"CALV\"]\n" +
"	},\n" +
"	\"TMDN\": {\n" +
"		\"nombre\": \"Termodinamica\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ECDI\", \"FICO\"]\n" +
"	},\n" +
"	\"PIND\": {\n" +
"		\"nombre\": \"Procesos industriales\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"MSOL\", \"LMTR\", \"MTRL\", \"EGR2\"]\n" +
"	},\n" +
"	\"LPIN\": {\n" +
"		\"nombre\": \"Laboratorio de procesos industriales\",\n" +
"		\"creditos\": \"1\",\n" +
"		\"co\": [\"PIND\"],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"FUNE\": {\n" +
"		\"nombre\": \"Fundamentos de economia\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"CALD\"]\n" +
"	},\n" +
"	\"EHU3\": {\n" +
"		\"nombre\": \"Electiva humanistica 3\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"ESTI\": {\n" +
"		\"nombre\": \"Estadistica\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"PRBA\"]\n" +
"	},\n" +
"	\"MMAT\": {\n" +
"		\"nombre\": \"Modelamiento matematico\",\n" +
"		\"creditos\": \"2\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"SPPC\", \"PRBA\"]\n" +
"	},\n" +
"	\"ELET\": {\n" +
"		\"nombre\": \"Electrotecnia\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [\"LETC\"],\n" +
"		\"pre\": [\"ECDI\", \"FIEM\"]\n" +
"	},\n" +
"	\"LETC\": {\n" +
"		\"nombre\": \"Laboratorio de electrotecnia\",\n" +
"		\"creditos\": \"1\",\n" +
"		\"co\": [\"ELET\"],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"DPRD\": {\n" +
"		\"nombre\": \"Desarrollo del producto\",\n" +
"		\"creditos\": \"2\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"PIND\", \"LPIN\"]\n" +
"	},\n" +
"	\"LDPR\": {\n" +
"		\"nombre\": \"Laboratorio de desarrollo del producto\",\n" +
"		\"creditos\": \"1\",\n" +
"		\"co\": [\"DPRD\"],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"ACFI\": {\n" +
"		\"nombre\": \"Analisis contable y financiero\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"FUNE\"]\n" +
"	},\n" +
"	\"CLE1\": {\n" +
"		\"nombre\": \"Curso de libre eleccion 1\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"ELCB\": {\n" +
"		\"nombre\": \"Electiva en ciencias basicas\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"OPDO\": {\n" +
"		\"nombre\": \"Optimizacion de operaciones\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"MMAT\"]\n" +
"	},\n" +
"	\"ETTR\": {\n" +
"		\"nombre\": \"Estudio del trabajo\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"DPRD\", \"LDPR\", \"ESTI\"]\n" +
"	},\n" +
"	\"GORG\": {\n" +
"		\"nombre\": \"Gestion organizacional\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"IINI\"]\n" +
"	},\n" +
"	\"CMAN\": {\n" +
"		\"nombre\": \"Costos manufactura\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ACFI\"]\n" +
"	},\n" +
"	\"CLE2\": {\n" +
"		\"nombre\": \"Curso de libre eleccion 2\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"MOES\": {\n" +
"		\"nombre\": \"Modelos estocasticos\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"MMAT\"]\n" +
"	},\n" +
"	\"PCPI\": {\n" +
"		\"nombre\": \"Planeacion y Control de la Produccion e Inventarios \",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ETTR\", \"MMAT\"]\n" +
"	},\n" +
"	\"DPIN\": {\n" +
"		\"nombre\": \"Diseno de plantas industriales\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ELET\", \"ETTR\", \"TMDN\"]\n" +
"	},\n" +
"	\"CLDD\": {\n" +
"		\"nombre\": \"Calidad\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [\"ETTR\"],\n" +
"		\"pre\": [\"ESTI\", \"PIND\"]\n" +
"	},\n" +
"	\"GCHU\": {\n" +
"		\"nombre\": \"Gestion de capital humano\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ESTI\", \"GORG\"]\n" +
"	},\n" +
"	\"FEPR\": {\n" +
"		\"nombre\": \"Formulacion y evaluacion de proyectos\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"ACFI\", \"GORG\"]\n" +
"	},\n" +
"	\"EPF1\": {\n" +
"		\"nombre\": \"Electiva de profundizacion 1\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"EPF3\": {\n" +
"		\"nombre\": \"Electiva de profundizacion 3\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"OGI1\": {\n" +
"		\"nombre\": \"Opcion de grado industrial 1\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"GCAB\": {\n" +
"		\"nombre\": \"Gestion de la cadena de abastecimiento\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"PCPI\"]\n" +
"	},\n" +
"	\"PMLI\": {\n" +
"		\"nombre\": \"Produccion mas limpia\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"BIOL\", \"CMAN\"]\n" +
"	},\n" +
"	\"CRIP\": {\n" +
"		\"nombre\": \"Colombia realidad e instituciones politicas\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"EPF2\": {\n" +
"		\"nombre\": \"Electiva de profundizacion 2\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"OGI2\": {\n" +
"		\"nombre\": \"Opcion de grado industrial 2\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": []\n" +
"	},\n" +
"	\"NEGO\": {\n" +
"		\"nombre\": \"Negociacion\",\n" +
"		\"creditos\": \"3\",\n" +
"		\"co\": [],\n" +
"		\"pre\": [\"FEPR\"]\n" +
"	}\n" +
"}";
    }
    
    
}
