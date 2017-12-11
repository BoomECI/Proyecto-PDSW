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
    public void prueba2() throws ExcepcionServiciosCancelaciones{
        ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        a.consultarConsejero(0);
   }
    
   @Test
   public void prueba(){
        
        //ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        //ParserGrafo p = new ParserJSON();
        try{
           //SolicitudCancelacion  x = new SolicitudCancelacion(java.sql.Date.valueOf("2000-2-2"), "Esperando", 3, "me duele la vida" , "muy mal panita",true,false, "sopc", 1);
           //a.agregarSolicitudCancelacionEstudiante(x);
           Grafo graph = p.convertStringToGrafo(PlanDeEstudios.sistemas());
           
            
            List<Materia> le=new ArrayList();
            List<String> ca=new ArrayList();
            ca.add("CIED");   
            List<Materia> he=new ArrayList();
            List<SolicitudCancelacion> pa=new ArrayList();            
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
            
            PlanDeEstudios wqe= new PlanDeEstudios(1);
            wqe.setNumeroDeCreditosTotales(148);
            Acudiente xd= new Acudiente();
            Consejero po= new Consejero();
            SolicitudCancelacion te=new SolicitudCancelacion();           
            Estudiante lol= new Estudiante(1,"dasfsd","sdfjlasd",5465,po,xd,12123,"as",le,he,wqe,pa);         
            graph.calcularPlanDeEstudios(lol, ca);
            System.out.println(graph.getMateria("PRON").getCreditos());            
            System.out.println(graph.getSemestre(lol));
            
            

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
}
