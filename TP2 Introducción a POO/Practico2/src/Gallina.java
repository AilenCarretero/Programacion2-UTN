public class Gallina {
    // Generamos las instancias de la clase.
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor de la clase.
    public Gallina(int idGallina, int edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    // Getters y Setters.
    public int getIdGallina() {
        return idGallina;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    // Metodo para hacer que la gallina ponga huevos.
    public void ponerHuevos(int huevos){
        this.huevosPuestos += huevos;
    }

    // Metodo para hacer envejecer a la gallina.
    public void envejecer(){
        this.edad++;
    }

    // Metodo para mostrar el estado de la gallina.
    public void mostrarInformacion(){
        System.out.println("ID Gallina: " + this.idGallina);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
}
