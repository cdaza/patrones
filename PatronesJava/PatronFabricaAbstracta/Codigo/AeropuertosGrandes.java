package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public class AeropuertosGrandes implements Aeropuertos {

    public AeropuertosGrandes() {
    }
    public Torre getTorre(){
        return new TorreGrande();
    }
    public Pista getPista(){
        return new PistaGrande();
    }
}
