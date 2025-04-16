import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("001", "Leche", 120.50, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("002", "Smartphone", 45000.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("003", "Camisa", 3500.0, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("004", "Laptop", 80000.0, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("005", "Sillón", 25000.0, 8, CategoriaProducto.HOGAR));

        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        System.out.println("\n=== Producto con mayor stock ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        System.out.println("\n=== Productos entre $1000 y $3000 ===");
        ArrayList<Producto> filtrados = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : filtrados) {
            p.mostrarInfo();
        }

        inventario.mostrarCategoriasDisponibles();
    }
}