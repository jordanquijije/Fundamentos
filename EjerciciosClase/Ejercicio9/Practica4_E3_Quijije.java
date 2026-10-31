package EjerciciosClase.Ejercicio9;

import java.util.Scanner;
import java.util.Locale;

public class Practica4_E3_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas en el parqueadero: ");
        int horas = sc.nextInt();
        
        if (horas <= 0) {
            System.out.println("Error: El numero de horas debe ser mayor a 0.");
        } else {
            double total = 0;
            if (horas == 1) {
                total = 1.00;
            } else {
                total = 1.00 + (horas - 1) * 0.50;
            }
            
            if (total > 6.00) {
                total = 6.00;
            }
            
            System.out.println("\n--- TARIFA DE PARQUEADERO ---");
            System.out.println("Horas estacionadas: " + horas);
            System.out.printf("Total a pagar: $%.2f%n", total);
        }
        sc.close();
    }
}