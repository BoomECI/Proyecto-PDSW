/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.managedbeans;

import entidades.Grafo;
import entidades.PlanDeEstudios;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import logica.services.ExcepcionServiciosCancelaciones;
import logica.services.ServiciosCancelaciones;
import logica.services.ServiciosCancelacionesFactory;

/**
 *
 * @author BoomEci
 */

@ManagedBean(name="beanSolicitudDirectivo")
@SessionScoped
public class DirectivoBean implements Serializable{
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    private int creditosActuales;
    private Grafo grafoPlanDeEstudios;
    
    
    
    public DirectivoBean(){
        creditosActuales = PlanDeEstudios.creditosPorSemestre;
    }

    public int getCreditosActuales() {
        return creditosActuales;
    }

    public void setCreditosActuales(int creditosActuales) {
        this.creditosActuales = creditosActuales;
    }

    public Grafo getGrafoPlanDeEstudios() {
        return grafoPlanDeEstudios;
    }

    public void setGrafoPlanDeEstudios(Grafo grafoPlanDeEstudios) {
        this.grafoPlanDeEstudios = grafoPlanDeEstudios;
    }
    
    
    
   
}
