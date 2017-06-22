
package builder;

/**
 *
 * @author Carlos Andres Daza
 */


public class ConstructorAvionMediano extends BuilderAvion{

    public ConstructorAvionMediano() {
    }
    
    @Override
    public void construirMotor(){
        this.avion.setMotor("Motor mediano");
    }
    
    @Override
    public void construirAlas(){
        this.avion.setAlas("Alas medianas");
    }
    
    @Override
    public void construirTrenAterrizaje(){
        this.avion.setTrenAterrizaje(
            "Tren de aterrizaje mediano");
    }
    
    @Override
    public void construirFuselaje(){
        this.avion.setFuselaje("Fuselaje mediano");
    }
}
