package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public abstract class Pista {
    
        private String nombrePista;

 
    public String getNombrePista() {
        return this.nombrePista;
    }

   
    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }
    
    public void activar()
    {
        System.out.println("activando la pista");
    }
    public abstract void configurar();

    
}
