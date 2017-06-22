
package builder;

/**
 *
 * @author Carlos Andres Daza
 */


public class Builder {

  
    public static void main(String[] args) {
       
        Director objBuilder= new Director();
        
        BuilderAvion pequeno = new ConstructorAvionPequeno();
        BuilderAvion mediano = new ConstructorAvionMediano();
        BuilderAvion grande = new ConstructorAvionGrande();
        
        //construir avion pequeño
        objBuilder.construir(pequeno);
        Avion avionPequeno =pequeno.getAvion();
        
        //construir avion mediano
        objBuilder.construir(mediano);
        Avion avionMediano =mediano.getAvion();
        
        
        //construir avion grande
        objBuilder.construir(grande);
        Avion avionGrande =grande.getAvion();
        
        
        mostrarInformacionAvion(avionPequeno);
        mostrarInformacionAvion(avionMediano);
        mostrarInformacionAvion(avionGrande);
    }
    
    public  static void mostrarInformacionAvion(Avion avion){
        System.out.println("la informacion del avion es: ");
        System.out.println("Motor: "+ avion.getMotor());
        System.out.println("Alas: "+ avion.getAlas());
        System.out.println("Tren de aterrizaje: "
            + avion.getTrenAterrizaje());
        System.out.println("Fuselaje: "
            + avion.getFuselaje());
        
        System.out.println("---------------");
    }
    
}
