package Kata12;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de crédito " +
                numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + porcentaje + "% a pago con tarjeta de crédito");
    }
}