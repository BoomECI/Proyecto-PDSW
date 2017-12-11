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
    
    
    private String carrera;
    private String grafo;
    private int numeroDeCreditosTotales;
    private int numeroDeAsignaturas;
    private int numeroPlanDeEstudio;
    private List<Materia> materias;
    public static final int creditosPorSemestre = 18;
    
    public PlanDeEstudios(){
    }
    public PlanDeEstudios(int numeroPlanDeEstudio) {
        this.numeroPlanDeEstudio = numeroPlanDeEstudio;
        if(numeroPlanDeEstudio ==1){
            grafo = sistemas();
        }
        else if(numeroPlanDeEstudio == 10){
            grafo = industrial();
        }
        
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getNumeroPlanDeEstudio() {
        return numeroPlanDeEstudio;
    }

    public void setNumeroPlanDeEstudio(int numeroPlanDeEstudio) {
        this.numeroPlanDeEstudio = numeroPlanDeEstudio;
    }

    public static String sistemas() {
        return "{\"materias\": [\"CALD\",\"MMIN\","
        + "\"ALLI\",\"IINS\",\"EALE\",\"CIED\",\"LCAL\","
        + "\"FIMF\",\"PIMB\",\"MDIS\",\"FIEM\",\"MBDA\","
        + "\"PIMO\",\"EHU1\",\"PDIS\",\"TPRO\",\"ARQC\","
        + "\"ELCB\",\"POOB\",\"ESTI\",\"TCOM\",\"FRED\","
        + "\"TSOR\",\"PDSW\",\"FUNE\",\"SEGI\",\"SOPC\","
        + "\"PRON\",\"ARSW\",\"ACFI\",\"AREM\",\"COSW\", "
        + "\"EHU2\",\"FGPR\",\"ET01\", \"SOSW\", \"EHU3\", "
        + "\"ELEA\",\"ET02\", \"PGR1\", \"CRIP\", \"ET03\", "
        + "\"CLE1\", \"PGR2\", \"CLE2\"],"
        + "\"CALD\": {\"nombre\" : \"Calculo diferencial\",\"creditos\":\"4\", \"co\" : [], \"pre\" : []},"
        + "\"MMIN\": {\"nombre\" : \"Modelos matematicos para informatica\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ALLI\": {\"nombre\" : \"Algebra lineal\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"IINS\": {\"nombre\" : \"Introduccion a la ingenieria de sistemas\", \"creditos\":\"2\", \"co\" : [], \"pre\" : []},"
        + "\"EALE\": {\"nombre\" : \"Electiva en el area de lengua espanola\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"CIED\": {\"nombre\" : \"Calculo integral y ecuaciones diferenciales\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"CALD\"]},"
        + "\"LCAL\": {\"nombre\" : \"Logica calculativa\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"MMIN\"},"
        + "\"FIMF\": {\"nombre\" : \"Fisica mecanica y fluidos\", \"creditos\":\"4\", \"co\" : [\"CALD\"], \"pre\" : []},"
        + "\"PIMB\": {\"nombre\" : \"Programacion imperativa basica\", \"creditos\":\"4\", \"co\" : [], \"pre\" : []},"
        + "\"MDIS\": {\"nombre\" : \"Matematicas discretas\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"LCAL\"]},"
        + "\"FIEM\": {\"nombre\" : \"Fisica del electromagnetismo\", \"creditos\":\"4\", \"co\" : [\"CIED\"], \"pre\" : [\"FIMF\"]},"
        + "\"MBDA\": {\"nombre\" : \"Modelos y bases de datos\", \"creditos\":\"4\", \"co\" : [],\"pre\" : [\"LCAL\",\"PIMB\"]},"
        + "\"PIMO\": {\"nombre\" : \"Programacion imperativa modular\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"PIMB\"]},"
        + "\"EHU1\": {\"nombre\" : \"Electiva humanistica 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"PDIS\": {\"nombre\" : \"Probabilidad discreta\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"CIED\"]},"
        + "\"TPRO\": {\"nombre\" : \"Teoria de la programacion\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"MDIS\",\"PIMO\"]},"
        + "\"ARQC\": {\"nombre\" : \"Arquitectura del computador\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FIEM\"]},"
        + "\"ELCB\": {\"nombre\" : \"Electiva en ciencias basicas\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"POOB\": {\"nombre\" : \"Programacion orientada a objetos\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"PIMO\"]},"
        + "\"ESTI\": {\"nombre\" : \"Estadistica\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"PDIS\"]},"
        + "\"TCOM\": {\"nombre\" : \"Teoria de la computacion\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"MDIS\",\"POOB\"]},"
        + "\"FRED\": {\"nombre\" : \"Fundamentos de redes\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ARQC\"]},"
        + "\"TSOR\": {\"nombre\" : \"Teoria de sistemas y organizaciones\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"PDSW\": {\"nombre\" : \"Procesos de desarrollo de software\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"MBDA\", \"POOB\"]},"
        + "\"FUNE\": {\"nombre\" : \"Fundamentos de economia\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"CALD\"]},"
        + "\"SEGI\": {\"nombre\" : \"Seguridad informatica\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FRED\"]},"
        + "\"SOPC\": {\"nombre\" : \"Sistemas operativos y plataformas computacionales\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"ARQC\"]},"
        + "\"PRON\": {\"nombre\" : \"Procesos de negocio\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"TSOR\"]},"
        + "\"ARSW\": {\"nombre\" : \"Arquitectura de software\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"PDSW\", \"FRED\"]},"
        + "\"ACFI\": {\"nombre\" : \"Analisis contable y financiero\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FUNE\"]},"
        + "\"AREM\": {\"nombre\" : \"Arquitecturas empresariales\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"AREM\"]},"
        + "\"COSW\": {\"nombre\" : \"Construccion de software\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"ARSW\",\"PRON\"]},"
        + "\"EHU2\": {\"nombre\" : \"Electiva humanistica 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"FGPR\": {\"nombre\" : \"Fundamentos y gerencia de proyectos\", \"creditos\":\"3\", \"co\" : [], \"pre\" : [\"FGPR\"]},"
        + "\"ET01\": {\"nombre\" : \"Electiva tecnica 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"SOSW\": {\"nombre\" : \"Soluciones de software\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"ARSW\",\"AREM\"]},"
        + "\"EHU3\": {\"nombre\" : \"Electiva humanistica 3\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ELEA\": {\"nombre\" : \"Electiva economico-administrativa\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ET02\": {\"nombre\" : \"Electiva tecnica 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"PGR1\": {\"nombre\" : \"Proyecto de grado 1\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"FGPR\"]},"
        + "\"CRIP\": {\"nombre\" : \"Colombia: realidad e instituciones politicas\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"ET03\": {\"nombre\" : \"Electiva tecnica 3\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"CLE1\": {\"nombre\" : \"Curso de libre eleccion 1\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []},"
        + "\"PGR2\": {\"nombre\" : \"Proyecto de grado 2\", \"creditos\":\"4\", \"co\" : [], \"pre\" : [\"PGR1\"]},"
        + "\"CLE2\": {\"nombre\" : \"Curso de libre eleccion 2\", \"creditos\":\"3\", \"co\" : [], \"pre\" : []}}";
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
