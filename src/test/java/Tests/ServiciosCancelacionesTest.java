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

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.SolicitudCancelacion;
import com.BoomECI.entidades.SolicitudCancelacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.JsonObject;

import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ParserGrafo;
import com.BoomECI.logica.services.ParserJSON;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelacionesFactory;
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
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=MYSQL", "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("delete from Acudiente");
        stmt.execute("delete from Consejero");
        stmt.execute("delete from Estudiante");
        stmt.execute("delete from Materia");
        stmt.execute("delete from MateriasActuales");
        stmt.execute("delete from MateriasCursadas");
        stmt.execute("delete from Plan_de_Estudio");
        stmt.execute("delete from USER");
        stmt.execute("delete from rol");
        stmt.execute("delete from solicitud_de_cancelacion");
        
        conn.commit();
        conn.close();
    }

    /**
     * Obtiene una conexion a la base de datos de prueba
     * @return
     * @throws SQLException 
     */
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=MYSQL", "sa", "");        
    }
  
    
    @Test
    public void primeraPruebaTest() throws SQLException, ExcepcionServiciosCancelaciones {
        //Insertar datos en la base de datos de pruebas, de acuerdo con la clase
        //de equivalencia correspondiente
        /**Connection conn=getConnection();
        Statement stmt=conn.createStatement();                
        stmt.execute("INSERT into solicitud_de_cancelacion "
                + "values(TO_DATE('2016-01-30 16:58:01','YYYY-MM-DD HH24:MI:SS')"
                + ",'inactivo',1,'porque si','vale esta bien',FALSE,FALSE,'PDSW','1'");        
        conn.commit();
        conn.close();
	
        //Realizar la operacion de la logica y la prueba
        
        
        ServiciosCancelacionesFactory.getInstance().getTestingServiciosCancelaciones().cambiarElestadoDeLaSolicitud(1, "tramitada");        
        List<SolicitudCancelacion> s = ServiciosCancelacionesFactory.getInstance().getTestingServiciosCancelaciones().consultarSolicitudCancelacionEstudiante(1);
        
        System.out.println(s);
            
        Assert.assertEquals(s,"YESMAN");**/
    }    
     
   
}


