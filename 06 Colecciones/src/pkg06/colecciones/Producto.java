package pkg06.colecciones;

public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private Clase categoria;

    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, Clase categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Clase getClase() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio + ", Stock: " + cantidad + ", Categoria: " + categoria + " (" + categoria.getDescripcion() + ")");
    }

    // toString para depuración
    @Override
    public String toString() {
        return nombre + " - $" + precio + " (" + categoria + ")";
    }

}
