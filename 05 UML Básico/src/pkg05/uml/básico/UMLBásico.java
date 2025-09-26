package pkg05.uml.básico;

public class UMLBásico {

    public static void main(String[] args) {

        //EJERCICIO 1
        Foto foto = new Foto("imagen123.jpg");
        Pasaporte pasaporte = new Pasaporte("L222", "25-09-2025", foto);
        Titular titular = new Titular("Lina Berrone", 12345678);

        pasaporte.setTitular(titular);

        System.out.println("PASAPORTE: Número: " + pasaporte.getNumero() + " Fecha de Emisión: " + pasaporte.getFechaEmision() + " Titular: " + pasaporte.getTitular());

        //EJERCICIO2
        Bateria bateria = new Bateria("Bat-5000", 5000);
        Celular celular = new Celular("2525222", "Iphone", "SE", bateria);
        Usuario usuario = new Usuario("Lina Berrone", 12345678);

        celular.setUsuario(usuario);

        System.out.println("El usuario es  " + usuario + " y el celular asociado: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());

        //EJERCICIO3
        Autor autor = new Autor("Cortazar", "Argentina");
        Editorial editorial = new Editorial("Sudamericana", "Rosario, Argentina");
        Libro libro = new Libro("Rayuela", "2525222", autor, editorial);
        System.out.println(libro);

        //EJERCICIO 4
        Banco banco = new Banco("Macro", "27-12324536-1");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("55263874", "09/2025", banco);
        Cliente cliente = new Cliente("Lina Berrone", 12345678);

        tarjeta.setCliente(cliente);

        System.out.println(tarjeta + " Cliente asociado: " + tarjeta.getCliente().getNombre());

        //EJERCICIO 5
        PlacaMadre placa = new PlacaMadre("ASUS", "123");
        Computadora compu = new Computadora("Holi", "22561JAJAJA", placa);
        Propietario owner = new Propietario("Lucas Perez", 123);

        compu.setPropietario(owner);

        System.out.println(compu + "Propietario: " + compu.getPropietario());

        //EJERCICIO 6
        Comensal comensal = new Comensal("Maria La del Barrio", 4828845);
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-30", "20:30", comensal, mesa);

        System.out.println(reserva);

        //EJERCICIO  7
        Motor m = new Motor("De agua", 12345);
        Vehiculo v = new Vehiculo("LLB 222", "Suran", m);
        Conductor c = new Conductor("LINA", 2222);

        v.setConductor(c);

        System.out.println(v);

        //EJERCICIO 8
        Profesional prof = new Profesional("Le Corbusier", "lecorbu@hotmail.com");
        Documento doc = new Documento("Contrato de Obra", "Contenido...", "holi1234", "25/09/2025", prof);

        System.out.println(doc);

        //EJERCICIO 9 
        Paciente paciente1 = new Paciente("Lina Berrone", "OSDE");
        Doctor doctor1 = new Doctor("Dra. Loquibambia", "Neurologia");
        CitaMedica cita1 = new CitaMedica("25/09/2025", "10:30", paciente1, doctor1);

        System.out.println(cita1);

        //EJERCICIO 10 
        Poseedor poseedor1 = new Poseedor("Carlos Saul Menem", 12345678);
        CuentaBancaria cuenta1 = new CuentaBancaria(98765432, 50000, "CLAVE123", "25/09/2025");

        cuenta1.setPoseedor(poseedor1);

        // Imprimir los objetos
        System.out.println(cuenta1);
        
        //EJERCICIO 11
        
         Artista artista1 = new Artista("Farolitos", "Rock Nacional");
        Cancion cancion1 = new Cancion("Argentino", artista1);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion1);

        System.out.println(cancion1);
        
        //EJERCICIO 12
        Contribuyente contribuyente1 = new Contribuyente("Lina Lucia", 20354);
        Impuesto impuesto1 = new Impuesto(1500, contribuyente1);
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(impuesto1);

        System.out.println(impuesto1);
        
        //EJERCICIO 13
        Programador prog1 = new Programador("lINA Berrone", "holi@hastanunca.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("holi123", prog1);
        
        //EJERCICIO 14
        Proyecto proyecto1 = new Proyecto("Video 1", 10);
        EditorVideo editor = new EditorVideo();

        editor.exportar("mp4", proyecto1);
    }

}
