package Lab1.Ejercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Lab1_E1_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Fahrenheit: %.2f F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);
        sc.close();
    }
}
