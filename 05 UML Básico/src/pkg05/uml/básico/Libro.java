package pkg05.uml.básico;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;      
    private Editorial editorial; 

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "El titulo del libro es = " + titulo + ", isbn = " + isbn + ", Nombre del autor = " + autor + editorial;
    }
}
