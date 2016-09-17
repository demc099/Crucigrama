

package modelo;

import java.util.LinkedList;
import org.w3c.dom.Node;
import xml.ListaSerializable;

public class Glosario  {
    
    private int cantidad;
    private LinkedList<Palabra> palabritas;

    public Glosario() {
    
    cantidad=0;
    palabritas= new LinkedList();
 
    }
    
    public void agregar(Palabra pa){
        palabritas.add(pa);
        cantidad++;
    }
    
    public void remove(Palabra pa){
        for(int i=0; i< cantidad; i++){
          if(palabritas.get(i).getTermino()==pa.getTermino()){
              palabritas.remove(i);
           
          }
        }
    }
    public Palabra buscar(String a){
        for(int i=0; i< cantidad; i++){
          if(palabritas.get(i).getTermino()==a){
              return palabritas.get(i);
           
          }
        }
        return null;
    }
    
     public Palabra buscarXDe(String a){
        for(int i=0; i< cantidad; i++){
          if(palabritas.get(i).getDefinicion()==a){
              return palabritas.get(i);
           
          }
        }
        return null;
    }
     public Palabra BuscarPalabraXPos(int a, int b){
         for(int i=0; i< cantidad; i++){
          if(palabritas.get(i).getPosFila()==a && palabritas.get(i).getPosFila()==b){
    
              return palabritas.get(i);
           
          }
        }
    
         return null;
  }
     
    public String toString(){
        String msj=" ";
        for(int i=0; i<cantidad ; i++){
               msj=palabritas.get(i).toString();
        }
        return msj;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LinkedList<Palabra> getPalabritas() {
        return palabritas;
    }

    public void setPalabritas(LinkedList<Palabra> palabritas) {
        this.palabritas = palabritas;
    }

    private Iterable<Node> Palabra(Node nodoRoot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    

}
   


