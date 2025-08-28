package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidad;

    private List<Funcion> funciones = new ArrayList<>();

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Funcion> getFunciones() {
        return Collections.unmodifiableList(funciones);
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

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
}
