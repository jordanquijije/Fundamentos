package Ejercicio2;

import java.util.Scanner;
import java.util.Locale;

public class T2_P2_Descuento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PRECIO_SACO = 8.50;
        final double IVA = 0.15;

        System.out.print("Ingrese la cantidad de sacos de cemento: ");
        int sacos = sc.nextInt();

        if (sacos <= 0) {
            System.out.println("Error: La cantidad de sacos debe ser mayor a cero.");
        } else {
            double subtotalSinDesc = sacos * PRECIO_SACO;
            double descuento = 0.0;

            if (sacos >= 1 && sacos <= 20) {
                descuento = 0.0;
            } else if (sacos >= 21 && sacos <= 50) {
                descuento = subtotalSinDesc * 0.05;
            } else {
                descuento = subtotalSinDesc * 0.10;
            }

            double subtotalConDesc = subtotalSinDesc - descuento;
            double valorIva = subtotalConDesc * IVA;
            double totalPagar = subtotalConDesc + valorIva;

            System.out.println("\n--- FACTURA FERRETERÍA ---");
            System.out.printf("Sacos comprados: %d%n", sacos);
            System.out.printf("Subtotal sin descuento: $%.2f%n", subtotalSinDesc);
            System.out.printf("Descuento aplicado: $%.2f%n", descuento);
            System.out.printf("IVA (15%%): $%.2f%n", valorIva);
            System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        }
        sc.close();
    }
}