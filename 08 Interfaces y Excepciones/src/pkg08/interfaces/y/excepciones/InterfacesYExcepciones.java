package pkg08.interfaces.y.excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InterfacesYExcepciones {

    public static void main(String[] args) {

        //EJERCICIO 1
        Cliente cliente1 = new Cliente("Lina");
        Pedido pedido1 = new Pedido(cliente1);

        pedido1.agregarProducto(new Producto("Mouse", 15000));
        pedido1.agregarProducto(new Producto("Teclado", 20000));

        System.out.println(pedido1);

        TarjetaCredito tarjeta = new TarjetaCredito(10);
        double total = pedido1.calcularTotal();
        tarjeta.procesarPago(total);

        pedido1.cambiarEstado("Enviado");

        //EJERCICIO 2
        Scanner sc = new Scanner(System.in);

        // 1. Division segura
        try {
            System.out.print("Ingrese dividendo: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: division por cero");
        }

        // 2. Conversion de cadena a numero
        sc.nextLine(); // limpiar buffer
        try {
            System.out.print("Ingrese un numero: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: formato de numero invalido");
        }

        // 3. Lectura de archivo
        try {
            BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        // 4. Excepcion personalizada
        try {
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: " + edad);
            }
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        // 5. try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error de IO durante la lectura del archivo");
        } finally {
            System.out.println("Lectura finalizada");
        }
    }
}
