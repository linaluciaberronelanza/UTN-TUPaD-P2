package introduccion.a.poo;

public class NaveEspacial {

    private String nombre;
    private double combustible;
    private double maxCombustible = 300;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }
    public double getCombustible() {
        return combustible;
    }
    public void setCombustible(double combustible) {
        if (combustible >= 1) {
            this.combustible = combustible;
        }
    }
    public void despegar() {
        if (combustible > 0) {
            System.out.println("La nave puede despegar");
        } else {
            System.out.println("La nave NO puede despegar");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= maxCombustible) {
            combustible += cantidad;
        } else {
            combustible = maxCombustible;
        }
        System.out.println("Se ha realizado una recarga. Combustible actual: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " // Combustible: " + combustible);
    }
}
