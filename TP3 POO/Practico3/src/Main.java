public class Main {
    public static void main(String[] args) {
        // Creación de los empleados usando ambos constructores
        Empleado empleado1 = new Empleado(1, "Freddy Mercury", "Vocalista", 100000.0);
        Empleado empleado2 = new Empleado("Brian May", "Guitarrista");
        Empleado empleado3 = new Empleado(3, "John Deacon", "Bajista", 75000.0);
        Empleado empleado4 = new Empleado("Roger Taylor", "Baterista");

        // Actualizar salarios usando los métodos sobrecargados
        empleado1.actualizarSalario(54);
        empleado2.actualizarSalario(15000);
        empleado1.actualizarSalario(25);
        empleado2.actualizarSalario(10000);

        // Mostrar información de los empleados usando toString()
        System.out.println("Información de los empleados:");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);

        // Mostrar el total de empleados creados
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}