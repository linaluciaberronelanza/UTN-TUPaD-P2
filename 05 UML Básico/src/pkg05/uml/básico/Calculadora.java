package pkg05.uml.básico;

public class Calculadora {

    public void calcular(Impuesto impuesto) { 
        System.out.println("Calculando impuesto de " + (impuesto.getContribuyente() != null ? impuesto.getContribuyente().getNombre() : "Desconocido") + ": $" + impuesto.getMonto());
    }
}
