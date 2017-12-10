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
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid 
 * @adapted by BOOMECI
 */
public class ServiciosCancelacionesTest{
    
    private ServiciosCancelaciones servicios;        

    @Before
    public void setUp() {        
        servicios = ServiciosCancelacionesFactory.getInstance().getTestingServiciosCancelaciones();
    }
    
    @After
    public void clearDB() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "sa", "");
        Statement stmt = conn.createStatement();  
        stmt.execute("DELETE from ESTUDIANTE");
        //stmt.execute("delete from COMENTARIOS");
        //stmt.execute("delete from ENTRADAS_FOROS");
        conn.commit();
        conn.close();
    }
    
    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:h2:file:./target/db/testdb;MODE=PostgreSQL", "sa", "");        
    }
    
    @Test
    public void consultarEstudiantePorIdTest() throws ExcepcionServiciosCancelaciones, SQLException{
        
        Connection conn=getConnection();
        Statement stmt=conn.createStatement();
        stmt.execute("INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos) VALUES (134566, 2110805, 'Juan David Ramirez Mendoza', 'juan.ramirez-me@mail.escuelaing.edu.co', 3138912392, 2345678, 1019138850, 'CC', 1, 18)");
        stmt.execute("INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos) VALUES (1904567, 2110432, 'Nicolas Osorio Arias', 'nicolas.osorio@mail.escuelaing.edu.co', 3152345671, 2345680, 1013456778, 'CC', 1, 18)");
        conn.commit();
        conn.close();
        
        Estudiante es = servicios.consultarEstudiante(2110805);                                
        Estudiante es1 = servicios.consultarEstudiante(2110432);
        
        
        assertEquals(es.getNombre(),"Juan David Ramirez Mendoza"); 
        assertEquals(es1.getNombre(),"Nicolas Osorio Arias"); 
    }
    
    @Test
    public void consultarEstudiantesTest() throws ExcepcionServiciosCancelaciones, SQLException{
        Connection conn=getConnection();
        Statement stmt=conn.createStatement();
        stmt.execute("INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos) VALUES (134566, 2110805, 'Juan David Ramirez Mendoza', 'juan.ramirez-me@mail.escuelaing.edu.co', 3138912392, 2345678, 1019138850, 'CC', 1, 18)");
        stmt.execute("INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos) VALUES (1904567, 2110432, 'Nicolas Osorio Arias', 'nicolas.osorio@mail.escuelaing.edu.co', 3152345671, 2345680, 1013456778, 'CC', 1, 18)");
        conn.commit();
        conn.close();
        
        List<Estudiante> est = servicios.consultarEstudiantes();
        
        assertEquals(est.size(),2);

    }               
    
    @Test
    public void consultarSolicitudTest() throws ExcepcionServiciosCancelaciones, SQLException{
                       
    }
    
    
    
    
    
}

    

