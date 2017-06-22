
package fabrica;

/**
 *
 * @author Carlos Andres Daza
 */

public class Creador extends CreadorAbstracto {

    public Creador() {
    }
    
    @Override
    public IMotor crear(int tipo) {
        IMotor objeto=null;
        if(tipo == 1)
        {
            objeto= new MotorTurboHelice();
        }
        if(tipo == 2)
        {
            objeto= new MotorTurboJet();
        }
          
        return objeto;
    }
    
    
}
