import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // KATA 1: Manejo de Productos en un Pedido
        System.out.println("KATA 1: Manejo de Productos en un Pedido\n");

        // Creamos la lista de productos con diferentes tipos de identificadores
        List<Producto<?>> productos = new ArrayList<>();
        productos.add(new Producto<>("SKU123", "Laptop", 999.99));
        productos.add(new Producto<>(1001, "Teléfono", 599.99));
        productos.add(new Producto<>(1002L, "Tablet", 299.99));

        // Imprimimos la lista de productos
        for (Producto<?> producto : productos) {
            System.out.println(producto);
        }

        // KATA 2: Carrito de Compras Generico
        System.out.println("\nKATA 2: Carrito de Compras Genérico\n");

        // Crear carrito y agregar productos
        Carrito<Producto<?>> carrito = new Carrito<>();
        carrito.agregarProducto(new Producto<>("SKU123", "Laptop", 999.99));
        carrito.agregarProducto(new Producto<>(1001, "Teléfono", 599.99));

        // Mostrar productos y total
        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();
        System.out.println("Total del carrito: $" + carrito.obtenerTotal());

        //KATA 3: Comparación y Orden de Pedidos
        System.out.println("\nKATA 3: Comparación y Orden de Pedidos\n");

        List<Pedido> pedidos1 = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, LocalDate.of(2023, 5, 15));
        pedido1.agregarProducto(new Producto<>("SKU1", "Producto A", 100));
        pedido1.agregarProducto(new Producto<>("SKU2", "Producto B", 50));

        Pedido pedido2 = new Pedido(2, LocalDate.of(2023, 4, 10));
        pedido2.agregarProducto(new Producto<>("SKU3", "Producto C", 200));

        Pedido pedido3 = new Pedido(3, LocalDate.of(2023, 6, 1));
        pedido3.agregarProducto(new Producto<>("SKU4", "Producto D", 75));

        pedidos1.add(pedido1);
        pedidos1.add(pedido2);
        pedidos1.add(pedido3);

        // Ordenar por total (Comparable)
        System.out.println("Pedidos ordenados por total:");
        Collections.sort(pedidos1);
        pedidos1.forEach(System.out::println);

        // Ordenar por fecha (Comparator)
        System.out.println("\nPedidos ordenados por fecha:");
        pedidos1.sort(new Pedido.ComparadorPedidosPorFecha());
        pedidos1.forEach(System.out::println);

        // KATA 4: Búsqueda Genérica de Pedidos
        System.out.println("\nKATA 4: Búsqueda Genérica de Pedidos\n");

        List<Pedido> pedidos2 = new ArrayList<>();
        Pedido pedido4 = new Pedido(1, LocalDate.now());
        Pedido pedido5 = new Pedido(2, LocalDate.now());
        pedidos2.add(pedido1);
        pedidos2.add(pedido2);

        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido encontrado = buscador.buscar(pedidos2, 1);

        if (encontrado != null) {
            System.out.println("Pedido encontrado: " + encontrado);
        } else {
            System.out.println("Pedido no encontrado");
        }

    }
}