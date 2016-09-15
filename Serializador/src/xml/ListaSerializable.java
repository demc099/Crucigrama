/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.LinkedList;
import org.w3c.dom.*;

/**
 *
 * @author Steven
 * @param <T>
 */
public class ListaSerializable<T extends Serializable> extends LinkedList<T> implements Serializable {

    public ListaSerializable(String nombre){
        nombreEtiqueta = nombre;
    }

    public String getNombreEtiqueta() {
        return nombreEtiqueta;
    }

    public void setNombreEtiqueta(String nombreEtiqueta) {
        this.nombreEtiqueta = nombreEtiqueta;
    }    
    
    @Override
    public void serializar(Document doc, Element nodo) {
        Element nuevoNuevo = doc.createElement(getNombreEtiqueta());
        nuevoNuevo.setAttribute("size", Integer.toString(size()));
        for(T item : this){
            item.serializar(doc, nuevoNuevo);
        }
        nodo.appendChild(nuevoNuevo);
    }
    
    
    private String nombreEtiqueta;    
}
