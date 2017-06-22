
package fabrica;

/**
 *
 * @author Carlos Andres Daza
 */

public class Fabrica {

    
    public static void main(String[] args) {
        CreadorAbstracto creator = new Creador();
        
        IMotor helice=creator.crear(Creador.TurboHelice);
        helice.encender();
        
        IMotor jet=creator.crear(Creador.TurboJet);
        jet.encender();
    }
    
}
