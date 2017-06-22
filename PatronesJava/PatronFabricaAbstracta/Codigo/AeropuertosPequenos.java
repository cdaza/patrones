package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public class AeropuertosPequenos implements Aeropuertos {

    public AeropuertosPequenos() {
    }
    public Torre getTorre(){
        return new TorrePequena();
    }
    public Pista getPista(){
        return new PistaPequena();
    }
}
