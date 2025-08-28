import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
    private List<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void eliminarProducto(T producto) {
        productos.remove(producto);
    }

    public double obtenerTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public void mostrarProductos() {
        productos.forEach(System.out::println);
    }
}