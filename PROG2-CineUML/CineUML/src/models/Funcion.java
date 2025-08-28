package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Funcion {
    private String horario;

    // RELACIONES
    private List<Entrada> entradas = new ArrayList<>();
    private Pelicula pelicula;

    public Funcion(String horario, Pelicula pelicula) {
        this.horario = horario;
        this.pelicula = pelicula;
    }

    // GETTERS & SETTERS
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Entrada> getEntradas() {
        return Collections.unmodifiableList(entradas);
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    // ADDS & REMOVES
    public void addEntrada(Entrada entrada) {
        if (entrada != null && !entradas.contains(entrada)) {
            entradas.add(entrada);
        }
    }

    public void removeEntrada(Entrada entrada) {
        if (entrada != null && !entradas.contains(entrada)) {
            entradas.remove(entrada);
        }
    }
}
