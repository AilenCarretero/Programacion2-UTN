public class NaveEspacial {
    // Generamos las instancias de la clase.
    private String nombre;
    private int combustible;

    // Constructor de la clase.
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // Metodos getters
    public String getNombre() {
        return nombre;
    }
    public int getCombustible() {
        return combustible;
    }

    // Metodo para despegar la nave.
    public void despegar(){
        if(this.combustible > 10){
            this.combustible -= 10;
            System.out.println("La nave ha despegado.");
        }else{
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Metodo para avanzar con la nave.
    public void avanzar(int distancia){
        if(this.combustible >= distancia){
            this.combustible -= distancia;
            System.out.println("La nave ha avanzado " + distancia + " unidades.");
        }else{
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Metodo para la recarga de combustible.
    public void recargarCombustible(int cantidad){
        if(this.combustible + cantidad > 100){
            this.combustible = 100;
        }else{
            this.combustible += cantidad;
        }
    }

    // Metodo para mostrar el estado de la nave.
    public void mostrarEstado(){
        System.out.println();
        System.out.println("Nombre de la nave: " + this.nombre);
        System.out.println("Combustible actual: " + this.combustible);
    }
}
