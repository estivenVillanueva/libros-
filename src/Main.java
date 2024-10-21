public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAOImpl();

        // Crear libros
        Libro libro1 = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro(2, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro3 = new Libro(3, "1984", "George Orwell", 1949);

        // Agregar libros
        libroDAO.agregarLibro(libro1);
        libroDAO.agregarLibro(libro2);
        libroDAO.agregarLibro(libro3);

        // Obtener todos los libros
        System.out.println("\nLista de todos los libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }

        // Actualizar libro
        Libro libroActualizado = new Libro(1, "Cien años de soledad", "Gabriel García Márquez", 1968);
        libroDAO.actualizarLibro(libroActualizado);

        // Obtener libro por ID
        System.out.println("\nLibro con ID 1:");
        System.out.println(libroDAO.obtenerLibroPorId(1));

        // Eliminar libro
        libroDAO.eliminarLibro(2);

        // Lista actualizada de libros
        System.out.println("\nLista actualizada de todos los libros:");
        for (Libro libro : libroDAO.obtenerTodosLosLibros()) {
            System.out.println(libro);
        }
    }
}
