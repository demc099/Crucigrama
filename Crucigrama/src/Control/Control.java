
package Control;

import modelo.CrucigramaJuego;
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
    
    
    CrucigramaJuego crusi;
    //VistaPrincipal vista1;
    VistaJuego vista2;
}



