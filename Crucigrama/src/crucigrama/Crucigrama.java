
package crucigrama;

import Control.Control;
import modelo.Palabra;
import vistas.VistaJuego;


public class Crucigrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // new VistaJuego().show();
        Control control= new Control();
     //   control.Agregar(new Palabra("Sumar", "Antonimo de Restar", 5, "H", 5,8));
        
        
        control.MostrarVistaJuego();
        
        
    }
    
}
