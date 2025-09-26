package pkg05.uml.básico;

public class Contribuyente {

    private String nombre;
    private int cuil;

    public Contribuyente(String nombre, int cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente nombre = " + nombre + ", cuil = " + cuil;
    }
}
