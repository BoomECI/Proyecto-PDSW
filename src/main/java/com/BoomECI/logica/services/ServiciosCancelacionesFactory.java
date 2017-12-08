
package com.BoomECI.logica.services;

import com.BoomECI.logica.servicios.impl.ServiciosCancelacionesImpl;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import com.BoomECI.persistencia.EstudianteDAO;
import com.BoomECI.persistencia.mybatis.EstudianteDAOMyBatis;
import static com.google.inject.Guice.createInjector;
import com.BoomECI.persistencia.ConsejeroDAO;
import com.BoomECI.persistencia.DirectivoDAO;
import com.BoomECI.persistencia.mybatis.ConsejeroDAOMyBatis;
import com.BoomECI.persistencia.mybatis.DirectivoDAOMyBatis;

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
                bind(EstudianteDAO.class).to(EstudianteDAOMyBatis.class);
                bind(ParserGrafo.class).to(ParserJSON.class);
                bind(CalculoDeImpacto.class).to(CalculoPorCreditos.class);
                bind(ConsejeroDAO.class).to(ConsejeroDAOMyBatis.class);
                bind(DirectivoDAO.class).to(DirectivoDAOMyBatis.class);

            }

        }
        );

        testInjector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config-h2.xml");
                bind(ServiciosCancelaciones.class).to(ServiciosCancelacionesImpl.class);
                bind(EstudianteDAO.class).to(EstudianteDAOMyBatis.class);
                bind(ParserGrafo.class).to(ParserJSON.class);
                bind(CalculoDeImpacto.class).to(CalculoPorCreditos.class);
                bind(ConsejeroDAO.class).to(ConsejeroDAOMyBatis.class);
                bind(DirectivoDAO.class).to(DirectivoDAOMyBatis.class);
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
    
    public ParserGrafo getParserGrafo() {
        return injector.getInstance(ParserGrafo.class);
    }
    
}
