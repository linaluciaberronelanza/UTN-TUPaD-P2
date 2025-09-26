package pkg05.uml.básico;

public class Foto {

    private String imagen;
    private String formato;

    public Foto(String imagen) {
        this.imagen = imagen;
        this.formato = "png";
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        if (imagen != null) {
            this.imagen = imagen;
        }
    }

    @Override
    public String toString() {
        return "Foto [imagen=" + imagen + ", formato=" + formato + "]";
    }
}
