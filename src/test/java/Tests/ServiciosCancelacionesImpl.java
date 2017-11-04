
package Tests;

import Lógica.servicios.ServiciosCancelaciones;
import Lógica.servicios.ServiciosCancelacionesFactory;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Nicolás
 */
public class ServiciosCancelacionesImpl {
    
/**
 * Diseño de pruebas:
 * 
 * Clases de equivalencia:
 *  
 *      CE1: Descripción. El estudiante no existe
 *           Resultado esperado: No agrega la solicitud de cancelacion.
 *          
 *      CE2: Descripción. Se agrega una consulta de un paciente
 *           Resultado esperado: La lista de consultas del paciente debe aumentar
 *   
 *      CE3: Solo se pueden agregar pacientes al sistema.
 *           Resultado esperado: Es verdadero si el parametro de entrada es de tipo paciente.
 *          
 *      CE5: Cuando se agrega un paciente, la lista de pacientes aumenta en 1.
 *           Resultado esperado: el tamaño de pacientes aumente en 1 cuando se agrege un paciente
 * 
 *      CE5: Error en la persistencia al momento de registrar un nuevo paciente.
 *           Resultado esperado: ExcepcionOperacionConPaciente
 * 
 * 
 *  
 * Condiciones de frontera:
 * 
 *      CF1: Se registra una persona creada. 
 *           Clases de equivalencia relacionadas: CE3,CE4
 *           Resultado esperado: la longuitud de los pacientes aumentó en 1.
 * 
 */


public class ServiciosPacientesTest {

    private ServiciosCancelaciones factory;
    public ServiciosPacientesTest() {
        factory = ServiciosCancelacionesFactory.getInstance().getTestingServiciosCancelaciones();
    }
    
    @Before
    public void setUp() {
    }
    
 /*   
    @Test
    public void noDeberiaAgregarUnaConsultaCuandoElPacienteNoExisteEnLaBaseDeDatos() throws ExcepcionServiciosPacientes{
        Paciente p = new Paciente();
        p.setId(10000);
        p.setTipoId("CC");
        try{
            factory.agregarConsultaPaciente(p.getId(), p.getTipoId(), new Consulta(new Date("2017/09/21 12:22 PM"), "Chequeo general", 23000 ));
            fail("Ha fallado la prueba");
        }catch(ExcepcionServiciosPacientes e){
            assertEquals("Paciente "+p.getId()+" no esta registrado" , e.getMessage());
        }
    }
    
    
    @Test
    public void deberiaAgregarUnaConsultaAlPaciente() throws ExcepcionServiciosPacientes{
        Paciente pac1 = new Paciente();
        pac1.setId(10203041);
        pac1.setTipoId("CC");
        Consulta consulta = new Consulta(new Date("2017/09/21 12:22 PM"), "Chequeo general", 23000 );
        factory.registrarNuevoPaciente(pac1);
        factory.agregarConsultaPaciente(pac1.getId(), pac1.getTipoId(), consulta);       
        assertEquals(1, pac1.getConsultas().size());
    }
    
    

    //CF1:
    @Test
    public void testRegistrarNuevoPaciente() throws ExcepcionServiciosPacientes{
        int sizeClientes= factory.consultarPacientes().size();
        Paciente pac=new Paciente();
        pac.setId(101234455);
        pac.setTipoId("CC");
        factory.registrarNuevoPaciente(pac);
        assertEquals(sizeClientes+1,factory.consultarPacientes().size());
    }
    
}
*/
}
}
