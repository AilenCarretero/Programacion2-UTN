package Kata11;

import java.util.ArrayList;
import java.util.List;

public class Pedido1 implements Pagable {
    private List<Producto> productos;

    public Pedido1() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}