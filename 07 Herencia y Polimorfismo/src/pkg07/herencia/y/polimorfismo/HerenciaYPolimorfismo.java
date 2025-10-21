package pkg07.herencia.y.polimorfismo;

import Animales.Perro;
import Animales.Vaca;
import Animales.Animal;
import Animales.Gato;
import Personal.EmpleadoTemporal;
import Personal.EmpleadoPlanta;
import Personal.Empleado;
import Dibujos.Figura;
import Dibujos.Rectangulo;
import Dibujos.Circulo;
import MediosDeMovilidad.Auto;
import java.util.ArrayList;

public class HerenciaYPolimorfismo {

    public static void main(String[] args) {

        //EJERCICIO 1
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

        //EJERCICIO 2
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6)
        };

        for (Figura f : figuras) {
            f.mostrarInfo();
        }

        //EJERICCIO 3
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Lina", 250000));
        empleados.add(new EmpleadoTemporal("Carlos", 20, 8000));
        empleados.add(new EmpleadoPlanta("Marta", 300000));
        empleados.add(new EmpleadoTemporal("Juan", 15, 7500));

        for (Empleado e : empleados) {
            e.mostrarInfo();

            if (e instanceof EmpleadoPlanta) {
                System.out.println("(Empleado de planta)");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("(Empleado temporal)");
            }
        }

        //EJERCICIO 4
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }

    }
}
