/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entities;

/**
 *
 * @author user
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private String correo;
    private int telefono;
    private Consejero consejero;
    private int identificacion;
    private String tipo_id;
    //En String por ahora para que no salga error:
    private String plan_de_estudio;
    private Acudiente acudiente;
   
    
    public Estudiante(int codigo,String nombre,String correo,int telefono,Consejero consejero,int identificacion,String tipo_id,String plan_de_estudio,Acudiente acudiente){
        this.codigo=codigo;
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
        this.consejero=consejero;
        this.identificacion=identificacion;
        this.tipo_id=tipo_id;
        this.plan_de_estudio=plan_de_estudio;
        this.acudiente=acudiente;
    }
   
    
}
