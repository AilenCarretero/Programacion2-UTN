package ParteB;

public class Logica {

    //Punto 8: Calcular el precio final de un producto.
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }

    //Punto 9: Calcular el costo del envío.
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona no válida. Se calculará como Nacional por defecto.");
            costoPorKg = 5.0;
        }
        return peso * costoPorKg;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Punto 10: Gestión dle stock.
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // Punto 11: Cálculo del descuento especial.
    static final double DESCUENTO_ESPECIAL = 0.10;
    public static void calcularDescuentoEspecial(double precio) {

        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es:  $" + descuentoAplicado);
        System.out.println("El precio final con descuento es:   $" + precioFinal);
    }

    // Punto 12: Lista de precios modificados.
    public static void ejercicio5() {
        do {
            System.out.println("Ingrese la cantidad de productos:");
            int cantidad = Main.sc.nextInt();
            double[] precios = new double[cantidad];

            System.out.println("Ingrese los precios de los productos:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Producto " + (i + 1) + ": $");
                precios[i] = Main.sc.nextDouble();
            }

            int i = 0;
            System.out.println("\nPrecios originales:");
            for (double precio : precios) {
                System.out.println((i += 1) + ". Precio: $" + precio);
            }

            System.out.println("\n¿Qué producto desea modificar? (1-" + cantidad + ")");
            int productoAModificar = Main.sc.nextInt() - 1;

            System.out.println("Ingrese el nuevo precio:");
            double nuevoPrecio = Main.sc.nextDouble();
            Main.sc.nextLine();
            precios[productoAModificar] = nuevoPrecio;

            System.out.println("\nPrecios modificados:");
            for (double precio : precios) {
                System.out.println("Precio: $" + precio);
            }
        } while (!regresarMenu());
    }

    // Punto 13: Lista de precios recursiva
    public static void ejercicio6() {
        do {
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = Main.sc.nextInt();
            double[] precios = new double[cantidad];

            System.out.println();

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese el precio del producto " + (i + 1) + ": $");
                precios[i] = Main.sc.nextDouble();
            }

            System.out.println();

            System.out.println("Precios originales:");
            mostrarPrecios(precios, 0);

            System.out.print("\nIngrese el índice del producto a modificar (1-" + cantidad + "): ");
            int indice = Main.sc.nextInt() - 1;
            System.out.print("Ingrese el nuevo precio: $");
            double nuevoPrecio = Main.sc.nextDouble();
            precios[indice] = nuevoPrecio;

            System.out.println("Precios modificados:");
            mostrarPrecios(precios, 0);

            Main.sc.nextLine();
        } while (!regresarMenu());
    }
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.printf(". Precio: $%.2f%n", precios[indice]);

        mostrarPrecios(precios, indice + 1);

    }

    public static boolean regresarMenu() {
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = Main.sc.nextLine().trim();
        return rta.equalsIgnoreCase("si");
    }
}
