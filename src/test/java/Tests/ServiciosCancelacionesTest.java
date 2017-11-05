
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
 * @author BoomEci
 */

public class ServiciosCancelacionesTest {
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

    private ServiciosCancelaciones factory;
    
    public ServiciosCancelacionesTest() {
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

