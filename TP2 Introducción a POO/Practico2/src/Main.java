import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);

    public static boolean regresarMenu() {
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine().trim();
        return rta.equalsIgnoreCase("si");
    }

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("=============== Menú principal ===============");
            System.out.println();
            System.out.println("1. 🟢 Kata 1: Registro de Estudiantes.");
            System.out.println("2. 🟢 Kata 2: Registro de Mascotas.");
            System.out.println("3. 🟡 Kata 3: Primeros pasos en encapsulamiento.");
            System.out.println("4. 🟠 Kata 4: Estado e identidad de los objetos.");
            System.out.println("5. 🔴 Kata 5: Comportamiento de los objetos.");
            System.out.println();
            System.out.println("0. 🚪 Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;
                case 1:
                    registroEstudiantes();
                    break;
                case 2:
                    registroMascotas();
                    break;
                case 3:
                    libreria();
                    break;
                case 4:
                    gallinero();
                    break;
                case 5:
                    naveEspacial();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void registroEstudiantes(){
        do {
            // Le solicitamos al usuario los datos del estudiante.
            System.out.println("🎓🎓🎓🎓🎓🎓 REGISTRO DE ESTUDIANTES 🎓🎓🎓🎓🎓🎓");
            System.out.println();
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el apellido del estudiante: ");
            String apellido = sc.nextLine();
            System.out.print("Ingrese el curso del estudiante: ");
            String curso = sc.nextLine();
            System.out.print("Ingrese la calificación del estudiante: ");
            double calificacion = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            // Creamos una instancia de la clase Estudiante e imprimimos la información.
            Estudiante estudiante = new Estudiante(nombre, apellido, curso, calificacion);
            estudiante.mostrarInformacion();
            System.out.println();

            // Le preguntamos al usuario como desea modificar la calificación del estudiante.
            String respuestaCalificacion;
            do {
                System.out.print("¿Desea subir o bajar la calificación del estudiante? (s/b): ");
                respuestaCalificacion = sc.nextLine();
                if (respuestaCalificacion.equalsIgnoreCase("s")) {
                    System.out.print("Ingrese la cantidad de puntos a subir: ");
                    double puntos = sc.nextDouble();
                    estudiante.subirCalificacion(puntos);
                    sc.nextLine();

                    System.out.println();

                    estudiante.mostrarInformacion();
                } else if (respuestaCalificacion.equalsIgnoreCase("b")) {
                    System.out.print("Ingrese la cantidad de puntos a bajar: ");
                    double puntos = sc.nextDouble();
                    sc.nextLine();
                    estudiante.bajarCalificacion(puntos);

                    System.out.println();

                    estudiante.mostrarInformacion();
                } else {
                    System.out.println("⚠ La opción ingresada no es válida.");
                }
                } while (!respuestaCalificacion.equalsIgnoreCase("s") && !respuestaCalificacion.equalsIgnoreCase("b"));
        } while (!regresarMenu());
    }

    public static void registroMascotas(){
        do {
            // Le solicitamos al usuario los datos de la mascota.
            System.out.println("🐾🐾🐾🐾🐾🐾 REGISTRO DE MASCOTAS 🐾🐾🐾🐾🐾🐾");
            System.out.println();
            System.out.print("Ingrese el nombre de la mascota: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la raza de la mascota: ");
            String raza = sc.nextLine();
            System.out.print("Ingrese la edad de la mascota: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Creamos una instancia de la clase Mascota e imprimimos la información.
            Mascota mascota = new Mascota(nombre, raza, edad);
            mascota.mostrarInformacion();
            System.out.println();

            // Le preguntamos al usuario si desea cambiar la raza de la mascota.
            String respuestaRaza;
            do {
                System.out.print("¿Desea aumentar la edad de la mascota? (si/no): ");
                respuestaRaza = sc.nextLine();
                if (respuestaRaza.equalsIgnoreCase("si")) {
                    mascota.cumplirAnios();
                    mascota.mostrarInformacion();
                    System.out.println();
                } else if (respuestaRaza.equalsIgnoreCase("no")) {
                    System.out.println("La edad de la mascota no ha cambiado.");
                } else {
                    System.out.println("⚠ La opción ingresada no es válida.");
                }
                } while (!respuestaRaza.equalsIgnoreCase("si") && !respuestaRaza.equalsIgnoreCase("no"));
        } while (!regresarMenu());
    }

    public static void libreria() {
        do {
            // Le solicitamos al usuario los datos del libro.
            System.out.println("📚📚📚📚📚📚 REGISTRO DE LIBROS 📚📚📚📚📚📚");
            System.out.println();
            System.out.print("Ingrese el título del libro: ");
            String titulo = sc.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = sc.nextLine();
            System.out.print("Ingrese el año de publicación del libro: ");
            int anioPublicacion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Creamos una instancia de la clase Libro e imprimimos la información.
            Libro libro = new Libro(titulo, autor, anioPublicacion);
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de publicación: " + libro.getAnioPublicacion());
            System.out.println();

            // Le preguntamos al usuario si desea cambiar el año de publicación del libro.
            String respuestaAnio;
            do {
                System.out.print("¿Desea cambiar el año de publicación del libro? (si/no): ");
                respuestaAnio = sc.nextLine();
                if (respuestaAnio.equalsIgnoreCase("si")) {
                    boolean anioValido = false;
                    do {
                        System.out.print("Ingrese el nuevo año de publicación: ");
                        int nuevoAnio = sc.nextInt();
                        sc.nextLine();
                        libro.setAnioPublicacion(nuevoAnio);

                        if (libro.getAnioPublicacion() == nuevoAnio) {
                            anioValido = true;
                        }
                    } while (!anioValido);
                    System.out.println("Año de publicación actualizado: " + libro.getAnioPublicacion());
                } else if (respuestaAnio.equalsIgnoreCase("no")) {
                    System.out.println("El año de publicación del libro no ha cambiado.");
                } else {
                    System.out.println("⚠ La opción ingresada no es válida.");
                }
            } while (!respuestaAnio.equalsIgnoreCase("si") && !respuestaAnio.equalsIgnoreCase("no"));
        } while (!regresarMenu());
    }

    public static void gallinero() {
        do {
            int contador = 0;
            // Le solicitamos al usuario los datos de la gallina.
            System.out.println("🐓🐓🐓🐓🐓🐓 REGISTRO DE GALLINAS 🐓🐓🐓🐓🐓🐓");
            System.out.println();

            // Le solicitamos al usuario los datos de la primer gallina.
            System.out.print("Ingrese el ID de la gallina: ");
            int idGallina1 = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la edad de la gallina: ");
            int edadGallina1 = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la cantidad de huevos puestos por la gallina: ");
            int huevosPuestosGallina1 = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Le solicitamos al usuario los datos de la segunda gallina.
            System.out.print("Ingrese el ID de la gallina: ");
            int idGallina2 = sc.nextInt();
            sc.nextLine();

            if (idGallina2 == idGallina1) {
                System.out.println("\n⚠ El ID ingresado ya existe.");
                System.out.print("Ingrese un ID diferente: ");
                idGallina2 = sc.nextInt();
                sc.nextLine();
            }


            System.out.print("Ingrese la edad de la gallina: ");
            int edadGallina2 = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la cantidad de huevos puestos por la gallina: ");
            int huevosPuestosGallina2 = sc.nextInt();
            sc.nextLine();
            System.out.println();

            // Creamos las dos instancias de la clase Gallina e imprimimos la información de ambas.
            Gallina gallina1 = new Gallina(idGallina1, edadGallina1, huevosPuestosGallina1);
            Gallina gallina2 = new Gallina(idGallina2, edadGallina2, huevosPuestosGallina2);

            System.out.println("Información de la primer gallina:");
            gallina1.mostrarInformacion();
            System.out.println();

            System.out.println("Información de la segunda gallina:");
            gallina2.mostrarInformacion();
            System.out.println();

            // Le preguntamos al usuario si desea que la gallina ponga huevos.
            String respuestaHuevos;
            do {
                System.out.print("¿Desea que las gallinas pongan huevos? (si/no): ");
                respuestaHuevos = sc.nextLine();
                if (respuestaHuevos.equalsIgnoreCase("si")) {
                    System.out.print("Ingrese la cantidad de huevos para la gallina de id \"" + idGallina1 + "\": ");
                    int huevosGallina1 = sc.nextInt();
                    System.out.print("Ingrese la cantidad de huevos para la gallina de id \"" + idGallina2 + "\": ");
                    int huevosGallina2 = sc.nextInt();
                    sc.nextLine();
                    gallina1.ponerHuevos(huevosGallina1);
                    gallina2.ponerHuevos(huevosGallina2);

                    System.out.println();
                    System.out.println("Huevos puestos por la gallina " + idGallina1 +": " + gallina1.getHuevosPuestos());
                    System.out.println("Huevos puestos por la gallina " + idGallina2 +": " + gallina2.getHuevosPuestos());
                } else if (respuestaHuevos.equalsIgnoreCase("no")) {
                    System.out.println("Las gallinas no han puesto huevos.");
                } else {
                    System.out.println("⚠ La opción ingresada no es válida.");
                }
            } while (!respuestaHuevos.equalsIgnoreCase("si") && !respuestaHuevos.equalsIgnoreCase("no"));

            // Le preguntamos al usuario si desea que las gallinas envejezcan.
            String respuestaEdad;
            do {
                System.out.print("¿Desea que las gallinas crezcan? (si/no): ");
                respuestaEdad = sc.nextLine();
                if (respuestaEdad.equalsIgnoreCase("si")) {
                    gallina1.envejecer();
                    gallina2.envejecer();

                    System.out.println();

                    System.out.println("Edad de la gallina" + idGallina1 + ": " + gallina1.getEdad());
                    System.out.println("Edad de la gallina" + idGallina2 + ": " + gallina2.getEdad());
                } else if (respuestaEdad.equalsIgnoreCase("no")) {
                    System.out.println("Las gallinas no han crecido.");
                } else {
                    System.out.println("⚠ La opción ingresada no es válida.");
                }
                } while (!respuestaEdad.equalsIgnoreCase("si") && !respuestaEdad.equalsIgnoreCase("no"));
        } while (!regresarMenu());
    }

    public static void naveEspacial() {
        do {
            // Le solicitamos al usuario los datos de la nave espacial.
            System.out.println("🚀🚀🚀🚀🚀🚀 SIMULADOR NAVE ESPACIAL 🚀🚀🚀🚀🚀🚀");
            System.out.println();

            System.out.print("Ingrese el nombre de la nave espacial: ");
            String nombre = sc.nextLine();
            System.out.println();
            NaveEspacial nave = new NaveEspacial(nombre, 50);
            nave.mostrarEstado();

            // Le preguntamos al usuario si desea despegar o recargar combustible.
            boolean viajeEspacial = true;
            while (viajeEspacial) {
                System.out.println();
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. ⛽ Recargar combustible");
                System.out.println("2. 🚀 Realizar despegue");
                System.out.println("3. 🚀 Realizar avance");
                System.out.println("4. 🪐 Aterrizar y/o salir de la aeronave");
                System.out.print("Ingrese una opción: ");
                int opcionEspacial = sc.nextInt();
                sc.nextLine();
                System.out.println();

                switch (opcionEspacial) {
                    case 1:
                        System.out.print("⛽ Ingrese la cantidad de combustible a recargar: ");
                        int cantidad = sc.nextInt();
                        sc.nextLine();
                        nave.recargarCombustible(cantidad);
                        break;
                    case 2:
                        nave.despegar();
                        break;
                    case 3:
                        System.out.print("Ingrese la distancia a recorrer: ");
                        int distancia = sc.nextInt();
                        sc.nextLine();
                        nave.avanzar(distancia);
                        break;
                    case 4:
                        System.out.println("🪐 La nave ya se encuentra en una zona segura para salir.");
                        viajeEspacial = false;
                        break;
                    default:
                        System.out.println("⚠ Opción no válida. Intente nuevamente.");
                }
                nave.mostrarEstado();
            }
        } while (!regresarMenu());
    }
}