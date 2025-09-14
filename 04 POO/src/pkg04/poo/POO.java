package pkg04.poo;

public class POO {

    public static void main(String[] args) {
        Empleado lina = new Empleado(123, "Lina", "Administradora", 50000);
        Empleado ignacio = new Empleado("Ignacio", "CEO");

        lina.actualizarSalario(5000);
        ignacio.actualizarSalarioPorcentaje(10);

        System.out.println(lina);
        System.out.println(ignacio);
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }

}
