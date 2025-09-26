package pkg05.uml.básico;

public class CodigoQR {

    private String valor;
    private Programador programador;

    public CodigoQR(String valor, Programador programador) {
        this.valor = valor;
        this.programador = programador;
        System.out.println("Se creo un CodigoQR: " + this);
    }

    public String getValor() {
        return valor;
    }

    public Programador getProgramador() {
        return programador;
    }

    @Override
    public String toString() {
        return "CodigoQR valor = " + valor + ", programador = " + (programador != null ? programador.getNombre() : "Sin programador");
    }
}
