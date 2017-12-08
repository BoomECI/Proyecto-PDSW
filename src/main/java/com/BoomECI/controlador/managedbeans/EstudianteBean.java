package com.BoomECI.controlador.managedbeans;


import com.BoomECI.entidades.Acudiente;
import com.BoomECI.entidades.Consejero;
import com.BoomECI.entidades.Estudiante;
import com.BoomECI.entidades.Materia;
import com.BoomECI.entidades.PlanDeEstudios;
import com.BoomECI.entidades.SolicitudCancelacion;
import com.BoomECI.javamail.core.Email;
import com.BoomECI.javamail.core.EmailConfiguration;
import com.BoomECI.javamail.core.EmailSender;
import com.BoomECI.javamail.core.SimpleEmail;
import com.BoomECI.javamail.core.SimpleEmailSender;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.BoomECI.logica.services.ExcepcionServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelaciones;
import com.BoomECI.logica.services.ServiciosCancelacionesFactory;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.BoomECI.seguridad.bean.ShiroLoginBean;
import javax.faces.bean.ManagedProperty;
import javax.mail.MessagingException;
import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.component.outputlabel.OutputLabel;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;
import org.primefaces.context.RequestContext;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.DualListModel;
import org.primefaces.model.TreeNode;



@ManagedBean(name="beanSolicitudEstudiante")
@SessionScoped
public class EstudianteBean implements Serializable{
    
    private final ServiciosCancelaciones servCanc = ServiciosCancelacionesFactory.getInstance().getServiciosCancelaciones();
    /*@ManagedProperty(value = "#{loginBean}")
    private ShiroLoginBean seguridad;*/
    
    private Date fechaCancelacion;                         
    private List<SolicitudCancelacion> solicitudes;
    private PlanDeEstudios planDeEstudios;
    private List<Materia> materiasCursadas;
    private List<Materia> materiasActuales;
    private Estudiante estudianteActual;
    private List<Materia> materiasSeleccionadas;
    private String[] justificacionesCancelacion;
    private int creditosRestantes;
    private List<SolicitudCancelacion> solicitudesEstudiante;
    private TabView tablaMaterias;
    private int creditosCarrera;
    private DualListModel<String> materias;
    private List<String> materiasActualesString;
    private List<String> materiasSeleccionadasString;
    private String fecha;
    private List<List<String>> proyeccion;
    private int semestresRestantes;
    private TreeNode root;
    
    
    public EstudianteBean() throws ExcepcionServiciosCancelaciones{
        
       /* int carnetActual = Integer.parseInt(seguridad.getUsername());
        estudianteActual= servCanc.consultarEstudiante( carnetActual);*/
        fechaCancelacion = new Date();
        fecha = fechaCancelacion.getDate()+"-"+fechaCancelacion.getMonth()+"-"+(fechaCancelacion.getYear()+1900);
        
        estudianteActual = servCanc.consultarEstudiante(2110432);
        materiasCursadas = estudianteActual.getMateriasCursadas();
        materiasActuales = estudianteActual.getMateriasActuales();
        planDeEstudios = estudianteActual.getPlanDeEstudios();
        solicitudes = estudianteActual.getSolicitudes();
        creditosCarrera = estudianteActual.getPlanDeEstudios().getNumeroDeCreditosTotales();
        tablaMaterias = new TabView();
        materiasActualesString = new ArrayList<>();
        materiasSeleccionadasString = new ArrayList<>();
        materiasActualesString = conversorActualesToString();
        materias = new DualListModel<>(materiasActualesString, materiasSeleccionadasString);
            
    }
    
    
    
    
    public List<Materia> conversorStringToSeleccionadas(){
        List<Materia> mt = new ArrayList<>();
        List<String> matSelec = getMaterias().getTarget();
        for(int k=0; k<matSelec.size(); k++){
            for(Materia i: materiasActuales){
                if(i.getNemonico().equals(matSelec.get(k))){
                    mt.add(i);
                }
            }
        }
       
        return mt;
    }
    
    public List<String> conversorActualesToString(){
        List<String> mt = new ArrayList<>();
        
        for(int i = 0; i<materiasActuales.size(); i++){
            mt.add(materiasActuales.get(i).getNemonico());
        }
       
        return mt;
    }
    
    
    
    public List<String> conversorSeleccionadasToString(){
        List<String> mt = new ArrayList<>();
        
        for(int i = 0; i<materiasSeleccionadas.size(); i++){
            mt.add(materiasSeleccionadas.get(i).getNemonico());
        }
       
        return mt;
    }

    public List<SolicitudCancelacion> getSolicitudesEstudiante() {
        return solicitudesEstudiante;
    }

    public void setSolicitudesEstudiante(List<SolicitudCancelacion> solicitudesEstudiante) {
        this.solicitudesEstudiante = solicitudesEstudiante;
    }

    public DualListModel<String> getMaterias() {
        return materias;
    }

    public void setMaterias(DualListModel<String> materias) {
        this.materias = materias;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    

    public int getSemestresRestantes() {
        return semestresRestantes;
    }

    public void setSemestresRestantes(int semestresRestantes) {
        this.semestresRestantes = semestresRestantes;
    }
    
    

    public List<String> getMateriasActualesString() {
        return materiasActualesString;
    }

    public void setMateriasActualesString(List<String> materiasActualesString) {
        this.materiasActualesString = materiasActualesString;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<List<String>> getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(List<List<String>> proyeccion) {
        this.proyeccion = proyeccion;
    }
    
    

    public List<String> getMateriasSeleccionadasString() {
        return materiasSeleccionadasString;
    }

    public void setMateriasSeleccionadasString(List<String> materiasSeleccionadasString) {
        this.materiasSeleccionadasString = materiasSeleccionadasString;
    }
    
    
    
    public ServiciosCancelaciones getServCanc(){
        return servCanc;
    }

    public int getCreditosRestantes() {
        return creditosRestantes;
    }

    public void setCreditosRestantes(int creditosRestantes) {
        this.creditosRestantes = creditosRestantes;
    }
    
    
    public Estudiante getEstudianteActual() {
        return estudianteActual;
    }

    public void setEstudianteActual(Estudiante estudianteActual) {
        this.estudianteActual = estudianteActual;
    }

    public int getCreditosCarrera() {
        return creditosCarrera;
    }

    public void setCreditosCarrera(int creditosCarrera) {
        this.creditosCarrera = creditosCarrera;
    }
    

    public List<Materia> getMateriasSeleccionadas() {
        return materiasSeleccionadas;
    }

    public void setMateriasSeleccionadas(List<Materia> materiasSeleccionadas) {
        this.materiasSeleccionadas = materiasSeleccionadas;
    }

    public List<Materia> getMateriasActuales(){
        return materiasActuales;
    }

    public void setMateriasActuales(List<Materia> materiasActuales) {
        this.materiasActuales = materiasActuales;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String[] getJustificacionesCancelacion() {
        return justificacionesCancelacion;
    }

    public void setJustificacionesCancelacion(String[] justificacionesCancelacion) {
        this.justificacionesCancelacion = justificacionesCancelacion;
    }
    
   public void cancelarMaterias() throws ExcepcionServiciosCancelaciones, MessagingException{
       for(int i=0;i<justificacionesCancelacion.length;i++){
           InputTextarea m = (InputTextarea) tablaMaterias.getChildren().get(i).findComponent("input"+i);
           justificacionesCancelacion[i] = (String) m.getValue();
           solicitudesEstudiante.get(i).setJustificacion(justificacionesCancelacion[i]);
           solicitudes.add(solicitudesEstudiante.get(i));
           servCanc.agregarSolicitudCancelacionEstudiante(solicitudesEstudiante.get(i));
       }
       
       Email email = new SimpleEmail(estudianteActual.getCorreo(), estudianteActual.getConsejero().getCorreo(), "SOLICITUD DE CANCELACION ACONSEJADO", "Buen dia profesor "+estudianteActual.getConsejero().getNombre()+ ", la presente es para informarle"
                                                                                                                 + " que voy a realizar un proceso de cancelacion, espero pronta respuesta para acordar la reunion estipulada por el reglamento."
               + "\n\nCordialmente,\n"+estudianteActual.getNombre()+"\n"+estudianteActual.getCodigo()+"\n"+estudianteActual.getIdentificacion());
        EmailSender sender = new SimpleEmailSender(new EmailConfiguration());
        try {
            sender.send(email);
            System.out.println("Sent message successfully!");
        } catch (MessagingException e) {
            System.err.println("Message not sent!");
            e.printStackTrace();
        }
       
   }
    
    public void analizarSolicitud() throws ExcepcionServiciosCancelaciones{
       
       tablaMaterias = new TabView();
       materiasSeleccionadasString = getMaterias().getTarget();
       materiasSeleccionadas = conversorStringToSeleccionadas();
       justificacionesCancelacion = new String[materiasSeleccionadasString.size()];
       for(int i = 0; i < materiasSeleccionadasString.size(); i++){
           Tab tab = new Tab();
           tab.setTitle(materiasSeleccionadasString.get(i));
           InputTextarea ita = new InputTextarea();
           ita.setId("input"+i);
           ita.setValue(justificacionesCancelacion[i]);
           ita.setMaxlength(400);
           ita.setCounterTemplate("{0} restantes.");
           ita.setTitle("¿Por que quiero cancelar esta asignatura?");
           ita.setRows(6);
           ita.setCols(40);
           ita.setAutoResize(true);
           ita.setCounter("display"+i);           
           OutputLabel ol1 = new OutputLabel();
           ol1.setValue("Justificacion:            ");
           ol1.setStyle("font-size: 100%; font-weight:bold");
           OutputLabel ol = new OutputLabel();
           ol.setId("display"+i);
           ol.setStyle("font-style: italic; font-size: 80%");
           tab.getChildren().add(ol1);
           tab.getChildren().add(ita);
           tab.getChildren().add(ol);
           tablaMaterias.getChildren().add(tab);
       }
       RequestContext context = RequestContext.getCurrentInstance();
       context.update("myTabPanel");
       
       solicitudesEstudiante = new ArrayList();
       for(int i=0; i < materiasSeleccionadasString.size(); i++){
           solicitudesEstudiante.add(new SolicitudCancelacion(fechaCancelacion,"Pendiente", solicitudes.size()+3600+i, null, "", false, false, materiasSeleccionadasString.get(i), estudianteActual.getCodigo()));
       }
       
       creditosRestantes = servCanc.consultarImpacto(materiasSeleccionadas, estudianteActual);
       proyeccion = servCanc.calcularProyeccion(estudianteActual, materiasSeleccionadasString);
       
       root = new DefaultTreeNode("Proyeccion", null);
       for(int i=0; i<proyeccion.size(); i++){
           TreeNode semestre = new DefaultTreeNode("en "+(i+1)+" Semestre", root);
           for(int j=0; j<proyeccion.get(i).size(); j++){
               TreeNode materia = new DefaultTreeNode(proyeccion.get(i).get(j), semestre);
           }
       }
       semestresRestantes = proyeccion.size();
    }

    public PlanDeEstudios getPlanDeEstudios() {
        return planDeEstudios;
    }

    public void setPlanDeEstudios(PlanDeEstudios planDeEstudios) {
        this.planDeEstudios = planDeEstudios;
    }

    public List<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(List<Materia> materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    public TabView getTablaMaterias() {
        return tablaMaterias;
    }

    public void setTablaMaterias(TabView tablaMaterias) {
        this.tablaMaterias = tablaMaterias;
    }
    
    

    public List<SolicitudCancelacion> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<SolicitudCancelacion> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    public String finalizar(){
        return "esperarsolicitud.xhtml";
    }
    
    public String irAtras(){
        return "serviciocancelaciones.xhtml";
    }

    /*public List<Materia> comparar(){
        List<Materia> mt = new ArrayList<Materia>();
        List<String> mSels = materiasSeleccionadas;
        
        int k = 0;
        while (mSels.size() > 0){
            for(Materia i: materiasActuales){
                if(i.getNemonico().equals(mSels.get(k))){
                    mt.add(i);
                    mSels.remove(k);
                }
            }
        }
       
        return mt;
    }*/
}
