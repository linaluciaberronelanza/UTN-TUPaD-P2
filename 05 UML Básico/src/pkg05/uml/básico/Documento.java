package pkg05.uml.básico;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Profesional profesional) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, profesional); // Composición: la firma se crea junto con el documento
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Documento titulo = " + titulo + ", contenido = " + contenido + ", firmador = " + firma;
    }

}
