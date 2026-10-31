package Lab1.Ejercicio4;

import java.util.Scanner;
import java.util.Locale;

public class Lab1_E4_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precio = sc.nextDouble();
        if (cantidad > 0 && precio >= 0) {
            double subtotal = cantidad * precio;
            double iva = subtotal * 0.15;
            double total = subtotal + iva;
            System.out.println("\nFACTURA");
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.printf("Precio unitario: $%.2f%n", precio);
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("IVA (15%%): $%.2f%n", iva);
            System.out.printf("Total: $%.2f%n", total);
        }
        sc.close();
    }
}