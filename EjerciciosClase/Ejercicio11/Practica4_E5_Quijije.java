package EjerciciosClase.Ejercicio11;

import java.util.Scanner;
import java.util.Locale;

public class Practica4_E5_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("      CONVERSION DE UNIDADES   ");
        System.out.println("==============================");
        System.out.println("1) Metros a Pies (m -> ft)");
        System.out.println("2) Kilogramos a Libras (kg -> lb)");
        System.out.println("3) Celsius a Fahrenheit (C -> F)");
        System.out.print("Elija una opcion: ");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor en metros: ");
                double metros = sc.nextDouble();
                double pies = metros * 3.28084;
                System.out.printf("%.2f metros equivalen a %.2f pies.%n", metros, pies);
                break;
            case 2:
                System.out.print("Ingrese el valor en kilogramos: ");
                double kg = sc.nextDouble();
                double lb = kg * 2.20462;
                System.out.printf("%.2f kilogramos equivalen a %.2f libras.%n", kg, lb);
                break;
            case 3:
                System.out.print("Ingrese la temperatura en grados Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.printf("%.2f °C equivalen a %.2f °F.%n", celsius, fahrenheit);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
        
        sc.close();
    }
}