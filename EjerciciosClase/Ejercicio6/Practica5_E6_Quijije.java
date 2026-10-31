package EjerciciosClase.Ejercicio6;

import java.util.Locale;

public class Practica5_E6_Quijije {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        long poblacion = 100;
        long limite = 1000000;
        int horas = 0;

        System.out.println("=== SIMULACION DE CRECIMIENTO DE BACTERIAS ===");
        System.out.println("Poblacion inicial: " + poblacion);

        while (poblacion <= limite) {
            poblacion *= 2;
            horas++;
            System.out.println("Hora " + horas + ": " + poblacion + " bacterias");
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Se necesitan " + horas + " horas para superar 1,000,000 de bacterias (Llegando a " + poblacion + ").");
    }
}
