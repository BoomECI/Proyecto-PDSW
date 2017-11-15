
package Tests;

import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;
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
        //factory = ServiciosCancelacionesFactory.getInstance().getTestingServiciosCancelaciones();
    }
    
    @Before
    public void setUp() {
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
   /*
    fechaCancelacion = new Date();
        ArrayList<Materia> mA = new ArrayList<Materia>();
        mA.add(new Materia("APMU","Apreciacion musical", 3, null, null));
        mA.add(new Materia("FRED","Fundamentos de redes", 3, null, null));
        mA.add(new Materia("PRON","Procesos de negocios", 3, null, null));
        mA.add(new Materia("ACFI","Analisis contable y financiero", 3, null, null));
        mA.add(new Materia("PDSW","Procesos de desarrollo de software", 4, null, null));
        ArrayList<Materia> mC = new ArrayList<Materia>();
        mC.add(new Materia("IINS","Introduccion a la ingenieria de sistemas",3,null,null));
        mC.add(new Materia("MMIN","Modelos matematicos para la informatica",3,null,null));
        mC.add(new Materia("DEPD","Deporte dirigido",3,null,null));
        mC.add(new Materia("ALLI","Algebra lineal",4,null,null));
        PlanDeEstudios PDE = new PlanDeEstudios();
        PDE.setNumeroDeCreditosTotales(154);
        estudianteActual= new Estudiante(2110805,"Juan David Ramirez Mendoza","juanda@hotmail.com",12345,new Consejero(12,"Oswaldo","oswald.com"), new Acudiente(23,"Giovanni","gio.com",1234),
                                                            1019138849,"cc",mA,mC,PDE,null);
        materiasCursadas = estudianteActual.getMateriasCursadas();
        materiasActuales = estudianteActual.getMateriasActuales();
        planDeEstudios = estudianteActual.getPlanDeEstudios();
        solicitudes = estudianteActual.getSolicitudes();
    }
    */ 
    
}

