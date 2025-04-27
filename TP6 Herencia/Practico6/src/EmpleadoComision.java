class EmpleadoAComision extends Empleado {
    private double salarioMinimo;
    private int clientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String dni, String nombre, String apellido, int añoIngreso,
                             double salarioMinimo, int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, añoIngreso);
        this.salarioMinimo = salarioMinimo;
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double calcularSalario() {
        double salario = clientesCaptados * montoPorCliente;
        return Math.max(salario, salarioMinimo);
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    @Override
    public String toString() {
        return super.toString() + " EmpleadoAComision{" +
                "salarioMinimo=" + salarioMinimo +
                ", clientesCaptados=" + clientesCaptados +
                ", montoPorCliente=" + montoPorCliente +
                '}';
    }
}