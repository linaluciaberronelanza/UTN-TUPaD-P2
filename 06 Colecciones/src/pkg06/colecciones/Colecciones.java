package pkg06.colecciones;

public class Colecciones {

    public static void main(String[] args) {

        // EJERCICIO 1 PRODUCTOS 
        Inventario inventario = new Inventario();

        // 1. Crear productos
        Producto p1 = new Producto("A1", "Arroz", 1200, 30, Clase.ALIMENTOS);
        Producto p2 = new Producto("E1", "Auriculares", 3500, 15, Clase.ELECTRONICA);
        Producto p3 = new Producto("R1", "Campera", 2500, 10, Clase.ROPA);
        Producto p4 = new Producto("H1", "Lampara", 1800, 20, Clase.HOGAR);
        Producto p5 = new Producto("A2", "Aceite", 1000, 25, Clase.ALIMENTOS);

        // Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos
        System.out.println("LISTA DE PRODUCTOS");
        inventario.listarProductos();

        // 3. Buscar producto por ID
        System.out.println("BUSCAR PRODUCTO POR ID");
        Producto buscado = inventario.buscarProductoPorId("R1");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 4. Filtrar por categoría
        System.out.println("PRODUCTOS DE ALIMENTOS");
        for (Producto p : inventario.filtrarPorCategoria(Clase.ALIMENTOS)) {
            p.mostrarInfo();
        }

        // 5. Eliminar un producto
        System.out.println("ELIMINANDO PRODUCTO E1");
        inventario.eliminarProducto("E1");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("ACTUALIZANDO STOCK DE A1");
        inventario.actualizarStock("A1", 50);
        inventario.buscarProductoPorId("A1").mostrarInfo();

        // 7. Mostrar total de stock
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("Producto con mayor stock: " + inventario.obtenerProductoConMayorStock());

        // 9. Filtrar por precio
        System.out.println("PRODUCTOS ENTRE $1000 Y $3000");
        for (Producto p : inventario.filtrarProductosPorPrecio(1000, 3000)) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorías disponibles
        System.out.println("CATEGORIAS DISPONIBLES");
        inventario.mostrarCategoriasDisponibles();

        //EJERCICIO 2 BIBLIOTECA
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal Funes");

        // 2. Crear autores
        Autor autor1 = new Autor("A1", "Jorge Luis Borges", "Argentina");
        Autor autor2 = new Autor("A2", "Gabriel Garcia Marquez", "Colombia");
        Autor autor3 = new Autor("A3", "Jane Austen", "Reino Unido");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Ficciones", 1944, autor1);
        biblioteca.agregarLibro("ISBN002", "El Aleph", 1949, autor1);
        biblioteca.agregarLibro("ISBN003", "Cien anios de soledad", 1967, autor2);
        biblioteca.agregarLibro("ISBN004", "Orgullo y Prejuicio", 1813, autor3);
        biblioteca.agregarLibro("ISBN005", "Amor en los tiempos del colera", 1985, autor2);

        // 4. Listar todos los libros
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("Buscar libro por ISBN");
        Libro buscar = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscar != null) {
            buscar.mostrarInfo();
        }

        // 6. Filtrar libros por año
        System.out.println("Libros publicados en 1949");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(1949)) {
            l.mostrarInfo();
        }

        // 7. Eliminar libro
        System.out.println("Eliminando libro con ISBN002");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
        
        
        //EJERICIO 2 UNIVERSIDADES Y PROFESORES  Y CURSOS
        
        Universidad uni = new Universidad("Universidad Ficticia");

        // Crear profesores
        Profesor prof1 = new Profesor("P1", "Ana Lopez", "Matematicas");
        Profesor prof2 = new Profesor("P2", "Juan Perez", "Fisica");
        Profesor prof3 = new Profesor("P3", "Maria Gomez", "Literatura");

        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        // Crear cursos
        Curso c1 = new Curso("C101", "Algebra");
        Curso c2 = new Curso("C102", "Fisica I");
        Curso c3 = new Curso("C103", "Calculo");
        Curso c4 = new Curso("C104", "Literatura Espanola");
        Curso c5 = new Curso("C105", "Fisica II");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C103", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C105", "P2");
        uni.asignarProfesorACurso("C104", "P3");

        // Listar
        uni.listarCursos();
        uni.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("\nCambiando profesor de C104 a Juan Perez");
        uni.asignarProfesorACurso("C104", "P2");

        uni.listarCursos();
        uni.listarProfesores();

        // Eliminar curso
        System.out.println("\nEliminando curso C102");
        uni.eliminarCurso("C102");
        uni.listarCursos();
        uni.listarProfesores();

        // Eliminar profesor
        System.out.println("\nEliminando profesor P1");
        uni.eliminarProfesor("P1");
        uni.listarCursos();
        uni.listarProfesores();
    }
}
