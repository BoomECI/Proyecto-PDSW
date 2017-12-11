/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BoomECI.controlador.managedbeans;

import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Grafo;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ParserGrafo;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelacionesFactory;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.diagram.Connection;
import org.primefaces.model.diagram.DefaultDiagramModel;
import org.primefaces.model.diagram.Element;
import org.primefaces.model.diagram.connector.StraightConnector;
import org.primefaces.model.diagram.endpoint.DotEndPoint;
import org.primefaces.model.diagram.endpoint.EndPoint;
import org.primefaces.model.diagram.endpoint.EndPointAnchor;

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
    private DefaultDiagramModel model;
    private List<List<String>> configuracion;
    
    
    
    public DirectivoBean(){
        model = new DefaultDiagramModel();
        model.setMaxConnections(-1);
        ParserGrafo p = ServiciosCancelacionesFactory.getInstance().getParserGrafo();
        Estudiante e = new Estudiante();
        List<Materia> act = new ArrayList();
        act.add(new Materia("CALD"));
        List<Materia> vist = new ArrayList();
        vist.add(new Materia("DEPD"));
        e.setPlanDeEstudios(new PlanDeEstudios(1));
        e.setMateriasActuales(act);
        e.setMateriasCursadas(vist);
        grafoPlanDeEstudios = p.convertStringToGrafo(e.getPlanDeEstudios().getGrafo());
        List<String> lista = new ArrayList();
        List<Materia> materias = grafoPlanDeEstudios.getLista();
        lista.add("CALD");
        configuracion = servCanc.calcularProyeccion(e, lista, grafoPlanDeEstudios);
        
        StraightConnector connector = new StraightConnector();
        connector.setPaintStyle("{strokeStyle:'#404a4e', lineWidth:3}");
        connector.setHoverPaintStyle("{strokeStyle:'#20282b'}");
        for(int i=0; i<configuracion.size(); i++){
            List<String> contenedor = configuracion.get(i);
            for(int j=0; j<contenedor.size(); j++){
                System.out.println(model.getConnections().size()+"  "+j);
                System.out.println("MATERIA "+(i+1)+" "+contenedor.get(j));
                int x =j*20;
                int y = i*20;
                String contenedorActual = contenedor.get(j);
                Element a= new Element(contenedorActual, x+"em", y+"em");
                a.setId(contenedorActual);
                Materia materiaActual = grafoPlanDeEstudios.getMateria(contenedorActual);
                List<String> pre = materiaActual.getPrerequisitos();
                String idElementoActual = a.getId();
                int k= 1;
                for(String l: pre){
                    Element prerrequisito = model.findElement(l);
                    System.out.println(prerrequisito.getData()+ "-->id " +prerrequisito.getId());
                    k++;
                    String idPre = prerrequisito.getId();
                    a.addEndPoint(createEndPoint(EndPointAnchor.TOP, idElementoActual+"-"+idPre));
                    prerrequisito.addEndPoint(createEndPoint(EndPointAnchor.BOTTOM,idPre+"-"+idElementoActual));
                    
                    if(j==0 && k==1);
                    model.connect(new Connection(model.findEndPoint(a, idElementoActual+"-"+idPre), model.findEndPoint(prerrequisito, idPre+"-"+idElementoActual), connector));
                }
                model.addElement(a);
                
            }
        }
        
      
        
        
        
        
        
        
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

    private EndPoint createEndPoint(EndPointAnchor anchor,String id) {
        DotEndPoint endPoint = new DotEndPoint(anchor);
        endPoint.setStyle("{fillStyle:'#404a4e'}");
        endPoint.setHoverStyle("{fillStyle:'#20282b'}");
        endPoint.setId(id);
         
        return endPoint;
    }

    public DefaultDiagramModel getModel() {
        return model;
    }
}
