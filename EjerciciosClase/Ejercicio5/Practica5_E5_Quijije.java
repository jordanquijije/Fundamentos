package EjerciciosClase.Ejercicio5;

import java.util.Locale;

public class Practica5_E5_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        int cantidad = 0;
        System.out.println("=== MULTIPLOS DE 7 ENTRE 1 Y 100 ===");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                cantidad++;
            }
        }
        
        System.out.println("\n\nTotal de multiplos de 7 encontrados: " + cantidad);
    }
}