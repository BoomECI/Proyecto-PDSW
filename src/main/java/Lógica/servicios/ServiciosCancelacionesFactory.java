/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lógica.servicios;

import logica.servicios.impl.ServiciosCancelacionesImpl;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

/**
 *
 * @author BoomEci
 */
public class ServiciosCancelacionesFactory {
    private static ServiciosCancelacionesFactory instance = new ServiciosCancelacionesFactory();
    private static Injector injector;
    private static Injector testInjector;
    
    public ServiciosCancelacionesFactory(){
        injector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);              
                setClassPathResource("mybatis-config.xml");
                bind(ServiciosCancelaciones.class).to(ServiciosCancelacionesImpl.class);
                //Falta injectar los DAOS
            }

        }
        );

        testInjector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config-h2.xml");
                bind(ServiciosCancelaciones.class).to(ServiciosCancelacionesImpl.class);
                //Falta injectar los DAOS
            }

        }
        );
    }
    
    public ServiciosCancelaciones getServiciosCancelaciones() {
        return injector.getInstance(ServiciosCancelaciones.class);
    }    
    
     public ServiciosCancelaciones getTestingServiciosCancelaciones() {
        return testInjector.getInstance(ServiciosCancelaciones.class);
    }
     
    public static ServiciosCancelacionesFactory getInstance() {
        return instance;
    }
    
}
