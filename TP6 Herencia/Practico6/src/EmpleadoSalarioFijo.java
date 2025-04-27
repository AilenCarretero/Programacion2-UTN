class EmpleadoSalarioFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int añoIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, añoIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularSalario() {
        int añosEnEmpresa = java.time.Year.now().getValue() - getAñoIngreso();
        double porcentajeAdicional = 0;

        if (añosEnEmpresa >= 2 && añosEnEmpresa <= 5) {
            porcentajeAdicional = 0.05;
        } else if (añosEnEmpresa > 5) {
            porcentajeAdicional = 0.10;
        }

        return sueldoBasico * (1 + porcentajeAdicional);
    }

    @Override
    public String toString() {
        return super.toString() + " EmpleadoSalarioFijo{" +
                "sueldoBasico=" + sueldoBasico +
                '}';
    }
}