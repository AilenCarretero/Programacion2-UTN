public class Tecnico {

    // Atributos de la clase Tecnico
    private int id;
    private String nombre;
    private String especialidad;

    // Metodos Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }

    // Constructor sobrecargado para añadir un tecnico.
    public Tecnico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Metodo toString
    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}