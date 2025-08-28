public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar empleados
        empresa.agregarEmpleado(new EmpleadoSalarioFijo("12345678", "Juan", "Pérez", 2020, 100000));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo("23456789", "Ana", "Gómez", 2018, 120000));
        empresa.agregarEmpleado(new EmpleadoAComision("34567890", "Carlos", "López", 2021, 80000, 15, 5000));
        empresa.agregarEmpleado(new EmpleadoAComision("45678901", "María", "Rodríguez", 2019, 90000, 25, 4000));

        // Mostrar salarios
        System.out.println("Salarios de los empleados:");
        empresa.mostrarSalarios();

        // Encontrar empleado con más clientes
        EmpleadoAComision empleadoTop = empresa.empleadoConMasClientes();
        if (empleadoTop != null) {
            System.out.println("\nEmpleado con más clientes captados: " +
                    empleadoTop.getNombreCompleto() +
                    " con " + empleadoTop.getClientesCaptados() + " clientes");
        }
    }
}