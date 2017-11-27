/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import entidades.Grafo;
import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ParserGrafo;
import logica.services.ParserJSON;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author BoomEci
 */
public class SimpleTest {
    /**
     * Diseño de pruebas:
     * 
     * Clases de equivalencia:
     *  
     *      CE1: Descripción. El estudiante no existe.
     *           Resultado esperado: No agrega la solicitud de cancelacion.
     *          
     *      CE2: Descripción. Solicitar una nueva cancelacion.
     *           Resultado esperado: La lista de cancelaciones generales y del estudiante debe aumentar
     *   
     *      CE3: Las solicitudes de cancelacion tramitadas deben tener el aval del consejero y 
     *           del acudiente.
     *           Resultado esperado: Solicitudes de cancelacion deben cumplir con la condicion.
     *          
     *      CE5: Las solicitudes de cancelacion NO tramitadas, son las que le falta el aval del consejero
     *           y/o la del acudiente.
     *           Resultado esperado: Todas las solicitudes deben cumplir con la condicion.
     * 
     *      CE5: Si la solicitud de cancelacion se acepta, los creditos faltantes deben aumentar en los creditos
     *           de la materia cancelada
     *           Resultado esperado: Creditos faltantes mas los de materia cancelada
     *  
     * Condiciones de frontera:
     * 
     *      CF1: Una materia cancelada anteriormente no puede ser cancelada de nuevo.
     *           Clases de equivalencia relacionadas: 
     *           Resultado esperado: No se puede realizar la cancelacion solicitada 
     *      
     *         
     * 
     */
    
    public SimpleTest(){
    }
    
    @Test
    public void testNoDeberiaAgregarUnaSolicitudSiElEstudianteNoExiste() throws ExcepcionServiciosCancelaciones{
        
    } 
    
    @Test
    public void testDeberiaPoderSolicitarUnaCancelacion() throws ExcepcionServiciosCancelaciones{
        
    } 
    
    @Test
    public void testLasSolicitudesTramitadasDeberianTenerElAvalDelConsejeroAcudiente() throws ExcepcionServiciosCancelaciones{
        
    } 
    
    @Test
    public void testLasSolicitudesNoTramitadasNoDebenTenerAlgunAval() throws ExcepcionServiciosCancelaciones{
        
    } 
    
    @Test
    public void testLosCreditosDebenCoincidirCorrectamente() throws ExcepcionServiciosCancelaciones{
        
    } 
    
    @Test
    public void testUnaMateriaCanceladaAnteriormenteNoPuedeVolverHacerCancelada() throws ExcepcionServiciosCancelaciones{
    
    } 
    
    @Test
    public void prueba(){
        //ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        //ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        ParserGrafo p = new ParserJSON();
        try{
           //SolicitudCancelacion  x = new SolicitudCancelacion(java.sql.Date.valueOf("2000-2-2"), "Esperando", 3, "me duele la vida" , "muy mal panita",true,false, "sopc", 1);
           //a.agregarSolicitudCancelacionEstudiante(x);
           Grafo graph = p.convertStringToGrafo("{\n" +
"	\"materias\": [\"CALD\",\"MMIN\",\"ALLI\",\"IINS\",\"EALE\",\"CIED\",\"LCAL\",\"FIMF\",\"PIMB\",\"MDIS\",\"FIEM\",\"MBDA\",\"PIMO\",\"EHU1\",\"PDIS\",\"TPRO\",\"ARQC\",\n" +
"	\"ELCB\",\"POOB\",\"ESTI\",\"TCOM\",\"FRED\",\"TSOR\",\"PDSW\",\"FUNE\",\"SEGI\",\"SOPC\",\"PRON\",\"ARSW\",\"ACFI\",\"AREM\",\"COSW\", \"EHU2\",\"FGPR\",\"ET01\", \n" +
"	\"SOSW\", \"EHU3\", \"ELEA\", \"ET02\", \"PGR1\", \"CRIP\", \"ET03\", \"CLE1\", \"PGR2\", \"CLE2\"],\n" +
"	\"root\": {\n" +
"			\"nombre\" : \"\", \n" +
"			\"creditos\":\"0\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CLE1\", \"TSOR\", \"ET01\", \"IINS\", \"EXOE\", \"ELCB\", \"CLE2\", \"FMAT\", \"FFIS\", \"AGEO\", \"ET02\", \"PIMB\", \"DEPD\", \"ET03\", \"ELEA\"]}, \n" +
"	\"CALD\": {\"nombre\" : \"Calculo diferencial\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [\"FIMF\"], \n" +
"			\"pre\" : [\"CIED\",\"FUNE\"]}, \n" +
"	\"MMIN\": {\"nombre\" : \"Modelos matematicos para informatica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMO\",\"LCAL\"]},\n" +
"	\"FFIS\": {\"nombre\" : \"Fundamentos de Fisica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FIMF\"]},\n" +
"	\"FMAT\": {\"nombre\" : \"Fundamentos de Matematicas\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PREM\"]},\n" +
"	\"AGEO\": {\"nombre\" : \"Analisis Geometrico\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CALD\",\"ALLI\"]},\n" +
"	\"PREM\": {\"nombre\" : \"Precalculo\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CALD\",\"ALLI\"]},\n" +
"	\"EXOE\": {\"nombre\" : \"Expresion Oral y Escrita\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMO\",\"LCAL\"]},\n" +
"	\"DEPD\": {\"nombre\" : \"Deporte Dirigido\", \n" +
"			\"creditos\":\"0\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"ALLI\": {\"nombre\" : \"Algebra lineal\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"IINS\": {\"nombre\" : \"Introduccion a la ingenieria de sistemas\", \n" +
"			\"creditos\":\"2\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"EALE\": {\"nombre\" : \"Electiva en el area de lengua espanola\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"CIED\": {\"nombre\" : \"Calculo integral y ecuaciones diferenciales\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [\"FIEM\"], \n" +
"			\"pre\" : [\"PDIS\"]}, \n" +
"	\"LCAL\": {\"nombre\" : \"Logica calculativa\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"MBDA\",\"MDIS\"]}, \n" +
"	\"FIMF\": {\"nombre\" : \"Fisica mecanica y fluidos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FIEM\"]}, \n" +
"	\"PIMB\": {\"nombre\" : \"Programacion imperativa basica\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMO\",\"MBDA\"]}, \n" +
"	\"MDIS\": {\"nombre\" : \"Matematicas discretas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"TPRO\",\"TCOM\"]}, \n" +
"	\"FIEM\": {\"nombre\" : \"Fisica del electromagnetismo\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ARQC\"]}, \n" +
"	\"MBDA\": {\"nombre\" : \"Modelos y bases de datos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PDSW\"]}, \n" +
"	\"PIMO\": {\"nombre\" : \"Programacion imperativa modular\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"POOB\", \"TPRO\"]}, \n" +
"	\"EHU1\": {\"nombre\" : \"Electiva humanistica 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PDIS\": {\"nombre\" : \"Probabilidad discreta\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ESTI\",\"FGPR\"]}, \n" +
"	\"TPRO\": {\"nombre\" : \"Teoria de la programacion\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ARQC\": {\"nombre\" : \"Arquitectura del computador\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"SOPC\",\"FRED\"]}, \n" +
"	\"ELCB\": {\"nombre\" : \"Electiva en ciencias basicas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"POOB\": {\"nombre\" : \"Programacion orientada a objetos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PDSW\"]}, \n" +
"	\"ESTI\": {\"nombre\" : \"Estadistica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"TCOM\": {\"nombre\" : \"Teoria de la computacion\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"FRED\": {\"nombre\" : \"Fundamentos de redes\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"SEGI\",\"ARSW\"]}, \n" +
"	\"TSOR\": {\"nombre\" : \"Teoria de sistemas y organizaciones\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PRON\"]}, \n" +
"	\"PDSW\": {\"nombre\" : \"Procesos de desarrollo de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ARSW\"]}, \n" +
"	\"FUNE\": {\"nombre\" : \"Fundamentos de economia\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ACFI\"]}, \n" +
"	\"SEGI\": {\"nombre\" : \"Seguridad informatica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"SOPC\": {\"nombre\" : \"Sistemas operativos y plataformas computacionales\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PRON\": {\"nombre\" : \"Procesos de negocio\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"COSW\",\"AREM\"]}, \n" +
"	\"ARSW\": {\"nombre\" : \"Arquitectura de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"COSW\",\"SOSW\"]}, \n" +
"	\"ACFI\": {\"nombre\" : \"Analisis contable y financiero\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FGPR\"]}, \n" +
"	\"AREM\": {\"nombre\" : \"Arquitecturas empresariales\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"SOSW\"]}, \n" +
"	\"COSW\": {\"nombre\" : \"Construccion de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"EHU2\": {\"nombre\" : \"Electiva humanistica 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"FGPR\": {\"nombre\" : \"Fundamentos y gerencia de proyectos\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PGR1\"]}, \n" +
"	\"ET01\": {\"nombre\" : \"Electiva tecnica 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"SOSW\": {\"nombre\" : \"Soluciones de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"EHU3\": {\"nombre\" : \"Electiva humanistica 3\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ELEA\": {\"nombre\" : \"Electiva economico-administrativa\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ET02\": {\"nombre\" : \"Electiva tecnica 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PGR1\": {\"nombre\" : \"Proyecto de grado 1\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PGR2\"]}, \n" +
"	\"CRIP\": {\"nombre\" : \"Colombia: realidad e instituciones politicas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ET03\": {\"nombre\" : \"Electiva tecnica 3\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"CLE1\": {\"nombre\" : \"Curso de libre eleccion 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PGR2\": {\"nombre\" : \"Proyecto de grado 2\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"CLE2\": {\"nombre\" : \"Curso de libre eleccion 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}\n" +
"}");
           
            graph.printNodes();
            
           

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
}
