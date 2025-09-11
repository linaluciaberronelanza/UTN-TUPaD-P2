package introduccion.a.poo;

public class IntroduccionAPOO {

    public static void main(String[] args) {

//        1. Registro de Estudiantes
        Estudiante estudiante1 = new Estudiante();

        estudiante1.setNombre("Juan");
        estudiante1.setApellido("Pérez");
        estudiante1.setCurso("Programación");
        estudiante1.setCalificacion(9.5);

        estudiante1.getMostrarInfo();

        estudiante1.bajarCalificacion(5);
        estudiante1.getMostrarInfo();
        estudiante1.subirCalificacion(2.5);
        estudiante1.getMostrarInfo();

//        2. Registro de Mascotas
        Mascotas pili = new Mascotas();

        pili.setNombre("Piliguertita");
        pili.setEspecie("gato");
        pili.setEdad(12);
        pili.getMostrarInfo();
        pili.cumplirAnios(2);
        pili.getMostrarInfo();

//        3. Encapsulamiento con la Clase Libro
        Libro rayuela = new Libro();

        rayuela.setAutor("Julio Cortazar");
        rayuela.setTitulo("Rayuela");
        rayuela.setAnioPublicacion(-14);
        System.out.println(rayuela.getAnioPublicacion() + " " + rayuela.getTitulo() + " " + rayuela.getAutor());
        rayuela.setAnioPublicacion(1963);
        System.out.println(rayuela.getAnioPublicacion() + " " + rayuela.getTitulo() + " " + rayuela.getAutor());

//        4. Gestión de Gallinas en Granja Digital
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        g1.setEdad(2);
        g1.ponerHuevos(5);
        g1.envejecer(1);

        System.out.println("Gallina " + g1.getIdGallina() + " tiene " + g1.getEdad() + " años y puso " + g1.getHuevosPuestos() + " huevos.");
        System.out.println("Gallina " + g2.getIdGallina() + " tiene " + g2.getEdad() + " años y puso " + g2.getHuevosPuestos() + " huevos.");

        g2.setEdad(1);
        g2.ponerHuevos(19);
        g2.envejecer(1);

        System.out.println("Gallina " + g2.getIdGallina() + " tiene " + g2.getEdad() + " años y puso " + g2.getHuevosPuestos() + " huevos.");

//        Simulación de Nave Espacial
        NaveEspacial roja = new NaveEspacial();
        roja.setNombre("Nave espacial roja");
        roja.setCombustible(50);

        roja.despegar();
        roja.avanzar(60);
        roja.mostrarEstado();
        roja.recargarCombustible(200);

        roja.avanzar(60);
        roja.mostrarEstado();

    }

}
