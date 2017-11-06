/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 *
 * @author camil
 */
public class SolicitudCancelacion {
    
    private Materia materiaSolicitada;
    private String descripcion;
    private Date fecha;
    
    public SolicitudCancelacion(Materia materiaSolicitada, String descripcion, Date fecha) {
        this.materiaSolicitada = materiaSolicitada;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    

    public Materia getMateriaSolicitada() {
        return materiaSolicitada;
    }

    public void setMateriaSolicitada(Materia materiaSolicitada) {
        this.materiaSolicitada = materiaSolicitada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
