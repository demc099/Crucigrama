
package modelo;

import java.util.LinkedList;
import org.w3c.dom.Node;
import xml.SerializadorHelper;


public class Palabra {

    public Palabra(String termino, String Definicion, int tamaño, String direccion, int posColumna, int posFila) {
        this.termino = termino;
        this.Definicion = Definicion;
        this.tamaño = tamaño;
        this.direccion = direccion;
        this.posColumna = posColumna;
        this.posFila = posFila;
    }

    
    private String termino;
    private String Definicion;
    private int tamaño;
    private String direccion;
    private int posColumna;
    private int posFila;

    Palabra() {
        this.termino = " ";
        this.Definicion = " ";
        this.tamaño = 0;
        this.direccion =" ";
        this.posColumna = -1;
        this.posFila = -1;

    }

    Palabra(Node actual) {
        posFila=Integer.parseInt(SerializadorHelper.getNodeValue("row", actual.getChildNodes()));
        posColumna=Integer.parseInt(SerializadorHelper.getNodeValue("col", actual.getChildNodes()));
        direccion= SerializadorHelper.getNodeValue("direction", actual.getChildNodes());
        termino= SerializadorHelper.getNodeValue("term", actual.getChildNodes());
        Definicion= SerializadorHelper.getNodeValue("definition", actual.getChildNodes());
        tamaño= termino.length();
        
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getDefinicion() {
        return Definicion;
    }

    public void setDefinicion(String Definicion) {
        this.Definicion = Definicion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPosColumna() {
        return posColumna;
    }

    public void setPosColumna(int posColumna) {
        this.posColumna = posColumna;
    }

    public int getPosFila() {
        return posFila;
    }

    public void setPosFila(int posFila) {
        this.posFila = posFila;
    }
    
    //Suma:
    //Antonimo de Resta
    
   public String toString(){
     String mensaje;
      mensaje= getTermino()+": \n"+ getDefinicion()+" \n \n";
      return mensaje;
   }
}
