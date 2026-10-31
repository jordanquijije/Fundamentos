package EjerciciosClase.Ejercicio8;

import java.util.Scanner;
import java.util.Locale;

public class Practica4_E2_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El anio " + anio + " ES bisiesto.");
        } else {
            System.out.println("El anio " + anio + " NO es bisiesto.");
        }
        
        sc.close();
    }
}
