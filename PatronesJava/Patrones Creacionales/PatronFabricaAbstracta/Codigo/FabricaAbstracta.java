
package FabricaAbstracta;

/**
 *
 * @author Carlos Andres Daza
 */

public class FabricaAbstracta {

    public static void main(String[] args) {

        Cliente cliente=
        		new Cliente(new AeropuertosGrandes());
        
        System.out.println("------------------------");
        
        cliente=new Cliente(new AeropuertosPequenos());
    }
    
}
