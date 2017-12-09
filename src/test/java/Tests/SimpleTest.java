/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.BoomECI.entidades.Acudiente;
import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import com.BoomECI.entidades.SolicitudCancelacion;
import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ParserGrafo;
import com.BoomECI.logica.services.ParserJSON;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelacionesFactory;
import java.util.ArrayList;
import java.util.List;
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
        ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        //ParserGrafo p = new ParserJSON();
        try{
           //SolicitudCancelacion  x = new SolicitudCancelacion(java.sql.Date.valueOf("2000-2-2"), "Esperando", 3, "me duele la vida" , "muy mal panita",true,false, "sopc", 1);
           //a.agregarSolicitudCancelacionEstudiante(x);
           Grafo graph = p.convertStringToGrafo("{\n" +
"	\"materias\": [\"CALD\",\"MMIN\",\"ALLI\",\"IINS\",\"EALE\",\"CIED\",\"LCAL\",\"FIMF\",\"PIMB\",\"MDIS\",\"FIEM\",\"MBDA\",\"PIMO\",\"EHU1\",\"PDIS\",\"TPRO\",\"ARQC\",\n" +
"	\"ELCB\",\"POOB\",\"ESTI\",\"TCOM\",\"FRED\",\"TSOR\",\"PDSW\",\"FUNE\",\"SEGI\",\"SOPC\",\"PRON\",\"ARSW\",\"ACFI\",\"AREM\",\"COSW\", \"EHU2\",\"FGPR\",\"ET01\", \n" +
"	\"SOSW\", \"EHU3\", \"ELEA\", \"ET02\", \"PGR1\", \"CRIP\", \"ET03\", \"CLE1\", \"PGR2\", \"CLE2\"],\n" +
"	\"CALD\": {\"nombre\" : \"Calculo diferencial\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"AGEO\",\"PRE\"]}, \n" +
"	\"MMIN\": {\"nombre\" : \"Modelos matematicos para informatica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"FFIS\": {\"nombre\" : \"Fundamentos de Fisica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"FMAT\": {\"nombre\" : \"Fundamentos de Matematicas\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"AGEO\": {\"nombre\" : \"Analisis Geometrico\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"PREM\": {\"nombre\" : \"Precalculo\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FMAT\"]},\n" +
"	\"EXOE\": {\"nombre\" : \"Expresion Oral y Escrita\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"DEPD\": {\"nombre\" : \"Deporte Dirigido\", \n" +
"			\"creditos\":\"0\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []},\n" +
"	\"ALLI\": {\"nombre\" : \"Algebra lineal\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PREM\",\"AGEO\"]}, \n" +
"	\"IINS\": {\"nombre\" : \"Introduccion a la ingenieria de sistemas\", \n" +
"			\"creditos\":\"2\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"EALE\": {\"nombre\" : \"Electiva en el area de lengua espanola\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EXOE\"]}, \n" +
"	\"CIED\": {\"nombre\" : \"Calculo integral y ecuaciones diferenciales\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CALD\"]}, \n" +
"	\"LCAL\": {\"nombre\" : \"Logica calculativa\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"MMIN\"]}, \n" +
"	\"FIMF\": {\"nombre\" : \"Fisica mecanica y fluidos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [\"CALD\"], \n" +
"			\"pre\" : [\"FFIS\"]}, \n" +
"	\"PIMB\": {\"nombre\" : \"Programacion imperativa basica\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"MDIS\": {\"nombre\" : \"Matematicas discretas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"LCAL\"]}, \n" +
"	\"FIEM\": {\"nombre\" : \"Fisica del electromagnetismo\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [\"CIED\"], \n" +
"			\"pre\" : [\"FIMF\"]}, \n" +
"	\"MBDA\": {\"nombre\" : \"Modelos y bases de datos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"LCAL\",\"PIMB\"]}, \n" +
"	\"PIMO\": {\"nombre\" : \"Programacion imperativa modular\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMB\", \"LCAL\"]}, \n" +
"	\"EHU1\": {\"nombre\" : \"Electiva humanistica 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EALE\"]}, \n" +
"	\"PDIS\": {\"nombre\" : \"Probabilidad discreta\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CIED\"]}, \n" +
"	\"TPRO\": {\"nombre\" : \"Teoria de la programacion\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"MDIS\",\"PIMO\"]}, \n" +
"	\"ARQC\": {\"nombre\" : \"Arquitectura del computador\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FIEM\"]}, \n" +
"	\"ELCB\": {\"nombre\" : \"Electiva en ciencias basicas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"POOB\": {\"nombre\" : \"Programacion orientada a objetos\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PIMO\"]}, \n" +
"	\"ESTI\": {\"nombre\" : \"Estadistica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PDIS\"]}, \n" +
"	\"TCOM\": {\"nombre\" : \"Teoria de la computacion\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"POOB\",\"MDIS\"]}, \n" +
"	\"FRED\": {\"nombre\" : \"Fundamentos de redes\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ARQC\"]}, \n" +
"	\"TSOR\": {\"nombre\" : \"Teoria de sistemas y organizaciones\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PDSW\": {\"nombre\" : \"Procesos de desarrollo de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"POOB\",\"MBDA\"]}, \n" +
"	\"FUNE\": {\"nombre\" : \"Fundamentos de economia\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"CALD\"]}, \n" +
"	\"SEGI\": {\"nombre\" : \"Seguridad informatica\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FRED\"]}, \n" +
"	\"SOPC\": {\"nombre\" : \"Sistemas operativos y plataformas computacionales\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ARQC\"]}, \n" +
"	\"PRON\": {\"nombre\" : \"Procesos de negocio\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"TSOR\"]}, \n" +
"	\"ARSW\": {\"nombre\" : \"Arquitectura de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FRED\",\"PDSW\"]}, \n" +
"	\"ACFI\": {\"nombre\" : \"Analisis contable y financiero\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FUNE\"]}, \n" +
"	\"AREM\": {\"nombre\" : \"Arquitecturas empresariales\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PRON\"]}, \n" +
"	\"COSW\": {\"nombre\" : \"Construccion de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PRON\",\"ARSW\"]}, \n" +
"	\"EHU2\": {\"nombre\" : \"Electiva humanistica 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EHU1\"]}, \n" +
"	\"FGPR\": {\"nombre\" : \"Fundamentos y gerencia de proyectos\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ACFI\"]}, \n" +
"	\"ET01\": {\"nombre\" : \"Electiva tecnica 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"SOSW\": {\"nombre\" : \"Soluciones de software\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"AREM\",\"ARSW\"]}, \n" +
"	\"EHU3\": {\"nombre\" : \"Electiva humanistica 3\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"EHU2\"]}, \n" +
"	\"ELEA\": {\"nombre\" : \"Electiva economico-administrativa\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ET02\": {\"nombre\" : \"Electiva tecnica 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ET01\"]}, \n" +
"	\"PGR1\": {\"nombre\" : \"Proyecto de grado 1\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"FGPR\"]}, \n" +
"	\"CRIP\": {\"nombre\" : \"Colombia: realidad e instituciones politicas\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"ET03\": {\"nombre\" : \"Electiva tecnica 3\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"ET02\"]}, \n" +
"	\"CLE1\": {\"nombre\" : \"Curso de libre eleccion 1\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}, \n" +
"	\"PGR2\": {\"nombre\" : \"Proyecto de grado 2\", \n" +
"			\"creditos\":\"4\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : [\"PGR1\"]}, \n" +
"	\"CLE2\": {\"nombre\" : \"Curso de libre eleccion 2\", \n" +
"			\"creditos\":\"3\", \n" +
"			\"co\" : [], \n" +
"			\"pre\" : []}\n" +
"}");
           
            
            List<Materia> le=new ArrayList<Materia>();
            List<String> ca=new ArrayList<String>();
            ca.add("CIED");   
            List<Materia> he=new ArrayList<Materia>();
            List<SolicitudCancelacion> pa=new ArrayList<SolicitudCancelacion>();            
            Materia re=new Materia();
            re.setNemonico("MMIN");
            Materia y=new Materia();
            y.setNemonico("CALD");
            Materia X=new Materia();
            X.setNemonico("FIMF");
            Materia T=new Materia();
            T.setNemonico("ALLI");
            Materia U=new Materia();
            U.setNemonico("EALE");
            
            he.add(re);
            he.add(y);
            he.add(X);
            he.add(T);
            he.add(U);
            Materia P=new Materia();
            P.setNemonico("CIED");
            Materia O=new Materia();
            O.setNemonico("PIMB");
            Materia I=new Materia();
            I.setNemonico("LCAL");
            Materia L=new Materia();
            L.setNemonico("FIEM");
            Materia K=new Materia();
            K.setNemonico("EHU1");                     
            le.add(P);
            le.add(O);
            le.add(I);
            le.add(L);
            le.add(K);              
            
            PlanDeEstudios wqe= new PlanDeEstudios();
            Acudiente xd= new Acudiente();
            Consejero po= new Consejero();
            SolicitudCancelacion te=new SolicitudCancelacion();           
            Estudiante lol= new Estudiante(1,"dasfsd","sdfjlasd",5465,po,xd,12123,"as",le,he,wqe,pa);  
            new Estudiante();
            graph.calcularPlanDeEstudios(lol, ca);  

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
}
