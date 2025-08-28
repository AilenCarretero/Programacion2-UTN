package ParteB;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("=============== Menú Principal ===============");
            System.out.println();
            System.out.println("1. Cálculo del precio final de un producto.");
            System.out.println("2. Cálculo del costo del envío.");
            System.out.println("3. Gestión del stock de productos.");
            System.out.println("4. Cálculo de descuento especial.");
            System.out.println("5. Listado de precios modificados");
            System.out.println("6. Listado de precios v2.0.");
            System.out.println();
            System.out.println("0. Salir");

            System.out.println();

            System.out.print("Ingrese una opción: ");
            int opcionMenu =sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (opcionMenu) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    Logica.ejercicio5();
                    break;
                case 6:
                    Logica.ejercicio6();
                    break;

                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;
            }
        }
    }

    // Punto 8: Cálculo del precio final de un producto.
    public static void ejercicio1() {
        do {
            System.out.print("Ingrese el precio base del producto:   $");
            double precioBase = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese el impuesto del producto (%):  ");
            double impuesto = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese el descuento del producto (%): ");
            double descuento = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            double precioFinal = Logica.calcularPrecioFinal(precioBase, impuesto, descuento);

            System.out.println("El precio final del producto es: $" + precioFinal);
        } while (!Logica.regresarMenu());
    }

    // Punto 9: Cálculo del costo del envío.
    public static void ejercicio2() {
        do {
            System.out.print("Ingrese el precio del producto: $");
            double precioProducto = sc.nextDouble();

            System.out.print("Ingrese el peso del producto (kg): ");
            double peso = sc.nextDouble();
            sc.nextLine();

            System.out.print("Ingrese la zona del envío (Nacional/Internacional): ");
            String zona = sc.nextLine();
            System.out.println();

            double costoEnvio = Logica.calcularCostoEnvio(peso, zona);
            double totalCompra = Logica.calcularTotalCompra(precioProducto, costoEnvio);

            System.out.println("El costo del envío es:      $" + costoEnvio);
            System.out.println("El total de la compra es:   $" + totalCompra);
        } while (!Logica.regresarMenu());
    }

    // Punto 10: Gestión del stock de productos.
    public static void ejercicio3() {
        do {
            System.out.print("Ingrese el stock actual del producto:      ");
            int stockActual = sc.nextInt();

            System.out.print("Ingrese la cantidad vendida del producto:  ");
            int cantidadVendida = sc.nextInt();

            System.out.print("Ingrese la cantidad recibida del producto: ");
            int cantidadRecibida = sc.nextInt();
            sc.nextLine();
            System.out.println();

            int stockActualizado = Logica.actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

            System.out.println("El stock actualizado del producto es: " + stockActualizado);
        } while (!Logica.regresarMenu());
    }

    // Punto 11: Cálculo de descuento especial.
    public static void ejercicio4() {
        do {
            System.out.print("Ingrese el precio del producto: $");
            double precio = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            Logica.calcularDescuentoEspecial(precio);
        } while (!Logica.regresarMenu());
    }
}