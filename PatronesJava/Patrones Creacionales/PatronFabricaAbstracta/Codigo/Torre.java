package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public abstract class Torre {
    
    private String nombreTorre;

   
    public String getNombreTorre() {
        return this.nombreTorre;
    }

 
    public void setNombreTorre(String nombreTorre) {
        this.nombreTorre = nombreTorre;
    }
 
    public void activar()
    {
        System.out.println("activando la torre");
    }
    public abstract void configurar();
}
