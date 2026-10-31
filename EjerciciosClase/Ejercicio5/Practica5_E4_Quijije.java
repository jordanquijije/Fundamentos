package EjerciciosClase.Ejercicio5;

import java.util.Scanner;
import java.util.Locale;

public class Practica5_E4_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        double suma = 0;
        double max = 0;
        double min = 0;

        System.out.println("Ingrese temperaturas (ingrese -999 para terminar):");
        System.out.print("Lectura 1: ");
        double temp = sc.nextDouble();

        if (temp == -999) {
            System.out.println("No se ingresaron temperaturas validas.");
        } else {
            max = temp;
            min = temp;
            suma += temp;
            contador++;

            while (true) {
                System.out.print("Siguiente temperatura (-999 para terminar): ");
                temp = sc.nextDouble();
                if (temp == -999) {
                    break;
                }
                suma += temp;
                contador++;
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }

            double promedio = suma / contador;
            System.out.println("\n--- ESTADISTICAS DE TEMPERATURA ---");
            System.out.println("Total de lecturas: " + contador);
            System.out.printf("Temperatura maxima: %.2f%n", max);
            System.out.printf("Temperatura minima: %.2f%n", min);
            System.out.printf("Promedio: %.2f%n", promedio);
        }
        sc.close();
    }
}
