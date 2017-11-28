/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.managedbeans;

import entidades.Materia;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.WeakHashMap;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

@FacesConverter(value = "entityConverterBean")
public class EntityConverter implements Converter {
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        Object ret = null;
        if (arg1 instanceof PickList) {
            Object dualList = ((PickList) arg1).getValue();
            DualListModel dl = (DualListModel) dualList;
            for (Object o : dl.getSource()) {
                String nemonico = "" + ((Materia) o).getNemonico();
                if (arg2.equals(nemonico)) {
                    ret = o;
                    break;
                }
            }
            if (ret == null)
                for (Object o : dl.getTarget()) {
                    String nemonico = "" + ((Materia) o).getNemonico();
                    if (arg2.equals(nemonico)) {
                        ret = o;
                        break;
                    }
                }
        }
        return ret;
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        String str = "";
        if (arg2 instanceof Materia) {
            str = "" + ((Materia) arg2).getNemonico();
        }
        return str;
    }
}