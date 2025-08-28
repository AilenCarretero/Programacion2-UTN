package Kata21;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número (dividendo): ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el segundo número (divisor): ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error: Ingrese números enteros válidos.");
        }
    }
}