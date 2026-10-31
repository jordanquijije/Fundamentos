package Lab2.Ejercicio2;

import java.util.Scanner;
import java.util.Locale;

public class Lab2_E2_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double max = 0;
        double min = 0;

        System.out.println("Ingrese lecturas de temperatura (ingrese un valor negativo para terminar):");
        System.out.print("Lectura 1: ");
        double lectura = sc.nextDouble();

        if (lectura < 0) {
            System.out.println("No se ingresaron lecturas validas (primera lectura negativa). No hay estadisticas.");
        } else {
            max = lectura;
            min = lectura;
            suma += lectura;
            contador++;

            while (true) {
                System.out.print("Siguiente lectura (negativo para terminar): ");
                lectura = sc.nextDouble();
                if (lectura < 0) {
                    break;
                }
                suma += lectura;
                contador++;
                if (lectura > max) {
                    max = lectura;
                }
                if (lectura < min) {
                    min = lectura;
                }
            }

            double promedio = suma / contador;
            System.out.println("\n--- ESTADISTICAS DEL SENSOR ---");
            System.out.printf("Lecturas: %d | Promedio: %.2f | Max: %.2f | Min: %.2f%n", contador, promedio, max, min);
        }
        sc.close();
    }
}