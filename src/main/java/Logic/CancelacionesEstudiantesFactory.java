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
public class CancelacionesEstudiantesFactory {
    private static Injector injector;

    
    private static CancelacionesEstudiantesFactory instance = new CancelacionesEstudiantesFactory();

    
    
    public CancelacionesEstudiantesFactory(){
        injector = createInjector(new AbstractModule() {

            @Override
            protected void configure() {
               bind(CancelacionesEstudiantes.class).to(CancelacionesEstudiantesImpl.class);
            }

        }
        );
    }
    
    public CancelacionesEstudiantesImpl getCancelacionesEstudiantes() {
        return injector.getInstance(CancelacionesEstudiantesImpl.class);
    }
    
    public static CancelacionesEstudiantesFactory getInstance() {
        return instance;
    }
}
