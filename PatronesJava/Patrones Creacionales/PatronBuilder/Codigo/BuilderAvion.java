
package builder;

/**
 *
 * @author Carlos Andres Daza
 */

public abstract class BuilderAvion {
    
    protected Avion avion;

    public Avion getAvion() {
        return this.avion;
    }

    public void crearNuevoAvion(){
        this.avion=new Avion();
    }
    
    public abstract void construirMotor();
    public abstract void construirAlas();
    public abstract void construirTrenAterrizaje();
    public abstract void construirFuselaje();
    
}
