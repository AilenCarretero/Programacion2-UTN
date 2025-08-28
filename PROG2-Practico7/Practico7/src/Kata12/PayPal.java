package Kata12;

public class PayPal implements PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Kata12.PayPal asociado al email " + email);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + porcentaje + "% a pago con Kata12.PayPal");
    }
}