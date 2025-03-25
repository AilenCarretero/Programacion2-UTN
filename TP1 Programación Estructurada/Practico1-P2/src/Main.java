import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    // Creación del menú principal.
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("=============== Menú Principal ===============");
            System.out.println();
            System.out.println("1. 💸 Cálculo del precio final de un producto.");
            System.out.println("2. 📦 Cálculo del costo del envío.");
            System.out.println("3. 🗃 Gestión del stock de productos.");
            System.out.println("4. 💸 Cálculo de descuento especial.");
            System.out.println("5. 📝 Listado de precios modificados");
            System.out.println("6. 📝 Listado de precios v2.0.");
            System.out.println();
            System.out.println("0. 🚪 Salir");

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

    // Ejercitación 8: Cálculo del precio final de un producto.
    public static void ejercicio1() {
        do {
            // Le solicitamos al usuario el ingreso del precio base del producto.
            System.out.print("Ingrese el precio base del producto:   $");
            double precioBase = sc.nextDouble();
            sc.nextLine();

            // Le solicitamos al usuario el ingreso del impuesto del producto.
            System.out.print("Ingrese el impuesto del producto (%):  ");
            double impuesto = sc.nextDouble();
            sc.nextLine();

            // Le solicitamos al usuario el ingreso del descuento del producto.
            System.out.print("Ingrese el descuento del producto (%): ");
            double descuento = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            // Calculamos el precio final del producto llamdndo al metodo.
            double precioFinal = Logica.calcularPrecioFinal(precioBase, impuesto, descuento);

            // Imprimimos el resultado pro pantalla.
            System.out.println("El precio final del producto es: $" + precioFinal);
        } while (!Logica.regresarMenu());
    }

    // Ejercitación 9: Cálculo del costo del envío.
    public static void ejercicio2() {
        do {
            // Solicitamos al usuario el precio del producto.
            System.out.print("Ingrese el precio del producto: $");
            double precioProducto = sc.nextDouble();

            // Solicitamos al usuario el peso del producto
            System.out.print("Ingrese el peso del producto (kg): ");
            double peso = sc.nextDouble();
            sc.nextLine();

            // Solicitamos al usuario el ingreso de la zona de envio.
            System.out.print("Ingrese la zona del envío (Nacional/Internacional): ");
            String zona = sc.nextLine();
            System.out.println();

            // Calculamos el costo del envío y el total de la compra.
            double costoEnvio = Logica.calcularCostoEnvio(peso, zona);
            double totalCompra = Logica.calcularTotalCompra(precioProducto, costoEnvio);

            // Imprimimos el resultado por pantalla.
            System.out.println("📦 El costo del envío es:      $" + costoEnvio);
            System.out.println("💸 El total de la compra es:   $" + totalCompra);
        } while (!Logica.regresarMenu());
    }

    // Ejercitación 10: Gestión del stock de productos.
    public static void ejercicio3() {
        do {
            // Solicitamos al usuario el stock actual del producto.
            System.out.print("Ingrese el stock actual del producto:      ");
            int stockActual = sc.nextInt();

            // Solicitamos al usuario la cantidad vendida del producto.
            System.out.print("Ingrese la cantidad vendida del producto:  ");
            int cantidadVendida = sc.nextInt();

            // Solicitamos al usuario la cantidad recibida del producto.
            System.out.print("Ingrese la cantidad recibida del producto: ");
            int cantidadRecibida = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Calculamos el stock actualizado del producto.
            int stockActualizado = Logica.actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

            // Imprimimos el resultado por pantalla.
            System.out.println("El stock actualizado del producto es: " + stockActualizado);
        } while (!Logica.regresarMenu());
    }

    // Ejercitación 11: Cálculo de descuento especial.
    public static void ejercicio4() {
        do {
            // Solicitamos al usuario el ingreso del precio del producto.
            System.out.print("Ingrese el precio del producto: $");
            double precio = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            Logica.calcularDescuentoEspecial(precio);
        } while (!Logica.regresarMenu());
    }
}