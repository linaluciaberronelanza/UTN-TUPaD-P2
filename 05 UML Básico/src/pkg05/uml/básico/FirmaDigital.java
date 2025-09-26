package pkg05.uml.básico;

public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    private Profesional profesional; // Agregación

    public FirmaDigital(String codigoHash, String fecha, Profesional profesional) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.profesional = profesional;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "codigoHash = " + codigoHash + ", fecha = " + fecha + ", profesional = " + (profesional != null ? profesional.getNombre() : "Sin profesional");
    }
}
