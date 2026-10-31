package Ejercicio3;

import java.util.Scanner;
import java.util.Locale;

public class T2_P3_NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota 1 (sobre 20): ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese la nota 2 (sobre 20): ");
        double n2 = sc.nextDouble();
        System.out.print("Ingrese la nota 3 (sobre 20): ");
        double n3 = sc.nextDouble();

        if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20 || n3 < 0 || n3 > 20) {
            System.out.println("Error: Las notas deben estar en el rango de 0 a 20.");
        } else {
            double promedio = (n1 + n2 + n3) / 3.0;
            System.out.printf("Promedio Final: %.2f -> ", promedio);

            if (promedio >= 14.0) {
                System.out.println("«Aprobado»");
            } else if (promedio >= 9.0 && promedio <= 13.99) {
                System.out.println("«Supletorio»");
            } else {
                System.out.println("«Reprobado»");
            }
        }
        sc.close();
    }
}
