import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Variables identificadas
        Scanner leer = new Scanner(System.in);


        // Empieza código
        System.out.println("Bienvenido a la biblioteca de FROU");
        int opc;

        do {
            System.out.println("Seleccione opción");
            System.out.println(" ");
            System.out.println("1. Registrar libro");
            System.out.println("2. Ver catálogo");
            System.out.println("3. Prestar libros");
            System.out.println("4. Devoluciones de libros");
            System.out.println("5. Buscar libros");
            System.out.print("> ");

            opc = leer.nextInt();
            switch (opc) {
                case 1 -> System.out.println("Registra el libro");
                case 2 -> System.out.println("Ver catálogo");
                case 3 -> System.out.println("Prestar libros");
                case 4 -> System.out.println("Devolviendo libro");
                case 5 -> System.out.println("Busca el libro");
                case 6 -> System.out.println("Saliendo . . .");
                default -> System.out.println("Opción inválida");
            }
        } while (opc != 6);
    }

}