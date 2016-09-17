package modelo;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.util.Iterator;
import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.*;
import org.w3c.dom.NodeList;
import xml.Serializable;
import xml.SerializadorHelper;


public class CrucigramaJuego  {
  
     public CrucigramaJuego() {
        glosarito = new Glosario();
        filas = 15;
        columnas = 15;
        matriz = new char[filas][columnas];
         for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               matriz[i][j]='0';
           }
       }      
        
    }
    
    public CrucigramaJuego(int f, int c) {
        glosarito = new Glosario();
        filas = f;
        columnas = c;
        matriz = new char[f][c];
         for(int i=0; i<filas; i++){
           for(int j=0; j<columnas; j++){
               matriz[i][j]=' ';
           }
       }      
        
    }

    public void crear(Node nodoRoot) {
       String etq="word";
        glosarito= new Glosario();
             for (Node actual : SerializadorHelper.iterator(etq, nodoRoot)) {
                IngresarPalabra(new Palabra(actual));
            }  
    }

    public Glosario getGlosarito() {
        return glosarito;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public void setGlosarito(Glosario glosarito) {
        this.glosarito = glosarito;
    }

    public boolean Revisar(String def, String pal) {
        Palabra palabrita = new Palabra();
        if (glosarito.buscarXDe(def) != null) {
            palabrita = glosarito.buscarXDe(def);
            if (palabrita.getTermino() == pal) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean deserializar(String path) {
        try {
            
            DOMParser parser = new DOMParser();
            parser.parse(path);
            Document doc = parser.getDocument();
            NodeList root = doc.getChildNodes();
            int q;
            q=0;
            Node nodoRoot = SerializadorHelper.getNode("crossword", root);
            int p;
            p=90;
            //
            //            
            filas = Integer.parseInt(SerializadorHelper.getNodeValue("rows", nodoRoot.getChildNodes()));
            columnas = Integer.parseInt(SerializadorHelper.getNodeValue("cols", nodoRoot.getChildNodes()));
            
            crear(nodoRoot);
            setMatriz(filas, columnas);
        
            return true;
        }  catch (Exception e) {
            return false;
        }
    }

    public void setMatriz(int a, int b){
        matriz= new char[a][b];
    }

    public void IngresarPalabra(Palabra pa) {
        glosarito.agregar(pa);
        ingresarPalabraMatriz(pa);

    }

    void ingresarPalabraMatriz(Palabra p) {
        char[] a = p.getTermino().toCharArray();
        int ite = 0;
        String dire = p.getDireccion();
        int h = p.getTamaño();
        if (dire == "V") {
            ite = p.getPosFila();
            int posCol = p.getPosColumna();
            for (int i = 0; i < h; i++) {
                matriz[ite][posCol] = a[i];
                ite++;
            }
        }
        if (dire == "H") {
            ite = p.getPosColumna();
            int posFila = p.getPosFila();
            for (int i = 0; i < h; i++) {
                matriz[posFila][ite] = a[i];
                ite++;
            }
        }

    }
   public boolean verificarLetra(char letra, int a, int b){
       if(0<=a && a<= filas && b<=columnas && 0<=b){
          if(matriz[a][b]==letra){
           return true;
           
       }
         else
              return true;
   }
       return false;
  }
   
   public int DevolverTamañoPalabra(int a, int b){
       for(int i=0; i<glosarito.getCantidad(); i++){
           if(glosarito.BuscarPalabraXPos(a, b)!=null){
               return glosarito.BuscarPalabraXPos(a, b).getTamaño();
           }
       }
       return -1;
   }

    private Glosario glosarito;
    private int filas;
    private int columnas;
    private char matriz[][];

   

}
