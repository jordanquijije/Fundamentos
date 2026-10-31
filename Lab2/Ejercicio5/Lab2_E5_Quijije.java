package Lab2.Ejercicio5;

import java.util.Scanner;
import java.util.Locale;

public class Lab2_E5_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double saldo = 500.00;
        int opcion;

        do {
            System.out.println("\n==============================");
            System.out.println("      CAJERO AUTOMATICO       ");
            System.out.println("==============================");
            System.out.println("1) Consultar saldo");
            System.out.println("2) Depositar dinero");
            System.out.println("3) Retirar dinero");
            System.out.println("0) Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Error: No se permiten depositos negativos o iguales a cero.");
                    } else {
                        saldo += deposito;
                        System.out.println("Deposito aceptado con exito.");
                        System.out.printf("Nuevo saldo: $%.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro <= 0 || retiro > saldo) {
                        System.out.println("Error: Fondos insuficientes o monto invalido.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso.");
                        System.out.printf("Nuevo saldo: $%.2f%n", saldo);
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar el cajero automatico. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}