
package Control;

import modelo.CrucigramaJuego;
import modelo.Palabra;
import vistas.VistaJuego;

/**
 *
 * @author Zeneida
 */
public class Control {
    
    public Control(){
       vista2=new VistaJuego(this);
       crusi= new CrucigramaJuego();
       
    }
    public void leerXML(String path){
        crusi.deserializar(path);
    }
    
    public char[][] devolverMatriz(){
     return crusi.getMatriz();
    }
    
    public void MostrarVistaJuego(){
        vista2.setVisible(true);
        vista2.show();
    }
    public void Agregar(Palabra p){
        crusi.IngresarPalabra(p);
    }

   
   
     public int getFilas(){
         return crusi.getFilas();
     }
     public int getColumnas(){
         return crusi.getColumnas();
     }
     public int tamañoPalabra(int a , int b){
         return crusi.DevolverTamañoPalabra(a, b);
     }

     public boolean verificarLetra(char a, int p, int q){
       return  crusi.verificarLetra(a, p, q);
     }
     
    CrucigramaJuego crusi;
    //VistaPrincipal vista1;
    VistaJuego vista2;
}



