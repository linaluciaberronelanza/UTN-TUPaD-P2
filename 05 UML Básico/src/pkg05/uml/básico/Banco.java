package pkg05.uml.básico;

public class Banco {

    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return " Nombre del banco = " + nombre + ", cuit=" + cuit;
    }

}
