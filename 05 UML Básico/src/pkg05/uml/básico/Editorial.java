package pkg05.uml.básico;

public class Editorial {

    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return " Nombre de la editorial = " + nombre + ", direccion = " + direccion;
    }
}
