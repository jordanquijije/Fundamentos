package EjerciciosClase.Ejercicio3;

import java.util.Scanner;
import java.util.Locale;

public class Practica5_E3_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        int auxiliar = Math.abs(numero);
        
        int contadorCifras = 0;
        int sumaCifras = 0;

        if (auxiliar == 0) {
            contadorCifras = 1;
            sumaCifras = 0;
        } else {
            while (auxiliar > 0) {
                int cifra = auxiliar % 10;
                sumaCifras += cifra;
                contadorCifras++;
                auxiliar /= 10;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Numero ingresado: " + numero);
        System.out.println("Cantidad de cifras: " + contadorCifras);
        System.out.println("Suma de las cifras: " + sumaCifras);
        sc.close();
    }
}