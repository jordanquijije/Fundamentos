package Ejercicio3;

import java.util.Scanner;
import java.util.Locale;

public class T1_P3_Cifras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número de 3 cifras (ej. 472): ");
        int num = sc.nextInt();

        int centenas = num / 100;
        int decenas = (num / 10) % 10;
        int unidades = num % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);

        sc.close();
    }
}
