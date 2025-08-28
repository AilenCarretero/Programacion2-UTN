package Kata24;

import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
            }

            System.out.println("Edad ingresada correctamente: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }
    }
}