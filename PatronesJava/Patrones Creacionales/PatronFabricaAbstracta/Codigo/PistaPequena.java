
package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public class PistaPequena extends Pista{

    public PistaPequena() {
        this.activar();
    }
    
    public void configurar(){
        System.out.println(
        	"configurando la pista como Pequeña");
    }
}
