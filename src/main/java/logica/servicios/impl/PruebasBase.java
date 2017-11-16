/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios.impl;

import entidades.Estudiante;
import static junit.framework.Assert.fail;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;
import org.junit.Test;

/**
 *
 * @author Nicolás
 */
public class PruebasBase {
        
    @Test
    public void prueba(){
        ServiciosCancelaciones a = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
        try{
            Estudiante x = a.consultarEstudiante(1);
            System.out.println(x.getNombre());
            System.out.println(x.getCodigo());
            System.out.println(x.getCorreo());
            //System.out.println(x.getAcudiente().getNombre());
            System.out.println(x.getConsejero().getNombre());

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
   
}

