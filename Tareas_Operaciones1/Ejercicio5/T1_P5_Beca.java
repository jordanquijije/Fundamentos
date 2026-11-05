package Ejercicio5;

import java.util.Scanner;
import java.util.Locale;

public class T1_P5_Beca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el promedio (ej. 8.5): ");
        double promedio = sc.nextDouble();

        boolean postula = (edad <= 25) && (promedio >= 8.5);
        System.out.println(postula);

        sc.close();
    }
}
