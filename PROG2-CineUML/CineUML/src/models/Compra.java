package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Compra {
    private Date fecha;

    // RELACIONES
    private List<Insumo> insumos = new ArrayList<>();
    private List<Proveedor> proveedores = new ArrayList<>();

    public Compra(Date fecha) {
        this.fecha = fecha;
    }

    // GETTERS & SETTERS
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Insumo> getInsumos() {
        return Collections.unmodifiableList(insumos);
    }

    public void setInsumos(List<Insumo> insumos) {
        this.insumos = insumos;
    }

    public List<Proveedor> getProveedores() {
        return Collections.unmodifiableList(proveedores);
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    // ADDS & REMOVES
    public void addInsumo(String nombre, double precio) {
        insumos.add(new Insumo(nombre, precio));
    }

    public boolean removeInsumo(String nombreInsumo) {
        for (Insumo i: insumos) {
            if (i.getNombre().equals(nombreInsumo)) {
                insumos.remove(i);
                return true;
            }
        }
        return false;
    }

    public void addProveedor(Proveedor proveedor) {
        if (proveedor != null && !proveedores.contains(proveedor)) {
            proveedores.add(proveedor);
        }
    }

    public void removeProveedor(Proveedor proveedor) {
        if (proveedor != null && !proveedores.contains(proveedor)) {
            proveedores.remove(proveedor);
        }
    }
}
