package pkg06.colecciones;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor != null && this.profesor != p) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null && !p.cursos.contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String profNombre = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso: " + codigo + " - " + nombre + ", Profesor: " + profNombre);
    }
}
