package ParteA;

import java.util.Scanner;

public class Logica {
    public static final Scanner sc = new Scanner(System.in);

    public static boolean regresarMenu() {
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine().trim();
        return rta.equalsIgnoreCase("si");
    }

    // Punto 1: Verificación de un año bisiesto.
    public static void anioBisiesto() {
       do {
            System.out.print("Ingrese un año: ");
            int anio = sc.nextInt();
            sc.nextLine();

            if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        } while (!regresarMenu());
    }

    // Punto 2: Determinar el mayor de tres números.
    public static void numeroMayor() {
        do {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            System.out.print("Ingrese el tercer número: ");
            int num3 = sc.nextInt();
            sc.nextLine();

            if (num1 > num2 && num1 > num3) {
                System.out.println("El número mayor es: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("El número mayor es: " + num3);
            }
        } while (!regresarMenu());
    }

    // Punto 3: Clasificación por edades.
    public static void clasificacionPorEdades() {
        do {
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            if (edad < 0) {
                System.out.println("Edad no válida.");
            } else if (edad >= 0 && edad < 12) {
                System.out.println("Es un niño.");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("Es un adolescente.");
            } else if (edad >= 18 && edad <= 59) {
                System.out.println("Es un adulto.");
            } else {
                System.out.println("Es un adulto mayor.");
            }
        } while (!regresarMenu());
    }

    // Punto 4: Calculadora de descuento.
    public static void calculadoraDescuento() {
        do {
            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = sc.nextDouble();
            sc.nextLine();

            char categoria;

            do {
                System.out.print("Ingrese su categoría (A, B, C): ");
                categoria = sc.next().charAt(0);
                sc.nextLine();

                if (categoria == 'A' || categoria == 'a') {
                    System.out.println("El descuento aplicado es el 10%.");
                    System.out.println("El precio final es: " + (precioProducto - (precioProducto * 0.1)));
                    break;
                } else if (categoria == 'B' || categoria == 'b') {
                    System.out.println("El descuento aplicado es el 15%.");
                    System.out.println("El precio final es: " + (precioProducto - (precioProducto * 0.15)));
                    break;
                } else if (categoria == 'C' || categoria == 'c') {
                    System.out.println("El descuento aplicado es el 20%.");
                    System.out.println("El precio final es: " + (precioProducto - (precioProducto * 0.2)));
                    break;
                } else {
                    System.out.println("Categoría no válida.");
                }
            } while (categoria != 'A' || categoria != 'B' || categoria != 'C' || categoria != 'a' || categoria != 'b' || categoria != 'c');
        } while (!regresarMenu());
    }

    // Punto 5: Suma de los números pares.
    public static void sumaNumerosPares() {
        do {
            int suma = 0;
            int numero;

            while (true) {
                System.out.print("Ingrese un número (escribe 0 para salir): ");
                numero = sc.nextInt();
                sc.nextLine();

                if (numero == 0) {
                    break;
                } else if (numero % 2 == 0) {
                    suma += numero;
                }
            }

            System.out.println("La suma de los números pares es: " + suma);
        } while (!regresarMenu());
    }

    // Punto 6: Contador de números positivos y negativos.
    public static void contadorNumerosPositivosNegativos() {
        do {
            int numero = 0;
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese un número: ");
                numero = sc.nextInt();
                sc.nextLine();

                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }

            System.out.println("Cantidad de números positivos:  " + positivos);
            System.out.println("Cantidad de números negativos:  " + negativos);
            System.out.println("Cantidad de ceros:              " + ceros);
        } while (!regresarMenu());
    }

    // Punto 7: Validación de entradas.
    public static void validacionNotas() {
        do {
            System.out.print("Ingrese una nota entre 0-10: ");
            int nota = sc.nextInt();
            sc.nextLine();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida.");
            } else {
                System.out.println("Nota no válida.");
            }
        } while (!regresarMenu());
    }
}