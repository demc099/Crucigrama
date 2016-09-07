
package modelo;


public class CrucigramaJuego {

    public CrucigramaJuego() {
       glosarito= new Glosario();
    }

    public Glosario getGlosarito() {
        return glosarito;
    }

    public void setGlosarito(Glosario glosarito) {
        this.glosarito = glosarito;
    }
    
    public boolean Revisar(String def, String pal){
        Palabra palabrita= new Palabra();
        if(glosarito.buscarXDe(def)!=null){
        palabrita= glosarito.buscarXDe(def);
            if(palabrita.getTermino()==pal){
                return true;
            }
            else{
                return false;
            }
      }
        return false;
   }
    
    
       
    private Glosario glosarito;
}
