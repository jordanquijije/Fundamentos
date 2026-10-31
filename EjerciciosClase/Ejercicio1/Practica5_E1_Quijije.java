package EjerciciosClase.Ejercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Practica5_E1_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero positivo (n): ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Error: El numero debe ser mayor que 0.");
        } else {
            int sumaBucle = 0;
            for (int i = 1; i <= n; i++) {
                sumaBucle += i;
            }
            
            int sumaFormula = (n * (n + 1)) / 2;
            
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma usando ciclo for: " + sumaBucle);
            System.out.println("Suma usando formula n(n+1)/2: " + sumaFormula);
            System.out.println("¿Coinciden los resultados? " + (sumaBucle == sumaFormula));
        }
        sc.close();
    }
}