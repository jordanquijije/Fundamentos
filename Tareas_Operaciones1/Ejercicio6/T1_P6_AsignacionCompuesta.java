package Ejercicio6;

public class T1_P6_AsignacionCompuesta {
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Inicio x = " + x);
        
        x *= 3; // 4 * 3 = 12
        System.out.println("Después de x *= 3, x = " + x);
        
        x %= 5; // 12 % 5 = 2
        System.out.println("Después de x %= 5, x = " + x);
        
        x += x++; // x = 2 + 2 (luego x se incrementa a 3), resultado x = 4
        System.out.println("Después de x += x++, x = " + x);
    }
}
