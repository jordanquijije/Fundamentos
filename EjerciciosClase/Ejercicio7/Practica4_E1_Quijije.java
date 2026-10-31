package EjerciciosClase.Ejercicio7;

import java.util.Scanner;
import java.util.Locale;

public class Practica4_E1_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== ECUACION CUADRATICA (ax^2 + bx + c = 0) ===");
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println("Error: No es una ecuacion cuadratica (a no puede ser 0).");
        } else {
            double discriminante = (b * b) - (4 * a * c);
            
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("\nLa ecuacion tiene dos raices reales distintas:");
                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("\nLa ecuacion tiene una raiz doble:");
                System.out.printf("x1 = x2 = %.2f%n", x);
            } else {
                System.out.println("\nLa ecuacion no tiene raices reales (raices complejas).");
            }
        }
        sc.close();
    }
}
