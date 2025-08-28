import Kata11.Pedido1;
import Kata11.Producto;
import Kata12.PayPal;
import Kata12.TarjetaCredito;
import Kata13.Cliente;
import Kata13.Pedido2;
import Kata21.DivisionSegura;

public class Main {
    public static void main(String[] args) {
        // KATA 1.1: Uso básico de Interfaces
        System.out.println("KATA 1.1: Uso básico de Interfaces\n");

        // Instancia de nuevos productos.
        Producto producto1 = new Producto("Laptop", 1200.0);
        Producto producto2 = new Producto("Mouse", 25.0);
        Producto producto3 = new Producto("Teclado", 50.0);

        // Instancia de un pedido y agregamos los productos.
        Pedido1 pedido1 = new Pedido1();
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);

        System.out.println("Total del pedido: $" + pedido1.calcularTotal());

        // KATA 1.2: Herencia entre Interfaces
        System.out.println("\nKATA 1.2: Herencia entre Interfaces\n");

        // Instancia de nuevos métodos de pago.
        TarjetaCredito tarjeta = new TarjetaCredito("1234123412341234");
        PayPal paypal = new PayPal("darthvader@example.com");

        // Procesamos los pagos
        tarjeta.procesarPago(100.0);
        paypal.procesarPago(75.0);

        // Aplicamos los descuentos
        tarjeta.aplicarDescuento(10.0);
        paypal.aplicarDescuento(5.0);

        // KATA 1.3: Resolución del problema del Diamante con Interfaces.
        System.out.println("\nKATA 1.3: Resolución del problema del Diamante con Interfaces\n");

        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@example.com");
        Pedido2 pedido = new Pedido2(cliente);

        // Cambiar estados del pedido
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");

        System.out.println("\n------------\n");

        // KATA 2.1: Division Segura
        System.out.println("KATA 2.1: Division Segura\n");
        DivisionSegura.main(args);

        // KATA 2.2: Conversión de Cadena a Número
        System.out.println("\nKATA 2.2: Conversión de Cadena a Número\n");
        Kata22.ConversionCadenaNumero.main(args);

        // KATA 2.3: Lectura de Archivos
        System.out.println("\nKATA 2.3: Lectura de Archivo\n");
        Kata23.LecturaArchivo.main(args);

        // KATA 2.4: Excepciones Personalizadas
        System.out.println("\nKATA 2.4: Excepciones Personalizadas\n");
        Kata24.ValidacionEdad.main(args);

        // KATA 2.5: Uso de try-with-resources
        System.out.println("\nKATA 2.5: Uso de try-with-resources\n");
        Kata25.LecturaArchivoRecursos.main(args);


    }
 }

