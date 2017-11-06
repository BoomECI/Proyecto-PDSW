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
    public void setNombre (String nombre){
        this.nombre=nombre;        
    }
    public String getNombre (){
        return nombre;        
    }
    public void setCodigo (int codigo){
        this.codigo=codigo;        
    }
    public int getCodigo (){
        return codigo;
    }    
    public void setCorreo (String correo){
        this.correo=correo;       
    }
    public String getCorreo (){
        return correo;        
    }
    public void setTelefono (int telefono){
        this.telefono=telefono;        
    }
    public int getTelefono (){
        return telefono;
    }  
    public void setConsejero (Consejero consejero){
        this.consejero=consejero;        
    }
    public Consejero getConsejero(){
        return consejero;
    }  
    public void setIdentificacion (int identificacion){
        this.identificacion=identificacion;        
    }
    public int getIdentificacion(){
        return identificacion;
    }  
    public void setTipo_id (String tipo_id){
        this.tipo_id=tipo_id;        
    }
    public String getTipo_id (){
        return tipo_id;        
    }
    public void setPlan_de_estudio (String plan_de_estudio){
        this.plan_de_estudio=plan_de_estudio;        
    }
    public String getPlan_de_estudio (){
        return plan_de_estudio;        
    }
    public void setAcudiente (Acudiente acudiente){
        this.acudiente=acudiente;        
    }
    public Acudiente getAcudiente(){
        return acudiente;
    } 
    
}
