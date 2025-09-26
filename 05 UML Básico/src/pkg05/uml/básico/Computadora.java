package pkg05.uml.básico;

public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; 
    private Propietario propietario; 

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    @Override
    public String toString() {
        return "Computadora marca = " + marca + ", numeroSerie = " + numeroSerie + " "+ placaMadre;
    }
}
