package prototipo;

/**
 *
 * @author Carlos Andres Daza
 */

public class AvionInternacional extends Avion {
    
    public AvionInternacional() {
        System.out.println(
            "Avion Internacional creado");
    }

    @Override
    public void despegar() {
        System.out.println(
            "El Avion Internacional despega");
    }

    @Override
    public void aterrizar() {
        System.out.println(
            "El Avion Internacional aterriza");
    }
    
    
    @Override
    public Avion clonar() {
        
        AvionInternacional objAvionInternacional= 
                        new AvionInternacional();
        objAvionInternacional.setMatricula(this.getMatricula());
        objAvionInternacional.setEmpresa(this.getEmpresa());
        
        return objAvionInternacional;

    }
}
