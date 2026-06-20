import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Variables identificadas
        System.out.println("Menú básico");
        System.out.println("seleccione opción");
        Scanner leer = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Menú");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("> ");

            opc = leer.nextInt();
            switch (opc) {
                case 1 -> System.out.println("Elegiste la opción 1");
                case 2 -> System.out.println("Elegiste la opción 2");
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opc != 3);
    }

}