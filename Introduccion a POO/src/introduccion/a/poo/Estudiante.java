package introduccion.a.poo;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        }
    }

    public void setCurso(String curso) {
        if (curso != null) {
            this.curso = curso;
        }
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double subirCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion += puntos;
            if (calificacion > 10) {
                calificacion = 10; // límite máximo
            }
        }
        return calificacion;
    }

    public double bajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion -= puntos;
            if (calificacion < 0) {
                calificacion = 0; // límite mínimo
            }
        }
        return calificacion;
    }

    public void getMostrarInfo() {
        System.out.println("El nombre completo del estudiante es: " + nombre + " " + apellido + ", pertenece a: " + curso + ". Su calificación es: " + calificacion);
    }
}
