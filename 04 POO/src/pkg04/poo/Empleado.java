package pkg04.poo;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int generadorId = 100;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = generadorId++;
        setNombre(nombre);
        setPuesto(puesto);
        this.salario = 20000;
        totalEmpleados++;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void actualizarSalario(double aumento) {
        this.salario += aumento;
    }

    public void actualizarSalarioPorcentaje(double porcentaje) {
        this.salario += salario * porcentaje / 100;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

}
