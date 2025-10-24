package pkg08.interfaces.y.excepciones;

import java.util.ArrayList;

public class Pedido implements Pagable {

    private ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambio();
    }

    private void notificarCambio() {
        if (cliente != null) {
            cliente.notificar("El pedido cambio su estado a: " + estado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido: productos=" + productos + ", estado=" + estado + ", total=" + calcularTotal();
    }
}
