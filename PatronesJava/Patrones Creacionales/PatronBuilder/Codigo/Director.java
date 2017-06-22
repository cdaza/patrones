
package builder;

/**
 *
 * @author Carlos Andres Daza
 */

public class Director {

    public Director() {
    }
    
    public void construir(BuilderAvion builder){
        builder.crearNuevoAvion();
        
        builder.construirMotor();
        builder.construirAlas();
        builder.construirTrenAterrizaje();
        builder.construirFuselaje();
    }
}
