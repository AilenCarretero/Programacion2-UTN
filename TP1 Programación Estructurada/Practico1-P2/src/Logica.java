public class Logica {

    //EJERCITACIÖN 8: Calcular el precio final de un producto.
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertimos los porcentajes a valores decimales
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // Calculamos el precio final siguiendo la fórmula
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }

    //EJERCITACIÖN 9: Calcular el costo del envío.
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

    // EJERCITACIÖN 10: Gestión dle stock.
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    // EJERCITACIÖN 11: Cálculo del descuento especial.
    // Declaramos la variable global
    static final double DESCUENTO_ESPECIAL = 0.10;
    public static void calcularDescuentoEspecial(double precio) {
        // Declaramos la variable local.

        //Calculamos el descuento especial y el precio final.
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        //Imprimimos el resultado por pantalla.
        System.out.println("💰 El descuento especial aplicado es:  $" + descuentoAplicado);
        System.out.println("❗❗ El precio final con descuento es:   $" + precioFinal);
    }

    // EJERCITACIÖN 12: Lista de precios modificados.
    public static void ejercicio5() {
        do {
            // Solicitamos el ingreso de la cantidad de productos.
            System.out.println("Ingrese la cantidad de productos:");
            int cantidad = Main.sc.nextInt();
            double[] precios = new double[cantidad];

            // Solicitamos el ingreso de los precios de los productos.
            System.out.println("Ingrese los precios de los productos:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Producto " + (i + 1) + ": $");
                precios[i] = Main.sc.nextDouble();
            }

            // Imprimimos el resultado original por pantalla.
            int i = 0;
            System.out.println("\nPrecios originales:");
            for (double precio : precios) {
                System.out.println((i += 1) + ". Precio: $" + precio);
            }

            // Le brindamos al usuario la posibilidad de modificar un precio.
            System.out.println("\n¿Qué producto desea modificar? (1-" + cantidad + ")");
            int productoAModificar = Main.sc.nextInt() - 1;

            System.out.println("Ingrese el nuevo precio:");
            double nuevoPrecio = Main.sc.nextDouble();
            Main.sc.nextLine();
            precios[productoAModificar] = nuevoPrecio;

            // Imprimimos los precios modificados por pantalla.
            System.out.println("\nPrecios modificados:");
            for (double precio : precios) {
                System.out.println("Precio: $" + precio);
            }
        } while (!regresarMenu());
    }

    // EJERCITACIÖN 13: Lista de precios recursiva
    public static void ejercicio6() {
        do {
            // Solicitamos la cantidad de productos e inicializamos el array de precios.
            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = Main.sc.nextInt();
            double[] precios = new double[cantidad];

            System.out.println();

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese el precio del producto " + (i + 1) + ": $");
                precios[i] = Main.sc.nextDouble();
            }

            System.out.println();

            // Imprimimos los precios originales con la función recursiva.
            System.out.println("Precios originales:");
            mostrarPrecios(precios, 0);

            // Brindamos al usuario la posibilidad de modificar un precio.
            System.out.print("\nIngrese el índice del producto a modificar (1-" + cantidad + "): ");
            int indice = Main.sc.nextInt() - 1;
            System.out.print("Ingrese el nuevo precio: $");
            double nuevoPrecio = Main.sc.nextDouble();
            precios[indice] = nuevoPrecio;

            // Imprimimos los nuevos valores con la funcion recursiva.
            System.out.println("Precios modificados:");
            mostrarPrecios(precios, 0);

            Main.sc.nextLine();
        } while (!regresarMenu());
    }

    public static void mostrarPrecios(double[] precios, int indice) {
        // Función recursiva para mostrar los precios.
        if (indice >= precios.length) {
            return;
        }
        System.out.printf(". Precio: $%.2f%n", precios[indice]);

        mostrarPrecios(precios, indice + 1);

    }

    // Creamos un metodo para regresar al menú principal.
    public static boolean regresarMenu() {
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = Main.sc.nextLine().trim();
        return rta.equalsIgnoreCase("si");
    }
}
