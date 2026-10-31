package Lab1.Ejercicio5;

import java.util.Scanner;
import java.util.Locale;

public class Lab1_E5_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = sc.nextInt();
        int suma = a + b;
        int resta = a - b;
        int producto = a * b;
        System.out.println("\nOPERACIONES ARITMETICAS");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + producto);
        if (b != 0) {
            double division = (double) a / b;
            int residuo = a % b;
            System.out.printf("Division real: %.2f%n", division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("No se puede dividir para cero");
        }
        System.out.println("\nOPERACIONES RELACIONALES");
        System.out.println("A > B: " + (a > b));
        System.out.println("A < B: " + (a < b));
        System.out.println("A == B: " + (a == b));
        System.out.println("\nOPERACIONES LOGICAS");
        System.out.println("Ambos son positivos: " + (a > 0 && b > 0));
        System.out.println("Alguno es mayor que 10: " + (a > 10 || b > 10));
        sc.close();
    }
}
