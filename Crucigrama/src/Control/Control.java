
package Control;

import modelo.CrucigramaJuego;
import vistas.VistaJuego;
import vistas.VistaPrincipal;

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
      public void MostrarVistaFile(){
        vista1.setVisible(true);
        vista1.show();
    }
     public int getFilas(){
         return crusi.getFilas();
     }
     public int getColumnas(){
         return crusi.getColumnas();
     }
     
    CrucigramaJuego crusi;
    VistaPrincipal vista1;
    VistaJuego vista2;
}



