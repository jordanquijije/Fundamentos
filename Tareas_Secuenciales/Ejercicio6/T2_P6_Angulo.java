package Ejercicio6;

import java.util.Scanner;
import java.util.Locale;

public class T2_P6_Angulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el ángulo en grados: ");
        double angulo = sc.nextDouble();

        if (angulo < 0) {
            System.out.println("Error: El ángulo no puede ser negativo.");
        } else {
            if (angulo > 360) {
                angulo = angulo % 360;
            }

            System.out.printf("Ángulo reducido: %.2f° -> Clasificación: ", angulo);

            if (angulo == 0 || angulo == 360) {
                System.out.println("Completo");
            } else if (angulo > 0 && angulo < 90) {
                System.out.println("Agudo");
            } else if (angulo == 90) {
                System.out.println("Recto");
            } else if (angulo > 90 && angulo < 180) {
                System.out.println("Obtuso");
            } else if (angulo == 180) {
                System.out.println("Llano");
            } else if (angulo > 180 && angulo < 360) {
                System.out.println("Cóncavo");
            }
        }
        sc.close();
    }
}