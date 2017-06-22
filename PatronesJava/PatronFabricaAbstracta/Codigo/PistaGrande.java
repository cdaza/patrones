package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public class PistaGrande extends Pista {

    public PistaGrande() {
        this.activar();
    }
    
    public void configurar(){
        System.out.println(
        	"configurando la pista como Grande");
    }
    
}
