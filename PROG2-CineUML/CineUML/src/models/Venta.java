package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Venta {
    private Date fecha;

    // RELACIONES
    private List<Funcion> funciones = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private Pago pago;

    public Venta(Date fecha, Pago pago) {
        this.fecha = fecha;
        this.pago = pago;
    }

    // GETTERS & SETTERS
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Funcion> getFunciones() {
        return Collections.unmodifiableList(funciones);
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    // ADDS & REMOVES
    public void addFuncion(Funcion funcion) {
        if (funcion != null && !funciones.contains(funcion)) {
            funciones.add(funcion);
        }
    }

    public void removeFuncion(Funcion funcion) {
        if (funcion != null && !funciones.contains(funcion)) {
            funciones.remove(funcion);
        }
    }

    public void addCliente(Cliente cliente) {
        if (cliente != null && !clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void removeCliente(Cliente cliente) {
        if (cliente != null && !clientes.contains(cliente)) {
            clientes.remove(cliente);
        }
    }

}
