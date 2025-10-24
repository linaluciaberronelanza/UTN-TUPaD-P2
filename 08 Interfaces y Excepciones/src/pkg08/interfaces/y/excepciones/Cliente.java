package pkg08.interfaces.y.excepciones;

public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }

    @Override
    public String toString() {
        return "Cliente: nombre=" + nombre;
    }
}
