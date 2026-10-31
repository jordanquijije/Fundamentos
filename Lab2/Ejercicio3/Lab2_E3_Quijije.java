package Lab2.Ejercicio3;

import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class Lab2_E3_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random azar = new Random();

        int numeroSecreto = azar.nextInt(100) + 1;
        int maxIntentos = 7;
        int intentoActual = 0;
        boolean acerto = false;

        System.out.println("=== JUEGO: ADIVINA EL NUMERO ===");
        System.out.println("He pensado un numero entre 1 y 100. Tienes " + maxIntentos + " intentos!");

        do {
            intentoActual++;
            System.out.print("\nIntento " + intentoActual + " de " + maxIntentos + ". Ingresa tu numero: ");
            int propuesta = sc.nextInt();

            if (propuesta == numeroSecreto) {
                acerto = true;
                break;
            } else if (propuesta < numeroSecreto) {
                System.out.println("El numero secreto es MAS ALTO.");
            } else {
                System.out.println("El numero secreto es MAS BAJO.");
            }
        } while (intentoActual < maxIntentos && !acerto);

        System.out.println("\n==================================");
        if (acerto) {
            System.out.println("¡FELICIDADES! ¡Has acertado el numero en " + intentoActual + " intentos!");
        } else {
            System.out.println("¡Se acabaron los intentos! Has perdido.");
            System.out.println("El numero secreto era: " + numeroSecreto);
        }
        sc.close();
    }
}