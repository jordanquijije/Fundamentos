package EjerciciosClase.Ejercicio10;

import java.util.Scanner;
import java.util.Locale;

public class Practica4_E4_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== CLASIFICACION DE TRIANGULOS ===");
        System.out.print("Ingrese el lado A: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el lado B: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el lado C: ");
        double c = sc.nextDouble();
        
        // Validacion de existencia de triangulo (desigualdad triangular)
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("\nLos valores forman un triangulo valido.");
            if (a == b && b == c) {
                System.out.println("Clasificacion: Triangulo EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("Clasificacion: Triangulo ISOSCELES");
            } else {
                System.out.println("Clasificacion: Triangulo ESCALENO");
            }
        } else {
            System.out.println("\nError: Los lados ingresados NO forman un triangulo valido.");
        }
        
        sc.close();
    }
}