abstract class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int añoIngreso;

    public Empleado(String dni, String nombre, String apellido, int añoIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", añoIngreso=" + añoIngreso +
                '}';
    }
}
