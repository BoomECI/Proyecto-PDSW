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
                "	\"materias\": [\"iins\",\"fmat\",\"prem\",\"ageo\",\"pimb\",\"depd\",\"ffis\",\"pimo\",\"mmin\",\"exoe\",\"eale\",\"fimf\",\"cald\",\"alli\",\"lcal\",\"ehu1\",\"ehu2\",\n" +
                "	\"ehu3\",\"crip\",\"poob\",\"cied\",\"fune\",\"mbda\",\"mdis\",\"cle1\",\"cle2\",\"fiem\",\"elcb\",\"tpro\",\"tcom\",\"arqc\",\"pdsw\", \"pdis\",\"tsor\",\"acfi\", \n" +
                "	\"elea\", \"sopc\", \"fred\", \"esti\", \"pron\", \"fgpr\", \"et01\", \"et02\", \"et03\", \"segi\", \"arsw\", \"arem\", \"pgr1\", \"pgr2\", \"cosw\", \"sosw\"],\n" +
                "	\"root\": {\n" +
                "			\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"cle1\", \"tsor\", \"et01\", \"iins\", \"exoe\", \"elcb\", \"cle2\", \"fmat\", \"ffis\", \"ageo\", \"et02\", \"pimb\", \"depd\", \"et03\", \"elea\"]}, \n" +
                "	\"iins\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"fmat\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"prem\"]}, \n" +
                "	\"prem\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"cald\", \"alli\"]}, \n" +
                "	\"ageo\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"cald\", \"alli\"]}, \n" +
                "	\"pimb\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pimo\", \"mbda\"]}, \n" +
                "	\"depd\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"ffis\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"fimf\"]}, \n" +
                "	\"pimo\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"tpro\", \"poob\"]}, \n" +
                "	\"mmin\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pimo\", \"lcal\"]}, \n" +
                "	\"exoe\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"eale\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"fimf\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"fiem\"]}, \n" +
                "	\"cald\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [\"fimf\"], \n" +
                "			\"pre\" : [\"cied\", \"fune\"]}, \n" +
                "	\"alli\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"lcal\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"mdis\", \"mbda\"]}, \n" +
                "	\"ehu1\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"ehu2\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"ehu3\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"crip\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"poob\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pdsw\", \"tcom\"]}, \n" +
                "	\"cied\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pdis\"]}, \n" +
                "	\"fune\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"acfi\"]}, \n" +
                "	\"mbda\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pdsw\"]}, \n" +
                "	\"mdis\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"tpro\", \"tcom\"]}, \n" +
                "	\"cle1\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"cle2\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"fiem\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"arqc\"]}, \n" +
                "	\"elcb\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"tpro\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"tcom\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"arqc\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"sopc\", \"fred\"]}, \n" +
                "	\"pdsw\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"arsw\"]}, \n" +
                "	\"pdis\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"esti\"]}, \n" +
                "	\"tsor\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pron\"]}, \n" +
                "	\"acfi\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"fgpr\"]}, \n" +
                "	\"elea\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"sopc\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"fred\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"arsw\", \"segi\"]}, \n" +
                "	\"esti\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"pron\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"cosw\", \"arem\"]}, \n" +
                "	\"fgpr\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pgr1\"]}, \n" +
                "	\"et01\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"et02\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"et03\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"segi\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"arsw\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"cosw\", \"sosw\"]}, \n" +
                "	\"arem\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"sosw\"]}, \n" +
                "	\"pgr1\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : [\"pgr2\"]}, \n" +
                "	\"pgr2\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"cosw\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
                "			\"co\" : [], \n" +
                "			\"pre\" : []}, \n" +
                "	\"sosw\": {\"nombre\" : \"\", \n" +
                "			\"creditos\":\"0\", \n" +
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
