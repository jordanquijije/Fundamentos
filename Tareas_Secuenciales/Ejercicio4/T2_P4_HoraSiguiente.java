package Ejercicio4;

import java.util.Scanner;
import java.util.Locale;

public class T2_P4_HoraSiguiente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las horas (0-23): ");
        int h = sc.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int m = sc.nextInt();
        System.out.print("Ingrese los segundos (0-59): ");
        int s = sc.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Error: Los rangos de la hora ingresada no son válidos.");
        } else {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }
            }
            System.out.print("Hora un segundo después: ");
            System.out.printf("%02d:%02d:%02d%n", h, m, s);
        }
        sc.close();
    }
}