import java.util.Scanner;
import java.util.TreeSet;

public class OrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>(); // TreeSet para almacenar y ordenar números

        System.out.println("Ingresa números. Escribe 'salir' o 'fin' para terminar.");

        while (true) {
            System.out.print("Introduce un número: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir") || entrada.equalsIgnoreCase("fin")) {
                System.out.println("Terminando la entrada de números.");
                break; // El usuario decidió terminar
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero); // Agrega el número al TreeSet
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número entero o 'salir' o'fin'.");
            }
        }

        System.out.println("\nNúmeros ingresados (ordenados de menor a mayor):");
        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            for (Integer num : numeros) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}