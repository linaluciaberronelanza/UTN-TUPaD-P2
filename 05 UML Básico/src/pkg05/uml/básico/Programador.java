package pkg05.uml.básico;

public class Programador {

    private String nombre;
    private String email;

    public Programador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Programador nombre = " + nombre + ", email = " + email;
    }
}
