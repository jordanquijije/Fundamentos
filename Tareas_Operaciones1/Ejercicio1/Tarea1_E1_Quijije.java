package Ejercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Tarea1_E1_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== EJERCICIO 1: ÁREA Y PERÍMETRO DE UN RECTÁNGULO ===");
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Base: %.2f%n", base);
        System.out.printf("Altura: %.2f%n", altura);
        System.out.printf("Área del rectángulo: %.2f%n", area);
        System.out.printf("Perímetro del rectángulo: %.2f%n", perimetro);

        sc.close();
    }
}