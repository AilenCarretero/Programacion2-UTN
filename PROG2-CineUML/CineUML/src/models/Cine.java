package models;

import enums.Genero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cine {
    private String nombre;
    private String direccion;

    // RELACIONES
    private List<Empleado> empleados = new ArrayList<>();
    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();
    private List<SalaVIP> salasVip = new ArrayList<>();
    private List<Sala> salas = new ArrayList<>();
    private List<Compra> compras = new ArrayList<>();

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Pelicula> getPeliculas() {
        return Collections.unmodifiableList(peliculas);
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Venta> getVentas() {
        return Collections.unmodifiableList(ventas);
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<SalaVIP> getSalasVip() {
        return Collections.unmodifiableList(salasVip);
    }

    public void setSalasVip(List<SalaVIP> salasVip) {
        this.salasVip = salasVip;
    }

    public List<Sala> getSalas() {
        return Collections.unmodifiableList(salas);
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Compra> getCompras() {
        return Collections.unmodifiableList(compras);
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    // ADDS & REMOVES
    public void addPelicula(String titulo, Genero genero) {
        peliculas.add(new Pelicula(titulo, genero));
    }

    public void addEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            empleados.add(empleado);
            if (empleado.getCines() != this) {
                empleado.setCines((List<Cine>) this);
            }
        }
    }

    public void removeEmpleado(Empleado empleado) {
        if (empleado != null && !empleados.contains(empleado)) {
            empleados.remove(empleado);
            if (empleado.getCines() != this) {
                empleado.setCines(null);
            }
        }
    }

    public boolean removePelicula(String nombrePelicula) {
        for (Pelicula p: peliculas) {
            if (p.getTitulo().equals(nombrePelicula)) {
                peliculas.remove(p);
                return true;
            }
        }
        return false;
    }

    public void addVenta(Venta venta) {
        ventas.add(venta);
    }

    public void removeVenta(Venta venta) {
        ventas.remove(venta);
    }

    public void addSalaVIP(SalaVIP salaVIP) {
        if (salaVIP != null && !salasVip.contains(salaVIP)) {
            salasVip.add(salaVIP);
        }
    }

    public void removeSalaVIP(SalaVIP salaVIP) {
        if (salaVIP != null && !salasVip.contains(salaVIP)) {
            salasVip.remove(salaVIP);
        }
    }

    public void addSala(Sala sala) {
        if (sala != null && !salas.contains(sala)) {
            salas.add(sala);
        }
    }

    public void removeSala(Sala sala) {
        if (sala != null && !salas.contains(salas)) {
            salas.remove(sala);
        }
    }

    public void addCompra(Compra compra) {
        compras.add(compra);
    }

    public void removeCompra(Compra compra) {
        compras.remove(compra);
    }

}