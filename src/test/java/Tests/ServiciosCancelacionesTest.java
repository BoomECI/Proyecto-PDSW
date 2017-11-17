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
import entidades.Materia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import logica.services.ExcepcionServiciosCancelaciones;
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
    
    @Test
    public void prueba(){
        ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        try{
            List<Estudiante> x = a.consultarEstudiantes();
            
            System.out.println(x.get(0).getMateriasActuales().size());
          

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
   
}


