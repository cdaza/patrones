
package builder;

/**
 *
 * @author Carlos Andres Daza
 */


public class ConstructorAvionGrande extends BuilderAvion {

    public ConstructorAvionGrande() {
    }
    
    @Override
    public void construirMotor(){
        this.avion.setMotor("Motor Grande");
    }
    
    @Override
    public void construirAlas(){
        this.avion.setAlas("Alas grandes");
    }
    
    @Override
    public void construirTrenAterrizaje(){
        this.avion.setTrenAterrizaje(
            "Tren de aterrizaje grande");
    }
    
    @Override
    public void construirFuselaje(){
        this.avion.setFuselaje("Fuselaje grande");
    }
}
