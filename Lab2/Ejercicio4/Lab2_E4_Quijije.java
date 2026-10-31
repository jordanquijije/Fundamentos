package Lab2.Ejercicio4;

import java.util.Scanner;
import java.util.Locale;

public class Lab2_E4_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un numero entero positivo e impar (n): ");
            n = sc.nextInt();
            if (n <= 0 || n % 2 == 0) {
                System.out.println("Error: El numero debe ser impar y mayor que 0. Intente de nuevo.");
            }
        } while (n <= 0 || n % 2 == 0);

        int mitad = n / 2;
        System.out.println("\n--- ROMBO DE TAMAÑO " + n + " ---");

        for (int i = 0; i <= mitad; i++) {
            for (int j = 0; j < (mitad - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mitad - 1; i >= 0; i--) {
            for (int j = 0; j < (mitad - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
