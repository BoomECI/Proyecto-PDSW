/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.logica.services;

/**
 *
 * @author Boom
 */
public class ExcepcionServiciosCancelaciones extends Exception {
    
    public ExcepcionServiciosCancelaciones() {
    }
    public ExcepcionServiciosCancelaciones(String message) {
        super(message);
    }
    public ExcepcionServiciosCancelaciones(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ExcepcionServiciosCancelaciones(Throwable cause) {
        super(cause);
    }
    
    
}

