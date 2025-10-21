package Dibujos;

public abstract class Figura {

    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public void mostrarInfo() {
        System.out.println(nombre + " - Area: " + calcularArea());
    }
}
