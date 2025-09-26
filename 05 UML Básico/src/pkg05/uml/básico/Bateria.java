package pkg05.uml.básico;

public class Bateria {

    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = 128;
    }

    public String getModelo() {
        return modelo;
    }


    @Override
    public String toString() {
        return "modelo= " + modelo + ", capacidad=" + capacidad ;
    }
}
