public class Empleado {
    //Generamos los atributos de la clase
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructor con todos los atributos de la clase
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con los atributos nombre y puesto
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000;
        totalEmpleados++;
    }

    // Creacion de los metodos actualizarSalario sobrecargados
    public void actualizarSalario(double aumentoPorcentaje) {
        this.salario += this.salario * aumentoPorcentaje / 100;
    }

    public void actualizarSalario(int aumentoCantidadFija) {
        this.salario += aumentoCantidadFija;
    }

    //Sobrescribimos el metodo toString
    @Override
    public String toString() {
        return "Empleado[" +
                "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Puesto: '" + puesto + '\'' +
                ", Salario: $" + salario +
                ']';
    }

    // Implementamos el metodo estatico mostrarTotalEmpleados()
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
