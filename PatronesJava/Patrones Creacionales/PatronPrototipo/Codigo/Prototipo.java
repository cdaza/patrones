
package prototipo;

/**
 *
 * @author Carlos Andres Daza
 */

public class Prototipo {

    public static void main(String[] args) {
        GestorAvion objGA = new GestorAvion();
        
        Avion a1 = objGA.getAvion("NY-321");
        
        System.out.println("-------------------");
        
        System.out.println("El avion original tiene matricula: "
            + a1.getMatricula());
        System.out.println("Su Empresa es: "
            +a1.getEmpresa());
                
        System.out.println("------------------");
        
        Avion a2 = objGA.getClon("NY-321");
        
        System.out.println("Clon de avion creado");
        System.out.println("su matricula es: "+
            a2.getMatricula());
        System.out.println("Su empresa es: "+
            a2.getEmpresa());
        
        System.out.println("-------------------");
        
        a2.setMatricula("BQ-536");
        a2.setEmpresa("Viva Colombia");
        
        System.out.println("el clon modificado, ahora tiene matricula "
            + a2.getMatricula());
        System.out.println("su empresa es: "
            +a2.getEmpresa());
        
        System.out.println("------------------");
        
        a1.setMatricula("Sin categoria");
        a1.setEmpresa("SITP");
       
        System.out.println(
            "el avion original modificado, ahora tiene matricula "
            + a1.getMatricula());
        System.out.println("su empresa es: "+
            a1.getEmpresa());
        
        System.out.println("El clon tiene matricula "
            + a2.getMatricula());
        System.out.println("su empresa es: "
            +a2.getEmpresa());
    }
    
}
