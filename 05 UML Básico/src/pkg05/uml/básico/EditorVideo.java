package pkg05.uml.básico;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto); 
        System.out.println("El editor de video exporto el proyecto en formato: " + render.getFormato());
    }
}
