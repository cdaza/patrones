
package fabrica;

/**
 *
 * @author Carlos Andres Daza
 */

public abstract class CreadorAbstracto {
    
    public static final int TurboHelice = 1;
    public static final int TurboJet = 2;
    
    public abstract IMotor crear(int tipo);
    
}
