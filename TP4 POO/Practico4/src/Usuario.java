public class Usuario {

    // Atributos de la clase Usuario.
    private int id;
    private String nombre;
    private String email;

    // Metodos Getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }

    // Constructor sobrecargado para la creación de un usuario.
    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Metodos toString
    @Override
    public String toString() {
        return nombre + " (ID: " + id + ")";
    }
}
