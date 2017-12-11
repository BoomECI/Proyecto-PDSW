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
        return "{\"materias\": [\"CALD\",\"ALLI\",\"BIOL\",\"EGR1\", \"IINI\", \"EALE\",\"CALI\",\"FIMF\","
        + "\"QUIM\",\"EGR2\",\"EHU1\",\"CALV\",\"FIEM\",\"MSOL\",\"HYSE\",\"EHU2\",\"ECDI\",\"FICO\","
        + "\"MTRL\",\"LMTR\",\"SPPC\",\"ERGO\", \"LCTR\",\"PRBA\",\"TMDN\", \"PIND\", \"LPIN\","
        + "\"FUNE\",\"EHU3\", \"ESTI\", \"MMAT\", \"ELET\", \"LETC\",\"DPRD\", \"LDPR\", \"ACFI\","
        + "\"CLE1\", \"ELCB\", \"OPDO\",\"ETTR\", \"GORG\", \"CMAN\", \"CLE2\", \"MOES\", \"PCPI\","
        + "\"DPIN\", \"CLDD\", \"GCHU\", \"FEPR\", \"EPF1\", \"EPF3\",\"OGI1\", \"GCAB\", \"PMLI\","
        + "\"CRIP\", \"EPF2\", \"OGI2\", \"NEGO\"],"
        + "\"CALD\": {\"nombre\" : \"Calculo diferencial\",\"creditos\":\"4\", \"co\" : [], \"pre\" : []},"
        + "\"ALLI\": {\"nombre\" : \"Algebra lineal\",\"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"BIOL\": {\"nombre\" : \"Biologia\",\"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"EGR1\": {\"nombre\" : \"Expresion grafica 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"IINI\": {\"nombre\" : \"Introduccion a la ingenieria industrial\", \"creditos\":\"2\", \"co\" : [], \"pre\" : []},"
        + "\"EALE\": {\"nombre\" : \"Electiva en el area de lengua espanola\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"CALI\": {\"nombre\" : \"Calculo integral\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"CALD\"},"
        + "\"FIMF\": {\"nombre\" : \"Fisica mecanica y fluidos\", \"creditos\":\"4\", \"co\" : [\"CALD\"], \"pre\" : []},"
        + "\"QUIM\": {\"nombre\" : \"Quimica\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"EGR2\": {\"nombre\" : \"Expresion grafica 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"EGR1\"]},"
        + "\"EHU1\": {\"nombre\" : \"Electiva humanistica 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"CALV\": {\"nombre\" : \"Calculo vectorial\", \"creditos\":\"4\", \"co\" : [],\"pre\" : [\"ALLI\",\"CALI\"]},"
        + "\"FIEM\": {\"nombre\" : \"Fisica del electromagnetismo\", \"creditos\":\"4\", \"co\" : [\"CALI\"], \"pre\" : [\"FIMF\"]},"
        + "\"MSOL\": {\"nombre\" : \"Mecanica de solidos\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"CALD\",\"FIMF\"]},"
        + "\"HYSE\": {\"nombre\" : \"Higiene y seguridad\", \"creditos\":\"2\", \"co\" : [], \"pre\" : [\"IINI\"]},"
        + "\"EHU2\": {\"nombre\" : \"Electiva humanistica 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ECDI\": {\"nombre\" : \"Ecuaciones diferenciales\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"CALV\"]},"
        + "\"FICO\": {\"nombre\" : \"Fisica de calor, ondas y estr.atomica\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"FIEM\"]},"
        + "\"MTRL\": {\"nombre\" : \"Materiales\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FIEM\", \"QUIM\"]},"
        + "\"LMTR\": {\"nombre\" : \"Laboratorio de materiales\", \"creditos\":\"1\", \"co\" : [\"MTRL\"], \"pre\" : []},"
        + "\"SPPC\": {\"nombre\" : \"Soluciones de problemas por computador\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ALLI\",\"CALD\"]},"
        + "\"ERGO\": {\"nombre\" : \"Ergonomia\", \"creditos\":\"2\", \"co\" : [\"LCTR\"], \"pre\" : [\"HYSE\"]},"
        + "\"LCTR\": {\"nombre\" : \"Laboratorio condiciones de trabajo\", \"creditos\":\"1\", \"co\" : [\"ERGO\"], \"pre\" : []},"
        + "\"PRBA\": {\"nombre\" : \"Probabilidad\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"CALV\"]},"
        + "\"TMDN\": {\"nombre\" : \"Termodinamica\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ECDI\",\"FICO\"]},"
        + "\"PIND\": {\"nombre\" : \"Procesos industriales\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"MSOL\", \"LMTR\", \"MTRL\", \"EGR2\"]},"
        + "\"LPIN\": {\"nombre\" : \"Laboratorio de procesos industriales\", \"creditos\":\"1\", \"co\" : [\"PIND\"], \"pre\" : []},"
        + "\"FUNE\": {\"nombre\" : \"Fundamentos de economia\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"CALD\"]},"
        + "\"EHU3\": {\"nombre\" : \"Electiva humanistica 3\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ESTI\": {\"nombre\" : \"Estadistica\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"PRBA\"]},"
        + "\"MMAT\": {\"nombre\" : \"Modelamiento matematico\", \"creditos\":\"2\", \"co\" : [], \"pre\" : [\"SPPC\", \"PRBA\"]},"
        + "\"ELET\": {\"nombre\" : \"Electrotecnia\", \"creditos\":\"3\", \"co\" : [\"LETC\"], \"pre\" : [\"ECDI\",\"FIEM\"]},"
        + "\"LETC\": {\"nombre\" : \"Laboratorio de electrotecnia\", \"creditos\":\"1\", \"co\" : [\"ELET\"], \"pre\" : []},"
        + "\"DPRD\": {\"nombre\" : \"Desarrollo del producto\", \"creditos\":\"2\", \"co\" : [], \"pre\" : [\"PIND\", \"LPIN\"]},"
        + "\"LDPR\": {\"nombre\" : \"Laboratorio de desarrollo del producto\", \"creditos\":\"1\", \"co\" : [\"DPRD\"], \"pre\" : []},"
        + "\"ACFI\": {\"nombre\" : \"Analisis contable y financiero\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FUNE\"]},"
        + "\"CLE1\": {\"nombre\" : \"Curso de libre eleccion 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ELCB\": {\"nombre\" : \"Electiva en ciencias basicas\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"OPDO\": {\"nombre\" : \"Optimizacion de operaciones\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"MMAT\"]},"
        + "\"ETTR\": {\"nombre\" : \"Estudio del trabajo\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"DPRD\", \"LDPR\", \"ESTI\"]},"
        + "\"GORG\": {\"nombre\" : \"Gestion organizacional\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"IINI\"]},"
        + "\"CMAN\": {\"nombre\" : \"Costos manufactura\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ACFI\"]},"
        + "\"CLE2\": {\"nombre\" : \"Curso de libre eleccion 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"MOES\": {\"nombre\" : \"Modelos estocasticos\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"MMAT\"]},"
        + "\"PCPI\": {\"nombre\" : \"Planeacion y Control de la Produccion e Inventarios \", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ETTR\", \"MMAT\"]},"
        + "\"DPIN\": {\"nombre\" : \"Diseno de plantas industriales\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ELET\",\"ETTR\", \"TMDN\"]},"
        + "\"CLDD\": {\"nombre\" : \"Calidad\", \"creditos\":\"3\", \"co\" : [\"ETTR\"], \"pre\" : [\"ESTI\", \"PIND\"]},"
        + "\"GCHU\": {\"nombre\" : \"Gestion de capital humano\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ESTI\",\"GORG\"]},"
        + "\"FEPR\": {\"nombre\" : \"Formulacion y evaluacion de proyectos\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ACFI\", \"GORG\"]},"
        + "\"EPF1\": {\"nombre\" : \"Electiva de profundizacion 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"EPF3\": {\"nombre\" : \"Electiva de profundizacion 3\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"OGI1\": {\"nombre\" : \"Opcion de grado industrial 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"GCAB\": {\"nombre\" : \"Gestion de la cadena de abastecimiento\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"PCPI\"]},"
        + "\"PMLI\": {\"nombre\" : \"Produccion mas limpia\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"BIOL\",  \"CMAN\"]},"
        + "\"CRIP\": {\"nombre\" : \"Colombia realidad e instituciones politicas\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"EPF2\": {\"nombre\" : \"Electiva de profundizacion 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"OGI2\": {\"nombre\" : \"Opcion de grado industrial 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"NEGO\": {\"nombre\" : \"Negociacion\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FEPR\"]}}";

    }
    
    
}
