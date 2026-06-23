import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.Random;
.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random(); // Usarse para credencual

        // CLASE OBJETO USUARIO
        // Acceso especial admin
        // Agregar credencial
        String passwordAd = "admin123";

        // Sin listas
        // Usuario 1
        String credencial = "1234";
        String passwordUser = "usuario123";

        // Usuario 2
        String credencial2 = "";
        String passwordUser2 = "";

        int usuarioTotal = 0;
        String todosLosUsuarios = credencial + ", " + credencial2;

        //Contadores
        int cantDisp1 = 0, cantDisp2 = 0, cantDisp3 = 0, cantDisp4 = 0; // Lista
        int cantPrest1 = 0, cantPrest2 = 0, cantPrest3 = 0, cantPrest4 = 0; // Lista
        int cantDev1 = 0, cantDev2 = 0, cantDev3 = 0, cantDev4 = 0; // Lista
        String fecha1 = "", fecha2 = "", fecha3 = "", fecha4 = ""; // Lista

        // Variables de precios individuales
        int precio1 = 0, precio2 = 0, precio3 = 0, precio4 = 0;

        // CLASE OBJETO LIBRO
        // Por ahora hay límite se usarán así porque no se puede usar arreglos
        String libro1 = "Vacío", libro2 = "Vacío", libro3 = "Vacío", libro4 = "Vacío";
        int librosReg = 0; // Total

        // Temporal
        String todosLosLibros = libro1 + ", "+ libro2 + ", "+ libro3 + ", " + libro4;

        // Autores
        String autor1 = "", autor2 = "", autor3 = "", autor4 = "";

        // String catalogo[]
        String avent = "Aventura", doc = "Documental", ec = "Economía", politica = "Poltica";
        String nuevoCat = "";
        String catalogo = "1. "+avent + " - 2. " + doc + " - 3. " + ec + " - 4. " + politica;

        // Empezar código
        System.out.println("Bienvenido a la biblioteca de la FROU");
        System.out.println(" ");

        // Crear una función menú
        do {
            int opc, intentos = 0;
            String validar = "";
            boolean acceso = false;

            System.out.println("seleccione opción");
            System.out.println("1. Admin");
            System.out.println("2. Usuario normal");
            System.out.println("3. Salir");
            opc = leer.nextInt();
            leer.nextLine();

            // Modo admin
            if (opc == 1) {

                // Acceso especial al modo administrador
                while (intentos < 3) {
                    System.out.println("-- Modo administrador --");
                    System.out.println("Ingresa contraseña, tiene 3 intentos");

                    validar = leer.nextLine();

                    if (validar.equals(passwordAd)) {
                        System.out.println("Ingreso exitoso");
                        acceso = true;
                        break;
                    } else {
                        System.out.println("Contraseña incorrecta");
                        intentos++;
                        System.out.println("Intento "+intentos+"/3");
                    }
                }
                if (!acceso) {
                    System.out.println("-- Se agotaron los intentos --");
                    continue; // vuelve al menú principal
                }

                System.out.println("seleccione lo que desee realizar");
                System.out.println("1. Gestionar libros");
                System.out.println("2. Gestionar préstamos y devoluciones");
                System.out.println("3. Gestionar usuarios");
                System.out.println("4. Salir ");
                opc = leer.nextInt();
                leer.nextLine();
                switch (opc){
                    case 1 -> {

                        System.out.println("-- Gestión de libros --");
                        System.out.println("Libros disponibles: ");
                        System.out.println("-- ");
                        System.out.println("1. Agregar libros");
                        System.out.println("2. Eliminar libros");
                        System.out.println("3. Añadir historial del libro");
                        System.out.println("4. Ver lista de libros");
                        System.out.println("5. Salir");
                        System.out.print("> ");
                        opc = leer.nextInt();
                        leer.nextLine();
                        // Inicio de elección
                        switch (opc){
                            case 1 -> {
                                System.out.println("-- Agregando libros --");
                                System.out.println("Ingresa el título");
                                System.out.print("> ");
                                // Título, autor, catálogo, fecha, cantidad

                                librosReg++; // Contador de libros registrados
                                if (librosReg == 1){
                                    libro1 = leer.nextLine();
                                    System.out.println("Título registrado!");
                                    System.out.println("- - - - - - - - - -");

                                    System.out.println("Ingresa su autor");
                                    autor1 = leer.nextLine();
                                    System.out.println("Nombre del autor registrado!");

                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa catálogo");
                                    System.out.println(catalogo);

                                    System.out.println("Catálogo registrado!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingrsa fecha");
                                    System.out.print("> ");
                                    fecha1 = leer.nextLine();

                                    System.out.println("Fecha registrada!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa cantidad disponible");
                                    System.out.print(">");
                                    cantDisp1 = leer.nextInt();

                                    System.out.println("Ingresa el precio del libro:");
                                    precio1 = leer.nextInt();
                                    leer.nextLine();

                                    System.out.println("Libro agregado!");
                                } else if (librosReg == 2) {
                                    libro2 = leer.nextLine();
                                    System.out.println("Título registrado!");
                                    System.out.println("- - - - - - - - - -");

                                    System.out.println("Ingresa su autor");
                                    autor2 = leer.nextLine();
                                    System.out.println("Nombre del autor registrado!");

                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa catálogo");
                                    System.out.println(catalogo);

                                    System.out.println("Catálogo registrado!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingrsa fecha");
                                    System.out.print("> ");
                                    fecha2 = leer.nextLine();

                                    System.out.println("Fecha registrada!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa cantidad disponible");
                                    System.out.print(">");
                                    cantDisp2 = leer.nextInt();

                                    System.out.println("Ingresa el precio del libro:");
                                    precio2 = leer.nextInt();
                                    leer.nextLine();

                                    System.out.println("Libro agregado!");
                                } else if ( librosReg == 3){
                                    libro3 = leer.nextLine();
                                    System.out.println("Título registrado!");
                                    System.out.println("- - - - - - - - - -");

                                    System.out.println("Ingresa su autor");
                                    autor3 = leer.nextLine();
                                    System.out.println("Nombre del autor registrado!");

                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa catálogo");
                                    System.out.println(catalogo);

                                    System.out.println("Catálogo registrado!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingrsa fecha");
                                    System.out.print("> ");
                                    fecha3 = leer.nextLine();

                                    System.out.println("Fecha registrada!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa cantidad disponible");
                                    System.out.print(">");
                                    cantDisp3 = leer.nextInt();

                                    System.out.println("Ingresa el precio del libro:");
                                    precio3 = leer.nextInt();
                                    leer.nextLine();

                                    System.out.println("Libro agregado!");
                                } else if (librosReg >= 4){

                                    libro4 = leer.nextLine();
                                    System.out.println("Título registrado!");
                                    System.out.println("- - - - - - - - - -");

                                    System.out.println("Ingresa su autor");
                                    autor4 = leer.nextLine();
                                    System.out.println("Nombre del autor registrado!");

                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa catálogo");
                                    System.out.println(catalogo);

                                    System.out.println("Catálogo registrado!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingrsa fecha");
                                    System.out.print("> ");
                                    fecha4 = leer.nextLine();

                                    System.out.println("Fecha registrada!");
                                    System.out.println("- - - - - - - - - -");
                                    System.out.println("Ingresa cantidad disponible");
                                    System.out.print(">");
                                    cantDisp4 = leer.nextInt();

                                    System.out.println("Ingresa el precio del libro:");
                                    precio4 = leer.nextInt();
                                    leer.nextLine();

                                    System.out.println("Libro agregado!");
                                }

                            }
                            case 2 -> {
                                System.out.println("-- Eliminando libros --");
                                System.out.println("Elija un libro que desee eliminar");
                                System.out.print(">");
                            }
                            case 3 -> {
                                System.out.println("-- Añadiendo historial de libros --");
                                System.out.println("Libros: "+ todosLosLibros);
                                System.out.println("Ingresa el nombre del libro que desee agregarle historial");
                                System.out.print("> ");
                            }
                            case 4 -> {
                                // Despliegue de inventario con precios para el administrador
                                System.out.println("--- Lista de Libros (Admin) ---");
                                System.out.println("1. " + libro1 + " - Precio: $" + precio1);
                                System.out.println("2. " + libro2 + " - Precio: $" + precio2);
                                System.out.println("3. " + libro3 + " - Precio: $" + precio3);
                                System.out.println("4. " + libro4 + " - Precio: $" + precio4);
                            }
                            case 5 -> System.out.println("-- Saliendo --");
                            default -> System.err.println("Error, inténtelo nuevamente");
                        }
                    }
                    case 2 -> {
                        System.out.println("-- Préstamos y devoluciones --");
                        System.out.println("1. Registrar préstamo");
                        System.out.println("2. Registrar devolución");
                        System.out.println("4. Salir");
                        System.out.print("> ");
                        opc = leer.nextInt();
                        leer.nextLine();
                        switch (opc){
                            case 1 -> {
                                System.out.println("-- Registrando préstamo --");
                                System.out.println(todosLosUsuarios);
                                System.out.println("Ingrese usuario que desee registrar préstamo");
                                System.out.print("> ");
                                validar = leer.nextLine();

                                if (librosReg == 0){
                                    System.out.println("No hay libros para prestar");
                                } else {
                                    System.out.println("- -");
                                    System.out.println(todosLosLibros);
                                    System.out.println("Ingrese libro que desee prestar");
                                    if (validar.equals(credencial)){
                                        if (validar.equals(libro1)){
                                            System.out.println("Libro prestado");
                                            cantPrest1++;
                                        } else if (validar.equals(libro2)){
                                            System.out.println("Libro prestado");
                                            cantPrest2++;
                                        } else if (validar.equals(libro3)){
                                            System.out.println("Libro prestado");
                                            cantPrest3++;
                                        } else if (validar.equals(libro4)){
                                            System.out.println("Libro prestado");
                                            cantPrest4++;
                                        } else {
                                            System.err.println("Libro no encontrado");
                                        }

                                    } else if (validar.equals(credencial2)) {
                                        System.out.println("- -");
                                        System.out.println(todosLosLibros);
                                        System.out.println("Ingrese libro que desee prestar");
                                        if (validar.equals(credencial)) {
                                            if (validar.equals(libro1)) {
                                                System.out.println("Libro prestado");
                                                cantPrest1++;
                                            } else if (validar.equals(libro2)) {
                                                System.out.println("Libro prestado");
                                                cantPrest2++;
                                            } else if (validar.equals(libro3)) {
                                                System.out.println("Libro prestado");
                                                cantPrest3++;
                                            } else if (validar.equals(libro4)) {
                                                System.out.println("Libro prestado");
                                                cantPrest4++;
                                            } else {
                                                System.err.println("Libro no encontrado");
                                            }
                                        }
                                    } else {
                                        System.err.println("Usuario inválido");
                                    }
                                }
                            }
                            case 2 -> {
                                // Lógica de devolución pendiente
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("-- Gestión de usuarios --");
                        System.out.println("1. Agregar usuario");
                        System.out.println("2. Sancionar usuario");
                        System.out.println("3. Eliminar usuario");
                        System.out.println("4. Ver usuario");
                        System.out.println("4. Salir");
                        System.out.println("> ");
                        opc = leer.nextInt();
                        leer.nextLine();

                        switch (opc){
                            case 1 -> {
                                System.out.println("-- Agregando usuario --");
                                System.out.println("Ingrese nombre de usuario");
                                System.out.print("> ");
                                if (usuarioTotal < 1){
                                    credencial2 = leer.nextLine();
                                    System.out.println("Usuario creado!");
                                    System.out.println("--");
                                    System.out.println("Ingrese su contraseña");
                                    passwordUser2 = leer.nextLine();
                                    System.out.println("Contraseña creada!");
                                    usuarioTotal++;
                                } else if (usuarioTotal >= 1) {
                                    System.out.println("Usuarios llenos");
                                }
                            }
                        }
                    }
                    case 4 -> System.out.println("-- Saliendo . . .");
                    default -> System.out.println("opción inválida");
                }
            } else if (opc == 2) {
                // Opción usuario normal común y corriente
                System.out.println("-- Modo usuario --");
                System.out.println("1. Iniciar con credencial");
                System.out.println("2. Crear credencial");
                System.out.println("3. Salir");
                System.out.println("> ");
                opc = leer.nextInt();
                // Elección
                switch (opc){
                    case 1 -> {
                        System.out.println("-----------------------");
                        System.out.println("Ingrese su credencial");
                        leer.nextLine();
                        validar = leer.nextLine();

                        if (!validar.equals(credencial)) {
                            System.out.println("Credencial no encontrada");
                        } else {
                            while (intentos < 3) {
                                System.out.println("-- Modo usuario --");
                                System.out.println("Ingresa contraseña, tiene 3 intentos");

                                validar = leer.nextLine();

                                if (validar.equals(passwordUser)) {
                                    System.out.println("Ingreso exitoso");
                                    acceso = true;
                                    break;
                                } else {
                                    System.out.println("Contraseña incorrecta");
                                    intentos++;
                                    System.out.println("Intento " + intentos + "/3");
                                }
                            }
                            if (!acceso) {
                                System.out.println("-- Se agotaron los intentos --");
                                continue; // vuelve al menú principal
                            }
                        }

                        // Interacción del usuario
                        System.out.println("seleccione lo que desee realizar");
                        System.out.println("1. Ver catálogo de libros");
                        System.out.println("2. Consultar información de un libro");
                        System.out.println("3. Salir");
                        System.out.print("> ");
                        int opcUser = leer.nextInt();
                        leer.nextLine();

                        switch (opcUser) {
                            case 1 -> {
                                // Vista de catálogo general para usuarios sin variables de precio
                                System.out.println("--- Catálogo de Libros (Usuario) ---");
                                System.out.println("1. " + libro1 + " - Autor: " + autor1);
                                System.out.println("2. " + libro2 + " - Autor: " + autor2);
                                System.out.println("3. " + libro3 + " - Autor: " + autor3);
                                System.out.println("4. " + libro4 + " - Autor: " + autor4);
                            }
                            case 2 -> {
                                // Selección por ID individual para desplegar ficha técnica sin precio
                                System.out.println("Ingrese el número de libro a consultar (1-4):");
                                int num = leer.nextInt();
                                leer.nextLine();

                                if (num == 1) {
                                    System.out.println("Título: " + libro1 + " | Autor: " + autor1 + " | Fecha: " + fecha1 + " | Cantidad: " + cantDisp1);
                                } else if (num == 2) {
                                    System.out.println("Título: " + libro2 + " | Autor: " + autor2 + " | Fecha: " + fecha2 + " | Cantidad: " + cantDisp2);
                                } else if (num == 3) {
                                    System.out.println("Título: " + libro3 + " | Autor: " + autor3 + " | Fecha: " + fecha3 + " | Cantidad: " + cantDisp3);
                                } else if (num == 4) {
                                    System.out.println("Título: " + libro4 + " | Autor: " + autor4 + " | Fecha: " + fecha4 + " | Cantidad: " + cantDisp4);
                                } else {
                                    System.out.println("Número inválido.");
                                }
                            }
                            case 3 -> System.out.println("Saliendo al menú...");
                        }
                    }
                    case 2 -> {
                        System.out.println("-----------------------");
                        System.out.println("Solicitelo a un administrador");
                    }
                    case 3 -> System.out.println("-- Saliendo . . .");
                    default -> System.err.println("Opción inválida");
                }

            }else if (opc == 3){
                // SALIENDO
                System.out.println("-- Saliendo . . .");
                break;
            } else {
                System.err.println("Opción inválida");
            }
        }while (true);
        System.out.println("Gracias por su visita!");
    }
}