public class Libro {
    //Generamos las instancias de la clase Libro.
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //Constructor de la clase Libro.
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Generamos los getters.
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }

    //Generamos los setters y los validamos.
    public void setAnioPublicacion(int nuevoAnio) {
        int añoActual = java.time.Year.now().getValue();
        if (nuevoAnio >= 1900 && nuevoAnio <= añoActual) {
            this.anioPublicacion = nuevoAnio;
        } else {
            System.out.println("El año se encuentra fuera de rango.");
        }
    }
}
