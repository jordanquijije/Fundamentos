package Ejercicio5;

import java.util.Scanner;
import java.util.Locale;

public class T2_P5_MayorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número (distinto): ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número (distinto): ");
        int c = sc.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Error: Los números deben ser distintos.");
        } else {
            int mayor, medio, menor;

            if (a > b && a > c) {
                mayor = a;
                if (b > c) { medio = b; menor = c; }
                else { medio = c; menor = b; }
            } else if (b > a && b > c) {
                mayor = b;
                if (a > c) { medio = a; menor = c; }
                else { medio = c; menor = a; }
            } else {
                mayor = c;
                if (a > b) { medio = a; menor = b; }
                else { medio = b; menor = a; }
            }

            System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
        }
        sc.close();
    }
}