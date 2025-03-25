public class Mascota {
    // Generamos las instancias de la clase.
    private String nombre;
    private String especie;
    private int edad;

    // Constructor de la clase.
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Metodo para mostrar la informacion de la mascota.
    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Edad: " + this.edad);
    }

    // Metodo para cumplri años.
    public void cumplirAnios(){
        this.edad++;
    }
}
