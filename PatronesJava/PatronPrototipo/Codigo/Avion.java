
package prototipo;

/**
 *
 * @author Carlos Andres Daza
 */

public abstract class Avion {

    private String matricula="";
    private String empresa="sin empresa";

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public abstract Avion clonar();
    
    public abstract void despegar();
    public abstract void aterrizar();
}
