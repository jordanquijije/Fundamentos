package Lab1.Ejercicio3;

import java.util.Scanner;
import java.util.Locale;

public class Lab1_E3_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero de tres cifras: ");
        int numero = sc.nextInt();
        if (numero >= 100 && numero <= 999) {
            int centenas = numero / 100;
            int decenas = (numero % 100) / 10;
            int unidades = numero % 10;
            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);
        } else {
            System.out.println("Debe ingresar un numero de tres cifras");
        }
        sc.close();
    }
}