package models;

import enums.Genero;

public class Pelicula implements IPromocion {
    private String titulo;
    private Genero genero;

    public Pelicula(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
