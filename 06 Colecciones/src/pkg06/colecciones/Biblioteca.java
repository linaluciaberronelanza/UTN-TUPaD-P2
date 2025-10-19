package pkg06.colecciones;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // 1. Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    // 2. Listar libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            System.out.println("Libros en " + nombre);
            for (Libro l : libros) {
                l.mostrarInfo();
            }
        }
    }

    // 3. Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    // 4. Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            return true;
        }
        return false;
    }

    // 5. Cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // 6. Filtrar por año
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> filtrados = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                filtrados.add(l);
            }
        }
        return filtrados;
    }

    // 7. Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("Autores en la biblioteca");
        ArrayList<String> nombresMostrados = new ArrayList<>();
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            if (!nombresMostrados.contains(nombreAutor)) {
                System.out.println("- " + nombreAutor + " , " + l.getAutor().getNacionalidad());
                nombresMostrados.add(nombreAutor);
            }
        }
    }
}
