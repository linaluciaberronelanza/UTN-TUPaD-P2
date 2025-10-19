package pkg06.colecciones;

public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + " , ISBN: " + isbn + " , Anio: " + anioPublicacion + " , Autor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
    }

    @Override
    public String toString() {
        return titulo + " (" + anioPublicacion + ") - " + autor.getNombre();
    }
}
