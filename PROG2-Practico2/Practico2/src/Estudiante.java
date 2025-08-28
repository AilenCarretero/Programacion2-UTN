public class Estudiante {
    //Generamos las instancias de la clase Estudiante
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    //Constructor de la clase Estudiante
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Metodo para mostar la informacion del estudiante.
    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificacion: " + this.calificacion);
    }

    // Metodo para sobir la calificacion.
    public void subirCalificacion(double nota){
        if(this.calificacion + nota > 10){
            this.calificacion = 10;
        }else{
            this.calificacion += nota;
        }
    }

    //Metodo para bajar la calificacion.
    public void bajarCalificacion(double nota){
        if(this.calificacion - nota < 0){
            this.calificacion = 0;
        }else{
            this.calificacion -= nota;
        }
    }
}
