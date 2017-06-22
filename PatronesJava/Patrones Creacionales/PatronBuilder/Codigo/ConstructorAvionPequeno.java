
package builder;

/**
 *
 * @author Carlos Andres Daza
 */

public class ConstructorAvionPequeno extends BuilderAvion {

    public ConstructorAvionPequeno() {
    }
   
    @Override
    public void construirMotor(){
        this.avion.setMotor("Motor pequeño");
    }
    
    @Override
    public void construirAlas(){
        this.avion.setAlas("Alas pequeñas");
    }
    
    @Override
    public void construirTrenAterrizaje(){
        this.avion.setTrenAterrizaje(
            "Tren de aterrizaje pequeño");
    }
    
    @Override
    public void construirFuselaje(){
        this.avion.setFuselaje("Fuselaje pequeño");
    }
}
