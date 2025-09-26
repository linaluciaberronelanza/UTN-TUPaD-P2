package pkg05.uml.básico;

public class Profesional {

    private String nombre;
    private String email;

    public Profesional(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profesional nombre = " + nombre + ", email = " + email;
    }

}
