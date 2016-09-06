

package modelo;

import java.util.LinkedList;

public class Glosario {
    
    private int cantidad;
    private LinkedList<Palabra> palabritas;

    public Glosario() {
    
    cantidad=0;
    palabritas= new LinkedList<Palabra>();
 
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
   
    

}
   


