package pkg05.uml.básico;

public class Render {

    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
        System.out.println("Se hizo un Render: " + this);
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    @Override
    public String toString() {
        return "Render formato = " + formato + ", proyecto = " + (proyecto != null ? proyecto.getNombre() : "Sin proyecto");
    }
}
