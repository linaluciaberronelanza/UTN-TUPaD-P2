package pkg05.uml.básico;

public class Reproductor {

    public void reproducir(Cancion cancion) { 
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + (cancion.getArtista() != null ? cancion.getArtista().getNombre() : "Desconocido"));
    }
}
