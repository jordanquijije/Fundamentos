package Ejercicio2;

import java.util.Scanner;
import java.util.Locale;

public class T1_P2_EsPar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        boolean esPar = (numero % 2 == 0);
        System.out.println(esPar);

        sc.close();
    }
}
