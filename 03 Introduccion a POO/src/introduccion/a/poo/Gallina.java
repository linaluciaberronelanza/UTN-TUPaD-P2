package introduccion.a.poo;

public class Gallina {

    private static int contador = 0;
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina() {
        contador++;
        this.idGallina = contador;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public int envejecer(int aniosCumplidos) {
        if (aniosCumplidos > 0) {
            edad += aniosCumplidos;
        }
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        }
    }

    public int ponerHuevos(int cantidadHuevos) {
        if (cantidadHuevos > 0) {
            huevosPuestos += cantidadHuevos;
        }
        return huevosPuestos;
    }
}