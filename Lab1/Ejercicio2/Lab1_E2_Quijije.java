package Lab1.Ejercicio2;

import java.util.Scanner;
import java.util.Locale;

public class Lab1_E2_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos: ");
        int tiempo = sc.nextInt();
        if (tiempo >= 0) {
            int horas = tiempo / 3600;
            int residuo = tiempo % 3600;
            int minutos = residuo / 60;
            int segundos = residuo % 60;
            System.out.println("Horas: " + horas);
            System.out.println("Minutos: " + minutos);
            System.out.println("Segundos: " + segundos);
        } else {
            System.out.println("Tiempo no valido");
        }
        sc.close();
    }
}
