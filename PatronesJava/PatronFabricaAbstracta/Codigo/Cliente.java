package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public class Cliente {
    public Cliente(Aeropuertos tamano)
    {
        Torre torre=tamano.getTorre();
        torre.configurar();
        
        Pista pista=tamano.getPista();
        pista.configurar();
    }
}
