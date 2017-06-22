package Singleton;

/**
 *
 * @author Carlos Andres Daza
 */
public class Avion {

    public Avion() {
    }
    private static Avion instancia;

    public static Avion getInstancia() {

        if (instancia == null) {
            instancia = new Avion();
            System.out.println("El objeto ha sido creado");
        } else {
            System.out.println("Ya existe el objeto");
        }
        return instancia;
    }

    //Se sobreescribe el metodo clone para controlar la clonacion del objeto
    @Override
    public Avion clone() {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase Avion");
        }
        return null;

    }

}
