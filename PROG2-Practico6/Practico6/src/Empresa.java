import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para mostrar salarios de todos los empleados
    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombreCompleto() + ": $" + empleado.calcularSalario());
        }
    }

    // Método para encontrar al empleado con más clientes captados
    public EmpleadoAComision empleadoConMasClientes() {
        EmpleadoAComision empleadoConMasClientes = null;
        int maxClientes = -1;

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoAComision) {
                EmpleadoAComision empComision = (EmpleadoAComision) empleado;
                if (empComision.getClientesCaptados() > maxClientes) {
                    maxClientes = empComision.getClientesCaptados();
                    empleadoConMasClientes = empComision;
                }
            }
        }

        return empleadoConMasClientes;
    }
}
