
package prototipo;

/**
 *
 * @author Carlos Andres Daza
 */

import java.util.Hashtable;

public class GestorAvion {
    
    private Hashtable hAviones = new Hashtable();
    
    public GestorAvion()
    {
        Avion an1 = new AvionNacional();
        an1.setMatricula("BOG-123");
        
        //guardar
        this.addAvion(an1.getMatricula(), an1);
        
        //crear una avion internacional y darle propiedades
        Avion ai1= new AvionInternacional();
        ai1.setMatricula("NY-321");
        ai1.setEmpresa("LAN");
        //guardar
        this.addAvion(ai1.getMatricula(), ai1);
    }
    
    public void addAvion(String matricula, Avion objAvion){
        this.hAviones.put(matricula, objAvion);
    }
    
    
    public Avion getAvion(String matricula){
        Avion objPrototipo = (AvionInternacional) 
        hAviones.get(matricula);
        return objPrototipo;
    }
    
    public Avion getClon(String matricula){
        Avion objPrototipo = (AvionInternacional)
        hAviones.get(matricula);
        return (Avion) objPrototipo.clonar();
    }
           
}
