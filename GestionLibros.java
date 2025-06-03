import java.util.LinkedHashSet;
import java.util.Scanner;

public class GestionLibros {

    public static void main(String[] args) {
        LinkedHashSet<Libro> catalogo = new LinkedHashSet<>(); // LinkedHashSet para mantener el orden de inserción
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gestión de Libros. Introduce los datos de los libros.");
        System.out.println("Escribe 'fin' en el ID del libro para terminar.");

        while (true) {
            System.out.println("\n--- Nuevo Libro ---");
            System.out.print("ID del libro (o 'fin' para salir): ");
            String idStr = scanner.nextLine();

            if (idStr.equalsIgnoreCase("fin")) {
                break;
            }

            int id;
            try {
                id = Integer.parseInt(idStr);
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Por favor, introduce un número entero.");
                continue;
            }

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Edición: ");
            String edicion = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            Libro nuevoLibro = new Libro(id, titulo, edicion, autor);

            // Intentar añadir el libro al LinkedHashSet
            if (catalogo.add(nuevoLibro)) {
                System.out.println("Libro añadido exitosamente: " + nuevoLibro.getTitulo());
            } else {
                System.out.println("¡Advertencia! Este libro (ID y Título) ya existe en el catálogo y no se añadió nuevamente.");
            }
        }

        System.out.println("\n--- Catálogo de Libros (orden de inserción) ---");
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catálogo.");
        } else {
            for (Libro libro : catalogo) {
                System.out.println(libro);
            }
        }

        scanner.close();
    }
}