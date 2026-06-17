import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Variables identificadas

        menu();




    }


    public static void menu(){
        // Probando menu
        System.out.println("Menú principal");
        System.out.println("seleccione opción");
        Scanner leer = new Scanner(System.in);
        int opc = leer.nextInt();
        switch (opc){
            case 1-> System.out.println("Esto es una prueba");
            case 2-> System.out.println("1");
            case 3-> System.out.println("2");
            case 4-> System.out.println("3");
            default -> System.out.println("Error");

        }

    }
}