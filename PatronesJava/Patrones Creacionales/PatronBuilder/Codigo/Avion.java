
package builder;

/**
 *
 * @author Carlos Andres Daza
 */


class Avion {

    public Avion() {
    }
   
    private String motor;
    private String alas;
    private String trenAterrizaje;
    private String fuselaje;
    
    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAlas() {
        return this.alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getTrenAterrizaje() {
        return this.trenAterrizaje;
    }

    public void setTrenAterrizaje(String trenAterrizaje) {
        this.trenAterrizaje = trenAterrizaje;
    }

    public String getFuselaje() {
        return this.fuselaje;
    }

    public void setFuselaje(String fuselaje) {
        this.fuselaje = fuselaje;
    }
 
}
