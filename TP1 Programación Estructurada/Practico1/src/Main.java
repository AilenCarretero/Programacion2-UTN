import java.util.Scanner;


public class Main {
    // Creación del menú principal.
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("=============== Menú Principal ===============");
            System.out.println();
            System.out.println("1. 📅 Averiguar si el año es bisiesto.");
            System.out.println("2. 🔢 ¿Cuál es el número mayor?");
            System.out.println("3. 🍯 Clasificación por edades.");
            System.out.println("4. 💸 Calculadora de descuento.");
            System.out.println("5. ➕ Suma de los números pares.");
            System.out.println("6. 🔢 Contador de números positivos y negativos.");
            System.out.println("7. 📝 Validación de las notas.");
            System.out.println();
            System.out.println("0. 🚪 Salir");

            System.out.println();

            System.out.print("Ingrese una opción: ");
            int opcionMenu = Logica.sc.nextInt();
            Logica.sc.nextLine();

            System.out.println();

            switch (opcionMenu) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                case 1:
                    Logica.anioBisiesto();
                    break;
                case 2:
                    Logica.numeroMayor();
                    break;
                case 3:
                    Logica.clasificacionPorEdades();
                    break;
                case 4:
                    Logica.calculadoraDescuento();
                    break;
                case 5:
                    Logica.sumaNumerosPares();
                    break;
                case 6:
                    Logica.contadorNumerosPositivosNegativos();
                    break;
                case 7:
                    Logica.validacionNotas();
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;
            }
        }
    }
    }
