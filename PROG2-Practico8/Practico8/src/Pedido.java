import java.time.LocalDate;
import java.util.*;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {
    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto<?> producto) {
        productos.add(producto);
    }

    public double calculaTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calculaTotal(), otro.calculaTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", total=" + calculaTotal() +
                ", fecha=" + fecha +
                '}';
    }

    public static class ComparadorPedidosPorFecha implements Comparator<Pedido> {
        @Override
        public int compare(Pedido p1, Pedido p2) {
            return p1.getFecha().compareTo(p2.getFecha());
        }
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }
}