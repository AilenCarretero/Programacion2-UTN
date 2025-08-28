package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empleado {
    private String nombre;
    private int dni;

    // RELACIONES
    private List<Cine> cines = new ArrayList<>();

    public Empleado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Cine> getCines() {
        return Collections.unmodifiableList(cines);
    }

    public void setCines(List<Cine> cines) {
        this.cines = cines;
    }

    // ADDS & REMOVES
    public void addCine(Cine cine) {
        if (cine != null && !cines.contains(cine)) {
            cines.add(cine);
            if (cine.getEmpleados() != this) {
                cine.setEmpleados((List<Empleado>) this);
            }
        }
    }

    public void removeCine(Cine cine) {
        if (cine != null && !cines.contains(cine)) {
            cines.remove(cine);
            if (cine.getEmpleados() != this) {
                cine.setEmpleados(null);
            }
        }
    }
}
