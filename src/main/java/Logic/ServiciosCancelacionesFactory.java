/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import com.google.inject.AbstractModule;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;

/**
 *
 * @author camil
 */
public class ServiciosCancelacionesFactory {
    private static Injector injector;

    
    private static ServiciosCancelacionesFactory instance = new ServiciosCancelacionesFactory();

    
    
    public ServiciosCancelacionesFactory(){
        injector = createInjector(new AbstractModule() {

            @Override
            protected void configure() {
               bind(ServiciosCancelaciones.class).to(ServiciosCancelacionesImpl.class);
            }

        }
        );
    }
    
    public ServiciosCancelacionesImpl getServiciosCancelaciones() {
        return injector.getInstance(ServiciosCancelacionesImpl.class);
    }
    
    public static ServiciosCancelacionesFactory getInstance() {
        return instance;
    }
}
