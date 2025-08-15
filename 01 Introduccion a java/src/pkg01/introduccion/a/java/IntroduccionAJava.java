package pkg01.introduccion.a.java;

import java.util.Scanner;

public class IntroduccionAJava {


    public static void main(String[] args) {
        
      //EJERCICIO 1
       String holaMundo = "¡Hola, Java!";
        System.out.println(holaMundo);
        
      // EJERCICIO 3
       String nombre = "Maria";
        int edad = 32;
        double altura = 1.52;
        boolean estudiante = true;
        System.out.println(nombre + " tiene " + edad + " años y mide " + altura + " m." + estudiante);

        //EJERCICIO 4
        Scanner input = new Scanner(System.in);
        int edad2;
        System.out.println("Coloca un numero entero");
        edad2 = Integer.parseInt(input.nextLine());
        System.out.println("El usuario tiene " + edad2 + " años");

        //EJERCICIO 5 
        Scanner entrada = new Scanner(System.in);
        int x, z, suma, resta, multiplicacion;
        double division;
        System.out.println("Coloca un numero entero");
        x = Integer.parseInt(entrada.nextLine());
        System.out.println("Coloca el segundo numero entero");
        z = Integer.parseInt(entrada.nextLine());
        suma = x+z;
        resta = x-z;
        multiplicacion = x*z;
        division = (x * 1.0) / z;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);

        //EJERCICIO 6
        String nombre1 = "Juan Pérez", direccion = "Calle Falsa 123";
        int edad3 = 30;
        System.out.println("Nombre: " + nombre1+ "\n" + "Edad: " + edad3 + " años" + "\n" + "Dirección: " + "\"" + direccion + "\" " );

        //EJERCICIO 8
        int x2;
        double z2, division2;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Coloca un numero entero");
        x2 = Integer.parseInt(input2.nextLine());
        System.out.println("Coloca el segundo numero entero");
        z2 = Double.parseDouble(input2.nextLine());
        division2 = x2 / z2;
        System.out.println("El resultado de la division es: " + division2);

        //EJERCICIO 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre4 = scanner.nextLine(); 
        System.out.println("Hola, " + nombre4);

        //EJERCICIO 10
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);


    }
    
}
