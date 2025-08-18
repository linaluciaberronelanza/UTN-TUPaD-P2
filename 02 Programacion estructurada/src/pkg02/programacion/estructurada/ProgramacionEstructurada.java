package pkg02.programacion.estructurada;

//IMPORTACIONES
import java.util.Scanner;

public class ProgramacionEstructurada {

    //CONSTANTES
    final static double DESCUENTO_ESPECIAL = 0.90;

    public static void main(String[] args) {

//       Estructuras Condicionales:
//1. Verificación de Año Bisiesto.
//Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
//        Scanner input = new Scanner(System.in);
//        int anio;
//        System.out.println("Coloca un año para evaluar si es bisisesto o no: ");
//        anio = Integer.parseInt(input.nextLine());
//        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
//            System.out.println("El año: " + anio + " es bisiesto");
//        } else {
//            System.out.println("El año: " + anio + " NO es bisiesto");
//        }
//2. Determinar el Mayor de Tres Números.
//Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
//        Scanner input2 = new Scanner(System.in);
//        int num1, num2, num3, numeroMayor;
//        System.out.println("Coloca el primer numero entero: ");
//        num1 = Integer.parseInt(input2.nextLine());
//        System.out.println("Coloca el segundo numero entero: ");
//        num2 = Integer.parseInt(input2.nextLine());
//        System.out.println("Coloca el tercer numero entero: ");
//        num3 = Integer.parseInt(input2.nextLine());
//
//        numeroMayor = num1;
//
//        if (num2 > numeroMayor) {
//            numeroMayor = num2;
//        }
//        if (num3 > numeroMayor) {
//            numeroMayor = num3;
//        }
//        System.out.println("El numero mayor es: " + numeroMayor);
//3. Clasificación de Edad.
//Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
//Menor de 12 años: "Niño"
//Entre 12 y 17 años: "Adolescente"
//Entre 18 y 59 años: "Adulto"
//60 años o más: "Adulto mayor"
//        Scanner input3 = new Scanner(System.in);
//        int edad;
//        System.out.println("Coloca tu edad para evaluarla: ");
//        edad = Integer.parseInt(input3.nextLine());
//        if (edad < 12) {
//            System.out.println("Eres un niño");
//        } else if ((edad >= 12) && (edad <= 17)){
//            System.out.println("Eres un adolescente");
//        }else if ((edad >= 18) && (edad <= 59)){
//            System.out.println("Eres un adulto");
//        }else {
//            System.out.println("Eres un adulto mayor");
//        }
//4. Calculadora de Descuento según categoría.
//Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
//Luego, aplique los siguientes descuentos:
//Categoría A: 10% de descuento
//Categoría B: 15% de descuento
//Categoría C: 20% de descuento
//El programa debe mostrar el precio original, el descuento aplicado y el precio final
//        Scanner input4 = new Scanner(System.in);
//        char descuentoCategoria;
//        double precioInicial, descuentoPorcentaje, precioConDescuento;
//        System.out.println("Coloca el precio inicial: ");
//        precioInicial = Double.parseDouble(input4.nextLine());
//        System.out.println("Coloca la categoria de descuento: ");
//        descuentoCategoria = input4.nextLine().charAt(0);
//
//        switch (descuentoCategoria) {
//            case 'A', 'a' -> {
//                descuentoPorcentaje = 0.9;
//                precioConDescuento = precioInicial * descuentoPorcentaje;
//                System.out.println("El precio es de: " + precioInicial + ". El descuento es del 10%. Y el precio final es de: " + precioConDescuento);
//            }
//            case 'B', 'b' -> {
//                descuentoPorcentaje = 0.85;
//                precioConDescuento = precioInicial * descuentoPorcentaje;
//                System.out.println("El precio es de: " + precioInicial + ". El descuento es del 15%. Y el precio final es de: " + precioConDescuento);
//            }
//            case 'C', 'c' -> {
//                descuentoPorcentaje = 0.8;
//                precioConDescuento = precioInicial * descuentoPorcentaje;
//                System.out.println("El precio es de: " + precioInicial + ". El descuento es del 20%. Y el precio final es de: " + precioConDescuento);
//            }
//            default ->
//                System.out.println("Categoría inválida. Debe ser A, B o C.");
//        }
//Estructuras de Repetición:
//5. Suma de Números Pares (while).
//Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
//        Scanner input5 = new Scanner(System.in);
//        int numeroIngresado, sumatoria;
//        System.out.println("Coloca un numero entero y 0 para cortar: ");
//        numeroIngresado = Integer.parseInt(input5.nextLine());
//        sumatoria = 0;
//        while (numeroIngresado != 0) {
//            if (numeroIngresado % 2 == 0) {
//                sumatoria += numeroIngresado;
//            }
//            System.out.println("Coloca un numero entero (0 para cortar): ");
//            numeroIngresado = Integer.parseInt(input5.nextLine());
//        }
//
//        System.out.println("La suma de los números pares ingresados es: " + sumatoria);
//6. Contador de Positivos, Negativos y Ceros (for).
//Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros.
//        Scanner input6 = new Scanner(System.in);
//        int numeroIngresado2, numerosPositivos, numerosNegativos, ceros;
//        numerosPositivos = 0;
//        numerosNegativos = 0;
//        ceros = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Coloca un numero: ");
//            numeroIngresado2 = Integer.parseInt(input6.nextLine());
//            if (numeroIngresado2 == 0) {
//                ceros++;
//            } else if (numeroIngresado2 > 0) {
//                numerosPositivos++;
//            } else {
//                numerosNegativos++;
//            }
//        }
//        System.out.println("Hay: " + numerosPositivos + " numeros positivos, " + numerosNegativos + " numeros negativos y " + ceros + " veces se coloco 0.");
//7. Validación de Nota entre 0 y 10 (do-while).
//Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.
//        Scanner input7 = new Scanner(System.in);
//        int numeroIngresado3;
//
//        do {
//            System.out.println("Coloca un numero entre 0 y 10: ");
//            numeroIngresado3 = Integer.parseInt(input7.nextLine());
//            System.out.println("Nota invalida");
//        } while ((numeroIngresado3 > 10) || (numeroIngresado3 < 0));
//        System.out.println("Nota guardada correctamente");
//        Funciones:
//8. Cálculo del Precio Final con impuesto y descuento.
//Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
//PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
//Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
//        Scanner input8 = new Scanner(System.in);
//        double impuesto, descuento, precioBase, precioFinal;
//
//        System.out.println("Ingresa el precio base: ");
//        precioBase = Double.parseDouble(input8.nextLine());
//        System.out.println("Ingresa el impuesto en porcentaje: ");
//        impuesto = Double.parseDouble(input8.nextLine());
//        System.out.println("Ingresa el descuento en porcentaje: ");
//        descuento = Double.parseDouble(input8.nextLine());
//
//        impuesto = impuesto / 100;
//        descuento = descuento / 100;
//
//        // Llamamos a la función
//        precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
//
//        System.out.println("El precio final es: " + precioFinal);
//9. Composición de funciones para calcular costo de envío y total de compra.
//a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
//Nacional: $5 por kg
//Internacional: $10 por kg
//b. calcularTotalCompra(double precioProducto, double costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
//Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar.
//        Scanner input9 = new Scanner(System.in);
//        double costoEnvio, precioTotal;
//        String zona;
//        int pesoKg, precioProducto;
//
//        System.out.println("Ingresa el tipo de envío (nacional o internacional): ");
//        zona = input9.nextLine();
//        System.out.println("Ingresa el peso del paquete en números enteros (kg): ");
//        pesoKg = Integer.parseInt(input9.nextLine());
//        System.out.println("Ingresa el precio del producto en números enteros: ");
//        precioProducto = Integer.parseInt(input9.nextLine());
//
//        costoEnvio = calcularCostoEnvio(zona, pesoKg);
//        precioTotal = calcularTotalCompra(precioProducto, costoEnvio);
//
//        System.out.println("El costo de envío es: $" + costoEnvio);
//        System.out.println("El precio total de la compra es: $" + precioTotal);
        //        10. Actualización de stock a partir de venta y recepción de productos.
        //Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción de productos:
        //NuevoStock = StockActual − CantidadVendida + CantidadRecibida
        //NuevoStock = CantidadVendida + CantidadRecibida 
        //Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
//        Scanner input10 = new Scanner(System.in);
//        String accion;
//        int ventas, recepciones, stockActual, nuevoStock;
//
//        System.out.println("Ingresa el tipo de accion (venta o ingreso): ");
//        accion = input10.nextLine();
//        System.out.println("Ingresa el stock del producto en numero entero: ");
//        stockActual = Integer.parseInt(input10.nextLine());
//        System.out.println("Ingresa la cantidad de ventas en numero entero: ");
//        ventas = Integer.parseInt(input10.nextLine());
//        System.out.println("Ingresa la cantidad de recepciones del producto en numero entero: ");
//        recepciones = Integer.parseInt(input10.nextLine());
//
//        nuevoStock = actualizarStock(accion, stockActual, ventas, recepciones);
//
//        System.out.println("El stock actualizado del producto es: " + nuevoStock);
        //11. Cálculo de descuento especial usando variable global.
        //Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
        //Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento.
//        Scanner input11 = new Scanner(System.in);
//        double precioProducto, precioFinal;
//
//        System.out.println("Ingresa el precio del producto: ");
//        precioProducto = Double.parseDouble(input11.nextLine());
//
//        precioFinal = calcularDescuentoEspecial(precioProducto, DESCUENTO_ESPECIAL);
//
//        System.out.println("El precio final del producto es: " + precioFinal);
        //        Arrays y Recursividad:
        //12. Modificación de un array de precios y visualización de resultados.
        //Crea un programa que:
        //a. Declare e inicialice un array con los precios de algunos productos.
        //b. Muestre los valores originales de los precios.
        //c. Modifique el precio de un producto específico.
        //d. Muestre los valores modificados.
//        Scanner input12 = new Scanner(System.in);
//        double[] arrayPrecios = new double[4];
//        System.out.println("Ingresa los precios de 4 productos:");
//        for (int i = 0; i < arrayPrecios.length; i++) {
//            System.out.print("Producto " + (i + 1) + ": ");
//            arrayPrecios[i] = Double.parseDouble(input12.nextLine());
//        }
//
//        // Mostrar precios originales
//        System.out.println("\nPrecios originales:");
//        for (int i = 0; i < arrayPrecios.length; i++) {
//            System.out.println("Producto " + (i + 1) + ": " + arrayPrecios[i]);
//        }
//
//        // Modificar un precio
//        System.out.print("\nElige el índice del producto que deseas modificar (0 a 3): ");
//        int indice = Integer.parseInt(input12.nextLine());
//
//        if (indice >= 0 && indice < arrayPrecios.length) {
//            System.out.print("Ingresa el nuevo precio: ");
//            arrayPrecios[indice] = Double.parseDouble(input12.nextLine());
//        } else {
//            System.out.println("Índice no válido.");
//        }
//
//        // Mostrar precios modificados
//        System.out.println("\nPrecios modificados:");
//        for (int i = 0; i < arrayPrecios.length; i++) {
//            System.out.println("Producto " + (i + 1) + ": " + arrayPrecios[i]);
//        }

        //13. Impresión recursiva de arrays antes y después de modificar un elemento.
        //Crea un programa que:
        //a. Declare e inicialice un array con los precios de algunos productos.
        //b. Use una función recursiva para mostrar los precios originales.
        //c. Modifique el precio de un producto específico.
        //d. Use otra función recursiva para mostrar los valores modificados.
        Scanner input13 = new Scanner(System.in);
        double[] arrayPrecios = new double[3];

        // a. Declarar e inicializar array
        System.out.println("Ingresa los precios de 3 productos:");
        for (int i = 0; i < arrayPrecios.length; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            arrayPrecios[i] = Double.parseDouble(input13.nextLine());
        }

        // b. Mostrar precios originales con recursividad
        System.out.println("Precios originales:");
        mostrarRecursivo(arrayPrecios, 0);

        // c. Modificar un precio
        System.out.print("\nElige el índice del producto que deseas modificar (0 a 2): ");
        int indice = Integer.parseInt(input13.nextLine());

        if (indice >= 0 && indice < arrayPrecios.length) {
            System.out.print("Ingresa el nuevo precio: ");
            arrayPrecios[indice] = Double.parseDouble(input13.nextLine());
        } else {
            System.out.println("Índice no válido.");
        }

        // d. Mostrar precios modificados con recursividad
        System.out.println("\nPrecios modificados:");
        mostrarRecursivo(arrayPrecios, 0);

        //Salida esperada:
        //Precios originales:
        //Precio: $199.99
        //Precio: $299.5
        //Precio: $149.75
        //Precio: $399.0
        //Precio: $89.99
        //Precios modificados:
        //Precio: $199.99
        //Precio: $299.5
        //Precio: $129.99
        //Precio: $399.0
        //Precio: $89.99
        //Conceptos Clave Aplicados:
        //✔ Uso de arrays (double[]) para almacenar valores.
        //✔ Recorrido del array con una función recursiva en lugar de un bucle.
        //✔ Modificación de un valor en un array mediante un índice.
        //✔ Uso de un índice como parámetro en la recursión para recorrer el array.
    }

    //FUNCIONES COMUNES Y VOID
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static double calcularCostoEnvio(String zona, int pesoKg) {
        double costoEnvio = 0;

        if (zona.equalsIgnoreCase("nacional")) {
            costoEnvio = pesoKg * 5;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costoEnvio = pesoKg * 10;
        } else {
            System.out.println("Error: zona no válida. Debes ingresar 'nacional' o 'internacional'.");
        }
        return costoEnvio;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static int actualizarStock(String accion, int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual;

        if (accion.equalsIgnoreCase("venta")) {
            nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        } else if (accion.equalsIgnoreCase("ingreso")) {
            nuevoStock = stockActual + cantidadRecibida;
        } else {
            System.out.println("Error: acción no válida.");
        }
        return nuevoStock;
    }

    public static double calcularDescuentoEspecial(double precio, double descuento) {
        double precioFinal;
        precioFinal = precio * descuento;
        return precioFinal;
    }

    public static void mostrarRecursivo(double[] array, int indice) {
        if (indice < array.length) {  // Caso base: si el índice es válido
            System.out.println("Producto " + (indice + 1) + ": " + array[indice]);
            mostrarRecursivo(array, indice + 1); // Caso recursivo
        }
    }

}
