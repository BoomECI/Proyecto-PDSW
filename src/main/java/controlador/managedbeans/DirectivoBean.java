/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.managedbeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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
    
    
    public DirectivoBean(){
        creditosActuales = 18;
    }

    public int getCreditosActuales() {
        return creditosActuales;
    }

    public void setCreditosActuales(int creditosActuales) {
        this.creditosActuales = creditosActuales;
    }

    public ServiciosCancelaciones getServCanc() {
        return servCanc;
    }
    
    public void cambiar(){
        servCanc.cambiarCreditosTotalesPorSemestre(creditosActuales);
    }
    
    
}
