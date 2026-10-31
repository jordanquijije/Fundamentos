package Lab2.Ejercicio1;


import java.util.Locale;

public class Lab2_E1_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("=== TABLA DE MULTIPLICAR (1 al 10) ===");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}