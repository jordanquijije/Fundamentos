package Ejercicio4;

import java.util.Scanner;
import java.util.Locale;

public class T1_P4_MinutosAHoras {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int totalMinutos = sc.nextInt();

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println(totalMinutos + " -> " + horas + " h " + minutos + " min");

        sc.close();
    }
}