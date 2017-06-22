
package prototipo;

/**
 *
 * @author Carlos Andres Daza
 */

public class AvionNacional extends Avion {

    public AvionNacional() {
        System.out.println("Avion Nacional creado");
    }

    @Override
    public void despegar() {
        System.out.println("El Avion Nacional despega");
    }

    @Override
    public void aterrizar() {
        System.out.println("El Avion Nacional aterriza");
    }
    
    
    @Override
    public Avion clonar() {
        
        AvionNacional objAvionNacional= 
                            new AvionNacional();
        objAvionNacional.setMatricula(this.getMatricula());
        objAvionNacional.setEmpresa(this.getEmpresa());
        
        return objAvionNacional;

    }
}
