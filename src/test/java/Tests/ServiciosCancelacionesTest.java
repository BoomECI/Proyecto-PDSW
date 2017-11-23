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
        ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        try{
           //SolicitudCancelacion  x = new SolicitudCancelacion(java.sql.Date.valueOf("2000-2-2"), "Esperando", 3, "me duele la vida" , "muy mal panita",true,false, "sopc", 1);
           //a.agregarSolicitudCancelacionEstudiante(x);
           JsonObject o = p.convertStringToGrafo("{\n" +
                "	\"materias\": [\"iins\",\"fmat\",\"prem\",\"ageo\",\"pimb\",\"depd\",\"ffis\",\"pimo\",\"mmin\",\"exoe\",\"eale\",\"fimf\",\"cald\",\"alli\",\"lcal\",\"ehu1\",\"ehu2\",\"ehu3\",\"crip\",\"poob\",\"cied\",\"fune\",\"mbda\",\"mdis\",\"cle1\",\"cle2\",\"fiem\",\"elcb\",\"tpro\",\"tcom\",\"arqc\",\"pdsw\", \n" +
                "	\"pdis\", \n" +
                "	\"tsor\", \n" +
                "	\"acfi\", \n" +
                "	\"elea\", \n" +
                "	\"sopc\", \n" +
                "	\"fred\", \n" +
                "	\"esti\", \n" +
                "	\"pron\", \n" +
                "	\"fgpr\", \n" +
                "	\"et01\", \n" +
                "	\"et02\", \n" +
                "	\"et03\", \n" +
                "	\"segi\", \n" +
                "	\"arsw\", \n" +
                "	\"arem\", \n" +
                "	\"pgr1\", \n" +
                "	\"pgr2\", \n" +
                "	\"cosw\", \n" +
                "	\"sosw\"],\n" +
                "	\"root\": [\"cle1\", \"tsor\", \"et01\", \"iins\", \"exoe\", \"elcb\", \"cle2\", \"fmat\", \"ffis\", \"ageo\", \"et02\", \"pimb\", \"depd\", \"et03\", \"elea\",\"ehu1\",\"ehu2\",\"ehu3\"], \n" +
                "	\"iins\": [], \n" +
                "	\"fmat\": [\"prem\"], \n" +
                "	\"prem\": [\"cald\", \"alli\"], \n" +
                "	\"ageo\": [\"cald\", \"alli\"], \n" +
                "	\"pimb\": [\"pimo\", \"mbda\"], \n" +
                "	\"depd\": [], \n" +
                "	\"ffis\": [\"fimf\"], \n" +
                "	\"pimo\": [\"tpro\", \"poob\"], \n" +
                "	\"mmin\": [\"pimo\", \"lcal\"], \n" +
                "	\"exoe\": [], \n" +
                "	\"eale\": [], \n" +
                "	\"fimf\": {\"co\":\"cald\",\"pre\": [\"fiem\"]}, \n" +
                "	\"cald\": [\"cied\", \"fune\"], \n" +
                "	\"alli\": [], \n" +
                "	\"lcal\": [\"mdis\", \"mbda\"], \n" +
                "	\"ehu1\": [], \n" +
                "	\"ehu2\": [], \n" +
                "	\"ehu3\": [], \n" +
                "	\"crip\": [], \n" +
                "	\"poob\": [\"pdsw\", \"tcom\"], \n" +
                "	\"cied\": [\"pdis\"], \n" +
                "	\"fune\": [\"acfi\"], \n" +
                "	\"mbda\": [\"pdsw\"], \n" +
                "	\"mdis\": [\"tpro\", \"tcom\"], \n" +
                "	\"cle1\": [], \n" +
                "	\"cle2\": [], \n" +
                "	\"fiem\": [\"arqc\"], \n" +
                "	\"elcb\": [], \n" +
                "	\"tpro\": [], \n" +
                "	\"tcom\": [], \n" +
                "	\"arqc\": [\"sopc\", \"fred\"], \n" +
                "	\"pdsw\": [\"arsw\"], \n" +
                "	\"pdis\": [\"esti\"], \n" +
                "	\"tsor\": [\"pron\"], \n" +
                "	\"acfi\": [\"fgpr\"], \n" +
                "	\"elea\": [], \n" +
                "	\"sopc\": [], \n" +
                "	\"fred\": [\"arsw\", \"segi\"], \n" +
                "	\"esti\": [], \n" +
                "	\"pron\": [\"cosw\", \"arem\"], \n" +
                "	\"fgpr\": [\"pgr1\"], \n" +
                "	\"et01\": [], \n" +
                "	\"et02\": [], \n" +
                "	\"et03\": [], \n" +
                "	\"segi\": [], \n" +
                "	\"arsw\": [\"cosw\", \"sosw\"], \n" +
                "	\"arem\": [\"sosw\"], \n" +
                "	\"pgr1\": [\"pgr2\"], \n" +
                "	\"pgr2\": [], \n" +
                "	\"cosw\": [], \n" +
                "	\"sosw\": []\n" +
                
                "}");
           
            Grafo graph = p.convertJsonToGrafo(o);
            graph.printNodes();
           

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }*/
   
}


