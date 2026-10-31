package EjerciciosClase.Ejercicio2;

import java.util.Scanner;
import java.util.Locale;

public class Practica5_E2_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un numero entero mayor o igual a 0 para calcular su factorial: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Error: El numero no puede ser negativo. Intente de nuevo.");
            }
        } while (n < 0);

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El factorial de " + n + " (!" + n + ") es: " + factorial);
        sc.close();
    }
}