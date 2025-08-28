package Kata13;

public class Pedido2 {
    private Cliente cliente;
    private String estado;

    public Pedido2(Cliente cliente) {
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = "El estado de su pedido ha cambiado a: " + nuevoEstado;
        cliente.notificar(mensaje);
    }

    // Getters
    public String getEstado() {
        return estado;
    }
}