 /*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Tests;

import entidades.Estudiante;
import entidades.Grafo;
import entidades.Materia;
import entidades.SolicitudCancelacion;
import entidades.SolicitudCancelacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.JsonObject;

import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ParserGrafo;
import logica.services.ParserJSON;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hcadavid 
 * @adapted by BOOMECI
 */
public class ServiciosCancelacionesTest{
    public ServiciosCancelacionesTest(){
        
    }

    @Before
    public void setUp() {
    }

    @After
    public void clearDB() throws SQLException {
        /*Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=MYSQL", "anonymous", "anonymous");
        Statement stmt = conn.createStatement();
        stmt.execute("delete from Acudiente");
        stmt.execute("delete from Conserjero");
        stmt.execute("delete from Estudiante");
        stmt.execute("delete from Materia");
        stmt.execute("delete from MateriasActuales");
        stmt.execute("delete from MateriasCursadas");
        stmt.execute("delete from Plan_de_Estudio");
        stmt.execute("delete from solicitud_de_cancelacion");
        
        conn.commit();
        conn.close();*/
    }

    /**
     * Obtiene una conexion a la base de datos de prueba
     * @return
     * @throws SQLException 
     */
    /*private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=MYSQL", "anonymous", "anonymous");        
    }*/

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
    
    
    /*@Test
    public void primeraPruebaTest() throws SQLException, ExcepcionServiciosCancelaciones {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente
        Connection conn=getConnection();
        Statement stmt=conn.createStatement();        
        stmt.execute("INSERT into Plan_de_Estudio values ('ingenieria de sistemas',1,'blabla',1,1)");
        stmt.execute("INSERT into materia values('ESTI')");
        stmt.execute("INSERT into materia values('FRED')");
        stmt.execute("INSERT into materia values('PDSW'");
        stmt.execute("INSERT into solicitud_de_cancelacion "
                + "values(TO_DATE('2016-01-30 16:58:01','YYYY-MM-DD HH24:MI:SS')"
                + ",'inactivo',1,'porque si','vale esta bien',FALSE,FALSE,'PDSW'");
        stmt.execute("INSERT into consejero values('RODRI',1,'blabla')");
        stmt.execute("INSERT into acudiente values('YOLANDA',1,'biriri',92827)");
        stmt.execute("INSERT into estudiante values(1,222,'YESMAN','yesman',314433,1,101213,'CC',1,1)");
        conn.commit();
        conn.close();
	
        //Realizar la operacion de la logica y la prueba
        
        
        Estudiante estudiante = ServiciosCancelacionesFactory.getInstance().getTestingServiciosCancelaciones().consultarEstudiante(222);        
            System.out.println(estudiante);
            
        Assert.assertEquals(estudiante.getNombre(),"YESMAN");
    }  */    
     
    
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
    /*
    @Test
    public void prueba(){
        //ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        //ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        ParserGrafo p = new ParserJSON();
        try{
           //SolicitudCancelacion  x = new SolicitudCancelacion(java.sql.Date.valueOf("2000-2-2"), "Esperando", 3, "me duele la vida" , "muy mal panita",true,false, "sopc", 1);
           //a.agregarSolicitudCancelacionEstudiante(x);
           JsonObject o = p.convertStringToGrafo("{\n" +
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
           
            Grafo graph = p.convertJsonToGrafo(o);
            graph.printNodes();
           

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }*/
   
}


