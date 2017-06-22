package Singleton;

/**
 *
 * @author Carlos Andres Daza
 */
public class Singleton {

    public static void main(String[] args) {
        Avion avion1 = Avion.getInstancia();
        Avion avion2 = Avion.getInstancia();
        
        try {
            Avion avion3 = avion1.clone();
            System.out.println(avion3);
        } catch (NullPointerException ex) {
        }
    }

}
