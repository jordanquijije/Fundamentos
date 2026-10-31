package Ejercicio1;

import java.util.Scanner;
import java.util.Locale;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera resistencia (R1): ");
        double r1 = sc.nextDouble();

        System.out.print("Ingrese la segunda resistencia (R2): ");
        double r2 = sc.nextDouble();

        if (r1 <= 0 || r2 <= 0) {
            System.out.println("Error: Las resistencias deben ser valores positivos mayores a cero.");
        } else {
            System.out.print("Ingrese el tipo de conexión [S]erie o [P]aralelo: ");
            char conexion = sc.next().toUpperCase().charAt(0);

            double req = 0;
            switch (conexion) {
                case 'S':
                    req = r1 + r2;
                    System.out.printf("Resistencia Equivalente en Serie: %.2f Ω%n", req);
                    break;
                case 'P':
                    req = (r1 * r2) / (r1 + r2);
                    System.out.printf("Resistencia Equivalente en Paralelo: %.2f Ω%n", req);
                    break;
                default:
                    System.out.println("Error: Tipo de conexión inválido. Use S o P.");
            }
        }
        sc.close();
    }
}
